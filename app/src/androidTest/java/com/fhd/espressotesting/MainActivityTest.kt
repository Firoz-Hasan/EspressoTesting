package com.fhd.espressotesting

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest {
    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    private val mName = "Firoz"
    @Test
    fun listGoesOverTheFold() {
        onView(withId(R.id.etTextToChange)).perform(typeText(mName))
        closeSoftKeyboard()
        onView(withId(R.id.btnChange)).perform(click())
        onView(withId(R.id.tvChangedText)).check(matches(withText(mName)));
    }
    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }
}