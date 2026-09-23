package br.com.grupo.alfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.grupo.alfa.model.Technology;

public interface TechnologyRepository extends JpaRepository<Technology, Long>{
	
}
