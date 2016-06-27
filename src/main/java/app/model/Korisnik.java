package app.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Korisnik {
	public enum Uloga {
        KUPAC, PRODAVAC, ADMINISTRATOR
    }
	
	public enum Gender {
        MALE, FEMALE
    }
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String ime;
    @NotNull
    @Column(unique = true)
    private String korisnickoIme;
    @NotNull
    private String lozinka;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Uloga uloga = Uloga.KUPAC;

    private String telefon;

    private String adresa;

    private String email;
    
    private boolean aktivirano;
    
    private String registracijaKljuc;
    
    @NotNull
    @Enumerated(EnumType.STRING)
    private Gender gender;
    
    @JsonIgnore
    @OneToMany(mappedBy = "kupac", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Recenzija> recenzije;
    
    @JsonIgnore
    @OneToMany(mappedBy = "prodavac", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Prodavnica> prodavnice;
    
    @JsonIgnore
    @OneToMany(mappedBy = "kupac", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Kupovina> kupovine;
 
	public Korisnik() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}


	public String getKorisnickoIme() {
		return korisnickoIme;
	}

	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}

	public Set<Prodavnica> getProdavnice() {
		return prodavnice;
	}

	public void setProdavnice(Set<Prodavnica> prodavnice) {
		this.prodavnice = prodavnice;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public Uloga getUloga() {
		return uloga;
	}

	public void setUloga(Uloga uloga) {
		this.uloga = uloga;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public boolean isAktivirano() {
		return aktivirano;
	}

	public void setAktivirano(boolean aktivirano) {
		this.aktivirano = aktivirano;
	}

	public String getRegistracijaKljuc() {
		return registracijaKljuc;
	}

	public void setRegistracijaKljuc(String registracijaKljuc) {
		this.registracijaKljuc = registracijaKljuc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresa == null) ? 0 : adresa.hashCode());
		result = prime * result + (aktivirano ? 1231 : 1237);
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + id;
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result
				+ ((korisnickoIme == null) ? 0 : korisnickoIme.hashCode());
		result = prime * result
				+ ((kupovine == null) ? 0 : kupovine.hashCode());
		result = prime * result + ((lozinka == null) ? 0 : lozinka.hashCode());
		result = prime * result
				+ ((prodavnice == null) ? 0 : prodavnice.hashCode());
		result = prime * result
				+ ((recenzije == null) ? 0 : recenzije.hashCode());
		result = prime
				* result
				+ ((registracijaKljuc == null) ? 0 : registracijaKljuc
						.hashCode());
		result = prime * result + ((telefon == null) ? 0 : telefon.hashCode());
		result = prime * result + ((uloga == null) ? 0 : uloga.hashCode());
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
		Korisnik other = (Korisnik) obj;
		if (adresa == null) {
			if (other.adresa != null)
				return false;
		} else if (!adresa.equals(other.adresa))
			return false;
		if (aktivirano != other.aktivirano)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender != other.gender)
			return false;
		if (id != other.id)
			return false;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (korisnickoIme == null) {
			if (other.korisnickoIme != null)
				return false;
		} else if (!korisnickoIme.equals(other.korisnickoIme))
			return false;
		if (kupovine == null) {
			if (other.kupovine != null)
				return false;
		} else if (!kupovine.equals(other.kupovine))
			return false;
		if (lozinka == null) {
			if (other.lozinka != null)
				return false;
		} else if (!lozinka.equals(other.lozinka))
			return false;
		if (prodavnice == null) {
			if (other.prodavnice != null)
				return false;
		} else if (!prodavnice.equals(other.prodavnice))
			return false;
		if (recenzije == null) {
			if (other.recenzije != null)
				return false;
		} else if (!recenzije.equals(other.recenzije))
			return false;
		if (registracijaKljuc == null) {
			if (other.registracijaKljuc != null)
				return false;
		} else if (!registracijaKljuc.equals(other.registracijaKljuc))
			return false;
		if (telefon == null) {
			if (other.telefon != null)
				return false;
		} else if (!telefon.equals(other.telefon))
			return false;
		if (uloga != other.uloga)
			return false;
		return true;
	}
    
}
