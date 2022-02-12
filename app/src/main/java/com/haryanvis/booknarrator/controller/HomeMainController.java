package com.haryanvis.booknarrator.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.haryanvis.booknarrator.R;
import com.haryanvis.booknarrator.model.HomeSection;
import com.haryanvis.booknarrator.view.ViewHomeMain;

import java.util.List;

public class HomeMainController extends RecyclerView.Adapter<ViewHomeMain> {
    private List<HomeSection> sections;

    //for getting List from HomeScreen
    public HomeMainController(List<HomeSection> sections) {
        this.sections = sections;
    }

    @NonNull
    @Override
    public ViewHomeMain onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewHomeMain = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_home_item,parent,false);
        return new ViewHomeMain(viewHomeMain);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHomeMain holder, int position) {
        holder.getSectionTitle().setText(sections.get(position).getSectionTitle());

    }

    @Override
    public int getItemCount() {
        return sections.size();
    }
}
