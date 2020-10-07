package domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Lieu {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private String nom;
private String adresse;


public Lieu() {
super();	
}


public Lieu(String nom, String adresse) {
	super();
	this.nom = nom;
	this.adresse = adresse;
}




public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}


}

