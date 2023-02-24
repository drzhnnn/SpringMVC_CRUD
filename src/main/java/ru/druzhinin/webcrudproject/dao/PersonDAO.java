package ru.druzhinin.webcrudproject.dao;

import org.springframework.stereotype.Component;
import ru.druzhinin.webcrudproject.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private List<Person> people;
    private static int PEOPLE_COUNT = 0;

    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "Nikita"));
        people.add(new Person(++PEOPLE_COUNT, "Andrew"));
        people.add(new Person(++PEOPLE_COUNT, "Oleg"));
        people.add(new Person(++PEOPLE_COUNT, "Vladimir"));
    }

    public List<Person> index(){
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
