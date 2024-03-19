package br.com.learning.TvCatalog.controller;

import br.com.learning.TvCatalog.model.Tv;
import br.com.learning.TvCatalog.service.TvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tv")
public class TvController {
    @Autowired
    private TvService tvService;

    @GetMapping
    public List<Tv> getAllTvs() throws Exception{
        return tvService.findAllTvs();
    }

    @PostMapping
    public Tv createTv(@RequestBody Tv tv) throws Exception {
        return tvService.createTv(tv);
    }

    @PutMapping("/{id}")
    public Tv updateTv(@RequestBody Tv tv, @PathVariable Long id) throws Exception {
        return tvService.updateTv(tv, id);
    }

    @DeleteMapping("/{id}")
    public void deleteTv(@PathVariable Long id) throws Exception{
        tvService.deleteTv(id);
    }

    @GetMapping("/{id}")
    public void findTvById(@PathVariable Long id) throws Exception{
        tvService.findTvById(id);
    }
}
