package com.machado001.room4fun.model;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.machado001.room4fun.domain.entities.Word;

import java.util.List;

public class WordRepository {

    private final WordDao mWordDao;
    private final LiveData<List<Word>> mAllWords;
    public WordRepository(Application application) {
        WordRoomDatabase db = WordRoomDatabase.getDatabase(application);
        mWordDao = db.wordDao();
        mAllWords = mWordDao.getAlphabetizedWords();
    }

    public LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }

    public void insert(Word word){
        WordRoomDatabase.databaseWriteExecutor.execute(()-> mWordDao.insert(word));
    }
}
