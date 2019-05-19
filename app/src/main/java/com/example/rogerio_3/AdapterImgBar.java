package com.example.rogerio_3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class AdapterImgBar extends PagerAdapter {

    private Context context;
    private int[] imgs;

    public AdapterImgBar(Context context, int[]imgs){
        this.context = context;
        this.imgs = imgs;

    }


    @Override
    public int getCount() {
        return imgs.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){

        LinearLayout ll = new LinearLayout(context);
        ll.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        ll.setLayoutParams(lp);
        container.addView(ll);

        ImageView iv = new ImageView(context);
        iv.setImageResource(imgs[position]);
        ll.addView(iv);



        Log.i("Script","Build: Foto: "+(position + 1));

        return (ll);
    }

    @Override

    public void destroyItem(ViewGroup container, int position, Object view){
        container.removeView((View)view);
    }



}
