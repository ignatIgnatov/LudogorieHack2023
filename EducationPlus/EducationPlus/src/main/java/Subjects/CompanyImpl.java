package Subjects;

import Events.EventImpl;
import Events.EventInterface;

import java.util.ArrayList;
import java.util.List;

public class CompanyImpl extends User implements Company{

    private String name;
    private String town;
    private String description;
    private List<EventInterface> events;

    public CompanyImpl(String username, String password, String name, String town) {
        super(username, password);
        this.setName(name);
        this.setTown(town);
        events = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Company name must be not null or empty!");
        }
        this.name = name;
    }

    private void setTown(String town) {
        if (town == null || town.trim().isEmpty()) {
            throw new IllegalArgumentException("Town name must be not null or empty");
        }
        this.town = town;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTown() {
        return town;
    }

    @Override
    public String getDescription() {
        return description;
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
