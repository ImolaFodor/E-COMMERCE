package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;

import app.model.Kategorija;

public interface KategorijaRepository extends JpaRepository<Kategorija, Integer> {

}
