package es.uniovi.reflection.met_52.compliant;

import java.util.Arrays;
import java.util.ArrayList;
import es.uniovi.reflection.met_52.NonFinalE;
import es.uniovi.reflection.met_52.FinalE;
import java.util.Date;
import es.uniovi.reflection.met_52.ExtendedFinalFFromNonFinalE;

public class MET_52_Compliant {
    public void storeNonFinalData(
            Date date,
            NonFinalE[] array,
            ArrayList<NonFinalE> list) {
        Date dateCopy = new Date(date.getTime());
        NonFinalE[] arrayCopy = Arrays.copyOf(array, array.length);
        ArrayList<NonFinalE> listCopy = new ArrayList<NonFinalE>(list);
    }

    public void storeNonFinalObject(NonFinalE e) {
        NonFinalE eCopy = new NonFinalE(e.getStringVar());
    }

    public void storeFinalObject(FinalE e) {
        FinalE eCopy = (FinalE) e.clone();
    }

    public void storeExtendedFinalObject(ExtendedFinalFFromNonFinalE f) {
        ExtendedFinalFFromNonFinalE fCopy = (ExtendedFinalFFromNonFinalE) f.clone();
    }

    void storeDateInDefaultMethod(Date date) {
        Date dateCopy = (Date) date.clone();
    }

    protected void storeDateInProtectedMethod(Date date) {
        Date dateCopy = (Date) date.clone();
    }

    private void storeDateInPrivateMethod(Date date) {
        Date dateCopy = (Date) date.clone();
    }

    protected class InnerClass {
        public void storeDateInPublicMethod(Date date) {
            Date dateCopy = (Date) date.clone();
        }

        void storeDateInDefaultMethod(Date date) {
            Date dateCopy = (Date) date.clone();
        }

        protected void storeDateInProtectedMethod(Date date) {
            Date dateCopy = (Date) date.clone();
        }

        private void storeDateInPrivateMethod(Date date) {
            Date dateCopy = (Date) date.clone();
        }
    }
}
