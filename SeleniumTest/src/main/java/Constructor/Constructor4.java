package Constructor;
/*4. Write constructors with return type int and String*/
public class Constructor4 {

		
	
   String Constructor4(String n){
		String name=n;
		System.out.println("This is one argument constructor :" +name);
        return name;	
   }
	
	
	int Constructor4(int a,int b){
		
		int addition=a+b;
		System.out.println("This is two argument constructor : " + addition);
		return addition;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor4 s=new Constructor4();
		s.Constructor4("ravi");
		s.Constructor4(20, 40);
	}

}
