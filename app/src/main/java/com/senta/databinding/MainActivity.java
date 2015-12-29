package com.senta.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.senta.databinding.databinding.MainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainBinding activity = DataBindingUtil.setContentView(this,R.layout.main);
        activity.etText.setText("Good Evening");
        activity.tvFirstName.setText("Hi");
    }
}
