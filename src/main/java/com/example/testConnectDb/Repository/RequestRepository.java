package com.example.testConnectDb.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.testConnectDb.Model.Request;

import java.util.List;


@Repository
public interface RequestRepository extends JpaRepository<Request,Long>{


//    List<Request> findByIdrequest(int idrequest);

}
