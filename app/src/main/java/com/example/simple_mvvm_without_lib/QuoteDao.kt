package com.example.simple_mvvm_without_lib

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface QuoteDao {

    @Query("SELECT * from quote")
    fun getQuote() : LiveData<List<Quote>>


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertQuote(quote: Quote)
}