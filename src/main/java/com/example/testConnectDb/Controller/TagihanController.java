package com.example.testConnectDb.Controller;


import com.example.testConnectDb.Model.Request;
import com.example.testConnectDb.Model.Tagihan;
import com.example.testConnectDb.Repository.TagihanRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tagihan")
public class TagihanController {

    @Autowired
    TagihanRepository tagihanRepo;

    @GetMapping("")
    @CrossOrigin(origins = "http://localhost:5000")
    public List<Tagihan> all() {return  tagihanRepo.findAll();}


    @PostMapping("/")
    @CrossOrigin(origins = "http://localhost:5000")
    public Tagihan add(@RequestBody Tagihan tagihan) throws JsonMappingException, JsonProcessingException {

        return tagihanRepo.save(tagihan);
    }

    @PutMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:5000")
    public Tagihan update(@PathVariable("id") Long id,
                          @RequestBody Tagihan tagihan
                          ) {

        tagihan.setId(id);

        return tagihanRepo.save(tagihan);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:5000")
    public void delete(@PathVariable("id") Long id) {

        Tagihan tagihan = new Tagihan();
        tagihan.setId(id);

        tagihanRepo.delete(tagihan);
    }

    @GetMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:5000")
    public Optional<Tagihan> find(@PathVariable("id") Long id){
        return tagihanRepo.findById(id);
    }

}
