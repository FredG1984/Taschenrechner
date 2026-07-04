package de.fred.howto;

public class JavaHowTo {
	private String screen[];
	
	private int x, y;
	
	/**
	 * Konstruktor
	 */
	public JavaHowTo(){
		x = 0; 
		y = 0;
		screen = new String[25];
		cls();
	}

	/**
	 * Claer screen (löscht nicht den Bildschirm, sondern schreibt in den) 
	 * Puffer screen[] entsprechend Blancs
	 */
	public void cls(){
		for(int index = 0; index < screen.length; ++index){
			screen[index] = "                                     "+
			"                                           ";//Summe=80 Blancs
		}		
	}

	/**
	 * 
	 * @param str: String zur Ausgabe
	 * @return 		fertige Ausgabe
	 */

	public String print(String str) {
		int scrL = screen[y].length();
		int strL = str.length();
		
		if( screen[y] == null ) return null;
		if( screen[y].equals("") ) return screen[y] + " Fehler";
		if( scrL < 80 )	return screen[y] + " zu klein";
		String beg = screen[y].substring(0, x);//Teilstring ab 0 bis x
		String end = screen[y].substring( beg.length() + strL, scrL);
		screen[y] = beg + str + end;
		//System.out.println("begl= " + beg.length()+ " strl= " + str.length() + " endl= "+ end.length());
		return screen[y];
	}
	
	/**
	 * printScreen() - Schreibt den Puffer screen[] auf die Console
	 */
	public void printScreen(){
		for(int index = 0; index < screen.length; ++index){
			System.out.println(screen[index]);
		}				
	}
	
	/**
	 * 
	 * @param x:	Position in der reihe (ab null gezaehlt, insgesamt 80)
	 * @param y		Index der Reihe (insgesamt 25)
	 */
	public void gotoxy (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public static void main(String[] args) {
		JavaHowTo v = new JavaHowTo();
		//------------------------------------
		v.cls();
		v.gotoxy(31, 24);
		String r = v.print(" Fred");
		//System.out.println("Laenge = " + r.length()); //80
		//------------------------------------
		
		
		v.printScreen();
		
	}

}
