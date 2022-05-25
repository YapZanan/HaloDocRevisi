package com.uty.halodocrevisi.ui.riwayat;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModelRiwayat extends ViewModel {

    private final MutableLiveData<String> mText;

    public ViewModelRiwayat() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Riwayat fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}