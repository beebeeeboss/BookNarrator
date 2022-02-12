package com.haryanvis.booknarrator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toolbar;

import com.haryanvis.booknarrator.controller.HomeMainController;
import com.haryanvis.booknarrator.model.HomeSection;

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

        initVars();
        for(int i = 0 ; i < 5 ; i++)
        addSections("Section "+(i+1));

        sectionsRV.setAdapter(rvAdapter);
        sectionsRV.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));

        refreshLayout();
    }

    //for Refresh the Layout
    private void refreshLayout() {
        rvAdapter.notifyDataSetChanged();
    }

    //For Adding the New Sections in Home Screen of App
    private void addSections(String sectionName) {
        HomeSection section = new HomeSection(sectionName);
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