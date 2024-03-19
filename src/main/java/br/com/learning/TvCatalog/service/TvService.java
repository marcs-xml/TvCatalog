package br.com.learning.TvCatalog.service;

import br.com.learning.TvCatalog.model.Tv;

import java.util.List;

public interface TvService {
    public Tv findTvById(Long id) throws Exception;
    public List<Tv> findAllTvs();
    public Tv createTv(Tv tv) throws Exception;
    public Tv updateTv(Tv tv, Long id) throws  Exception;
    public void deleteTv(Long id) throws Exception;

}
