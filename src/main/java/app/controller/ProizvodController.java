package app.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import app.model.Prodavnica;
import app.model.Proizvod;
import app.repository.ProdavnicaRepository;
import app.repository.ProizvodRepository;

@RestController
@RequestMapping("/proizvodi")
public class ProizvodController {
	@Autowired
	ProizvodRepository proizvodRepository;
	
	@Autowired
	ProdavnicaRepository prodavnicaRepository;
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity getProizvodi(@PathVariable("id") int id) {
		Prodavnica p= prodavnicaRepository.findOne(id);
		Set<Proizvod> proizvodi = proizvodRepository.findProizvodByProdavnica(p);
		if (p == null) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity(proizvodi, HttpStatus.OK);
	}
}
