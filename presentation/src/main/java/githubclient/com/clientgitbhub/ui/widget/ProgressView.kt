package githubclient.com.clientgitbhub.ui.widget

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

/**
 * @author Ivan Kerer
 * @since  29/08/2018
 */
class ProgressView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val firstCirclePaint: Paint = Paint()

    private var firstX: Int = 0

    init {
        firstCirclePaint.color = Color.CYAN

        firstX = bottom - (top - bottom) / 2
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawCircle(left.toFloat(), firstX.toFloat(), 100f, firstCirclePaint)
    }
}