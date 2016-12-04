package com.pe.mi.bebe.activities;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import com.pe.mi.bebe.R;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MedicalEvidenceActivityTest {
    @Rule
    public ActivityTestRule<MedicalevidenceActivity> mActivityRule = new ActivityTestRule<>(MedicalevidenceActivity.class);
    @Test
    public void ChildNameIsDisplayed() {
        onView(withText("Luis")).check(matches(isDisplayed()));
    }
    @Test
    public void verifyMedicalEvidenceTest() {
        onView(withId(R.id.date_evidence)).perform(typeText("3/12/2016"), closeSoftKeyboard());
        onView(withId(R.id.btnSelectPhoto2)).perform(click());
        onView(withText("Cancelar")).perform(click());
        onView(withId(R.id.txtSintomatologia)).perform(click()).perform(typeText("Sintomas de fiebre y gripe"), closeSoftKeyboard());
        onView(withId(R.id.fab)).perform(click());
    }

}
