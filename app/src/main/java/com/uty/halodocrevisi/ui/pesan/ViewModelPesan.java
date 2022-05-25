package com.uty.halodocrevisi.ui.pesan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModelPesan extends ViewModel {

    private final MutableLiveData<String> mText;

    public ViewModelPesan() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Pesan fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}