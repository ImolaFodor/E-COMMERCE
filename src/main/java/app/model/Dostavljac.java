package app.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Dostavljac {
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	private String naziv;
	
	private String opis;
	
	private String drzavePoslovanja;
	
	private float tarifa;
	
	@JsonIgnore
	@OneToMany(mappedBy = "dostavljac", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Kupovina> kupovine;

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

	
	public String getDrzavePoslovanja() {
		return drzavePoslovanja;
	}

	public void setDrzavePoslovanja(String drzavePoslovanja) {
		this.drzavePoslovanja = drzavePoslovanja;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public float getTarifa() {
		return tarifa;
	}

	public void setTarifa(float tarifa) {
		this.tarifa = tarifa;
	}

	public Set<Kupovina> getKupovine() {
		return kupovine;
	}

	public void setKupovine(Set<Kupovina> kupovine) {
		this.kupovine = kupovine;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((drzavePoslovanja == null) ? 0 : drzavePoslovanja.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((kupovine == null) ? 0 : kupovine.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((opis == null) ? 0 : opis.hashCode());
		result = prime * result + Float.floatToIntBits(tarifa);
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
		Dostavljac other = (Dostavljac) obj;
		if (drzavePoslovanja == null) {
			if (other.drzavePoslovanja != null)
				return false;
		} else if (!drzavePoslovanja.equals(other.drzavePoslovanja))
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
		if (opis == null) {
			if (other.opis != null)
				return false;
		} else if (!opis.equals(other.opis))
			return false;
		if (Float.floatToIntBits(tarifa) != Float.floatToIntBits(other.tarifa))
			return false;
		return true;
	}
	
	
	
}
