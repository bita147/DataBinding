package com.senta.databinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.senta.databinding.databinding.RowListItemBinding;

/**
 * Created by "Nilesh Senta" on 3/28/2016.
 */
public class ListAdapter extends BaseAdapter {
    private ObservableArrayList<UserDTO> list;
    private LayoutInflater inflater;
    private RowListItemBinding binding;

    public ListAdapter(ObservableArrayList<UserDTO> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null) {
            inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        binding = DataBindingUtil.inflate(inflater, R.layout.row_list_item, parent, false);
        binding.setMyDTO(list.get(position));
        return binding.getRoot();
    }
}
