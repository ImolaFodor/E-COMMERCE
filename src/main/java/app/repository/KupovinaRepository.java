package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.model.Kupovina;

public interface KupovinaRepository extends JpaRepository<Kupovina, Integer> {
	


}
