package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.add_edit_note

/*
For the current text field state
 */
data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)