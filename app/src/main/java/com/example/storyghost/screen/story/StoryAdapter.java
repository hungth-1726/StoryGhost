package com.example.storyghost.screen.story;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.storyghost.R;
import com.example.storyghost.data.model.Story;
import com.example.storyghost.databinding.ItemStoryBinding;
import com.example.storyghost.screen.detail_story.DetailActivity;

import java.util.List;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.StoryViewHolder> {
    private List<Story> stories;
    private Context context;

    public StoryAdapter(List<Story> stories, Context context) {
        this.stories = stories;
        this.context = context;
    }

    @NonNull
    @Override
    public StoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemStoryBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.item_story, parent, false);
        return new StoryViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryViewHolder holder, int position) {
        holder.bindingData(stories.get(position));
    }

    @Override
    public int getItemCount() {
        return stories != null ? stories.size() : 0;
    }

    class StoryViewHolder extends RecyclerView.ViewHolder {
        private ItemStoryBinding binding;

        StoryViewHolder(@NonNull ItemStoryBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        private void bindingData(Story story) {
            binding.setStory(story);
            binding.setListener(new HandleItemStory());
        }
    }

    public class HandleItemStory{
        public void moveToDetailScreen(Story story) {
            context.startActivity(DetailActivity.moveToDetailScreen(context, story));
        }
    }
}
