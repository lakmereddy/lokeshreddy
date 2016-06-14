import java.util.*;
public class PasswordPatternValidator{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		boolean upperfound=false;
		boolean digitfound=false;
		boolean spcharfound=false;
		while(true){
		                  System.out.println("Password:");
		                     String pwd=scn.nextLine();
		                        int len=pwd.length();
		          if(len<8||len>16){
		              System.out.println("Password should contain 8-16 charachters");
		          }
		          else{
		                   for(int i=0; i<len; i++);{
		                       char ch=pwd.charAt(0);
			                      if(Character.isLetter(ch)){
		                             if(Character.isUpperCase(ch)){
		                                  upperfound=true;
		            }
								  }
		           else if(Character.isDigit(ch)){
		                   digitfound=true;
		            }
		           else{
		                   spcharfound=true;
		            }
		           if(upperfound&&digitfound&&spcharfound){
		                  System.out.println("Registration Success");
		                   break;
		            }
		            else{
		                     System.out.println("Password Should Contain:");
	                            System.out.println("one upper case alphabate");
     	                            System.out.println("2nd one digit");
	     	                            System.out.println("3rd one Special character");
		              
			      }
			   }
		   }
		}
	}
}
