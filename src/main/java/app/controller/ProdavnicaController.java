package app.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import app.model.Prodavnica;
import app.model.Kupovina;
import app.model.Korisnik;
import app.repository.ProdavnicaRepository;
import app.repository.KupovinaRepository;
import app.repository.KorisnikRepository;

@RestController
@RequestMapping("/prodavnice")
public class ProdavnicaController {

	
}
