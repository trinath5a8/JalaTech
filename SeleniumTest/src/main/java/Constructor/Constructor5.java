package Constructor;
/*5. Try to call the constructor multiple times with the same object*/
public class Constructor5 {

	int a=10,b=20;
		
     Constructor5(){
		
		int addition=a+b;
		System.out.println("This is two argument constructor : " + addition);
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Constructor5 s=new Constructor5();
		 Constructor5 n=new Constructor5();
		 
	}

}
