package br.dcx.ufpb.silva.eric.models;

import java.util.Locale;

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
        if(value.equals("fogo")){
            return true;
        } else if (value.equals("água")) {
            return true;
        } else if (value.equals("raio")) {
            return true;
        } else if (value.equals("grama")) {
            return true;
        } else if (value.equals("terra")){
            return true;
        } else if(value.equals("voador")){
            return true;
        }
        else {
            return false;
        }
    }
}
