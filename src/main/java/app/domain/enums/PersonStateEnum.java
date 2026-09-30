package app.domain.enums;

public enum PersonStateEnum {
    ACTIVE("Activo"),
    INACTIVE("Inactivo"),
    BLOCKED("Bloqueado");

    private String value;
    PersonStateEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
