package wcfb.com.myapplication.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Create by wcfb on 2019/2/16
 */
public class Arc extends View{

    Paint paint = new Paint();

    public Arc(Context context) {
        this(context, null);
    }

    public Arc(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawArc(canvas);
    }

    public void drawArc(Canvas canvas){
        // 填充模式
        paint.setStyle(Paint.Style.FILL);
        // 绘制扇
        canvas.drawArc(200, 100, 800, 500,
                -110, 100, true, paint);
        // 绘制弧形
        canvas.drawArc(200, 100, 800, 500,
                20, 140, false, paint);
        // 画线模式
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(200, 100, 800, 500,
                180, 60, false, paint);
    }

    public View getView(){
        return this;
    }
}
