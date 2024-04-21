package com.example.effectivekotlin.item39

sealed class WorkoutState

class Exercise

class PrepareState(val exercise: Exercise) : WorkoutState()
class ExerciseState(val exercise: Exercise) : WorkoutState()

object DoneState : WorkoutState()

fun List<Exercise>.toStates(): List<WorkoutState> =
    flatMap { exercise ->
        listOf(PrepareState(exercise), ExerciseState(exercise))
    } + DoneState

class WorkoutPresenter(
    var state: WorkoutState,
)
