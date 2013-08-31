package com.demondevelopers.popupinfo.model;

import android.os.Parcel;
import android.os.Parcelable;


public class Person implements Parcelable
{
	private final int    mId;
	private final int    mIcon;
	private final String mName;
	private final String mStatus;
	
	
	public Person(int id, int icon, String name, String status)
	{
		mId     = id;
		mIcon   = icon;
		mName   = name;
		mStatus = status;
	}
	
	public int getId()
	{
		return mId;
	}
	
	public int getIcon()
	{
		return mIcon;
	}
	
	public String getName()
	{
		return mName;
	}
	
	public String getStatus()
	{
		return mStatus;
	}
	
	// -- Parcel
	
	private Person(Parcel in)
	{
		mId     = in.readInt();
		mIcon   = in.readInt();
		mName   = in.readString();
		mStatus = in.readString();
	}
	
	@Override
	public void writeToParcel(Parcel dest, int flags)
	{
		dest.writeInt(mId);
		dest.writeInt(mIcon);
		dest.writeString(mName);
		dest.writeString(mStatus);
	}
	
	// -- Parcelable
	
	@Override
	public int describeContents()
	{
		return 0;
	}
	
	public static final Parcelable.Creator<Person> CREATOR = new Parcelable.Creator<Person>()
	{
		public Person createFromParcel(Parcel in)
		{
			return new Person(in);
		}
		
		public Person[] newArray(int size)
		{
			return new Person[size];
		}
	};
}