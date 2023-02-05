package Subjects;

import Events.EventImpl;
import Events.EventInterface;

import java.util.List;

public interface Company {

    String getName();
    String getTown();
    String getDescription();
    List<EventInterface> events();
    void addEvent(EventImpl event);
    void remove(EventImpl event);

}
