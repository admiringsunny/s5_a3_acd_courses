package com.acadgild.s5A3AcadGildCourses;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by sunny on 25/8/16.
 */
public class MentorsActivity extends Activity {
    TextView mentorName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentors);

        Intent intentFromCourses = getIntent();
        mentorName = (TextView) findViewById(R.id.mentor_name);
        mentorName.setText(intentFromCourses.getStringExtra("mentor"));

    }
}
