package wcfb.com.myapplication.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import wcfb.com.myapplication.R;

/**
 * Create by wcfb on 2019/2/16
 */
public class Chat extends View {
    Context context;

    public Chat(Context context) {
        this(context, null);
        this.context = context;
    }

    public Chat(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.bfx);
        Shader shader = new BitmapShader(bitmap,
                Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        Paint paint = new Paint();
        paint.setShader(shader);
        paint.setAntiAlias(true);
        canvas.drawCircle(200,200,200,paint);


        Paint paint2 = new Paint();
        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.chat);
        Shader shader1 = new BitmapShader(bitmap1,
                Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        Shader shader2 = new ComposeShader(shader1, shader, PorterDuff.Mode.DST_OUT);
        paint2.setShader(shader2);
        canvas.drawCircle(200,800,200,paint2);


        Paint paint3 = new Paint();
        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.zhaodehan);
        paint3.setMaskFilter(new BlurMaskFilter(100, BlurMaskFilter.Blur.OUTER));
        canvas.drawBitmap(bitmap2, 800,200,paint3);

    }
}
