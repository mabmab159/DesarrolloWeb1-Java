package com.cibertec.clase4.infrastructure.dataproviders.interfaces;

import com.cibertec.clase4.application.dtos.ResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "ApiFeignPerson", url = "https://rickandmortyapi.com/api")
public interface ApiFeignPerson {
    @RequestMapping(method = RequestMethod.GET, value = "/character/{id}")
    ResponseDTO getCharacter(@PathVariable("id") String id);
}
