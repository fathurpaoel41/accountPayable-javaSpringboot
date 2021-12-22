package com.example.testConnectDb.Controller;

import com.example.testConnectDb.Model.Invoice;
import com.example.testConnectDb.Repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/invoice")
public class InvoiceController {

    @Autowired
    InvoiceRepository invoiceRepo;

    @GetMapping("")
    @CrossOrigin(origins = "http://localhost:5000")
    public List<Invoice> all() {return invoiceRepo.findAll();};

    @PostMapping("/")
    @CrossOrigin(origins = "http://localhost:5000")
    public Invoice add(@RequestBody Invoice invoice){

        return invoiceRepo.save(invoice);
    }

    @PutMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:5000")
    public Invoice update(@PathVariable("id") Long id,
                          @RequestBody Invoice invoice) {

        invoice.setId(id);

        return invoiceRepo.save(invoice);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:5000")
    public void delete(@PathVariable("id") Long id) {

        Invoice invoice = new Invoice();
        invoice.setId(id);

        invoiceRepo.save(invoice);

    }

    @GetMapping("/{id}")
    public Optional<Invoice> find(@PathVariable("id") Long id){
        return invoiceRepo.findById(id);
    }

}
