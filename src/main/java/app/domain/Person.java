package app.domain;

import java.net.Inet4Address;

public class Person extends User{



    //Atributos

    private String occupation;
    private Double salary;


    //Constructores

    public Person() {

    }

    public Person(String occupation, Double salary) {
        this.occupation = occupation;
        this.salary = salary;
    }

    public Person(int id, String name, String lastName, DocumentTypeEnum documentType, String email, String password, String state, String occupation, Double salary) {
        super(id, name, lastName, documentType, email, password, state);
        this.occupation = occupation;
        this.salary = salary;
    }

    //Getters and Setters

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    //Esto se va a hacer con el objetivo de debugear mas adelante


    @Override
    public String toString() {
        return "Person{" +
                "occupation='" + occupation + '\'' +
                ", salary=" + salary +
                "} " + super.toString();
    }
}//Fin public class
