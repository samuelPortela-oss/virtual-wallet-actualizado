package app.service.helpers;

import app.domain.DocumentTypeEnum;
import app.utils.FormRuleValidator;

public class SetDocumentType {


    public static String getDocType(){

        int option = FormRuleValidator.validateInt("Seleccione el tipo de documento: \n " +
                "1. Cédula de ciudadanía \n" +
                "2. Pasaporte \n" +
                "3. Cédula de Extranjeria \n" +
                "4. Nit");
        String value = "";

        switch (option){
            case 1:
                value = DocumentTypeEnum.CEDULA.getValue();
                break;
            case 2:
                value = DocumentTypeEnum.PASSPORT.getValue();
                break;
            case 3:
                value = DocumentTypeEnum.CEDULA_EXTRANJERIA.getValue();
                break;
            case 4:
                value = DocumentTypeEnum.NIT.getValue();
                break;
            default:
                value= "Seleccione una opción valida";
        }

        return value;
    }



}
