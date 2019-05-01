package Constructor;

public class Constructor1 {

	//String name;
	//int a,b;
	
	Constructor1()
	{
		System.out.println("This is Default construcor");
	}
	
	
	Constructor1(String n){
		String name=n;
		System.out.println("This is one argument constructor :" +name);
	}
	
	
	Constructor1(int a,int b){
		
		int addition=a+b;
		System.out.println("This is two argument constructor : " + addition);
		
	}
	
	public static void main(String[] args) {
		
		Constructor1 c=new Constructor1();
		Constructor1 s=new Constructor1("ravi");
		Constructor1 t=new Constructor1(10,20);
		
		
		
		
	}
	
	
	
}
