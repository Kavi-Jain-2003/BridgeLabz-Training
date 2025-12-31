//Create a Person class with a copy constructor that clones another person's attributes.
public class Person {
	// attributes
	String name;
	int age;
	// parametrized constructor
	Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	Person(Person p)
	{
		this.name=p.name;
		this.age=p.age;		
	}

	// instance method
	void displayPersonDetail() {
		System.out.println("name:" + name);
		System.out.println("age:" + age);
	}

	public static void main(String[] args) {
		Person p1= new Person("Pooja",22);
		p1.displayPersonDetail();
		Person p2= new Person(p1);
		p2.displayPersonDetail();
	}
}

