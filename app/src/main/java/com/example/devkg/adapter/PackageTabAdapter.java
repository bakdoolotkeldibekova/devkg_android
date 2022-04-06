package com.example.devkg.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.devkg.fragment.FavoriteFragment;
import com.example.devkg.fragment.MainFragment;
import com.google.android.material.tabs.TabLayout;

public class PackageTabAdapter extends FragmentStatePagerAdapter {
    TabLayout tabLayout;
    public PackageTabAdapter(FragmentManager fm, TabLayout tabLayout) {
        super(fm);
        this.tabLayout = tabLayout;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
        {
            fragment = new MainFragment();
        }
        else if (position == 1)
        {
            fragment = new FavoriteFragment();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0)
        {
            title = "Main";
        }
        else if (position == 1)
        {
            title = "Favorite";
        }
        return title;
    }
}