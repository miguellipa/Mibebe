package com.pe.mi.bebe.activities;

import com.pe.mi.bebe.models.Child;
import com.pe.mi.bebe.models.VaccineChild;
import com.pe.mi.bebe.models.VaccinePlan;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class VaccineChildUnitTest {

    @Mock
    VaccineChild vaccineChildMock = new VaccineChild();
    @Test
    public void getMedicalEventEqualsChildName(){
    Child child = new Child("Miguel");
    VaccinePlan vaccine_plan = new VaccinePlan();
    VaccineChild vaccine_child = new VaccineChild(1,"2016-03-01",1,"2016-01-02",child,vaccine_plan);
    assertEquals("Consulta plan de vacunación de Miguel", vaccine_child.getVaccineChildPlan());
    }
    @Test
    public void getVaccineNameIsCorrect() throws Exception{
        when(vaccineChildMock.getVaccineName()).thenReturn("Sarampion");
        assertEquals("Value is different","Sarampion", vaccineChildMock.getVaccineName());
    }

}
