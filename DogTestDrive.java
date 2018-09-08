//# OOP
//you will find all the object oriented programse here
class Dog{
	int size;
	String  breed ;
	String name;
	void bark(){
	System.out.println("Ruff, Ruff");
	System.out.println("Doge size "+ size);
	System.out.println("Breed is " + breed );
	System.out.println("Name is " + name);
}
}
class DogTestDrive{
	public static void main (String[] args)
	{
		Dog d = new Dog();
 		d.size =40;
 		d.breed = "labrador";
 		d.name = "Golu";
 		d.bark();

 	}

}
