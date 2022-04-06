package com.example.devkg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.example.devkg.adapter.PackageTabAdapter;
import com.example.devkg.adapter.VacancyAdapter;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private VacancyAdapter.RecyclerViewClickListener listener;

    public static ViewPager viewPager;
    public static TabLayout tabLayout;
    private PackageTabAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setOffscreenPageLimit(2);
        tabLayout = (TabLayout) findViewById(R.id.packagetablayout);
        createTabFragment();
    }

    private void createTabFragment(){
        adapter = new PackageTabAdapter(getSupportFragmentManager(), tabLayout);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
    @Override//to do to test
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}