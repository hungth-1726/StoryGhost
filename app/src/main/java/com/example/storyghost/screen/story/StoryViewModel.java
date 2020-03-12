package com.example.storyghost.screen.story;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.storyghost.data.model.Story;
import com.example.storyghost.data.source.local.GetStoryFromLocal;

import java.util.ArrayList;
import java.util.List;

public class StoryViewModel extends ViewModel {
    private MutableLiveData<StoryAdapter> storyAdapterMutableLiveData = new MutableLiveData<>();
    private StoryAdapter storyAdapter;
    private Context context;

    private List<Story> stories;


    public StoryViewModel() {
        stories = new ArrayList<>();
        setStories(GetStoryFromLocal.getStoryFromLocal());
        storyAdapter = new StoryAdapter(stories, context);
    }

    public void setContext(Context context) {
        this.context = context;
    }

    private void setStories(List<Story> stories) {
        this.stories = stories;
    }

    public MutableLiveData<StoryAdapter> getStoryAdapterMutableLiveData() {
        storyAdapterMutableLiveData.setValue(storyAdapter);
        return storyAdapterMutableLiveData;
    }
}