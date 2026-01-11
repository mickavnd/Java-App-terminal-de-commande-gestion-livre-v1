package Gestion;

import java.util.ArrayList;
import java.util.Scanner;

public class home {

	 static Scanner sc = new Scanner(System.in);
	 static String nom ="";
	 static String prenom="";
	 
	 static ArrayList<String> list = new ArrayList<String>();

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
			 
			 if(userchoice==1) {
				 firstchoice =  displaycreate();
				 
			 }if(userchoice ==2) {
				 
				 firstchoice =displayLiberay();
				 
			 }if (userchoice ==3) {
				 
				 firstchoice = displayinfo();
				
			}
			 
			

	}

}

private static boolean displaycreate() {
		boolean back = false;
		
		// TODO Auto-generated method stub
		System.out.println("==============Cree toi un compte ========");
		System.out.println("nom  :");
		nom = sc.next();
		
		if(nom.contains("retour")) {
			back = true;
		}else {
			System.out.println("prenom :");
			prenom = sc.next(); //next() premet de faire un action  avant la prochaine line 
								//nextLine permet lui de faire laction suivante avant que on tape quelque chose
			back = true;
			
		}
		
		return back;
	}
private static boolean displayinfo() {
	String responce ;
	
	System.out.println("information personel :");
	
	System.out.println("nom :" +nom);
	
	System.out.println("prenom :"+ prenom) ;
	
	responce = sc.next();
	
	if(responce.contains("retour")){
		return true;
	}

	 return false;
}
private static boolean displayLiberay() {
	boolean  back2= false;
	int NbBooks;
	String addBook="";
	String responseUser;
	
	Scanner sc2= new Scanner(System.in);
	
	System.out.println("===========================");
	System.out.println("bienvenue dans votre librairy");
	//avoir pour ajouté dautre option comme supprimer /ou 5modifier
	
	System.out.println("Tape 1 pour add un livre /tape voir pour voir la liste de livre /Tape  pour retour ");
	
	responseUser = sc2.next();
	
	if(responseUser.contains("add")) {
		
		System.out.println("combien de livre vouler vous ajouter?");
		NbBooks = sc2.nextInt();
		
		for(int i=0;i<NbBooks;i++) {
		System.out.println("mettre le nom de votre livre ?");	
		addBook = sc2.next();
		list.add(addBook);

		}
		back2 = true ;
		
		
	}if (responseUser.contains("voir")) {
		
			if (list.isEmpty()) {
			System.out.println("votre liste est vide");
			}
			else {
				for(String books : list) {
				System.out.println(books);
										}
				}
	
	}if (responseUser.contains("retour")) {
		 back2 = true;
		
		}
		
		return back2;
	}
		
}
