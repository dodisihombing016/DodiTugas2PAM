package com.doditugas2pam.app.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Skill Pemrograman Saya\n" + listOf(
            "Javascript",
            "C++",
            "Python"
        ).joinToString("\n")
    }
    val text: LiveData<String> = _text
}