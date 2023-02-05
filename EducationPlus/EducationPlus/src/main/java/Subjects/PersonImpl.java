package Subjects;

import Events.EventImpl;
import Events.EventInterface;

import java.util.ArrayList;
import java.util.List;

public class PersonImpl extends User implements Person {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String town;
    private String status;
    private String education;
    private List<EventInterface> events;

    public PersonImpl(String username, String password, String firstName, String lastName, int age) {
        super(username, password);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.events = new ArrayList();
    }

    private void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("First name must not be null or empty!");
        }
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("First name must not be null or empty!");
        }
        this.lastName = lastName;
    }

    private void setAge(int age) {
        if (age < 0) {
            throw new NullPointerException("Age must be positive number!");
        }
        this.age = age;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }

    private void setTown(String town) {
        this.town = town;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getTown() {
        return town;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public String getEducation() {
        return education;
    }

    @Override
    public List<EventInterface> events() {
        return events;
    }

    @Override
    public void addEvent(EventImpl event) {
        events.add(event);
    }

    @Override
    public void remove(EventImpl event) {
        events.remove(event);
    }
}

