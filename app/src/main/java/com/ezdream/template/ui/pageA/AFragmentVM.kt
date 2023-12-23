package com.ezdream.template.ui.pageA

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AFragmentVM @Inject constructor(application: Application) : AndroidViewModel(application) {
    val text = "Data binding 1"
}