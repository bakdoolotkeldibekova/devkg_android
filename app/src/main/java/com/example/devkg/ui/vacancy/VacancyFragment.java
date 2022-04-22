package com.example.devkg.ui.vacancy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import com.example.devkg.R;
import com.example.devkg.adapter.PackageTabAdapter;
import com.example.devkg.databinding.MainFragmentVacancyBinding;
import com.google.android.material.tabs.TabLayout;

public class VacancyFragment extends Fragment {

    private MainFragmentVacancyBinding binding;

    public static ViewPager viewPager;
    public static TabLayout tabLayout;
    private PackageTabAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        VacancyViewModel homeViewModel =
                new ViewModelProvider(this).get(VacancyViewModel.class);

        binding = MainFragmentVacancyBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        viewPager = (ViewPager) root.findViewById(R.id.viewPager);
        viewPager.setOffscreenPageLimit(2);
        tabLayout = (TabLayout) root.findViewById(R.id.packagetablayout);
        createTabFragment();

        return root;
    }
    private void createTabFragment(){
        adapter = new PackageTabAdapter(getParentFragmentManager(), tabLayout);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}