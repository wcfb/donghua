package wcfb.com.myapplication.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Create by wcfb on 2019/2/17
 */
public class MyPagerAdapter extends PagerAdapter {

    private ArrayList<View> viewLists;
    private ArrayList<String> titleLists;

    public MyPagerAdapter() {

    }
    public MyPagerAdapter(ArrayList<View> viewLists,ArrayList<String> titleLists) {
        this.viewLists = viewLists;
        this.titleLists = titleLists;
    }

    @Override
    public int getCount() {
        return viewLists.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(viewLists.get(position));
        return viewLists.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(viewLists.get(position));
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleLists.get(position);
    }
}
