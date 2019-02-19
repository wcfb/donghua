package wcfb.com.myapplication.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Create by wcfb on 2019/2/17
 */
public class TongJiTu extends View {

    Paint paint = new Paint();

    public TongJiTu(Context context) {
        this(context, null);
    }

    public TongJiTu(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawBing(canvas);
    }

    public void drawBing(Canvas canvas){
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        canvas.drawLine(600,600,850,600,paint);
        paint.setTextSize(50);
        canvas.drawText("66",850, 600, paint);
        paint.setColor(Color.parseColor("#ff5e5e"));
        canvas.drawArc(310, 318, 810, 818,
                0, 120, true, paint);
        paint.setColor(Color.parseColor("#c0c080"));
        canvas.drawArc(300, 300, 800, 800,
                120, 30, true, paint);
        paint.setColor(Color.parseColor("#f544ba"));
        canvas.drawArc(300, 300, 800, 800,
                150, 210, true, paint);
    }


    public View getView(){
        return this;
    }
}
