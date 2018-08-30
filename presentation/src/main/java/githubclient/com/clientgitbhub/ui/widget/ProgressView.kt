package githubclient.com.clientgitbhub.ui.widget

import android.animation.Keyframe
import android.animation.PropertyValuesHolder
import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Handler
import android.util.AttributeSet
import android.util.Property
import android.view.View
import android.view.animation.AccelerateInterpolator
import android.view.animation.Animation
import android.view.animation.BounceInterpolator

/**
 * @author Ivan Kerer
 * @since  29/08/2018
 */
class ProgressView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val circlePaint: Paint = Paint()

    private var radius = 0f
    private val difference = 30
    private val circlesCount = 3


    init {
        circlePaint.color = Color.parseColor("#2D000000")
        Handler().postDelayed(
                {
                    startAnimation()
                },
                2000
        )
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawColor(Color.TRANSPARENT)
        val x = (width / 2).toFloat()
        val y = (height / 2).toFloat()

        for (it in 0..circlesCount)
            canvas?.drawCircle(x, y, radius - difference * it, circlePaint)
    }

    private fun startAnimation() {
        val keyFrame1 = Keyframe.ofFloat(0f, 0f)
        val keyFrame2 = Keyframe.ofFloat(.5f, (width / 2).toFloat())
        val keyFrame3 = Keyframe.ofFloat(1f, 0f)

        val valueAnimator = ValueAnimator
                .ofPropertyValuesHolder(
                        PropertyValuesHolder
                                .ofKeyframe("af", keyFrame1, keyFrame2, keyFrame3)
                )

        valueAnimator.duration = 3000
        valueAnimator.addUpdateListener {
            radius = it.animatedValue as Float
            invalidate()
        }

        valueAnimator.interpolator = AccelerateInterpolator()

        valueAnimator.repeatCount = Animation.INFINITE
        valueAnimator.start()
    }
}
