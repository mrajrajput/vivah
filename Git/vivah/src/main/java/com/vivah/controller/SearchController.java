package com.vivah.controller;

import com.vivah.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class SearchController {
    @Autowired
    SearchService searchService;

//    http://localhost:8080/name?id=1
    @RequestMapping(value = "/name", method=RequestMethod.GET, produces = {"application/json"})
    @ResponseBody
    public ResponseEntity<String> getName(int id){
        String name = searchService.findFirstNameOfMale(id);
        return ResponseEntity.noContent().build();
//        return new ResponseEntity<String>(name, HttpStatus.OK);
//        return searchService.findFirstNameOfMale(id);
    }



}
