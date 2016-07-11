package pe.edu.urp.mibebe;

import java.util.ArrayList;
import java.util.List;

import pe.edu.urp.mibebe.models.Child;


public class DataSource {


    static List<Child> CHILD=new ArrayList<Child>();

static{

    CHILD.add(new Child(1,"Luis","2016-04-03 11:33:22",R.drawable.iconbebe));
    CHILD.add(new Child(2,"Ana","2014-01-01 14:03:00",R.drawable.iconbebe));
    CHILD.add(new Child(3,"Jorge","2013-05-01 18:42:00",R.drawable.iconbebe));



}

}
