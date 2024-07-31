package com.example.dagger_retrofit_room.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dagger_retrofit_room.model.Product
import com.example.dagger_retrofit_room.repository.ProductRepository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: ProductRepository):ViewModel() {

    val productsLiveData: LiveData<List<Product>>
        get() = repository.product

    init {
        viewModelScope.launch {
            repository.getproducts()
        }
    }
}