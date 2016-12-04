package com.pe.mi.bebe.activities;

import com.pe.mi.bebe.models.Child;
import com.pe.mi.bebe.models.Doctor;
import com.pe.mi.bebe.models.HealthProblem;
import com.pe.mi.bebe.models.MedicalEvent;
import com.pe.mi.bebe.models.MedicalExam;
import com.pe.mi.bebe.models.Medicine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MedicalEventUnitTest {

    @Mock
    MedicalEvent medicalEventMock = new MedicalEvent();
    @Test
    public void getMedicalEventEqualsChildName(){
        MedicalExam medicalExam = new MedicalExam();
        Child child = new Child("Miguel");
        Medicine medicina = new Medicine();
        Doctor doctor = new Doctor();
        HealthProblem healthProblem= new HealthProblem();

        MedicalEvent medicalEvent = new MedicalEvent(1,"Gripe","2016-01-02",medicalExam,child,1,medicina,doctor,healthProblem);
        assertEquals("Consultar indidencia medica de Miguel", medicalEvent.getMedicalEvent());
    }
    @Test
    public void getDoctorNameIsCorrect() throws Exception{
        when(medicalEventMock.getDoctorName()).thenReturn("Manuel Medina");
        assertEquals("Value is different","Manuel Medina", medicalEventMock.getDoctorName());
    }

}
