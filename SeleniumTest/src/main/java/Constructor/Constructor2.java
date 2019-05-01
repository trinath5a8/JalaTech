package Constructor;



class Demo2{
	
	
	Demo2()
	{
		System.out.println("This is Default Constructor");
	}
	
	
	Demo2(String n) {
		String name=n;
		System.out.println("This is Arggument constructor :" +name);
	}
	
}




public class Constructor2 extends Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo2 s=new Demo2();
Demo2 n=new Demo2("ravi");

	}

}
