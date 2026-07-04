 /**
  *
  * Beschreibung
  *
  * @version 1.0 vom 18.12.2009
  * @author Fred Gambrah
  * Merhfachauswahl
  */
public class Unterprogramme_ohne_alles { // instanzieren: Unterprogramme_ohne_alles varname = new  Unterprogramme_ohne_alles();

//sog. Klassenvariable, gebildet mit > static <
//Zugriff innerhalb der Klasse möglich.

static double zahl1,zahl2,summe,quotient;

//sog. statische Methode
//Zugriff möglich (ohne Erzeugung einer Instanz)

public static void addition(){//Anwendung: Unterprogramme_ohne_alles.addition();
		
          JavaHowTo formatBS = new JavaHowTo();
              formatBS.cls();
              formatBS.gotoxy (30,2);
              System.out.print("TASCHENRECHNER");
              formatBS.gotoxy (30,3);
              System.out.print("______________");
              formatBS.gotoxy (25,6);
              System.out.println("Sie möchten plus rechnen.");
              formatBS.gotoxy (25,8);
              System.out.print("Bitte geben Sie die 1. Zahl ein: ");
              zahl1 = Tastatur.liesDouble();
              formatBS.gotoxy (25,10);
              System.out.print("Bitte geben Sie die 2. Zahl ein: ");
              zahl2 = Tastatur.liesDouble();
              summe = zahl1 + zahl2;
              formatBS.gotoxy (25,14);
              System.out.println("Die Summe ist: " + summe);
  }
	static void subtraktion(){
		JavaHowTo formatBS = new JavaHowTo();
		formatBS.cls();
		formatBS.gotoxy (30,2);
		System.out.print("TASCHENRECHNER");
		formatBS.gotoxy (30,3);
		System.out.print("______________");
		formatBS.gotoxy (25,6);
		System.out.println("Sie möchten minus rechen.");
		formatBS.gotoxy (25,8);
		System.out.print("Bitte geben Sie die 1. Zahl ein: ");
		zahl1 = Tastatur.liesDouble();
		formatBS.gotoxy (25,10);
		System.out.print("Bitte geben Sie die 2. Zahl ein: ");
		zahl2 = Tastatur.liesDouble();
		summe = zahl1 - zahl2;
		formatBS.gotoxy (25,14);
		System.out.println("Die Summe ist: " + summe);	
	}

   static void multiplication()
  {
          JavaHowTo formatBS = new JavaHowTo();
              formatBS.cls();
              formatBS.gotoxy (30,2);
              System.out.print("TASCHENRECHNER");
              formatBS.gotoxy (30,3);
              System.out.print("______________");
              formatBS.gotoxy (25,6);
              System.out.println("Sie möchten mal rechnen.");
              formatBS.gotoxy (25,8);
              System.out.print("Bitte geben Sie die 1. Zahl ein: ");
              zahl1 = Tastatur.liesDouble();
              formatBS.gotoxy (25,10);
              System.out.print("Bitte geben Sie die 2. Zahl ein: ");
              zahl2 = Tastatur.liesDouble();
              summe = zahl1 * zahl2;
              formatBS.gotoxy (25,14);
              System.out.println("Die Summe ist: " + summe);



  }

   static void division(){
        JavaHowTo formatBS = new JavaHowTo();
        formatBS.cls();
        formatBS.gotoxy (30,2);
        System.out.print("TASCHENRECHNER");
        formatBS.gotoxy (30,3);
        System.out.print("______________");
        formatBS.gotoxy (25,6);
        System.out.println("Sie möchten geteilt rechnen.");
        formatBS.gotoxy (25,8);
        System.out.print("Bitte geben Sie die 1. Zahl ein: ");
        zahl1 = Tastatur.liesDouble();
        formatBS.gotoxy (25,10);
        System.out.print("Bitte geben Sie die 2. Zahl ein: ");
        zahl2 = Tastatur.liesDouble();
        summe = zahl1 + zahl2;
        formatBS.gotoxy (25,14);
        System.out.println("Die Summe ist: " + summe);

        if (zahl2 != 0){
			quotient = zahl1 / zahl2;
			formatBS.gotoxy (25,14);
			System.out.println("Der Quotient ist: " + quotient);
        }else{
	        formatBS.gotoxy (25,14);
	        System.out.println("Fehler: Man darf nicht durch 0 teilen.");
        }
  }




  public static void main(String[] args) {

  char op_zeichen;
  double zahl1, zahl2, summe, differenz, produkt, quotient, z1;

  JavaHowTo formatBS = new JavaHowTo();

  do
  {
  formatBS.cls();
  formatBS.gotoxy (30,2);
  System.out.print("TASCHENRECHNER");
  formatBS.gotoxy (30,3);
  System.out.print("______________");
  formatBS.gotoxy (30,6);
  System.out.println("(+) Addieren");
  formatBS.gotoxy (30,8);
  System.out.println("(-) Substrahiere");
  formatBS.gotoxy (30,10);
  System.out.println("(*) Multiplizieren");
  formatBS.gotoxy (30,12);
  System.out.println("(/) Dividieren");
  formatBS.gotoxy (30,16);
  System.out.println("(#) Ende");
  op_zeichen = Tastatur.liesChar();

    switch (op_zeichen)
    {
    case '+': addition();
    break;

    case '-':subtracktion();
    break;

    case '*': addition();
    break;

    case '/': division();


    break;

    case '#': formatBS.cls();
              formatBS.gotoxy (30,2);
              System.out.print("TASCHENRECHNER");
              formatBS.gotoxy (30,3);
              System.out.print("______________");
              formatBS.gotoxy (30,6);
              System.out.println("Programm wird beendet.");
    break;

    default:  formatBS.cls();
              formatBS.gotoxy (30,6);
              System.out.println("Fehler: Kein gültiges Zeichen!");

    }
    z1 = 0;

    do
    {
      z1 = z1 + 0.7;
    }
    while (z1 < 999999999);
  }
  while (op_zeichen != '#');

  }
}
