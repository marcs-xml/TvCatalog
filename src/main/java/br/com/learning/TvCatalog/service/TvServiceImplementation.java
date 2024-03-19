package br.com.learning.TvCatalog.service;

import br.com.learning.TvCatalog.model.Tv;
import br.com.learning.TvCatalog.repository.TvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TvServiceImplementation implements TvService{

    @Autowired
    private TvRepository tvRepository;

    @Override
    public Tv findTvById(Long id) throws Exception {
        Optional<Tv> opt = tvRepository.findById(id);
        if(opt.isPresent()){
            return opt.get();
        }
        throw new Exception("Tv not found with id: "+id);
    }

    @Override
    public List<Tv> findAllTvs() {
        return tvRepository.findAll();
    }

    @Override
    public Tv createTv(Tv tv) throws Exception {
        Tv createTv = new Tv();
        createTv.setImage(tv.getImage());
        createTv.setBrand(tv.getBrand());
        createTv.setModel(tv.getModel());
        createTv.setInches(tv.getInches());
        createTv.setQuality(tv.getQuality());
        createTv.setAmount(tv.getAmount());
        createTv.setPrice(tv.getPrice());
        return tvRepository.save(createTv);
    }

    @Override
    public Tv updateTv(Tv tv, Long id) throws Exception {
        Tv oldTv = findTvById(id);

        if(tv.getImage() !=null){
            oldTv.setImage(tv.getImage());
        }
        if(tv.getBrand() !=null){
            oldTv.setBrand(tv.getBrand());
        }
        if(tv.getModel() !=null){
            oldTv.setModel(tv.getModel());
        }
        if(tv.getInches() !=null){
            oldTv.setInches(tv.getInches());
        }
        if(tv.getQuality() !=null){
            oldTv.setQuality(tv.getQuality());
        }
        if(tv.getAmount() !=0.0){
            oldTv.setAmount(tv.getAmount());
        }
        if(tv.getPrice() !=0.0){
            oldTv.setPrice(tv.getPrice());
        }
        return tvRepository.save(oldTv);
    }

    @Override
    public void deleteTv(Long id) throws Exception {
        findTvById(id);
        tvRepository.deleteById(id);
    }
}
