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
public class Kategorija {
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	private String naziv;
	
	private String opis;
	
	@JsonIgnore
    @OneToMany(mappedBy = "kategorija", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Kategorija> podkategorije;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn
	private Kategorija kategorija;
	
	@JsonIgnore
    @OneToMany(mappedBy = "kategorija", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Proizvod> proizvodi;

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
	
	

	public Kategorija getKategorija() {
		return kategorija;
	}

	public void setKategorija(Kategorija kategorija) {
		this.kategorija = kategorija;
	}

	public Set<Proizvod> getProizvodi() {
		return proizvodi;
	}

	public void setProizvodi(Set<Proizvod> proizvodi) {
		this.proizvodi = proizvodi;
	}

	public Set<Kategorija> getPodkategorije() {
		return podkategorije;
	}

	public void setPodkategorije(Set<Kategorija> podkategorije) {
		this.podkategorije = podkategorije;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result
				+ ((kategorija == null) ? 0 : kategorija.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((opis == null) ? 0 : opis.hashCode());
		result = prime * result
				+ ((podkategorije == null) ? 0 : podkategorije.hashCode());
		result = prime * result
				+ ((proizvodi == null) ? 0 : proizvodi.hashCode());
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
		Kategorija other = (Kategorija) obj;
		if (id != other.id)
			return false;
		if (kategorija == null) {
			if (other.kategorija != null)
				return false;
		} else if (!kategorija.equals(other.kategorija))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (opis == null) {
			if (other.opis != null)
				return false;
		} else if (!opis.equals(other.opis))
			return false;
		if (podkategorije == null) {
			if (other.podkategorije != null)
				return false;
		} else if (!podkategorije.equals(other.podkategorije))
			return false;
		if (proizvodi == null) {
			if (other.proizvodi != null)
				return false;
		} else if (!proizvodi.equals(other.proizvodi))
			return false;
		return true;
	}
	
	
}
