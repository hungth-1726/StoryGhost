package com.example.storyghost.screen.story;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.storyghost.R;
import com.example.storyghost.databinding.FragmentStoryBinding;

public class StoryFragment extends Fragment {

    private StoryViewModel storyViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        storyViewModel =
                ViewModelProviders.of(this).get(StoryViewModel.class);
        FragmentStoryBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_story, container, false);
        if (getActivity() != null) {
            storyViewModel.setContext(getActivity());
        }
        binding.setViewModel(storyViewModel);
        return binding.getRoot();
    }
}