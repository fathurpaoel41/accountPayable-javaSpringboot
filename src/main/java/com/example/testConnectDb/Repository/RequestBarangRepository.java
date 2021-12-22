package com.example.testConnectDb.Repository;

import com.example.testConnectDb.Model.RequestBarang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestBarangRepository extends JpaRepository<RequestBarang, Long> {

//    @Query("select u from tb_request_barang u where u.nama_barang like %?1")

//    List<RequestBarang> findByHarga(int harga);
    List<RequestBarang> findByIdrequest(long id_request);


}
