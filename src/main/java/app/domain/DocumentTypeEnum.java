package app.domain;

import com.sun.jdi.Value;

public enum DocumentTypeEnum {

    CEDULA("Cédula de ciudadania"),
    PASSPORT("Pasaporte"),
    CEDULA_EXTRANJERIA("Cédula de extranjería"),
    NIT("NIT");

    private final String value;
    DocumentTypeEnum(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }


}//Fin public class
