package com.example.fragements;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    ArrayList<Persons> personsList;

    public RecyclerViewAdapter(ArrayList<Persons> personsList) {
        this.personsList = personsList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(personsList.get(position).getImageUrl());
        holder.name.setText(personsList.get(position).getName());
        holder.dob.setText(String.valueOf(personsList.get(position).getDob()));
        holder.city.setText(personsList.get(position).getCity());
    }

    @Override
    public int getItemCount() {
        return personsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name, dob, city;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.personPicture);
            name=itemView.findViewById(R.id.personName);
            dob=itemView.findViewById(R.id.Date);
            city=itemView.findViewById(R.id.City);
        }
    }
}
