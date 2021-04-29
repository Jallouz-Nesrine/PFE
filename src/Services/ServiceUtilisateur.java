/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DB.MyConnexion;
import Entities.Utilisateur;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Utiles.BCrypt;
/**
 *
 * @author Nesrine
 */
public class ServiceUtilisateur {
  Connection db = MyConnexion.Get_Instance().getCon();
	
	
	 public void signIn(Utilisateur u) 
	    {
	        try {
	            String req = "INSERT INTO `agriculteur`(`nom`, `prenom`, `dateNaiss`, `age`, `email`, `numTel`, `mot_de_passe`) VALUES (?,?,?,?,?,?,?)";
	            PreparedStatement ste;
	            ste= db.prepareStatement(req);
	            ste.setString(1, u.getNom());
	            String m =u.getMot_de_passe(); 
	            String hashed = BCrypt.hashpw(m, BCrypt.gensalt());
	            ste.setString(2,hashed );
	            ste.setString(3, u.getPrenom());
	            ste.setString(4, u.getDateNaiss());
	            ste.setInt(5, u.getAge());
	            ste.setString(6, u.getEmail());
	            ste.setInt(7, u.getNumTel());
	           
	            ste.executeUpdate();
	        }
	        catch (SQLException ex) {
	            System.out.println("Erreur lors de l'inscription " + ex.getMessage());
	        }
	    }
}