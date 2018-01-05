package com.noah.bcquiz;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new AlertDialog.Builder(this)
                .setTitle(R.string.disclaimer_title)
                .setMessage(R.string.disclaimer_message)
                .setNeutralButton(R.string.disclaimer_button, null)
                .show();

        TextView who = (TextView) findViewById(R.id.link_who);
        who.setMovementMethod(LinkMovementMethod.getInstance());

        TextView yourLife = (TextView) findViewById(R.id.link_your_life);
        yourLife.setMovementMethod(LinkMovementMethod.getInstance());
    }




}
