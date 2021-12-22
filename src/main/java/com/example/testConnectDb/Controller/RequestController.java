package com.example.testConnectDb.Controller;

import com.example.testConnectDb.Model.Request;
import com.example.testConnectDb.Model.RequestBarang;
import com.example.testConnectDb.Model.User;
import com.example.testConnectDb.Repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/request")
public class RequestController {

    @Autowired
    RequestRepository requestRepo;

    @GetMapping("/")
    @CrossOrigin(origins = "http://localhost:5000")
    public List<Request> all(){
        return requestRepo.findAll();
    }

    @PostMapping("/")
    @CrossOrigin(origins = "http://localhost:5000")
    public Request add(@RequestBody Request request){

        return requestRepo.save(request);
    }


    @PutMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:5000")
    public Request update(@PathVariable("id") Long id,@RequestBody Request request) {
        request.setId(id);
        return requestRepo.save(request);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:5000")
    public void delete(@PathVariable("id") Long id) {

        Request request = new Request();
        request.setId(id);

        requestRepo.delete(request);
    }

    @GetMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:5000")
    public Optional<Request> find(@PathVariable("id") Long id){
        return requestRepo.findById(id);
    }

//    @DeleteMapping("/delete")
//    public ResponseEntity<List<Request>> deleteIdrequest(@RequestParam int idrequest) {
//        return new ResponseEntity<List<Request>>(requestRepo.deleteByIdrequest(idrequest), HttpStatus.OK);
//    }


//    @GetMapping("/search")
//    public ResponseEntity<List<Request>> getIdRequest(@RequestParam int id_request) {
//        return new ResponseEntity<List<Request>>(requestRepo.findByIdrequest(id_request), HttpStatus.OK);
//    }


}
