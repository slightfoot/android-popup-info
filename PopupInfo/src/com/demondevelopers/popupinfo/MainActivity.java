package com.demondevelopers.popupinfo;

import com.demondevelopers.popupinfo.R;
import com.demondevelopers.popupinfo.model.People;

import android.os.Bundle;
import android.app.Activity;
import android.view.ViewGroup;


public class MainActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ViewGroup people = (ViewGroup)findViewById(R.id.people);
		for(int i = 0; i < People.PEOPLE.length; i++){
			people.addView(People.inflatePersonView(this, people, People.PEOPLE[i]));
		}
	}
}
