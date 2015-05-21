package tp11;

import java.util.ArrayList;

/**
 * La classe Etudiant permet de repr�senter des �tudiants
 * @author Marie-No�l Vroman
 *
 */
public class Etudiant {
	private String nom;
	private int num;
	private static int nbEtu=0;
	
	/**
	 * Ce constructeur <i>permet</i> de cr�er un �tudiant
	 * @param nom le nom de famille de l'�tudiant
	 */
	public Etudiant(String nom){
		this.nom = nom;
		num = ++nbEtu;
	}
	
	public String toString(){
		return "nom : "+nom+" num : "+num;
	}

	/**
	 * Cette m�thode cr�e une arraylist avec des �tudiants
	 * @param args pas utilis�
	 */
	public static void main(String[] args) {
		ArrayList<Etudiant> listeEtu = new ArrayList<Etudiant>();
		listeEtu.add(new Etudiant("Toto"));
		listeEtu.add(new Etudiant("J�r�mie"));
		listeEtu.add(new Etudiant("Julien"));
		listeEtu.add(new Etudiant("Laurane"));
		listeEtu.add(new Etudiant("Arthur"));
		System.out.println(listeEtu);
		
	}

}
