package com.ques4;

public class Main {
	public static void main(String[] args) {
		Animal[] aniArr = {new Cat(), new Dog(), new Tiger()};
		
//		aniArr[0] = new Cat();
//		aniArr[1] = new Dog();
//		aniArr[2] = new Tiger();
		
		
		for(int i=0; i<aniArr.length; i++) {
			aniArr[i].makeNoise();
			aniArr[i].eat();
			aniArr[i].walk();
		}
	}
}

class Animal{
	public void makeNoise(){
		System.out.println("Animal making Noise");
	}
	public void eat(){
		System.out.println("Animal is eating");
	}
	public void walk(){
		System.out.println("Animal is walking");
	}
}
class Dog extends Animal{
	@Override
	public void makeNoise(){
		System.out.println("Barking...");
	}
}
class Cat extends Animal{
	@Override
	public void makeNoise(){
		System.out.println("Meaw...");
	}
}
class Tiger extends Animal{
	@Override
	public void makeNoise(){
		System.out.println("Roaring...");
	}
}
