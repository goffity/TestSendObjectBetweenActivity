package com.goffity.demo.test.sendobjectbwtact.object;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableObject implements Parcelable {

	private String name;
	private String lastname;
	private int age;

	private ParcelableObject(Parcel in) {
		setName(in.readString());
		setLastname(in.readString());
		setAge(in.readInt());
	}

	public ParcelableObject() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel out, int flags) {
		out.writeString(getName());
		out.writeString(getLastname());
		out.writeInt(getAge());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static final Parcelable.Creator<ParcelableObject> CREATOR = new Parcelable.Creator<ParcelableObject>() {
		public ParcelableObject createFromParcel(Parcel in) {
			return new ParcelableObject(in);
		}

		public ParcelableObject[] newArray(int size) {
			return new ParcelableObject[size];
		}
	};

}
