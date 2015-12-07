package com.example.kimcuc.raovat.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kimcuc.raovat.DTO.list_menu;
import com.example.kimcuc.raovat.R;

import java.util.List;

/**
 * Created by KimCuc on 10/23/2015.
 */
public class ListMenuAdapter extends ArrayAdapter<list_menu> {
    Context context;
    int resource;
    List<list_menu> list;
    TextView name;
    ImageView image;




    public ListMenuAdapter(Context context, int resource, List<list_menu> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.list = objects;
    }

    @Override
    public View getView(final int position, View v, ViewGroup viewGroup){
        View view = View.inflate(context, resource, null);
        name = (TextView) view.findViewById(R.id.menu_text);
        image= (ImageView)view.findViewById(R.id.menu_image);
        final list_menu ma = list.get(position);

        name.setText(ma.getName());
        int a= ma.getImage();
        image.setImageResource(a);

        return view;
    }

}
