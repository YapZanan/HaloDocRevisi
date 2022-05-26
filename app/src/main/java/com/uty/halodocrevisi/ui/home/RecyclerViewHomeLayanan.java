package com.uty.halodocrevisi.ui.home;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.uty.halodocrevisi.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewHomeLayanan extends Fragment {
    List<Integer> images;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.home_layanan_rv, container, false);
        images = new ArrayList<>();

        images.add(R.drawable.ic_dokter);
        images.add(R.drawable.ic_dokter);
        images.add(R.drawable.ic_dokter);
        images.add(R.drawable.ic_corona);

//        adapter = new Adapter(this, images);
//        GridLayoutManager layoutManager = new GridLayoutManager(this, 1, GridLayoutManager.HORIZONTAL, false);

//        RecyclerView recyclerview = view.findViewById(R.id.rvLayanan);
//        recyclerview.setLayoutManager(new LinearLayoutManager(this.getContext()));
//        recyclerview.setAdapter(new ListAdapter)


        return view;
    }
}
