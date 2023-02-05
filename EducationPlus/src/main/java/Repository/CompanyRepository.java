package Repository;

import Subjects.Company;
import java.util.Collection;

public class CompanyRepository implements Repository<Company>{

    private Collection<Company> companies;

    @Override
    public Collection<Company> getUser() {
        return companies;
    }

    @Override
    public void add(Company user) {
        companies.add(user);
    }

    @Override
    public boolean remove(Company user) {
        return companies.remove(user);
    }

    @Override
    public Company findByName(String name) {
        return companies.stream()
                .filter(c -> c.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
