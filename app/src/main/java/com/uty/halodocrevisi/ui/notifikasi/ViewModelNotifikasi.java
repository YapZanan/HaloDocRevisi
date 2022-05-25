package com.uty.halodocrevisi.ui.notifikasi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModelNotifikasi extends ViewModel {

    private final MutableLiveData<String> mText;

    public ViewModelNotifikasi() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Notifikasi fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}