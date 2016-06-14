class Eleventh{
	static int factorial(int number){
		System.out.println("parameter value="+number);
		if(number<=1)return 1;
		else
			return number*factorial(number -1);
	};
	public static void main(String[]args){
		int number =8;
		int result;
		//it is assumed that number is >=2 
		result =factorial(number);
		System.out.println("-----------------");
		System.out.println("number ="+number);
		System.out.println("The factorial is;"+result);
	}
}