package com.codepath.android.booksearch;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.codepath.android.booksearch.activities.BookDetailActivity;

import org.junit.Rule;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class BookDetailsActivityTests {

    @Rule
    public ActivityTestRule<BookDetailActivity> ActivityRule =
            new ActivityTestRule<>(BookDetailActivity.class);

    //Write tests for BookDetailsActivity here

}
