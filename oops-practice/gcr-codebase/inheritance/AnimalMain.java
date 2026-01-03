//Animal Hierarchy
class Animal {
	String name;
	int age;

	public void makeSound() {
		System.out.println("Animal making sound");
	}
}

class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Barking...");
	}
}

class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Meow Meow...");
	}
}

class Bird extends Animal {
	@Override
	public void makeSound() {
		System.out.println("humming...");
	}
}

public class AnimalMain {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.makeSound();
		Cat c = new Cat();
		c.makeSound();
		Bird b = new Bird();
		b.makeSound();
	}
}
