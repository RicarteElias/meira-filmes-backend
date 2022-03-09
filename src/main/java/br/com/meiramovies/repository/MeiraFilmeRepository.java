package br.com.meiramovies.repository;

import br.com.meiramovies.model.entity.MeiraFilme;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeiraFilmeRepository extends CrudRepository<MeiraFilme, Integer> {
}
