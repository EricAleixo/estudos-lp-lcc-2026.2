package br.dcx.ufpb.silva.eric.models;

public class Pokemon {

    private String name;
    private String description;
    private Type type;
    private Double power;

    public Pokemon(String name, String description, Type type, Double power){
        this.name = name;
        this.description = description;
        this.type = type;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public String toString(){
        return name + " | " + " | " + description + " | " + type.getValue() + " | " + power;
    }
}
