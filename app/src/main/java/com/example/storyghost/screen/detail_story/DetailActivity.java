package com.example.storyghost.screen.detail_story;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import com.example.storyghost.R;
import com.example.storyghost.data.model.Story;
import com.example.storyghost.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
    public static final String PARAM_STORY = "PARAM_STORY";

    private DetailViewModel detailViewModel;

    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initView();
    }

    public static Intent moveToDetailScreen(Context context, Story story) {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra(PARAM_STORY, (Parcelable) story);
        return intent;
    }

    private void initView() {
        detailViewModel = ViewModelProviders.of(this).get(DetailViewModel.class);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);
        binding.setViewModel(detailViewModel);
        if (getIntent() != null) {
            Story story = getIntent().getParcelableExtra(PARAM_STORY);
            detailViewModel.setStory(story);
        }
    }

}
