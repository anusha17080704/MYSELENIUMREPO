 package week1.day1;
 
 
public class Mobile { 

	public void makecall() {
	String mobileModel = "miui";
	float mobileWeight = 2.3f;
		System.out.println("mobileModel is " + mobileModel );
		System.out.println("mobileWeight is " + mobileWeight );
	}
	

		public void sendmsg() {
		Boolean isfullycharged = true;
		int mobilecost = 15000;
		System.out.println("Mobile is fullycharged" + isfullycharged );
			System.out.println("mobilecost is " + mobilecost);
}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Mobile mi = new Mobile();
				mi.makecall();
				mi.sendmsg();
System.out.println("This is my mobile");
	}
}




	
