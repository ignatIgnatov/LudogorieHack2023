package Subjects;

import Events.EventImpl;
import Events.EventInterface;

import java.util.List;

public interface Person {

    String getFirstName();
    String getLastName();
    int getAge();
    String getGender();
    String getTown();
    String getStatus();
    String getEducation();
    List<EventInterface> events();
    void addEvent(EventImpl event);
    void remove(EventImpl event);

}
