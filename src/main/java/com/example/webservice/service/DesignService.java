package com.example.webservice.service;

import com.example.webservice.domain.Design;
import com.example.webservice.repository.DesignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Sakshi Kukreti on 27-04-2017.
 */
@Service
public class DesignService {

    @Autowired
    private DesignRepository designRepository;

    public Design updateOrSaveDesign(Design design) {
        return designRepository.save(design);
    }

}
