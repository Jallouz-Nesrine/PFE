/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Nesrine
 */
public class Vache {
    private int id_vache;
	private int id_agri;
	private int id_vet;
	private int numero;
	private String race;
	private int age;
	private String sexe;
	private String vaccin;
	private String dossier_medical;
	private boolean periode_chaleur;
	

	
	
    public int getId_vache() {
		return id_vache;
	}




	public int getId_agri() {
		return id_agri;
	}




	public int getId_vet() {
		return id_vet;
	}




	public int getNumero() {
		return numero;
	}




	public String getRace() {
		return race;
	}




	public int getAge() {
		return age;
	}




	public String getSexe() {
		return sexe;
	}




	public String getVaccin() {
		return vaccin;
	}




	public String getDossier_medical() {
		return dossier_medical;
	}




	public boolean isPeriode_chaleur() {
		return periode_chaleur;
	}




	public void setId_vache(int id_vache) {
		this.id_vache = id_vache;
	}




	public void setId_agri(int id_agri) {
		this.id_agri = id_agri;
	}




	public void setId_vet(int id_vet) {
		this.id_vet = id_vet;
	}




	public void setNumero(int numero) {
		this.numero = numero;
	}




	public void setRace(String race) {
		this.race = race;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public void setSexe(String sexe) {
		this.sexe = sexe;
	}




	public void setVaccin(String vaccin) {
		this.vaccin = vaccin;
	}




	public void setDossier_medical(String dossier_medical) {
		this.dossier_medical = dossier_medical;
	}




	public void setPeriode_chaleur(boolean periode_chaleur) {
		this.periode_chaleur = periode_chaleur;
	}

	public Vache(int numero, String race, int age, String sexe, String vaccin, String dossier_medical,
			boolean periode_chaleur) {
		this.numero = numero;
		this.race = race;
		this.age = age;
		this.sexe = sexe;
		this.vaccin = vaccin;
		this.dossier_medical = dossier_medical;
		this.periode_chaleur = periode_chaleur;
	}




	public Vache () {
		
	}




	public Vache(String string, int i, String string2, String sexe2, String vaccin2, boolean b, int j) {
		// TODO Auto-generated constructor stub
	}




	public Vache(int i, int j, String string, int k, String string2, String string3, String string4, boolean b, int l) {
		// TODO Auto-generated constructor stub
	}




	public Vache(int i, int j, String string, int k, String string2, String string3, String string4, int l, int m) {
		// TODO Auto-generated constructor stub
	}




	public Vache(int i, int j, int k, int l, String string, int m, String string2, String string3, String string4,
			int n) {
		// TODO Auto-generated constructor stub
	}




	




	public Vache(int id_vache, int id_agri, int id_vet, int numero, String race, int age, String sexe, String vaccin,
			String dossier_medical, boolean periode_chaleur) {
		super();
		this.id_vache = id_vache;
		this.id_agri = id_agri;
		this.id_vet = id_vet;
		this.numero = numero;
		this.race = race;
		this.age = age;
		this.sexe = sexe;
		this.vaccin = vaccin;
		this.dossier_medical = dossier_medical;
		this.periode_chaleur = periode_chaleur;
	}


}
