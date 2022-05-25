package com.uty.halodocrevisi.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModelHome extends ViewModel {

    private final MutableLiveData<String> mText;

    public ViewModelHome() {
        mText = new MutableLiveData<>();
        mText.setValue("This is homeeeeee fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}