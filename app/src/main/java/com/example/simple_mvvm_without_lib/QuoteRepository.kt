package com.example.simple_mvvm_without_lib

import androidx.lifecycle.LiveData

//this will communicate with database that's why used QuoteDao in consstructor
//if Api's used then second api's instance also passed

class QuoteRepository (val quoteDo: QuoteDao) {

    fun getQuotes():LiveData<List<Quote>>{

        return quoteDo.getQuote();
    }

    suspend fun insertQuote(quote: Quote){
        quoteDo.insertQuote(quote)
    }
}