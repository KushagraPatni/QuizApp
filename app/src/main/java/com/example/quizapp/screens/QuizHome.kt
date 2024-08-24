package com.example.quizapp.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.quizapp.component.Questions

@Composable
fun QuizHome(viewModel: QuestionsViewModel = hiltViewModel()){
    Questions(viewModel)
}