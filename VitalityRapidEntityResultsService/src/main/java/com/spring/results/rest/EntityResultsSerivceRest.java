package com.spring.results.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.results.model.Address;
import com.spring.results.model.EntityAddr;
import com.spring.results.service.EntityResultsService;


@RestController
@RequestMapping("/results")
public class EntityResultsSerivceRest {

    @Autowired
    EntityResultsService entityresultsService;

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public EntityAddr getgetAddressresults(@PathVariable("id") int id){
    	EntityAddr address = entityresultsService.getAddressresults(id);
    	System.out.println("getEntityresults method : "+ address);
        return address;
    }

    @RequestMapping(method=RequestMethod.GET)
    public List<EntityAddr> getAllAddressResults(){
    	List<EntityAddr> addrssList = entityresultsService.getAllAddressResults();
    	System.out.println("getAllEntityResults method : "+ addrssList);
        return addrssList;
    }
}
