package com.example.nikeshop.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.nikeshop.Fragment.AboutUsFragment;
import com.example.nikeshop.Fragment.ProductListFragment;

public class ShopAdapter extends FragmentStateAdapter {

    public ShopAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new ProductListFragment();
            case 1:
                return new AboutUsFragment();
        }
        return new ProductListFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
