package wcfb.com.myapplication.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Create by wcfb on 2019/2/16
 */
public class Xin extends View {

    Paint paint = new Paint();
    Path path = new Path();

    public Xin(Context context) {
        this(context, null);
    }

    public Xin(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPath();
    }

    public void initPath(){
        Shader shader = new LinearGradient(0, 0, 0, 600,
                Color.parseColor("#ffffff"),
                Color.parseColor("#ff0000"), Shader.TileMode.CLAMP);
        paint.setShader(shader);
        path.addArc(200, 200, 400, 400, -225, 225);
        path.arcTo(400, 200, 600, 400, -180, 225, false);
        path.lineTo(400, 542);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(path, paint);
    }
}
