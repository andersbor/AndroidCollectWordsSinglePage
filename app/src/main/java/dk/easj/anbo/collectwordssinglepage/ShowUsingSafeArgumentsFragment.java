package dk.easj.anbo.collectwordssinglepage;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;

import dk.easj.anbo.collectwordssinglepage.databinding.FragmentFirstBinding;
import dk.easj.anbo.collectwordssinglepage.databinding.FragmentShowUsingBundleBinding;
import dk.easj.anbo.collectwordssinglepage.databinding.FragmentShowUsingSafeArgumentsBinding;


public class ShowUsingSafeArgumentsFragment extends Fragment {
    private FragmentShowUsingSafeArgumentsBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentShowUsingSafeArgumentsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // generated classes in \CollectWordsSinglePage\app\build\generated\source\navigation-args\debug\dk\easj\anbo\collectwordssinglepage
        String[] words = ShowUsingSafeArgumentsFragmentArgs.fromBundle(getArguments()).getWords();
        binding.textView.setText(Arrays.toString(words));
    }
}