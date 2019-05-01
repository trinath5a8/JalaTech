package Constructor;
/*3. Apply private, public, protected and default access modifiers to the constructor*/

public class Constructor3 {

	
	String name;
    int a,b;
		
		private Constructor3()
		{
			System.out.println("This is Default construcor");
		}
		
		
		public Constructor3(String n){
			 name=n;
			System.out.println("This is one argument constructor :" +name);
		}
		
		
		protected Constructor3(int a,int b){
			
			int addition=a+b;
			System.out.println("This is two argument constructor : " + addition);
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor3 c=new Constructor3();
		Constructor3 s=new Constructor3("ravi");
		Constructor3 t=new Constructor3(10,20);
		
		
	}

}
