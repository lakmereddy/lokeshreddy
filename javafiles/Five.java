class Five{
	public static void main(String[]args){
		boolean semI = true;
		boolean semII =false;
		boolean resultA,resultB;
		System.out.println("<---logical1--->");
		resultA =semI || semII;
		resultB =semI && semII;
		System.out.println("resultA ->"+resultA);
		System.out.println("resultB ->"+resultB);
	}
}