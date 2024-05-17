package com.uptc.frw.casemongo.controller;

import com.uptc.frw.casemongo.model.Person;
import com.uptc.frw.casemongo.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private PersonService personService;

    @GetMapping
    public List<Person> getAllPersons() { return personService.findAll(); }

    @GetMapping("/{id}")
    public Person getPersonById (@PathVariable long id) { return personService.findById(id); }

    @DeleteMapping("/{id}")
    public void deletePersonById (@PathVariable long id) { personService.deleteById(id); }

    @PostMapping
    public Person savePerson (@PathVariable Person person) { return personService.save(person); }

    @PutMapping("/{id}")
    public Person updatePerson (@PathVariable long id, @RequestBody Person person) {
        person.setIdPerson(id);
        return personService.save(person);
    }
}
