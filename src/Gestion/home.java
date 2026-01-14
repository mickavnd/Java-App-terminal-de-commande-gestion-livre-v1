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
	boolean  back2= false;;
	String responseUser;
	String error="";
	
	System.out.println("===========================");
	System.out.println("bienvenue dans votre librairy");
	//avoir pour ajouté dautre option comme supprimer /ou 5modifier
	
	
	System.out.println("""
			-Tape add pour ajoute  un livre 
			-Tape voir pour voir la liste de livre 
			-tape update pour mettre a jour un livre
			-Tape remove pour supprimer un livre
			-Tape  pour retour
			""");
	
	responseUser = sc.next();
	
	switch(responseUser){
		
	 case "add" -> back2=addBooks();
	 case "remove" ->back2 = removeBooks();
	 case "voir" -> back2 =displayBooks();
	 case "update" ->back2 =updateBook();
	 default ->   error =" je nais pas compris votre reponse";
	
	}
	
	return back2;
}
		

//methode Crud ( create ,read ,update,Delete);

 private static boolean addBooks() {
	 String addBook="";
	 int NbBooks ;
	 System.out.println("combien de livre vouler vous ajouter?");
		  NbBooks = sc.nextInt();
		
		for(int i=0;i<NbBooks;i++) {
		System.out.println("mettre le nom de votre livre ?");	
		addBook = sc.next();
		list.add(addBook);

		}
	 
	 
	 return true;
 }
 
 private static boolean displayBooks() {
	 if (list.isEmpty()) {
			System.out.println("votre liste est vide");
			
			}
			else {
				for(String books : list) {
				System.out.println(books);
										}
				}
			return false;
 }
 
 private static boolean removeBooks() {
	 
	String s ;
	
	s =sc.next();
	
	if(list.isEmpty()) {
		System.out.println("vous ne pouvais pas supprimer ");
	}else {
		list.remove(s);
	}
	 
	 
	
	
	 return true;
 }
 
 private static boolean updateBook() {
	 String ancienmot;
	 String noveaumot;
	 int index ;
	 System.out.println("quelle livre voulez vous mettre a jour ?");
	 
	 ancienmot = sc.next();
	 
	 if(list.contains(ancienmot)) {
		 
		index = list.indexOf(ancienmot);
		
		System.out.println("mettre le nouveau titre");
		noveaumot =sc.next();
		
		list.set(index, noveaumot);
		return true;
		
		 
		 
	 }
	 
	 
	 return false;
 }
 
 
}