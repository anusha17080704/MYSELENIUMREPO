package week2.day1;

public class IsPrime
{
	
public static void Number(int num)
{
	for(int i=2;i<=num/2;++i) {
		if(num%i!=0)
		{System.out.println(num + " is a PrimeNumber ");
		break;
	}
		else {
			System.out.println(num + " is not a PrimeNumber ");
			break;
		}
}

}
public static void main(String[]args) {
	IsPrime.Number(51);
	IsPrime.Number(66);
	IsPrime.Number(78);
	IsPrime.Number(23);
}

}
		  
		 
		 

