package com.machado001.room4fun.domain.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    public final String word;

    public Word(@NonNull String word) {
        this.word = word;
    }

    public String getWord() {
        return this.word;
    }

}
