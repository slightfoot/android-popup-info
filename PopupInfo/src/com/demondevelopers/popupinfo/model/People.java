package com.demondevelopers.popupinfo.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.demondevelopers.popupinfo.PersonBubbleActivity;
import com.demondevelopers.popupinfo.R;


public final class People
{
	public static Person[] PEOPLE = {
		new Person(1, R.drawable.person1, "Betty Boo", "is having her hair cut at 6pm"),
		new Person(1, R.drawable.person2, "Lisa James", "is going to Avicii live ft.. event"),
		new Person(1, R.drawable.person3, "Justin Richo", "is a douchebag with a massive hair-do"),
		new Person(1, R.drawable.person4, "Katey Price", "cant wait to see Iron Man 3")
	};
	
	public static View inflatePersonView(Context context, ViewGroup parent, Person person)
	{
		LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		ImageButton personView = (ImageButton)inflater.inflate(R.layout.button_person, parent, false);
		personView.setImageDrawable(context.getResources().getDrawable(person.getIcon()));
		personView.setContentDescription(person.getName());
		personView.setOnClickListener(mClickPersonView);
		personView.setTag(person);
		return personView;
	}
	
	private static View.OnClickListener mClickPersonView = new View.OnClickListener()
	{
		@Override
		public void onClick(View v)
		{
			Context context = v.getContext();
			context.startActivity(PersonBubbleActivity.createIntent(context, v, (Person)v.getTag()));
		}
	};
}
