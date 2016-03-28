package com.senta.databinding;

import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.widget.ListView;

/**
 * Created by "Nilesh Senta" on 3/28/2016.
 */
public class ListBinder {

    @BindingAdapter("bind:items")
    public static void bindList(ListView listView, ObservableArrayList<UserDTO> list) {
        ListAdapter adp = new ListAdapter(list);
        listView.setAdapter(adp);
    }
}

