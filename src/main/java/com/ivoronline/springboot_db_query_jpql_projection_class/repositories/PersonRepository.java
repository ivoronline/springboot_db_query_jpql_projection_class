package com.ivoronline.springboot_db_query_jpql_projection_class.repositories;

import com.ivoronline.springboot_db_query_jpql_projection_class.dto.PersonDTO;
import com.ivoronline.springboot_db_query_jpql_projection_class.entities.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {

  //=======================================================================================
  // SOME PROPERTIES AS PERSON DTO
  //=======================================================================================
  //Needs fully qualified DTO name. Imports are not used.
  @Query(value = "" +
    "SELECT new com.ivoronline.springboot_db_query_jpql_projection_class.dto.PersonDTO(john.name, john.age)"+
    "FROM   Person john " +
    "WHERE  john.name = 'John' " +
    "AND    john.age  = 20"
  )
  PersonDTO returnPersonDTO();

}
