package com.personal;

public class gowthamProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		
		System.out.println(ProfileConstant.FIRST_NAME+"gowtham");
		System.out.println(ProfileConstant.LAST_NAME+"karthick");
		System.out.println(ProfileConstant.AGE+"21");
	}

	@Override
	public void myHpbbies() {
		System.out.println(ProfileConstant.HOBBIES+ "reading books");
		
	}

}
