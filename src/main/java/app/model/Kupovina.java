package app.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Kupovina {

	@Id
	@GeneratedValue
	private int id;
	
	private int iznos;
	
	@NotNull
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn
	private Korisnik kupac;
	
	@NotNull
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn
	private Prodavnica prodavnica;
	
	@NotNull
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn
	private Proizvod proizvod;
	
	@NotNull
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn
	private Dostavljac dostavljac;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIznos() {
		return iznos;
	}

	public void setIznos(int iznos) {
		this.iznos = iznos;
	}

	public Korisnik getKupac() {
		return kupac;
	}

	public void setKupac(Korisnik kupac) {
		this.kupac = kupac;
	}

	public Prodavnica getProdavnica() {
		return prodavnica;
	}

	public void setProdavnica(Prodavnica prodavnica) {
		this.prodavnica = prodavnica;
	}

	public Proizvod getProizvod() {
		return proizvod;
	}

	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}

	public Dostavljac getDostavljac() {
		return dostavljac;
	}

	public void setDostavljac(Dostavljac dostavljac) {
		this.dostavljac = dostavljac;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dostavljac == null) ? 0 : dostavljac.hashCode());
		result = prime * result + id;
		result = prime * result + iznos;
		result = prime * result + ((kupac == null) ? 0 : kupac.hashCode());
		result = prime * result
				+ ((prodavnica == null) ? 0 : prodavnica.hashCode());
		result = prime * result
				+ ((proizvod == null) ? 0 : proizvod.hashCode());
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
		Kupovina other = (Kupovina) obj;
		if (dostavljac == null) {
			if (other.dostavljac != null)
				return false;
		} else if (!dostavljac.equals(other.dostavljac))
			return false;
		if (id != other.id)
			return false;
		if (iznos != other.iznos)
			return false;
		if (kupac == null) {
			if (other.kupac != null)
				return false;
		} else if (!kupac.equals(other.kupac))
			return false;
		if (prodavnica == null) {
			if (other.prodavnica != null)
				return false;
		} else if (!prodavnica.equals(other.prodavnica))
			return false;
		if (proizvod == null) {
			if (other.proizvod != null)
				return false;
		} else if (!proizvod.equals(other.proizvod))
			return false;
		return true;
	}
	
	
	
	
	
}
