package com.acadgild.s5A3AcadGildCourses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CoursesListActivity extends AppCompatActivity {

    ListView coursesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_list);

        final String[] coursesArray = getResources().getStringArray(R.array.courses_names);
        final String[] mentorsArray = getResources().getStringArray(R.array.course_mentors);

        coursesList = (ListView) findViewById(R.id.courses_list);
        ArrayAdapter<String > aa = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, coursesArray);
        coursesList.setAdapter(aa);

        coursesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent toMentorsActivity = new Intent(getApplicationContext(), MentorsActivity.class);
                toMentorsActivity.putExtra("mentor", mentorsArray[position]);
                startActivity(toMentorsActivity);
            }
        });
    }
}
