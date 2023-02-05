package Repository;

import Subjects.Person;

import java.awt.*;
import java.util.Collection;

public class PersonRepository implements Repository<Person>{

    private Collection<Person> persons;

    @Override
    public Collection<Person> getUser() {
        return persons;
    }

    @Override
    public void add(Person user) {
        persons.add(user);
    }

    @Override
    public boolean remove(Person user) {
        return persons.remove(user);
    }

    @Override
    public Person findByName(String name) {
        return persons.stream()
                .filter(u -> u.getFirstName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
