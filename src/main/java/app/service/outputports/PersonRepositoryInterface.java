package app.service.outputports;

import app.domain.Person;

import java.util.List;

public interface PersonRepositoryInterface {

    public Person savePerson(Person person);
    public Person selecPersonById(int id);
    public List<Person> selectAllPersons();
    public Person updatePerson(Person person);
    public void deletePersonById(int id);
}
