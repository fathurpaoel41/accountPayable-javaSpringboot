package com.example.testConnectDb.Repository;


import com.example.testConnectDb.Model.Tagihan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagihanRepository extends JpaRepository<Tagihan, Long> {
}
