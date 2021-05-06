package dk.easj.anbo.collectwordssinglepage;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class WordsViewModel extends ViewModel {
    private List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }
}
