package com.altinsoy.restcallrickandmorty.controller;

import com.altinsoy.restcallrickandmorty.entity.Character;
import com.altinsoy.restcallrickandmorty.service.ApiServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/rickandmorty")
public class ApiController {

    private final ApiServiceImpl apiService;

    public ApiController(ApiServiceImpl apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/getAllCharacters")
    public ResponseEntity<Character> getCharacters() {
        Character allCharacters = apiService.getAllCharacters();
        return new ResponseEntity<>(allCharacters, HttpStatus.OK);
    }

}
