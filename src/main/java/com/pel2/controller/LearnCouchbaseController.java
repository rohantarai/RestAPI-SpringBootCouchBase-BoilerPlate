/**
 * 
 */
package com.pel2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pel2.dto.Airport;
import com.pel2.service.LearnCouchbaseService;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author softechie (Suresh V) Controller with end points to learn all
 *         different operations of using Couchbase NoSQL DB
 *
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/learnCB")
public class LearnCouchbaseController {

    @Autowired
    LearnCouchbaseService learnCBService;

    @RequestMapping(value = "/getAllRecordsFromBucket", method = RequestMethod.GET)
    public List<Airport> getAllFromBucket() {
        List<Airport> results = learnCBService.getAllAirports();
        System.out.println("LearnCouchbaseController:getAllFromBucket() - Returned Results = " + results.toString());

        return results;
    }

}
