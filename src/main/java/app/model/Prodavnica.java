package app.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Prodavnica {

	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	private String naziv;
	
	private String opis;
	private String adresa;
	private String drzava;
	private String telefon;
	private String email;
	private float ocena;
	
	
   
    @JsonIgnore
    @OneToMany(mappedBy = "prodavnica", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Recenzija> recenzije;
    
    @JsonIgnore
    @OneToMany(mappedBy = "prodavnica", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Kupovina> kupovine;
    
    @JsonIgnore
    @OneToMany(mappedBy = "prodavnica", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Proizvod> proizvodi;
    
    @JsonIgnore
    @OneToMany(mappedBy = "prodavnica", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Korisnik> prodavci;
    
	public Prodavnica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getDrzava() {
		return drzava;
	}

	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getOcena() {
		return ocena;
	}

	public void setOcena(float ocena) {
		this.ocena = ocena;
	}

	public Set<Recenzija> getRecenzije() {
		return recenzije;
	}

	public void setRecenzije(Set<Recenzija> recenzije) {
		this.recenzije = recenzije;
	}


	public Set<Kupovina> getKupovine() {
		return kupovine;
	}

	public void setKupovine(Set<Kupovina> kupovine) {
		this.kupovine = kupovine;
	}

	
	
	public Set<Proizvod> getProizvodi() {
		return proizvodi;
	}

	public void setProizvodi(Set<Proizvod> proizvodi) {
		this.proizvodi = proizvodi;
	}

	
	public Set<Korisnik> getProdavci() {
		return prodavci;
	}

	public void setProdavci(Set<Korisnik> prodavci) {
		this.prodavci = prodavci;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresa == null) ? 0 : adresa.hashCode());
		result = prime * result + ((drzava == null) ? 0 : drzava.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((kupovine == null) ? 0 : kupovine.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + Float.floatToIntBits(ocena);
		result = prime * result + ((opis == null) ? 0 : opis.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prodavnica other = (Prodavnica) obj;
		if (adresa == null) {
			if (other.adresa != null)
				return false;
		} else if (!adresa.equals(other.adresa))
			return false;
		if (drzava == null) {
			if (other.drzava != null)
				return false;
		} else if (!drzava.equals(other.drzava))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (kupovine == null) {
			if (other.kupovine != null)
				return false;
		} else if (!kupovine.equals(other.kupovine))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (Float.floatToIntBits(ocena) != Float.floatToIntBits(other.ocena))
			return false;
		if (opis == null) {
			if (other.opis != null)
				return false;
		} else if (!opis.equals(other.opis))
			return false;
		if (telefon == null) {
			if (other.telefon != null)
				return false;
		} else if (!telefon.equals(other.telefon))
			return false;
		return true;
	}

	

	
	
}
