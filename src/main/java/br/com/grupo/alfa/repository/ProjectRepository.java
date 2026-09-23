package br.com.grupo.alfa.repository;

import br.com.grupo.alfa.model.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    Page<Project> findByTechnologyIgnoreCase(String technology, Pageable pageable);
}
