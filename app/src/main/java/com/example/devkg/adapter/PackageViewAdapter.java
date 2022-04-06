package com.example.devkg.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.devkg.R;
import com.example.devkg.model.Vacancy;

import java.util.ArrayList;

public class PackageViewAdapter  extends RecyclerView.Adapter<PackageViewAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<Vacancy> vacancies;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        final ImageView flagView;
        final TextView nameView, companyView;

        public MyViewHolder(View view) {
            super(view);
            flagView = view.findViewById(R.id.flag);
            nameView = view.findViewById(R.id.name);
            companyView = view.findViewById(R.id.capital);
        }
    }
    public PackageViewAdapter(Context _context, ArrayList<Vacancy> vacancies) {
        this.context = _context;
        this.vacancies = vacancies;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        // view.setOnClickListener(MainActivity.myOnClickListener);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        try{
            Vacancy vacancy = vacancies.get(position);
            holder.flagView.setImageResource(vacancy.getFlagResource());
            holder.nameView.setText(vacancy.getName());
            holder.companyView.setText(vacancy.getCompany());
        }catch (Exception e){e.printStackTrace();}
    }

    @Override
    public int getItemCount() {
        return vacancies.size();
    }
}
