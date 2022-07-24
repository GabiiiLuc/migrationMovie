package com.proiect.migration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
public class MyRepoConfig {

    @Bean
    MovieRepository movieRepository() {
        return new MovieRepository() {
            @Override
            public <S extends Movie> S save(S entity) {
                return null;
            }

            @Override
            public <S extends Movie> Iterable<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public Optional<Movie> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public Iterable<Movie> findAll() {
                return null;
            }

            @Override
            public Iterable<Movie> findAllById(Iterable<Long> longs) {
                return null;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Long aLong) {

            }

            @Override
            public void delete(Movie entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Long> longs) {

            }

            @Override
            public void deleteAll(Iterable<? extends Movie> entities) {

            }

            @Override
            public void deleteAll() {

            }
        };
    }
}