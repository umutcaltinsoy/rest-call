package com.altinsoy.restcallrickandmorty.service;

import com.altinsoy.restcallrickandmorty.entity.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private HttpHeaders httpHeaders;

    private static final String CHARACTER_API = "https://rickandmortyapi.com/api/character";



    @Override
    public Character getAllCharacters() {

        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);

        ResponseEntity<Character> response = restTemplate.exchange(CHARACTER_API, HttpMethod.GET, entity, Character.class);

        return response.getBody();
    }
}
