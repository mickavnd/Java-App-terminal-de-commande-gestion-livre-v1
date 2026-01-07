package Gestion;

import java.util.Scanner;

public class home {

	 static Scanner sc = new Scanner(System.in);
	 static String nom ="";
	 static String prenom="";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean firstchoice =true;
		int userchoice ;
		String error="";
		
		while(firstchoice) {
			 System.out.println("===========================");
			 System.out.println("bienvenue " +nom +prenom);
			 System.out.println(error);
			 System.out.printf("""
			 		 si tu veux  :
			 		 
			 		 - crees un compte tape 1
			 		 -voir ta librairy tape 2
			 		 -information perso tape 3
			 		 
			 		""");
			 userchoice = sc.nextInt();
			 
			 switch (userchoice) {
			 case 1 : firstchoice = displaycreate();
			 case 2 : firstchoice = displayLiberay();
			 case 3 : firstchoice = displayinfo();
			 default : error = "j'ai pas compris votre choix" ;
			 
			 
			 }

	}

}

	private static boolean displayinfo() {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean displayLiberay() {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean displaycreate() {
		// TODO Auto-generated method stub
		return false;
	}
	}

