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

import java.util.List;

public class VacancyAdapter extends RecyclerView.Adapter<VacancyAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<Vacancy> vacancies;

    private RecyclerViewClickListener listener;

    public VacancyAdapter(Context context, List<Vacancy> vacancies, RecyclerViewClickListener listener) {
        this.vacancies = vacancies;
        this.inflater = LayoutInflater.from(context);

        this.listener = listener;
    }
    @Override
    public VacancyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VacancyAdapter.ViewHolder holder, int position) {
        Vacancy vacancy = vacancies.get(position);
        holder.flagView.setImageResource(vacancy.getFlagResource());
        holder.nameView.setText(vacancy.getName());
        holder.companyView.setText(vacancy.getCompany());
    }

    @Override
    public int getItemCount() {
        return vacancies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        final ImageView flagView;
        final TextView nameView, companyView;
        ViewHolder(View view){
            super(view);
            flagView = view.findViewById(R.id.flag);
            nameView = view.findViewById(R.id.name);
            companyView = view.findViewById(R.id.capital);

            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, getAdapterPosition());
        }
    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }
}