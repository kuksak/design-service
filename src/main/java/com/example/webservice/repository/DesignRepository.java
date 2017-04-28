package com.example.webservice.repository;

import com.example.webservice.domain.Design;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Sakshi Kukreti on 26-04-2017.
 */

public interface DesignRepository extends JpaRepository<Design,Long>{

     List<Design> findByDesignNumAndAuthor(String designNum,String author);


}
