package com.haryanvis.booknarrator.view;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.haryanvis.booknarrator.R;

public class ViewHomeMain extends RecyclerView.ViewHolder {
    private TextView sectionTitle , tvSeeAll ;
    private RecyclerView rvBooks;
    public ViewHomeMain(@NonNull View itemView) {
        super(itemView);
        sectionTitle = itemView.findViewById(R.id.sectionTitle);
        tvSeeAll = itemView.findViewById(R.id.tvSeeAll);
        rvBooks = itemView.findViewById(R.id.rvBooks);
    }

    public TextView getSectionTitle() {
        return sectionTitle;
    }

    public TextView getTvSeeAll() {
        return tvSeeAll;
    }

    public RecyclerView getRvBooks() {
        return rvBooks;
    }
}
