package githubclient.com.clientgitbhub.ui.widget

import android.animation.Keyframe
import android.animation.PropertyValuesHolder
import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View
import android.view.animation.Animation

/**
 * @author Ivan Kerer
 * @since  31/08/2018
 */

class CircleProgress @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private var path: Path
    private var paint: Paint = Paint()

    private var bezieX = 0f
    private var bezieY = 0f

    init {
        paint.color = Color.CYAN
        paint.style = Paint.Style.FILL

        path = Path()
        startAnimation()
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        path.reset()
        path.moveTo(0f, 0f)
        path.quadTo(bezieX, bezieY, 100f, 200f)
        canvas?.drawPath(path, paint)
    }

    private fun startAnimation() {
        val keyFrame1 = Keyframe.ofFloat(0f, 0f)
        val keyFrame2 = Keyframe.ofFloat(.5f, 100f)
        val keyFrame3 = Keyframe.ofFloat(1f, 0f)
        val valueAnimator = ValueAnimator
                .ofPropertyValuesHolder(
                        PropertyValuesHolder.ofKeyframe("af", keyFrame1, keyFrame2)
                )
        valueAnimator.addUpdateListener {
            val value: Float = it.animatedValue as Float
            bezieX = value
            bezieY = (value - 10)
            invalidate()
        }

        valueAnimator.duration = 3000
        valueAnimator.repeatCount = Animation.INFINITE
        valueAnimator.start()
    }
}