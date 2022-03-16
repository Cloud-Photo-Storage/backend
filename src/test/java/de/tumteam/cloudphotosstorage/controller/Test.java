package de.tumteam.cloudphotosstorage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
public class Test {

	@GetMapping(path="", produces = "application/json")
    public String getEmployees() 
    {
        return "HIHIHI";
    }
}
