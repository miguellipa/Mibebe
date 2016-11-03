package com.pe.mi.bebe.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.pe.mi.bebe.R;

/**
 * Created by MIGUEL on 5/07/2016.
 */
public class MenuListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] integers;

    public MenuListAdapter(Activity context, String[] itemname, Integer[] integers) {
        super(context, R.layout.list_file, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.integers=integers;
    }

    public View getView(int posicion, View view, ViewGroup parent){

        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_file,null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.principal_text);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

        txtTitle.setText(itemname[posicion]);
        imageView.setImageResource(integers[posicion]);

        return rowView;
    }


}
