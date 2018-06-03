package com.personal;

public class TestProfile {
public static void	printprofile(IProfile profile)
{
profile.myBasicInfo();
profile.myHpbbies();
	
}
	
public static void main(String[] args) {
	IProfile myProfile;
	//myProfile=new gowthamProfile();
	//printprofile(myProfile);
	myProfile=new thirumalaiProfile();
	printprofile(myProfile);
	
	
		
	}
}
