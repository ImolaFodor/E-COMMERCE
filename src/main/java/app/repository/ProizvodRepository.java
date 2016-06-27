package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.model.Proizvod;

public interface ProizvodRepository extends JpaRepository<Proizvod, Integer> {
	


}
