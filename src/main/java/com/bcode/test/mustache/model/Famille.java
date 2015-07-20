/**
 * 
 */
package com.bcode.test.mustache.model;

import java.io.Serializable;
import java.util.List;


/**
 * @author vickrame
 *
 */
public class Famille implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Famille(String nom) {
//		super();
		this.nom = nom;
	}

	private String nom;
	
	private Personne pere, mere;
	
	private List<Personne> enfants;

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	public Famille(String nom, Personne pere, Personne mere,
			List<Personne> enfants) {
		super();
		this.nom = nom;
		this.pere = pere;
		this.mere = mere;
		this.enfants = enfants;
	}

	/**
	 * @return the pere
	 */
	public Personne getPere() {
		return pere;
	}

	/**
	 * @param pere the pere to set
	 */
	public void setPere(Personne pere) {
		this.pere = pere;
	}

	/**
	 * @return the mere
	 */
	public Personne getMere() {
		return mere;
	}

	/**
	 * @param mere the mere to set
	 */
	public void setMere(Personne mere) {
		this.mere = mere;
	}

	/**
	 * @return the enfants
	 */
	public List<Personne> getEnfants() {
		return enfants;
	}

	/**
	 * @param enfants the enfants to set
	 */
	public void setEnfants(List<Personne> enfants) {
		this.enfants = enfants;
	}

	public Famille() {
	}

//	/* (non-Javadoc)
//	 * @see java.lang.Object#toString()
//	 */
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Famille [nom=").append(nom).append(", pere=")
//				.append(pere).append(", mere=").append(mere)
//				.append(", enfants=").append(enfants).append("]");
//		return builder.toString();
//	}
	
	
}
