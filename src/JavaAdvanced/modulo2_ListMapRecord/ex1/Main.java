package JavaAdvanced.modulo2_ListMapRecord.ex1;

import java.util.ArrayList;
import java.util.List;

/* Creare una classe Student che accetti nel costruttore il parametro name (String e age int)
* in questa classe avere i metodi pubblici per ottenere le informazioni
* creare un arraylist con n elementi e stamparlo in console
* aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console*/
public class Main {
    public static void main(String[] args) {
        Studente alunno1 = new Studente("Davide", 14);
        Studente alunno2 = new Studente("Samantha", 34);
        Studente alunno3 = new Studente("Samuel", 40);
        Studente alunno4 = new Studente("Gioia", 23);
        List<Studente> lista = new ArrayList<Studente>();
        lista.add(alunno1);
        lista.add(alunno2);
        System.out.println("Lista non aggiornata: " + lista);

        lista.add(alunno3);
        lista.add(alunno4);
        System.out.println("Lista aggiornata: " + lista);
    }

}
