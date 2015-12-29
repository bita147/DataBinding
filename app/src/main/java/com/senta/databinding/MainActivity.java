package com.senta.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.senta.databinding.databinding.MainBinding;

public class MainActivity extends AppCompatActivity {
    MainBinding mainActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivity = DataBindingUtil.setContentView(this,R.layout.main);
        initLayout();
        mainActivity.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uName = mainActivity.etUsername.getText().toString();
                String pass = mainActivity.etPassword.getText().toString();
                if (uName.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin")){
                    Toast.makeText(MainActivity.this,"Login Success",Toast.LENGTH_LONG).show();
                }else
                    Toast.makeText(MainActivity.this,"Login Failed",Toast.LENGTH_LONG).show();
            }
        });
    }

    private void initLayout() {
        mainActivity.tvLoginCap.setText("Login");
        mainActivity.etUsername.setText("Admin");
        mainActivity.etPassword.setText("Admin");
    }
}
