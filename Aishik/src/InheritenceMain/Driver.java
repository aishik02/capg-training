package InheritenceMain;

public class Driver {
	public static void main(String[] args) {
		Animal animal=new Animal();
		Dog dog=new Dog();
		
		//non static variable of animal
		System.out.println(animal.a);
		System.out.println(dog.a);
		
		
		//non static variable of dog
		System.out.println(dog.b);
		
		//static variable of animal
		System.out.println(Animal.x);
		System.out.println(Dog.x);
		
		//static variable of dog
		System.out.println(Dog.y);
		
		//non-static method of animal
		animal.methodOfParent();
		dog.methodOfParent();
		
		//non static method of dog
		dog.methodOfChild();
		
		//static method of animal
		Animal.methodOfParent2();
		Dog.methodOfParent2();
		
		//static method of dog
		Dog.methodOfChild2();
		
		
	}
}
