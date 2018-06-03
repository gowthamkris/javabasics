package com.personal;

public class thirumalaiProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		// TODO Auto-generated method stub
		System.out.println(ProfileConstant.FIRST_NAME+   "Thirumali");
		System.out.println(ProfileConstant.LAST_NAME+  "Rajan");
		System.out.println(ProfileConstant.AGE+   "20");
	}

	@Override
	public void myHpbbies() {
		// TODO Auto-generated method stub
		System.out.println(ProfileConstant.HOBBIES+ " Watching tv");

	}

}
