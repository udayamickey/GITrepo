
public class MainClass {

	public static void main(String[] args) {
		System.out.println("Hi");
		display();
		DummyClass dummyObj=new DummyClass();
		dummyObj.show();

	}
	public static void display() {
		System.out.println("You are in display method");
	}

}
