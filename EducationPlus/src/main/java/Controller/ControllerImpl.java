package Controller;

import Subjects.Company;
import Subjects.Person;
import Subjects.User;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ControllerImpl {
    private List<User> users;
    private List<Person> persons;
    private List<Company> companies;

    public ControllerImpl() {
        this.users = new ArrayList<>();
        this.persons = new ArrayList<>();
        this.companies = new ArrayList<>();
    }
}
