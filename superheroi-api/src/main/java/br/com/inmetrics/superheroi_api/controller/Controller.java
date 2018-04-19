package br.com.inmetrics.superheroi_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.inmetrics.superheroi_api.modelo.SuperHeroi;
import br.com.inmetrics.superheroi_api.repository.SuperHeroiRepository;

@CrossOrigin(origins = { "http://localhost:8080" }, maxAge = 3000)
@RequestMapping( "/superheroi")
@RestController
public class Controller {
	
	@Autowired
	private SuperHeroiRepository repository;
	
	@PostMapping(path= "/cadastrar")
	public @ResponseBody SuperHeroi cadastro(@RequestBody SuperHeroi sh) {
		
		return repository.save(sh);
	}
	
	@GetMapping(path= "/todos")
	public  @ResponseBody Iterable<SuperHeroi> getAll(){
		
		return repository.findAll();
	}
	

}
