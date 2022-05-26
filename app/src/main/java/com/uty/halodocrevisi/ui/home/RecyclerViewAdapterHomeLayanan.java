package com.uty.halodocrevisi.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uty.halodocrevisi.R;

import java.util.List;

public class RecyclerViewAdapterHomeLayanan extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    List<Integer> images;
    LayoutInflater inflater;


    public RecyclerViewAdapterHomeLayanan(Context context, List<Integer> images) {
        this.images = images;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.home_layanan_rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
//        holder.gridIcon.setImageResource(images.get(position).intValue());
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageButton gridIcon;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gridIcon = itemView.findViewById(R.id.imageButtonRV);
        }
    }
}
