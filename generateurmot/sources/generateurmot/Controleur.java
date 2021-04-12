package sources.generateurmot;

import sources.generateurmot.metier.GenererMot;
import sources.generateurmot.ihm.FrameDictionnaireMot;


/**
	* Classe Controleur - interaction métier et ihm
	* @author 	: -
	* @version 	: 1.0
*/

public final class Controleur
{
	/**
		* Définition du serialVersionUID
	*/
	private static final long serialVersionUID = 1L;
	
	/**
		 * L'attribut renseigne sur le métier GenererMot.
	*/
	private final GenererMot metier;
	/**
		* L'attribut renseigne sur l'interface graphique FrameDictionnaireMot.
	*/
	private final FrameDictionnaireMot ihmDictionnaireMot;
	
	/**
		* Constructeur Controleur 
	*/
	public Controleur()
	{
		this.metier = new GenererMot();
		this.ihmDictionnaireMot = new FrameDictionnaireMot(this);
	}
	
	/**
		* Informe la partie métier qu'il faut générer générer toutes les combinaisons du mot.
		* @param mot : Le mot où il faut générer toutes les combinaisons de ce mot.
	*/
	public void genererMot(String mot)
	{
		this.metier.genererMot(mot);
	}
	
	/**
		* @return Retourne le(s) mot(s) qui est/sont généré(s) par la partie métier.
	*/
	public String getMot()
	{
		return this.metier.getsMot();
	}

	/**
		* Réinitialise le contenu de la chaîne de caractères.
	*/
	public void reinitMot()
	{
		this.metier.reinitMot();
	}
	
	/**
		* Main
		* @param args 
	*/
	public static void main(String[] args) 
	{
		new Controleur();
	}
}

