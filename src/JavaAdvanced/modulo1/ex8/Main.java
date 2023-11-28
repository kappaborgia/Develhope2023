package JavaAdvanced.modulo1.ex8;

import java.util.Arrays;
import java.util.HashSet;

/* Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato*/
public class Main {
    public static void main(String[] args) {
        HashSet();

    }
    public static void HashSet (){
        HashSet<String> notebook = new HashSet<String>(Arrays.asList("Zenbook14","Macbook air","xps"));
        HashSet<String> notebook2 = new HashSet<>();
        notebook2 = notebook;
        notebook2.add("Pavillon");
        System.out.println(notebook);

    }
    /* Non so se ho capito bene la traccia dell'esercizio, ma ho provato ad interpretarla */
}
