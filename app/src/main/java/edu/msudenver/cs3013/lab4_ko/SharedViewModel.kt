package edu.msudenver.cs3013.lab4_ko

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    private val _parkingLocation = MutableLiveData<String>()
    val parkingLocation: LiveData<String> get() = _parkingLocation

    fun setParkingLocation(location: String) {
        _parkingLocation.value = location
    }
}