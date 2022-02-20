package com.haryanvis.booknarrator.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.haryanvis.booknarrator.R;
import com.haryanvis.booknarrator.model.Book;
import com.haryanvis.booknarrator.view.ViewSectionMain;

import java.util.List;

public class SectionMainController extends RecyclerView.Adapter<ViewSectionMain> {

    private List<Book> books;
    private Context context;

    public SectionMainController(List<Book> books) {
        this.books = books;
    }

    @NonNull
    @Override
    public ViewSectionMain onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_section_item,parent,false);
        return new ViewSectionMain(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewSectionMain holder, int position) {
        Book currentBook = books.get(position);
        if(currentBook != null) {
            if (currentBook.getName() != null) {
                holder.getBookTitleTV().setText(currentBook.getName());
            }

            if(currentBook.getCoverImage() != null) {
                Glide.with(context).load(books.get(position).getCoverImage()).placeholder(R.drawable.book_cover).into(holder.getBookImageView());
            }
        }
    }

    @Override
    public int getItemCount() {
        return books.size();
    }
}
