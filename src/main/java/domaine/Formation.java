package domaine;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Formation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String Theme;
	private Date dateDebut;
	private int duree;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Lieu lieu;

	
	public Formation() {
		
	}
	
	public Formation(String theme, Date dateDebut, int duree, Lieu lieu) {
		super();
		Theme = theme;
		this.dateDebut = dateDebut;
		this.duree = duree;
		this.lieu = lieu;
	}

	public Long getId() {
		return id;
	}

	public String getTheme() {
		return Theme;
	}

	public void setTheme(String theme) {
		Theme = theme;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Lieu getLieu() {
		return lieu;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}
	
}
