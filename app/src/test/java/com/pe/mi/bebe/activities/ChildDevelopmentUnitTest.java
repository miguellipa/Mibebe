package com.pe.mi.bebe.activities;

import com.pe.mi.bebe.models.Child;
import com.pe.mi.bebe.models.ChildDevelopment;
import com.pe.mi.bebe.models.ChildDevelopmentPeriods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ChildDevelopmentUnitTest {
    @Mock
    ChildDevelopmentPeriods childDevelopmentPeriodsMock  = new ChildDevelopmentPeriods();
    @Test
    public void getMedicalEventEqualsChildName(){
        // Instancias
        Child child = new Child("Miguel");
        ChildDevelopment childDevelopment = new ChildDevelopment();
        // Test
        ChildDevelopmentPeriods childDevelopmentPeriods = new ChildDevelopmentPeriods(1,"2016-01-04",12.1,5.44,3.3,child,childDevelopment);
        assertEquals("Consulta control de crecimiento de Miguel", childDevelopmentPeriods.getChildDevelopmentPeriods());
    }
    @Test
    public void getHeadCircunferenceIsCorrect() throws Exception{
        when(childDevelopmentPeriodsMock.getHeadCircunference()).thenReturn(22.5);
        assertEquals("Value is different",22.3, childDevelopmentPeriodsMock.getHeadCircunference());
    }

}
