import java.util.*;
public class MobileValidator{
	public static void main(String[] args){
	Scanner scn=new Scanner(System.in);
	while( true){
				System.out.println("Enter number:");
				String mobile=scn.nextLine();
				if(mobile.isEmpty()){
						System.out.println("Mobile number is Mandatory:");
						continue;
						}
						else{
						try{
						  long mn=Long.parseLong(mobile);
						  if(mobile.length()!=10){
						  System.out.println("Mobile number should be 10 digit:");
						  continue;
						  }
						  else{
						  System.out.println("Activation key has Send to your number:");
						  System.out.println("Enter Activstion key:");
						  break;
						  }
						}
						catch(NumberFormatException nfe){
						  System.out.println("Mobile number should contain only digit:");
						  continue;
				    }
			    }
		   }
	  }
}
