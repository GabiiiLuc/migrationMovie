package com.proiect.migration.repository;

import com.proiect.migration.domain.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface MovieRepository extends CrudRepository<Movie, Long> {

}