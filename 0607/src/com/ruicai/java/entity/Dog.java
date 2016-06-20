package com.ruicai.java.entity;

public class Dog extends Animal {
	
     public Dog(String name, String cry) {
    	 
		super(name, cry);
		// TODO Auto-generated constructor stub
	}
     
     public String toString(){
    	 return "名字"+this.getName()+"叫声"+this.getCry();
    }
/**
 * 在创建dog对象的时候，是初始化了Animal这个父类
 * 的成员变量，
 */
	//private String color;
     
     public static void main(String[] args) {
		Dog faqiang = new Dog("faqiang", "wangwang");
		Dog zhouyong = new Dog("tiaotiao", "miemie");
		System.out.println(faqiang.toString());
		System.out.println(zhouyong.toString());
		faqiang.eat("faqiang");
	}
     /**
      * 重写
      * @see com.ruicai.java.entity.Animal#eat(java.lang.String)
      */
     public void eat(String mouth){
    	 super.eat(mouth);
    	 System.out.println("dog只会吃");
     }
}
