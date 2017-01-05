package com.example.animal;

public class TestMain {

	public static void main(String args[])	{
		Animal redTiger = new RedTiger();
		redTiger.settingColor("red");
		PrintSomething ps = (PrintSomething) redTiger;
		ps.print();
	}
}
