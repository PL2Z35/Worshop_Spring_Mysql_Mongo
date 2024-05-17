package com.uptc.frw.casemongo.service;

import com.uptc.frw.casemongo.model.Model;
import com.uptc.frw.casemongo.model.Person;
import com.uptc.frw.casemongo.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;
    private final AuditoryService auditoryService;

    public Person save(Person person) {
        return (Person) auditoryService.save("MODEL", findById(person.getIdPerson()), person,  personRepository.save(person));
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person findById(Long id) {
        return personRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }
}
