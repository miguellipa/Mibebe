package com.pe.mi.bebe.activities;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import com.pe.mi.bebe.R;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.allOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
@RunWith(AndroidJUnit4.class)
public class ControlVaccinesActivityTest {
    @Rule
    public ActivityTestRule<ControlVaccinesActivity> mActivityRule = new ActivityTestRule<>(ControlVaccinesActivity.class);
    @Test
    public void ChildNameIsDisplayed() {
        onView(withText("Luis")).check(matches(isDisplayed()));
    }
    @Test
    public void helloWithNameIsDisplayed() {
        onView(withId(R.id.spinner_vaccine)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Polio 1"))).perform(click());
        onView(withId(R.id.date)).perform(typeText("3/12/2016"), closeSoftKeyboard());
        onView(withId(R.id.btnSelectPhoto)).perform(click());
        onView(withText("Cancelar")).perform(click());
        onView(withId(R.id.fab)).perform(click());
    }
}
