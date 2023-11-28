package JavaAdvanced.modulo1.ex9;

import java.util.Arrays;
import java.util.HashSet;

/* Scrivere una funzione che restituisca un hashset riempito
Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
Svuotare l'hashset, verificarlo e stampare il risultato*/
public class Main {
    public static void main(String[] args) {
        HashSet();
    }
    public static void HashSet(){
        HashSet<String> lista = new HashSet<String>(Arrays.asList("Pane","Latte","Cereali"));
        HashSet<String> newList = new HashSet<String>();

        //newList = lista;
        newList.add("Latte");
        newList.add("coca cola");
        newList.add("Pane");
        System.out.println(lista);
        System.out.println(newList);

        for(String i : lista){
            for(String j : newList){
                if(j == i){
                    newList.remove(j);
                }
            }
        }
        System.out.println();
    }

    /* probabilmente al posto del ciclo for devo usare iterator, Ma non riesco a convertire
    * cio che ho scritto con il ciclo for in iterator */

}
