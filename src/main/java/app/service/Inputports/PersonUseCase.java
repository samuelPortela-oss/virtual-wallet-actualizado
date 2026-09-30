package app.service.Inputports;

import app.domain.DocumentTypeEnum;
import app.domain.Person;

import java.util.List;

public interface PersonUseCase {

    public Person createPerson (int id, String name, String lastName, DocumentTypeEnum documentType, String email, String password, String state, String occupation, Double salary);
    public Person getPersonById ( int id);
    public List<Person> getAllPersons ();
    public Person updatePerson(int id, String name, String lastName, DocumentTypeEnum documentType, String email, String password, boolean state, String occupation, Double salary);
    public void deletePerson(int id);


}


