package com.soho.evgeny.troubleshootingtools;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class InstallationGroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_installation_group);
    }

    public Dialog startRemoteInstallCheck(){
        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        adb.setTitle("Input parameters");
        adb.setView(R.layout.remoteinstallcheck);
        adb.setPositiveButton("Start", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        return adb.create();
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        return super.onCreateDialog(id);
    }
}
