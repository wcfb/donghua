package wcfb.com.myapplication.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import wcfb.com.myapplication.R;

/**
 * Create by wcfb on 2019/2/17
 */
public class Caijian extends View {

    public Caijian(Context context) {
        this(context, null);
    }

    public Caijian(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.baiduditu);


        canvas.save();
        canvas.clipRect(0,100,600,300);
        canvas.drawBitmap(bitmap,100,0,null);
        canvas.restore();


        canvas.save();
        canvas.rotate(45, 300, 600);
        canvas.drawBitmap(bitmap,100,500,null);
        canvas.restore();

        canvas.save();
        canvas.skew(0,0.3f);
        canvas.drawBitmap(bitmap,800,-200,null);
        canvas.restore();


        Camera camera = new Camera();
        canvas.save();
        camera.save();
        camera.rotateX(30);
        canvas.translate(bitmap.getWidth()/2,bitmap.getHeight()/2);
        camera.applyToCanvas(canvas);
        canvas.translate(-bitmap.getWidth()/2,-bitmap.getHeight()/2);
        camera.restore();
        canvas.drawBitmap(bitmap, 100,100, null);
        canvas.restore();
    }
}
