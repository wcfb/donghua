package wcfb.com.myapplication.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import wcfb.com.myapplication.R;


/**
 * Create by wcfb on 2019/2/19
 */
public class DongHua extends LinearLayout {

    public DongHua(Context context) {
        this(context, null);
    }

    public DongHua(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DongHua(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        ImageView imageView = new ImageView(context);
        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.zhaodehan));
        addView(imageView);
        imageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //第一种
                v.animate().translationX(100);
            }
        });

        Arc arc = new Arc(context);
        addView(arc);
        arc.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //第二种
                ObjectAnimator animator = ObjectAnimator.ofFloat(
                        v, TRANSLATION_X, 500);
                animator.setDuration(2000);
                animator.start();
            }
        });
    }
}