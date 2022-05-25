package com.uty.halodocrevisi.ui.riwayat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.uty.halodocrevisi.databinding.FragmentRiwayatBinding;

public class FragmentRiwayat extends Fragment {

    private FragmentRiwayatBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ViewModelRiwayat homeViewModel =
                new ViewModelProvider(this).get(ViewModelRiwayat.class);

        binding = FragmentRiwayatBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textRiwayat;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}