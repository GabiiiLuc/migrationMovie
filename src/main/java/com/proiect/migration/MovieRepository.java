package com.proiect.migration;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface MovieRepository extends CrudRepository<Movie, Long> {

}