package tp7;

import java.net.InetAddress;

/**
 * L'interface Routable garantit aux classes qui l'impl�mentent que l'on 
 * pourra trouver le saut suivant pour atteindre un r�seau de destination
 * @author mnv
 */
public interface Routable {
	/**
	 * @param reseau le r�seau de destination que l'on veut atteindre
	 * @return l'adresse ip du saut suivant pour atteindre ce r�seau
	 */
	public InetAddress trouveNextHop(InetAddress reseau);
}

