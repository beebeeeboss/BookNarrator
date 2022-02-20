package com.haryanvis.booknarrator.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.haryanvis.booknarrator.R;
import com.haryanvis.booknarrator.model.Book;
import com.haryanvis.booknarrator.model.HomeSection;
import com.haryanvis.booknarrator.view.ViewHomeMain;

import java.util.List;

public class HomeMainController extends RecyclerView.Adapter<ViewHomeMain> {
    private List<HomeSection> sections;
    private Context context;

    //for getting List from HomeScreen
    public HomeMainController(List<HomeSection> sections) {
        this.sections = sections;
    }

    @NonNull
    @Override
    public ViewHomeMain onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View viewHomeMain = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_home_item,parent,false);
        return new ViewHomeMain(viewHomeMain);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHomeMain holder, int position) {
        holder.getSectionTitle().setText(sections.get(position).getSectionTitle());

        //Setting Recycler View Inside the Section's Recycler View

        List<Book> bookList = sections.get(position).getBooks();

        if(bookList != null) {
            RecyclerView bookRV = holder.getRvBooks();
            SectionMainController rvAdapter = new SectionMainController(bookList);
            bookRV.setAdapter(rvAdapter);
            bookRV.setLayoutManager(new LinearLayoutManager(context , LinearLayoutManager.HORIZONTAL ,false));

        }

    }

    @Override
    public int getItemCount() {
        return sections.size();
    }
}
