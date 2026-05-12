package es.uniovi.reflection.met_52.noncompliant;

import java.util.ArrayList;
import es.uniovi.reflection.met_52.NonFinalE;
import es.uniovi.reflection.met_52.ExtendedNonFinalFFromNonFinalE;

public class MET_52_Noncompliant {

    public void storeNonFinalData(
            java.util.Date date,
            NonFinalE[] array,
            ArrayList<NonFinalE> list) {
        java.util.Date dateCopy = (java.util.Date) date.clone();
        NonFinalE[] arrayCopy = array.clone();
        ArrayList<NonFinalE> listCopy = (ArrayList<NonFinalE>) list.clone();
    }

    public void storeNonFinalObject(NonFinalE e) {
        NonFinalE personCopy = (NonFinalE) e.clone();
    }

    public void storeExtendedNonFinalObject(ExtendedNonFinalFFromNonFinalE f) {
        ExtendedNonFinalFFromNonFinalE fCopy = (ExtendedNonFinalFFromNonFinalE) f.clone();
    }
}
