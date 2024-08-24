# Quiz App

A simple Quiz App built using Jetpack Compose in Android Studio. This app presents users with a series of questions and allows them to select answers, providing feedback based on the correctness of their choices.

## Features

- **Dynamic Question Display**: The app retrieves a set of questions and displays them one at a time.
- **User Interaction**: Users can select their answers via radio buttons, and the app provides immediate visual feedback.
- **Progress Tracking**: The app tracks the user's progress through the questions and displays it.
- **Custom UI**: The app uses custom colors and styles to create an engaging user interface.

## Screenshots

Here are some screenshots of the app in action:

- **Questions Screen:**
  ![Questions Screen](https://github.com/KushagraPatni/QuizApp/blob/main/QuizScreenImage.jpg)

## Components

### 1. Questions Screen
   - Displays the current question and a list of possible answers.
   - Uses `RadioButton` for answer selection, with custom colors indicating correctness.
   - Utilizes Jetpack Compose's `Surface`, `Column`, `Row`, and other layout composables.

### 2. Question Tracker
   - Displays the current question number out of the total number of questions.
   - Uses a combination of `Text`, `buildAnnotatedString`, and `withStyle` to style the text.

### 3. Progress Indicator
   - A custom-styled progress bar that shows the user's progress through the quiz.
   - Created with `Row`, `border`, and `RoundedCornerShape` composables.

### 4. Draw Dotted Line
   - A custom composable that draws a dotted line separator using Jetpack Compose's `Canvas` and `PathEffect`.

## How It Works

- **Question Data**: The app loads questions dynamically via a `QuestionsViewModel`.
- **Answer Handling**: Each time a user selects an answer, the app checks if it's correct and updates the UI accordingly.
- **UI Feedback**: The radio buttons change color based on whether the selected answer is correct or incorrect.

## Setup Instructions

1. **Clone the Repository**: 
   ```bash
   git clone https://github.com/your-username/quiz-app.git
