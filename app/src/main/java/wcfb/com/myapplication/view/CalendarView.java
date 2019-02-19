package wcfb.com.myapplication.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Create by wcfb on 2019/2/15
 */
public class CalendarView extends LinearLayout{

    Paint paint;
    Path path;

    public CalendarView(Context context) {
        this(context, null);
    }

    public CalendarView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void initPaint(){
        paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
    }
}
