package com.example.mynotessss.listeners;

import com.example.mynotessss.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
