package com.example.storyghost.screen.detail_story;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.storyghost.data.model.Story;

public class DetailViewModel extends ViewModel {

    private MutableLiveData<Story> story;

    public DetailViewModel() {
        story = new MutableLiveData<>();
    }

    public Story getStory() {
        return story.getValue();
    }

    public void setStory(Story story) {
        this.story.setValue(story);
    }
}