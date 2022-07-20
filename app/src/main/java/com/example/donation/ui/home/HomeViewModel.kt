package com.example.donation.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.donation.Form

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = ""


    }

    val text: LiveData<String> = _text
}