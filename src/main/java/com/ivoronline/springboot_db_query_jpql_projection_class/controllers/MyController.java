package com.ivoronline.springboot_db_query_jpql_projection_class.controllers;

import com.ivoronline.springboot_db_query_jpql_projection_class.dto.PersonDTO;
import com.ivoronline.springboot_db_query_jpql_projection_class.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // SOME PROPERTIES AS DTO
  //================================================================
  @RequestMapping("ReturnPersonDTO")
  PersonDTO returnPersonDTO() {
    PersonDTO personDTO = personRepository.returnPersonDTO();
    return    personDTO;
  }

}
