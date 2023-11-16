package JavaBasic.modulo3.ex7;

public class Main {
    public static void main(String[] args) {
        String primaStringa = "Hello";
        String secondaStringa = "World";

        String risultatoConfronto = new ConfrontoStringhe(primaStringa, secondaStringa).toString();

        System.out.println(risultatoConfronto);
    }
}
