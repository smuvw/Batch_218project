package com.Testing;

public class classA {
	
	//instance variable 
	
	int studNo; //default value is 0
	String StudName; //default value is Null
	
	//Constructor name should same with class Name
	public classA(){
		System.out.println("this is classA constructor");
	}
	public classA(int a){
		System.out.println("a value is " + a);
	}
	public classA(int a,int b){
		System.out.println("a value is " + a +"****"+ b);
	}
	
	public classA(int studNo,String StudName){
		
		this.studNo=studNo;
		this.StudName=StudName;
		
		System.out.println("Student number is " + studNo);
		System.out.println("Student Name is " + StudName);
	}

}
