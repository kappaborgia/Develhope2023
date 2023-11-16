package JavaBasic.modulo3.ex7;

public class ConfrontoStringhe {
    public ConfrontoStringhe(String primaStringa, String secondaStringa) {
    }

    public String Confrontostringhe(String stringa1, String stringa2) {

        if (stringa1.equals(stringa2)) {
            return buildRisultato("Le due stringhe sono uguali");
        } else {
            return buildRisultato("Le due stringhe sono differenti");
        }
    }

    public static String buildRisultato(String messaggio) {
        return messaggio;
    }
}

