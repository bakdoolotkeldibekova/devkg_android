package com.example.devkg.ui.vacancy;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VacancyViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public VacancyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is vacancy fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}