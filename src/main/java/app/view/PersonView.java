package app.view;

import app.domain.DocumentTypeEnum;
import app.service.Inputports.PersonUseCase;
import app.service.helpers.SetDocumentType;
import app.service.helpers.SetPersonState;
import app.utils.FormRuleValidator;

import java.util.Scanner;

public class PersonView{

    Scanner sc = new Scanner(System.in);

    private final PersonUseCase personService;

    PersonView(PersonUseCase personUseCase){
        this.personService = personUseCase;
    }

    //Metodos vacios

    public void createPerson(){

        System.out.println("Creating person");

        int id = FormRuleValidator.validateInt("Ingrese el número de id de la persona: ");
        String name = FormRuleValidator.validateString("Ingrese el nombre del persona: ");
        String lastName = FormRuleValidator.validateString("Ingrese el nombre del persona: ");
        String docType = SetDocumentType.getDocType();
        String email = FormRuleValidator.validateString("Ingrese el correo del persona: ");
        String password = FormRuleValidator.validateString("Ingrese una contraseña de al menos 8 caracteres que contengan mayúsculas, números y símbolos: ");
        String state = SetPersonState.getPersonState();
        String occupation = FormRuleValidator.validateString("Ingrese la occupacion de la persona: ");
        double salary = FormRuleValidator.validateDouble("Ingrese el salario de la persona: ");


        personService.createPerson(id, name, lastName , DocumentTypeEnum.valueOf(docType) , email , password , state , occupation , salary);



    }

    public void showPerson(){
        System.out.println("Showing Person");
    }

    public void showPersonById(){
        System.out.println("Getting person by Id");
    }

    public void deletePerson(){
        System.out.println("Deleting person");
    }

}
