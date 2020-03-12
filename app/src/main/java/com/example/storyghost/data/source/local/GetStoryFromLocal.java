package com.example.storyghost.data.source.local;

import com.example.storyghost.data.model.Story;

import java.util.ArrayList;
import java.util.List;

public class GetStoryFromLocal {
    public static List<Story> getStoryFromLocal() {
        List<Story> stories = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Story story = new Story("title " + i, "this is content " + i, "", false);
            stories.add(story);
        }
        return stories;
    }
}
