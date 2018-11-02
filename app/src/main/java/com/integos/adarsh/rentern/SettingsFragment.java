package com.integos.adarsh.rentern;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SettingsFragment extends android.support.v4.app.Fragment {
    ListView listView;
    TextView textView;
    List<String> list=new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.setting_fragment,container,false);
        listView=(ListView)v.findViewById(R.id.list_id_settings);
        textView=(TextView)v.findViewById(R.id.txt_id_setting);
        list.add("Edit profile");
        list.add("Edit post");
        list.add("Rate App");
        list.add("Share App");
        list.add("Help and Support");
        list.add("Terms and Conditions");
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView.setText("Adarsh K A");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Objects.requireNonNull(getActivity()),
                android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
        listView.setPadding(6,8,6,8);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), ""+position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
