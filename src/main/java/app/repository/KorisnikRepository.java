package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.model.Korisnik;

public interface KorisnikRepository extends JpaRepository<Korisnik, Integer>  {
	
	Korisnik findByKorisnickoIme(String username);

}
