package com.codepath.recyclerviewlab.adapters;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codepath.recyclerviewlab.R;
import com.codepath.recyclerviewlab.models.Article;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ArticleResultsRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final List<Article> articleList = new ArrayList<>();

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_article_result, parent, false);

        return new ArticleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Article article = articleList.get(position);
        ArticleViewHolder articleViewHolder = (ArticleViewHolder) holder;
        articleViewHolder.headlineView.setText(article.headline.main);
        articleViewHolder.snippetView.setText(article.snippet);
        articleViewHolder.dateView.setText(article.publishDate);
    }

    public void setNewArticles(List<Article> articles){
        articleList.clear();
        articleList.addAll(articles);
    }

    void addArticles(List<Article> articles){
        articleList.addAll(articles);
    }
    @Override
    public int getItemCount() {
        return articleList.size();
    }

    static class ArticleViewHolder extends RecyclerView.ViewHolder {
        final TextView headlineView;
        final TextView snippetView;
        final TextView dateView;

        ArticleViewHolder(View view) {
            super(view);
            dateView = view.findViewById(R.id.article_pub_date);
            headlineView = view.findViewById(R.id.article_headline);
            snippetView = view.findViewById(R.id.article_snippet);
        }
    }
}
