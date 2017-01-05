package com.example.animal;

public class RedTiger extends Animal implements PrintSomething{

	private String color;
	
	@Override
	public void settingColor(String s) {
		this.color = s;
	}

	@Override
	public void print() {
		if(color != null)
			System.out.println(color + " Tiger");
		else {
			System.out.println("need color...");
		}
	}
	
	public String getColor() {
		return color;
	}

}
