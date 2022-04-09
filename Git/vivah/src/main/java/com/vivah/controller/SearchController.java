package com.vivah.controller;

import com.vivah.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class SearchController {
    @Autowired
    SearchService searchService;

    @GetMapping("/name")
    @ResponseBody
    public String getName(@RequestParam int id){
        return searchService.findFirstNameOfMale(id);
    }



}
