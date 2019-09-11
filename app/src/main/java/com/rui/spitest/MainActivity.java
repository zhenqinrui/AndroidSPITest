package com.rui.spitest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.rui.modulea.ModuleAActivity;
import com.rui.moduleb.ModuleBActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void moduleAClick(View view) {
        startActivity(new Intent(this, ModuleAActivity.class));
    }

    public void moduleBClick(View view) {
        startActivity(new Intent(this, ModuleBActivity.class));
    }
}
