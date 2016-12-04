package com.pe.mi.bebe.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import com.pe.mi.bebe.R;
import com.pe.mi.bebe.models.Child;

public class ChildArrayAdapter extends ArrayAdapter<Child> {

    public ChildArrayAdapter(Context context, List<Child> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        //Obteniendo una instancia del inflater
        LayoutInflater inflater = (LayoutInflater)getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //Salvando la referencia del View de la fila
        View listItemView = convertView;

        //Comprobando si el View no existe
        if (null == convertView) {
            //Si no existe, entonces inflarlo con image_list_view.xml
            listItemView = inflater.inflate(
                    R.layout.image_list_item,
                    parent,
                    false);
        }

        //Obteniendo instancias de los elementos
        TextView titulo = (TextView)listItemView.findViewById(R.id.text1);
        TextView subtitulo = (TextView)listItemView.findViewById(R.id.text2);
        ImageView categoria = (ImageView)listItemView.findViewById(R.id.category);


        //Obteniendo instancia de la Tarea en la posición actual
        Child item = getItem(position);

        //Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //String dateofbirth = formatter.format(item.getDate_of_birth());

        titulo.setText(item.getName());
        subtitulo.setText(item.getDateOfBirth());
        categoria.setImageResource(item.getPhoto());

        //Devolver al ListView la fila creada
        return listItemView;

    }
}