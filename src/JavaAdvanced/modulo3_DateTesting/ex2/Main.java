package JavaAdvanced.modulo3_DateTesting.ex2;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
Formatta la data ottenendo 01 marzo 2023
Stampa sulla console*/
public class Main {
    public static void main(String[] args) {
        OffsetDateTime Oggetto = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String dateString = Oggetto.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println(dateString);
    }
}
