package com.pe.mi.bebe.adapters;

import java.util.ArrayList;
import java.util.List;

import com.pe.mi.bebe.R;
import com.pe.mi.bebe.models.Child;


public class DataSource {


    public static List<Child> CHILD=new ArrayList<Child>();

static{

    CHILD.add(new Child(1,"Luis","2016-04-03 11:33:22", R.drawable.iconbebe));
    CHILD.add(new Child(2,"Ana","2014-01-01 14:03:00",R.drawable.iconbebe));
    CHILD.add(new Child(3,"Jorge","2013-05-01 18:42:00",R.drawable.iconbebe));



}

}
