package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}

/* MoviesRepository faz com que haja o contato do sistema com o banco de dados, sendo assim, passa a ser possível fazer atualizações, 
modificar, etc. (CRUD) */
