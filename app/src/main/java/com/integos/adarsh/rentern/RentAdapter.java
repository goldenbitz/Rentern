package com.integos.adarsh.rentern;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class RentAdapter extends BaseAdapter {
    int img[]={R.drawable.car24,R.drawable.bike24,R.drawable.scooter24,R.drawable.bus24,R.drawable.camera24,R.drawable.dress24};
    String sub[]={"Car","Bike","Scooter","Bus","Camera","dress"};
 Context context;
    public RentAdapter(Context c) {
       this.context=c;
    }

    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public Object getItem(int position) {
        return img[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.adapter_item_rent,parent,false);
        LinearLayout linearLayout=(LinearLayout)convertView.findViewById(R.id.linear_id_rent);
        ImageButton imageButton=(ImageButton)convertView.findViewById(R.id.img_id_adapter);
        TextView textView=(TextView)convertView.findViewById(R.id.txt_id_adapter);
        textView.setText(sub[position]);
        imageButton.setImageResource(img[position]);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, ""+position, Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }
}
