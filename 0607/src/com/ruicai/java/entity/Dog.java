package com.ruicai.java.entity;

public class Dog extends Animal {
	
     public Dog(String name, String cry) {
    	 
		super(name, cry);
		// TODO Auto-generated constructor stub
	}
     
     public String toString(){
    	 return "����"+this.getName()+"����"+this.getCry();
    }
/**
 * �ڴ���dog�����ʱ���ǳ�ʼ����Animal�������
 * �ĳ�Ա������
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
      * ��д
      * @see com.ruicai.java.entity.Animal#eat(java.lang.String)
      */
     public void eat(String mouth){
    	 super.eat(mouth);
    	 System.out.println("dogֻ���");
     }
}
