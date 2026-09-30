package app.repository;

import app.domain.Person;
import app.service.outputports.PersonRepositoryInterface;

import java.util.ArrayList;
import java.util.List;

public class PersonRepositoryImpl implements PersonRepositoryInterface {

    List<Person> personList = new ArrayList<>();

    @Override
    public Person savePerson(Person person) {
        personList.add(person);
        return person;
    }

    @Override
    public Person selecPersonById(int id) {
        return null;
    }

    @Override
    public List<Person> selectAllPersons() {
        return List.of();
    }

    @Override
    public Person updatePerson(Person person) {
        return null;
    }

    @Override
    public void deletePersonById(int id) {

    }
}
