package JavaBasic.modulo3;

public class ConfrontoLessicografico {
    public static void main(String[] args) {
        String primaStringa = "Hello";
        String secondaStringa = "World";

        String risultatoConfronto = confrontaLessicograficamente(primaStringa, secondaStringa);

        System.out.println(risultatoConfronto);
    }

    static String confrontaLessicograficamente(String stringa1, String stringa2) {
        int confronto = stringa1.compareTo(stringa2);

        if (confronto == 0) {
            return buildRisultato("Le due stringhe sono uguali");
        } else {
            return buildRisultato("Le due stringhe sono differenti");
        }
    }

    static String buildRisultato(String messaggio) {
        StringBuilder risultato = new StringBuilder();
        risultato.append(messaggio);
        return risultato.toString();
    }
}

