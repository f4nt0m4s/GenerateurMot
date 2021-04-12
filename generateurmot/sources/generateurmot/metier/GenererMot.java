package sources.generateurmot.metier;

/**
	* Classe GenererMot
	* @author 	: -
	* @version 	: 1.0
*/

// Source : https://www.geeksforgeeks.org/java-program-to-print-all-permutations-of-a-given-string/

public class GenererMot
{
	/**
		* Définition du serialVersionUID
	*/
	private static final long serialVersionUID = 1L;
	
	/**
		* L'attribut renseigne sur le mot contenant les permutations.
	*/
	private static String sMot;
	
	/**
		* Constructeur GenererMot
	*/
	public GenererMot()
	{
		GenererMot.sMot = new String();
	}
	
	/**
		* @return Retourne le mot.
	*/
	public String getsMot()
	{
		return GenererMot.sMot;
	}

	/**
		* Réinitialise le contenu de la chaîne de caractères.
	*/
	public void reinitMot()
	{
		GenererMot.sMot = new String();
	}

	/**
		* Méthode doublon juste pour tester les paramètres 
		* @param mot : Le mot dont il faut générer les combinaisons.
	*/
	public void genererMot(String mot)
	{
		if ( ! (mot.length() <= 0 || mot == null || mot.isEmpty() ) )
		{
			GenererMot.genererMot(mot, 0, mot.length()-1);
		}
	}
		
	/**
		* Affiche les combinaisons du mot
		* @param mot : Le mot dont il faut générer les combinaisons.
		* @param debut : l'indice de début.
		* @param fin : l'indice de fin.
	*/
	private static void genererMot(String mot, int debut, int fin)
	{
		if ( debut == fin )
		{
			System.out.println(mot);
			GenererMot.sMot += mot + "\n";
		}
		else
		{
			for(int cpt=debut; cpt<=fin; cpt++)
			{
				mot = echangerCaracteres(mot, debut, cpt);
				genererMot(mot, debut+1, fin);
				mot = echangerCaracteres(mot, debut, cpt);
			}
		}
	}
		
	/**
		* @return Retourne la chaîne où les deux caractères ont été échangés.
		* @param indice1 : l'indice du premier caractère.
		* @param indice2 : l'indice du second caractère.
	*/
	private static String echangerCaracteres(String mot, int indice1, int indice2)
	{
		char tabCarac[] = mot.toCharArray();
		char tmp = tabCarac[indice1];
		tabCarac[indice1] = tabCarac[indice2];
		tabCarac[indice2] = tmp;
		
		return String.valueOf(tabCarac);
	}
}
