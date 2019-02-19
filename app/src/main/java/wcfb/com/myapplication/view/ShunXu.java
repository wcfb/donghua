package wcfb.com.myapplication.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Create by wcfb on 2019/2/19
 */
public class ShunXu extends LinearLayout {

    Paint paint = new Paint();

    public ShunXu(Context context) {
        this(context, null);
    }

    public ShunXu(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ShunXu(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //调用ondraw
        setWillNotDraw(false);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(200, 100, 800, 500,
                -110, 100, true, paint);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(200, 100, 800, 500,
                20, 140, false, paint);
    }

    @Override
    public void onDrawForeground(Canvas canvas) {
        super.onDrawForeground(canvas);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(0, 0, 10, 500, paint);
    }
}
