package a.b.c.d;

class Person {
	private String name;

	void setName(String name) { this.name = name; }
	String getName() { return this.name; }
	
};

public class Reflect {
	public static void main(String args[]) {
		Person p = new Person();
		Class<?> c1 = null;

		try {
			c1 = Class.forName("a.b.c.d.Person");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
		Class<?> c2 = p.getClass();
		Class<?> c3 = Person.class;

		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());

		int arr[] = {1,2,3};
		int arr2[][] = {{1,2,3,4},{1}};
		
		Class<?> c4 = arr.getClass();
		Class<?> c5 = arr.getClass();

		Class<?> c6 = int.class;
		System.out.println(c4.getName());
		System.out.println(c5.getName());
		System.out.println(c6.getName());

		System.out.println((c4 == c5));
		System.out.println((c4 == c6));
	}
}

