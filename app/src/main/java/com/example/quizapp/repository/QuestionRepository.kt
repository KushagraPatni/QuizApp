package com.example.quizapp.repository

import android.util.Log
import com.example.quizapp.data.DataorException
import com.example.quizapp.model.QuestionItem
import com.example.quizapp.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionApi) {
    private val dataorException =
        DataorException<ArrayList<QuestionItem>,
                Boolean,
                Exception>()

    suspend fun getAllQuestions(): DataorException<ArrayList<QuestionItem>, Boolean, java.lang.Exception> {
        try {
            dataorException.loading = true
            dataorException.data = api.getAllQuestions()
            if(dataorException.data.toString().isNotEmpty()) dataorException.loading=false
        } catch (exception: Exception) {
            dataorException.e=exception
            Log.d("TAG","getAllQuestions: ${dataorException.e!!.localizedMessage}")

        }
        return dataorException
    }
}