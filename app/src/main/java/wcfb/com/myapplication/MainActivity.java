package wcfb.com.myapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;

import wcfb.com.myapplication.adapter.MyPagerAdapter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private ViewPager vpager;
    private ArrayList<View> list;
    private ArrayList<String> sList;
    private MyPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vpager = findViewById(R.id.vpager);
        list = new ArrayList<>();
        LayoutInflater li = getLayoutInflater();
        list.add(li.inflate(R.layout.view_one,null,false));
        list.add(li.inflate(R.layout.view_two,null,false));
        list.add(li.inflate(R.layout.view_three, null, false));
        list.add(li.inflate(R.layout.view_four, null, false));
        list.add(li.inflate(R.layout.view_five, null, false));
        list.add(li.inflate(R.layout.view_love, null, false));
        sList = new ArrayList<>();
        sList.add("统计图");
        sList.add("切图");
        sList.add("裁切");
        sList.add("斑点");
        sList.add("动画");
        sList.add("爱心");
        mAdapter = new MyPagerAdapter(list, sList);
        vpager.setAdapter(mAdapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

        }
    }
}
