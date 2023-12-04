package com.machado001.room4fun.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.machado001.room4fun.domain.entities.Note;

@Dao
public interface NoteDao {
    @Insert
    void create(Note note);
    @Query("SELECT * FROM NOTE_TABLE")
    void readAll(Note... notes);
    @Update
    void update(Note note);
    @Delete
    void delete(Note note);
}
