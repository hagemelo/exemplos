package br.com.inmetrics.superheroi_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.inmetrics.superheroi_api.modelo.SuperHeroi;

public interface SuperHeroiRepository extends JpaRepository<SuperHeroi, Long>{

}
