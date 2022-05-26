package com.uty.halodocrevisi.ui.notifikasi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.uty.halodocrevisi.databinding.FragmentNotifikasiBinding;

public class FragmentNotifikasi extends Fragment {

    private FragmentNotifikasiBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ViewModelNotifikasi ViewModelNotifikasi =
                new ViewModelProvider(this).get(ViewModelNotifikasi.class);

        binding = FragmentNotifikasiBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.textNotifikasi;
//        ViewModelNotifikasi.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}