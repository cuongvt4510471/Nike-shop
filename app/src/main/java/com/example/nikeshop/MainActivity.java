package com.example.nikeshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.GridView;

import com.example.nikeshop.Adapter.ShopAdapter;
import com.example.nikeshop.Adapter.SneakerAdapter;
import com.example.nikeshop.Model.sneaker;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 viewPager2;
    ShopAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager2 = findViewById(R.id.viewPaper2);
        adapter = new ShopAdapter(this);
        viewPager2.setAdapter(adapter);

        String[] tlName = {"Product list", "About us"};
        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> tab.setText(tlName[position])).attach();
    }
}