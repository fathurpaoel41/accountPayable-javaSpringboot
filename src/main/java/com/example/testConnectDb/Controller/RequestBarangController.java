package com.example.testConnectDb.Controller;

import com.example.testConnectDb.Model.RequestBarang;
import com.example.testConnectDb.Repository.RequestBarangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/requestBarang")
public class RequestBarangController {

    @Autowired
    RequestBarangRepository requestBarangRepo;

    @GetMapping("/")
    @CrossOrigin(origins = "http://localhost:5000")
    public List<RequestBarang> all(){
        return requestBarangRepo.findAll();
    }

    @PostMapping("/")
    @CrossOrigin(origins = "http://localhost:5000")
    public RequestBarang add(@RequestBody RequestBarang requestBarang ){

        return requestBarangRepo.save(requestBarang);
    }

    @PutMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:5000")
    public RequestBarang update(@PathVariable("id") Long id,
                                @RequestBody RequestBarang requestBarang){
        requestBarang.setId(id);
        return requestBarangRepo.save(requestBarang);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:5000")
    public void delete(@PathVariable("id") Long id) {

        RequestBarang requestBarang = new RequestBarang();
        requestBarang.setId(id);

        requestBarangRepo.delete(requestBarang);
    }

    @GetMapping("/search")
    @CrossOrigin(origins = "http://localhost:5000")
    public ResponseEntity<List<RequestBarang>> getIdRequest(@RequestParam long id_request) {
        return new ResponseEntity<List<RequestBarang>>(requestBarangRepo.findByIdrequest(id_request), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:5000")
    public Optional<RequestBarang> find(@PathVariable("id") Long id){
        return requestBarangRepo.findById(id);
    }

}
