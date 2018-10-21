package githubclient.com.clientgitbhub.ui.widget

import android.animation.ValueAnimator
import android.animation.ValueAnimator.INFINITE
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import android.view.animation.Animation


/**
 * @author Ivan Kerer
 * @since  05/09/2018
 */
class OneMoreProgress @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private var degrees: Float? = null
    private val radius = 30f
    private var paint: Paint = Paint()

    init {
        paint.style = Paint.Style.FILL
        paint.color = Color.CYAN
        paint.isAntiAlias = true
        startAnimation()
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val x = (width / 2).toFloat()
        val y = x
        degrees ?: canvas?.rotate(this.degrees!!, x, y)

        canvas?.save()
        canvas?.translate(x, y-50)
        canvas?.drawCircle(0f, 0f, radius, paint)
        canvas?.restore()
    }

    private fun startAnimation() {
        val valueAnimator = ValueAnimator.ofFloat(0f, 180f, 360f)
        valueAnimator.addUpdateListener {
            degrees = it.animatedValue as Float
            invalidate()
        }
        valueAnimator.repeatCount = Animation.INFINITE
        valueAnimator.start()
    }
}