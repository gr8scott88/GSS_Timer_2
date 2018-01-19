package com.waters.sysdev.gss_timer_2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity_ModuleSelect extends AppCompatActivity {

    ArrayList<Module> modules = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__module_select);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        this.generateModules();
        ListView listView = findViewById(R.id.list_modules);
        ModuleAdapter moduleAdapter = new ModuleAdapter(this, modules);
        listView.setAdapter(moduleAdapter);
    }


    private void generateModules(){
        modules.add(new Module(R.drawable.module_pda, "Module 1"));
        modules.add(new Module(R.drawable.module_pda, "Module 2"));
        modules.add(new Module(R.drawable.module_pda, "Module 3"));
        modules.add(new Module(R.drawable.module_pda, "Module 4"));
        modules.add(new Module(R.drawable.module_pda, "Module 5"));
    }

}
