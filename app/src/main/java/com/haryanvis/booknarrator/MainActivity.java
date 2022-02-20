package com.haryanvis.booknarrator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toolbar;

import com.haryanvis.booknarrator.controller.HomeMainController;
import com.haryanvis.booknarrator.model.Book;
import com.haryanvis.booknarrator.model.HomeSection;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView sectionsRV;
    private List<HomeSection> sections;
    private HomeMainController rvAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        initVars();



        Book ramNaamSatya = new Book(1,"Ram Naam Satya Hai","Devotional","Hindi","jbjhbhj",
                90.67,6, "https://cdn.pixabay.com/photo/2021/03/29/10/33/rama-6133619_1280.png");
        Book mahakaal = new Book(2,"Mahakal","Devotional","Hindi","fgsgegfs",86.98,8,"https://cdn.pixabay.com/photo/2020/09/09/21/09/shiva-5558695_1280.png");

        List<Book> books = new ArrayList<>();

        books.add(ramNaamSatya);
        books.add(mahakaal);

        addSections("New Titles",books);

        sectionsRV.setAdapter(rvAdapter);
        sectionsRV.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));

        refreshLayout();
    }

    //for Refresh the Layout
    private void refreshLayout() {
        rvAdapter.notifyDataSetChanged();
    }

    //For Adding the New Sections in Home Screen of App
    private void addSections(String sectionName, List<Book> bookList) {
        HomeSection section = new HomeSection(sectionName,bookList);
        sections.add(section);
    }

    //used for initialize the Variables
    private void initVars()
    {
        sectionsRV= findViewById(R.id.rvHomeMain);
        sections = new ArrayList<>();
        rvAdapter = new HomeMainController(sections);
    }


}


