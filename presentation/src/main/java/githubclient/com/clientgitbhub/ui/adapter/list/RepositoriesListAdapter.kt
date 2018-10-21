package githubclient.com.clientgitbhub.ui.adapter.list

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import githubclient.com.clientgitbhub.R
import githubclient.com.clientgitbhub.model.RepositoryViewModel
import githubclient.com.clientgitbhub.ui.adapter.list.base.BaseListAdapter

/**
 * @author Ivan Kerer
 * @since  29/08/2018
 */
class RepositoriesListAdapter : BaseListAdapter<RepositoryViewModel, RepositoriesListAdapter.RepositoriesViewHolder>() {

    override fun getLayoutRes() = R.layout.item_repository

    override fun createViewHolder(view: View) = RepositoriesViewHolder(view)

    override fun onBindViewHolder(holder: RepositoriesViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)

        val repository = mData[position]

        holder.txtName.text = repository.name
    }

    class RepositoriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var txtName: TextView

        init {
            initView(itemView)
        }

        private fun initView(view: View) {
            txtName = view.findViewById(R.id.txt_repository_name)
        }

    }
}