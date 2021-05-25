package com.example.fragements;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    ArrayList<Persons> personsList;
    OnNoteListener onNoteListener;

    public RecyclerViewAdapter(ArrayList<Persons> personsList, OnNoteListener onNoteListener) {
        this.personsList = personsList;
        this.onNoteListener=onNoteListener;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_list, parent, false);
        return new ViewHolder(view, onNoteListener);
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




    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageView;
        TextView name, dob, city;
        OnNoteListener onNoteListener;

        public ViewHolder(@NonNull View itemView, OnNoteListener onNoteListener) {
            super(itemView);
            imageView = itemView.findViewById(R.id.personPicture);
            name = itemView.findViewById(R.id.personName);
            dob = itemView.findViewById(R.id.Date);
            city = itemView.findViewById(R.id.City);
            this.onNoteListener=onNoteListener;
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            onNoteListener.onNoteClick(getAdapterPosition());
        }
    }
    public interface OnNoteListener {
        void onNoteClick(int position);
    }

}
