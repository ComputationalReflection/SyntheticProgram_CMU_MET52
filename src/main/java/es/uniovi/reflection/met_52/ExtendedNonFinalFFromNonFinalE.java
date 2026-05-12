package es.uniovi.reflection.met_52;

import java.io.*;
import java.util.function.Function;

public class ExtendedNonFinalFFromNonFinalE extends NonFinalE{
    private final int intVar = 5;

    public ExtendedNonFinalFFromNonFinalE(String stringVar){

        super(stringVar);
    }

    public int getIntVar() {
        return this.intVar;
    }
}
