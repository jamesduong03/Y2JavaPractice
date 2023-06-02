package exercises;

public class BoxTest {

	public static void main(String[] args) 
	{
		Box box1 = new Box(10,10,10);
		Box box2 = new Box(12,12,12);
		
		System.out.println(box1);
		System.out.println(box2);
		
		box1.fit(box2);
		box2.fit(box1);
	}

}
