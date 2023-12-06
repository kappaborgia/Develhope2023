package JavaAdvanced.modulo2.ex6;

public record Punto(int x, int y) {

    public Punto{
        if (x < 0){
            throw new IllegalArgumentException("X non può essere minore di zero");
        }
    }
}
