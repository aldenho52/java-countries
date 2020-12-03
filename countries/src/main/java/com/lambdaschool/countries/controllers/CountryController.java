package com.lambdaschool.countries.controllers;


import com.lambdaschool.countries.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController
{
    @Autowired
    CountryRepository countryrepos;


}
