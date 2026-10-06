package br.dcx.ufpb.silva.eric.models.Pokemon;

public class Type {
    //Valores simplificados
    private String value;

    public Type(String value){
        if (verifyType(value)){
            this.value = value;
        }else {
            this.value = "normal";
        }
    }

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }

    private boolean verifyType(String value){
        value = value.toLowerCase();
        return switch (value){
            case "fogo","água","raio","grama","terra","voador" -> true;
            default -> false;
        };
    }
}
