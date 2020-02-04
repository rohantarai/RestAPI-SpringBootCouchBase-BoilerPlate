/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pel2.dao.impl.couchbase;

import java.util.List;

import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.pel2.dto.Airport;

/**
 *
 * @author softechie (Suresh V)
 */
@Repository
public interface AirportRepo extends CouchbaseRepository<Airport, String> {
    @Query("#{#n1ql.selectEntity} WHERE type='airport'")
    public List<Airport> findAll();

}