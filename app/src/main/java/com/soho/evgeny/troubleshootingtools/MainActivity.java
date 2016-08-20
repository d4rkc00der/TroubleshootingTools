package com.soho.evgeny.troubleshootingtools;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startInstallGroup(View view){
        Intent intent = new Intent(this,InstallationGroupActivity.class);
        startActivity(intent);
    }

    public void startVMWareGroup(View view){
        Intent intent = new Intent(this,VMWareGroupActivity.class);
        startActivity(intent);
    }

    public void startHypervGroup(View view){
        Intent intent = new Intent(this,HypervGroupActivity.class);
        startActivity(intent);
    }
}
