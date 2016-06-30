package app.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import app.model.Prodavnica;
import app.model.Proizvod;

public interface ProizvodRepository extends JpaRepository<Proizvod, Integer> {
	
	public Set<Proizvod> findProizvodByProdavnica(Prodavnica p);

}
