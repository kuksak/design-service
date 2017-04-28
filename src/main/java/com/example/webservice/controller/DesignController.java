package com.example.webservice.controller;

import com.example.webservice.domain.Design;
import com.example.webservice.repository.DesignRepository;
import com.example.webservice.service.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Sakshi Kukreti on 26-04-2017.
 */
@RestController
@RequestMapping(value = "service")
public class DesignController {

    @Autowired
    private DesignRepository designRepository;

    @Autowired
    private DesignService  designService;

    @RequestMapping(value = "/{designNum}/{author}", method = RequestMethod.GET, produces = "application/json")
    public List<Design> getDesignByDesignNumAndAuthor(@PathVariable("designNum") String designNum, @PathVariable("author") String author) {
        return designRepository.findByDesignNumAndAuthor(designNum, author);
    }

    @RequestMapping(value = "/all" ,method = RequestMethod.GET, produces = "application/json")
    public List<Design> getAllDesigns(){
        return designRepository.findAll();
    }

    @RequestMapping(value = "/save" ,method = RequestMethod.POST, produces = "application/json")
    public List<Design> saveDesigns(@RequestBody List<Design> designs){
        for (Design design : designs) {
            designService.updateOrSaveDesign(design);
        }
       return  designs;
    }

}
