package br.com.meiramovies.repository.jpaRepository;

import br.com.meiramovies.model.entity.MeiraFilme;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeiraFilmeJpaRepository extends JpaRepository<MeiraFilme, Integer>, JpaSpecificationExecutor<MeiraFilme> {
    
    @Override
    public List<MeiraFilme> findAll(Specification<MeiraFilme> spec);
}