package com.bcode.test.mustache.model.utils;

import java.util.ArrayList;
import java.util.List;

import com.bcode.test.mustache.model.Famille;
import com.bcode.test.mustache.model.Personne;

public class FamilleUtils {

	
	
	public List<Famille> famille(){
		Famille f = new Famille();
		f.setNom("UJOODHA");
		List<Famille> listFamille = new ArrayList<Famille>();
		listFamille.add(f);

		
		Personne pere =new Personne();
		pere.setAge(36);
		pere.setNom("Vickrame");
		
		Personne mere =new Personne();
		mere.setAge(35);
		mere.setNom("Anne");
		
		Personne enfant =new Personne();
		enfant.setAge(4);
		enfant.setNom("Lea");
		
		Personne enfant1 =new Personne();
		enfant1.setAge(1);
		enfant1.setNom("Chloe");

		List<Personne> enfants = new ArrayList<Personne>();
		enfants.add(enfant);
		enfants.add(enfant1);
		
		f.setEnfants(enfants);
		f.setPere(pere);
		f.setMere(mere);
		
		return listFamille;
	}
}
