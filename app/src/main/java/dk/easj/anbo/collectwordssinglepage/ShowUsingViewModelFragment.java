package dk.easj.anbo.collectwordssinglepage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import dk.easj.anbo.collectwordssinglepage.databinding.FragmentShowUsingViewModelBinding;

public class ShowUsingViewModelFragment extends Fragment {
    private FragmentShowUsingViewModelBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentShowUsingViewModelBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ViewModelProvider viewModelProvider = new ViewModelProvider(getActivity());
        WordsViewModel viewModel = viewModelProvider.get(WordsViewModel.class);

        binding.textviewSecond.setText(viewModel.getWords().toString());

        binding.buttonSecond.setOnClickListener(view1 -> NavHostFragment.findNavController(ShowUsingViewModelFragment.this)
                .navigate(R.id.action_SecondFragment_to_FirstFragment));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}