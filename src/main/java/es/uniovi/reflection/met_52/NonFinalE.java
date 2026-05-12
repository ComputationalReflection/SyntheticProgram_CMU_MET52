package es.uniovi.reflection.met_52;

import java.io.*;
import java.util.function.Function;

public class NonFinalE implements Cloneable{
    private String stringVar;

    public NonFinalE(String stringVar){
        this.stringVar = stringVar;
    }

    public String getStringVar() {
        return this.stringVar;
    }

    public void setStringVar(String stringVar) {
        this.stringVar = stringVar;
    }

    @Override
    public Object clone() {
        return null;
    }
}
