package br.com.grupo.alfa.dto;

import br.com.grupo.alfa.model.Technology;

public record TechnologyResponseDTO(Long id, String name) {
    
	public static TechnologyResponseDTO fromEntity(Technology tech) {
        return new TechnologyResponseDTO(tech.getId(), tech.getName());
    }
	
}