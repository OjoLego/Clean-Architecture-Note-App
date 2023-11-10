package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

/*
This class is that single use case containing all other use cases that would be injected in our view model
 */
data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)