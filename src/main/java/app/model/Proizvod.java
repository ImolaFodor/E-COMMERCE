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
public class Proizvod {
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	private String naziv;
	
	private String boja;
	private String dimenzije;
	private int tezina;
	private int madeIn;
	private String proizvodjac;
	private float cena;
	private String urlSlika;
	private String urlVideo;
	private float ocena;
	private int kolicina;
	
	
    @OneToMany(mappedBy = "proizvod", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Recenzija> recenzije;
	
	
    @OneToMany(mappedBy = "proizvod", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Kupovina> kupovine;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private Kategorija kategorija;
	
	@NotNull
	@ManyToOne
	@JoinColumn
	private Prodavnica prodavnica;

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

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public String getDimenzije() {
		return dimenzije;
	}

	public void setDimenzije(String dimenzije) {
		this.dimenzije = dimenzije;
	}

	public int getTezina() {
		return tezina;
	}

	public void setTezina(int tezina) {
		this.tezina = tezina;
	}

	public int getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(int madeIn) {
		this.madeIn = madeIn;
	}

	public String getProizvodjac() {
		return proizvodjac;
	}

	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}

	public float getCena() {
		return cena;
	}

	public void setCena(float cena) {
		this.cena = cena;
	}
	

	public String getUrlSlika() {
		return urlSlika;
	}

	public void setUrlSlika(String urlSlika) {
		this.urlSlika = urlSlika;
	}

	public String getUrlVideo() {
		return urlVideo;
	}

	public void setUrlVideo(String urlVideo) {
		this.urlVideo = urlVideo;
	}

	public float getOcena() {
		return ocena;
	}

	public void setOcena(float ocena) {
		this.ocena = ocena;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
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
	

	public Kategorija getKategorija() {
		return kategorija;
	}

	public void setKategorija(Kategorija kategorija) {
		this.kategorija = kategorija;
	}
	
	
	
	public Prodavnica getProdavnica() {
		return prodavnica;
	}

	public void setProdavnica(Prodavnica prodavnica) {
		this.prodavnica = prodavnica;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boja == null) ? 0 : boja.hashCode());
		result = prime * result + Float.floatToIntBits(cena);
		result = prime * result
				+ ((dimenzije == null) ? 0 : dimenzije.hashCode());
		result = prime * result + id;
		result = prime * result + ((kategorija == null) ? 0 : kategorija.hashCode());
		result = prime * result + kolicina;
		result = prime * result + ((kupovine == null) ? 0 : kupovine.hashCode());
		result = prime * result + madeIn;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + Float.floatToIntBits(ocena);
		result = prime * result + ((prodavnica == null) ? 0 : prodavnica.hashCode());
		result = prime * result
				+ ((proizvodjac == null) ? 0 : proizvodjac.hashCode());
		result = prime * result
				+ ((recenzije == null) ? 0 : recenzije.hashCode());
		result = prime * result + tezina;
		result = prime * result
				+ ((urlSlika == null) ? 0 : urlSlika.hashCode());
		result = prime * result
				+ ((urlVideo == null) ? 0 : urlVideo.hashCode());
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
		Proizvod other = (Proizvod) obj;
		if (boja == null) {
			if (other.boja != null)
				return false;
		} else if (!boja.equals(other.boja))
			return false;
		if (Float.floatToIntBits(cena) != Float.floatToIntBits(other.cena))
			return false;
		if (dimenzije == null) {
			if (other.dimenzije != null)
				return false;
		} else if (!dimenzije.equals(other.dimenzije))
			return false;
		if (id != other.id)
			return false;
		if (kategorija == null) {
			if (other.kategorija != null)
				return false;
		} else if (!kategorija.equals(other.kategorija))
			return false;
		if (kolicina != other.kolicina)
			return false;
		if (kupovine == null) {
			if (other.kupovine != null)
				return false;
		} else if (!kupovine.equals(other.kupovine))
			return false;
		if (madeIn != other.madeIn)
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (Float.floatToIntBits(ocena) != Float.floatToIntBits(other.ocena))
			return false;
		if (prodavnica == null) {
			if (other.prodavnica != null)
				return false;
		} else if (!prodavnica.equals(other.prodavnica))
			return false;
		if (proizvodjac == null) {
			if (other.proizvodjac != null)
				return false;
		} else if (!proizvodjac.equals(other.proizvodjac))
			return false;
		if (recenzije == null) {
			if (other.recenzije != null)
				return false;
		} else if (!recenzije.equals(other.recenzije))
			return false;
		if (tezina != other.tezina)
			return false;
		if (urlSlika == null) {
			if (other.urlSlika != null)
				return false;
		} else if (!urlSlika.equals(other.urlSlika))
			return false;
		if (urlVideo == null) {
			if (other.urlVideo != null)
				return false;
		} else if (!urlVideo.equals(other.urlVideo))
			return false;
		return true;
	}

	
	
}
