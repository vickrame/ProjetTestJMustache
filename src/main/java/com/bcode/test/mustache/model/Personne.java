package com.bcode.test.mustache.model;

public class Personne {

	private String nom;
	private int age;
	
	
	public Personne(){
		
	}

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

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	public Personne(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
}
