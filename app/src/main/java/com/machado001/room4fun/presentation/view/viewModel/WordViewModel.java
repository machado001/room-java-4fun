package com.machado001.room4fun.presentation.view.viewModel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.machado001.room4fun.model.WordRepository;
import com.machado001.room4fun.domain.entities.Word;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    private final WordRepository mRepository;
    private final LiveData<List<Word>> mAllWords;
    public WordViewModel(Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();
    }

    public LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }
    public void insert(Word word) {
        mRepository.insert(word);
    }

}
