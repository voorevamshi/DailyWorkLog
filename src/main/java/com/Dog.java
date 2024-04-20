package com;

public class Dog {
	public String breed = "German shepard";
	public int height = 35;
	public int weight = 30;

	public static String breed1 = "UK shepard";
	public static int height1 = 99;
	public static int weight1 = 40;

	public static void main(String[] args) {
		System.out.println(breed1);
		System.out.println(height1);
		System.out.println(weight1);
		System.out.println(m2());
		
		Dog dog = new Dog();
		System.out.println(dog.m1());
		System.out.println(dog.breed);
		System.out.println(dog.height);
		System.out.println(dog.weight);
		System.out.println(Short.SIZE / 8);
		System.out.println(Integer.SIZE / 8);
		System.out.println(Float.SIZE / 8);
		System.out.println(Double.SIZE / 8);
		System.out.println(Character.SIZE / 8);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);

	}

	public int m1() {
		return 10;
	}
	public static int m2() {
		return 11;
	}
}
