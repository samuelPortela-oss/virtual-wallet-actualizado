package app.service;

import app.domain.DocumentTypeEnum;
import app.domain.Person;
import app.service.Inputports.PersonUseCase;
import app.service.outputports.PersonRepositoryInterface;

import java.util.List;

public class PersonServiceImpl implements PersonUseCase {

    private final PersonRepositoryInterface personRepositoryInterface;
    public PersonServiceImpl(PersonRepositoryInterface personRepositoryInterface) {
        this.personRepositoryInterface = personRepositoryInterface;
    }

    //Metodos


    @Override
    public Person createPerson(int id, String name, String lastName, DocumentTypeEnum documentType, String email, String password, String state, String occupation, Double salary) {
        Person person = new Person(id, name, lastName , documentType , email , password , state , occupation , salary);

        return personRepositoryInterface.savePerson(person);
    }

    @Override
    public Person getPersonById(int id) {
        return null;
    }

    @Override
    public List<Person> getAllPersons() {
        return List.of();
    }

    @Override
    public Person updatePerson(int id, String name, String lastName, DocumentTypeEnum documentType, String email, String password, boolean state, String occupation, Double salary) {
        return null;
    }

    @Override
    public void deletePerson(int id) {

    }
}