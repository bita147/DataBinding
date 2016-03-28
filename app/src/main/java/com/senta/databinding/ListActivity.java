package com.senta.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.senta.databinding.databinding.ActivityListBinding;

public class ListActivity extends AppCompatActivity {
    private ActivityListBinding listBinding;
    private ObservableList list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listBinding =  DataBindingUtil.setContentView(this,R.layout.activity_list);

        list = new ObservableList();
        listBinding.setList(list);

        list.add(new UserDTO("Username","Password")); // User need not worry for notify listview.

    }
}
