package com.ruicai.java.entity;

public class Animal {
     private String name;
     private String cry;
     private String mouth;
     
    public String getMouth() {
		return mouth;
	}
	public void setMouth(String mouth) {
		this.mouth = mouth;
	}
	public Animal(String name, String cry) {
		super();//object 可以注释掉
		this.name = name;
		this.cry = cry;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCry() {
		return cry;
	}
	public void setCry(String cry) {
		this.cry = cry;
	}
	



      public void eat(String mouth){
		System.out.println(mouth+"嘴吃的开心");
	}
}