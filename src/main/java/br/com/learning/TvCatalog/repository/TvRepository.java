package br.com.learning.TvCatalog.repository;

import br.com.learning.TvCatalog.model.Tv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TvRepository extends JpaRepository <Tv,Long> {

}
