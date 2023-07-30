package com.example.simple_mvvm_without_lib

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

//this will communicate with repositories so pass parameter of reposi.in constructor
class MainViewModel(private val repository: QuoteRepository) : ViewModel() {

    fun getQuotes(): LiveData<List<Quote>>{
        return repository.getQuotes()
    }

    fun insertQuotes(quote: Quote){
        viewModelScope.launch (Dispatchers.IO){
            repository.insertQuote(quote)
        }

    }
}