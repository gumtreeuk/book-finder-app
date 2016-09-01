package com.codepath.android.booksearch;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.codepath.android.booksearch.activities.BookListActivity;

import org.junit.Rule;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class BookListActivityTests {

    @Rule
    public ActivityTestRule<BookListActivity> ActivityRule =
            new ActivityTestRule<>(BookListActivity.class);

    //Write tests for BookListActivity here

}
