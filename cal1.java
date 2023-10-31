
import java.util.Scanner;


public class cal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a,b,c,ch;
	System.out.println("Enter any Two No:");
	Scanner s =new Scanner (System.in);
	a=s.nextInt();
	b=s.nextInt();
	//c=s.nextInt();
	System.out.println("Enter your choice");
	System.out.println("1 Addition");
	System.out.println("2 substraction");
	System.out.println("3 Multification");
	System.out.println("4 Division");
	
	ch=s.nextInt();
	
	switch(ch)
	{
	
	case 1: c=a+b;
	       System.out.println("Addition="+c);
	       break;
	       
	case 2: c=a-b;
    System.out.println("Subtraction="+c);
    break;
    
	case 3: c=a*b;
    System.out.println("Multipication="+c);
    break;
    
	case 4: c=a/b;
    System.out.println("Division="+c);
    break;
    
	case 5: c=a%b;
    System.out.println("Reminder="
    		+ ""+c);
    break;
    default:System.out.println("Default Invalid choice");
    
	}
    
    
	
	}
	

	}