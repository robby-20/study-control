package Uebung1.src;

public class Person {

	String name;
	Person parent;
	
	public Person(String name, 
	              Person parent) {
		this.name = name;
		this.parent = parent;
	}
	
	public Person child() {
		Person child = new Person(this.name, this);
		return child;
	}
	
	public static void main(String[] args){
		Person darth = new Person("Vader", null);
		Person breha = new Person("Organa", null);
		Person leia = breha.child();
		Person ben = leia.child();
		Person anakin = new Person("Organa", leia);

		leia.parent = darth;
		leia.name += "-Vader";
		
		System.out.println(ben.parent.parent == darth);
		System.out.println(anakin.name);
		System.out.println(ben.name);
		System.out.println(darth.parent);
		System.out.println(darth.parent.name);
	}

}