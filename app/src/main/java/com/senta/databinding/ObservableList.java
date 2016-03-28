package com.senta.databinding;

import android.databinding.ObservableArrayList;

/**
 * Created by "Nilesh Senta" on 3/28/2016.
 */
public class ObservableList {
    public ObservableArrayList<UserDTO> listItems = new ObservableArrayList<>();

    public ObservableList() {

    }

    public void add(UserDTO dto) {
        listItems.add(dto);
    }

    public void remove(int position) {
        listItems.remove(position);
    }

}
