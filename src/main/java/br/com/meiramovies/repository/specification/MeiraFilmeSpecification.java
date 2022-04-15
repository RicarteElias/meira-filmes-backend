package br.com.meiramovies.repository.specification;

import br.com.meiramovies.model.entity.MeiraFilme;
import br.com.meiramovies.model.request.FilterMeiraFilmeRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

@Component
public class MeiraFilmeSpecification {

    public Specification<MeiraFilme> getMeiraFilmes(FilterMeiraFilmeRequest request) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            if (StringUtils.hasLength(request.getTitle())) {
                predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get("title")),
                        "%" + request.getTitle().toLowerCase() + "%"));
            }
            if (request.isAssistido()) {
                predicates.add(criteriaBuilder.isTrue(root.get("assistido")));
            }
            query.orderBy(criteriaBuilder.asc(root.get("title")));
            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
