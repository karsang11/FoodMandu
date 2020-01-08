package com.karsang.foodmandu.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.karsang.foodmandu.Adapter.ViewPagerAdapter;
import com.karsang.foodmandu.Model.Home;
import com.karsang.foodmandu.R;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private CarouselView carouselView;

    private int[] image=new int[]{R.drawable.hankook,R.drawable.flavours,R.drawable.kyubi};

    ViewPager viewPager;
    List<Home> homes;
    ViewPagerAdapter viewPagerAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
                View view=inflater.inflate(R.layout.fragment_home,container,false);
                carouselView=view.findViewById(R.id.carousel);
                carouselView.setPageCount(image.length);
                carouselView.setImageClickListener(new ImageListener() {
                    @Override
                    public void setImageForPosition(int position, ImageView imageView) {
                        imageView.setImageResource(image[position]);
                    }
                });

                viewPager=view.findViewById(R.id.viewPager);
                homes=new ArrayList<>();

                homes.add(new Home(R.drawable.hankook,R.drawable.hankookfood,"Grab This Now","Nepal","Naxal"));
                homes.add(new Home(R.drawable.roadhousecafe,R.drawable.pizza,"Grab This Now","Nepal","Boudha"));

                viewPager.setAdapter(viewPagerAdapter);
                viewPager.setPadding(0,0,130,0);

    }
}