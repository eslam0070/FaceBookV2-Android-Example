package com.eso.face.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eso.face.R;
import com.eso.face.models.Post;

import java.util.ArrayList;
import java.util.List;


public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    private List<Post> post = new ArrayList<>();
    private Context context;

    public PostAdapter(List<Post> post, Context context) {
        this.post = post;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.post_item, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Post posts = post.get(position);
        holder.mTitle.setText(posts.getTitle());
        holder.mDesc.setText(posts.getBody());
    }

    @Override
    public int getItemCount() {
        if (post == null) return 0;
        return post.size();
    }

    public void setList(List<Post> moviesList) {
        this.post = moviesList;
        notifyDataSetChanged();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTitle,mDesc;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.title);
            mDesc = itemView.findViewById(R.id.desc);
        }

    }
}
