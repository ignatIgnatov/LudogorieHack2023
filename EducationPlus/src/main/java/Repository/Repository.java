package Repository;

import Subjects.Company;

import java.util.Collection;

public interface Repository <T>{

    Collection<T> getUser();

    void add(T user);

    boolean remove(T user);

    T findByName(String name);


}
