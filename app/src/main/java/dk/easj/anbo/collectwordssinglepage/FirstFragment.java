package dk.easj.anbo.collectwordssinglepage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import dk.easj.anbo.collectwordssinglepage.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ViewModelProvider viewModelProvider = new ViewModelProvider(getActivity());
        WordsViewModel model = viewModelProvider.get(WordsViewModel.class);

        binding.saveButton.setOnClickListener(view1 -> {
            String word = binding.wordInputField.getText().toString();
            model.getWords().add(word);
        });

        binding.clearButton.setOnClickListener(view1 -> model.getWords().clear());

        binding.showButtonUseViewModel.setOnClickListener(view12 ->
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment));

        binding.showButtonPassBundle.setOnClickListener(view1 -> {
                    // https://developer.android.com/guide/navigation/navigation-pass-data#bundle
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList(ShowUsingBundleFragment.WORDS, model.getWords());
                    // TODO messy to use ViewModel to hold the data !?
                    NavHostFragment.findNavController(FirstFragment.this)
                            .navigate(R.id.action_FirstFragment_to_showUsingBundleFragment, bundle);
                }
        );
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}