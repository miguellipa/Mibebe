package com.pe.mi.bebe.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.pe.mi.bebe.adapters.MenuListAdapter;
import com.pe.mi.bebe.R;

public class MenuActivity extends AppCompatActivity {

    private String MenuList[]=new String[]{
            "Informacion General",
            "Lista de Incidencias Medicas",
            "Incidencias Medicas",
            "Mi crecimiento",
            "Mis vacunas",
            "Mis Evidencias Medicas"};

    private Integer[] imgid={
            R.drawable.icono_informacion,
            R.drawable.informacion_historica,
            R.drawable.consulta_medica,
            R.drawable.iconocontrol,
            R.drawable.iconovacunas,
            R.drawable.indicencia_medica
    };
    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent principal = new Intent(view.getContext(),PrincipalActivity.class);
                startActivity(principal);

            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String nombre = getIntent().getStringExtra("childID");
        String childName = getIntent().getStringExtra("childName");

        TextView textView = (TextView) findViewById(R.id.titlenamechildtext);
        textView.setText(childName);

        MenuListAdapter adapter=new MenuListAdapter(this,MenuList,imgid);
        list=(ListView)findViewById(R.id.menu_list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Slecteditem= MenuList[+position];
                Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(view.getContext(),InformationActivity.class);
                        intent.putExtra("childID",getIntent().getStringExtra("childID"));
                        intent.putExtra("childName",getIntent().getStringExtra("childName"));
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(view.getContext(),RecordActivity.class);
                        intent.putExtra("childID",getIntent().getStringExtra("childID"));
                        intent.putExtra("childName",getIntent().getStringExtra("childName"));
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(view.getContext(),MedicalActivity.class);
                        intent.putExtra("childID",getIntent().getStringExtra("childID"));
                        intent.putExtra("childName",getIntent().getStringExtra("childName"));
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(view.getContext(),ControlGrowthActivity.class);
                        intent.putExtra("childID",getIntent().getStringExtra("childID"));
                        intent.putExtra("childName",getIntent().getStringExtra("childName"));
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(view.getContext(),ControlVaccinesActivity.class);
                        intent.putExtra("childID",getIntent().getStringExtra("childID"));
                        intent.putExtra("childName",getIntent().getStringExtra("childName"));
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(view.getContext(),MedicalevidenceActivity.class);
                        intent.putExtra("childID",getIntent().getStringExtra("childID"));
                        intent.putExtra("childName",getIntent().getStringExtra("childName"));
                        startActivity(intent);
                        break;
                }

                //Toast.makeText(getApplicationContext(), Slecteditem + "- " + position, Toast.LENGTH_SHORT).show();
            }
        });


    }

}
