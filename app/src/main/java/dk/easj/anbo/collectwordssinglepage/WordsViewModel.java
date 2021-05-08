package dk.easj.anbo.collectwordssinglepage;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class WordsViewModel extends ViewModel {
    private ArrayList<String> words = new ArrayList<>();

    public ArrayList<String> getWords() {
        return words;
    }

    public void setWords(ArrayList<String> words) {
        this.words = words;
    }
}
