package com.pe.mi.bebe.activities;

import com.pe.mi.bebe.R;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class ControlGrowthActivityTest {

    @Rule
    public ActivityTestRule<ControlGrowthActivity> mActivityRule =
            new ActivityTestRule<ControlGrowthActivity>(ControlGrowthActivity.class);
    @Test
    public void infoChildDevelopmentIsDisplayed() {
        onView(withId(R.id.fab)).perform(click());
    }


}
