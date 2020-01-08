package com.karsang.foodmandu.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.karsang.foodmandu.Model.Home;
import com.karsang.foodmandu.R;


import java.util.List;

public class ViewPagerAdapter extends PagerAdapter {

    private List<Home> homeFragmentList;
    private LayoutInflater layoutInflater;
    private Context context;

    public ViewPagerAdapter(List<Home> homeFragmentList, LayoutInflater layoutInflater, Context context) {
        this.homeFragmentList = homeFragmentList;
        this.layoutInflater = layoutInflater;
        this.context = context;
    }


    @Override
    public int getCount() {
        return homeFragmentList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
       return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater=LayoutInflater.from(context);
        View view1=layoutInflater.inflate(R.layout.design,container,false);


        ImageView img01, img02;
        TextView title, country, location;

        img01 = view1.findViewById(R.id.ivmain);
        img02 = view1.findViewById(R.id.ivsecond);
        title = view1.findViewById(R.id.tvname);
        country = view1.findViewById(R.id.tvcountry);
        location = view1.findViewById(R.id.tvlocation);

        img01.setImageResource(homeFragmentList.get(position).getImg1());
        img02.setImageResource(homeFragmentList.get(position).getImg2());
        title.setText(homeFragmentList.get(position).getTitle());
        country.setText(homeFragmentList.get(position).getCountry());
        location.setText(homeFragmentList.get(position).getLocation());

        container.addView(view1, 0);

        return view1;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        super.destroyItem(container, position, object);
    }
}
