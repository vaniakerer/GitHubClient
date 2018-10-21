package githubclient.com.clientgitbhub.ui.adapter.list.base

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * @author Ivan Kerer
 * @since  29/08/2018
 */
abstract class BaseListAdapter<D, ViewHolder : RecyclerView.ViewHolder>
    : RecyclerView.Adapter<ViewHolder>() {

    protected val mData: ArrayList<D> = ArrayList()
    public var onItemClickListener: OnItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = createViewHolder(
            LayoutInflater
                    .from(parent.context)
                    .inflate(getLayoutRes(), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        onItemClickListener?.let {
            val itItemClickListener = it
            holder.itemView.rootView.setOnClickListener {
                itItemClickListener.onItemClick(position)
            }
        }
    }

    override fun getItemCount(): Int = mData.size

    fun setNewData(newData: List<D>) {
        mData.clear()
        mData.addAll(newData)
        notifyDataSetChanged()
    }

    @LayoutRes
    protected abstract fun getLayoutRes(): Int

    protected abstract fun createViewHolder(view: View): ViewHolder
}

interface OnItemClickListener {
    fun onItemClick(position: Int)
}