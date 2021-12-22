package com.example.testConnectDb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.testConnectDb.Model.User;
import com.example.testConnectDb.Repository.UserRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class WelcomeController {

    @Autowired
    UserRepository userRepo;

    // mengambil semua data user
    @GetMapping("/")
    public List<User> all(){
        return userRepo.findAll();
    }

    // membuat data baru
    @PostMapping("/")
    public User add(@RequestParam("first_name") String firstName, @RequestParam("last_name") String lastName, @RequestParam("address") String address) {

        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAddress(address);

        return userRepo.save(user);
    }

    // mengubah data
    @PutMapping("/{id}")
    public User update(@PathVariable("id") Long id, @RequestParam("first_name") String firstName, @RequestParam("last_name") String lastName, @RequestParam("address") String address) {

        User user = new User();
        user.setId(id);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAddress(address);

        return userRepo.save(user);
    }

    // menghapus data
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {

        User user = new User();
        user.setId(id);

        userRepo.delete(user);
    }

    // mengambil satu data user
    @GetMapping("/{id}")
    public Optional<User> find(@PathVariable("id") Long id){
        return userRepo.findById(id);
    }
}
