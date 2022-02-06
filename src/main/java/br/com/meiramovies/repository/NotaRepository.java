package br.com.meiramovies.repository;

import br.com.meiramovies.model.entity.Nota;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaRepository extends CrudRepository<Nota,Integer> {

}
