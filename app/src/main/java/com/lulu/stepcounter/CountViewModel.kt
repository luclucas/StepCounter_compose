package com.lulu.stepcounter

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CountViewModel: ViewModel() {
    var steps = mutableStateOf(0)
        private set

    fun updateSteps(currentSteps: Int){
        steps.value = currentSteps
    }
}