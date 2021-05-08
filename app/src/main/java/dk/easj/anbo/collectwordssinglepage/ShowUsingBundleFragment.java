package dk.easj.anbo.collectwordssinglepage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import dk.easj.anbo.collectwordssinglepage.databinding.FragmentShowUsingBundleBinding;

public class ShowUsingBundleFragment extends Fragment {
    public static final String WORDS = "words";
    private FragmentShowUsingBundleBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentShowUsingBundleBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // https://developer.android.com/guide/navigation/navigation-pass-data#bundle
        Bundle bundle = getArguments();
        ArrayList<String> words = bundle.getStringArrayList(WORDS);
        binding.fragmentShowUsingBundleTextview.setText(words.toString());
    }
}