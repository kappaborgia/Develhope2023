package JavaBasic.modulo3.ex6;

public abstract class Forma {
    public Forma(TipoForma) {

    }

    abstract double calcolaArea();

    // Enumerazione per i tipi di forma
    enum TipoForma {
        TRIANGOLO, RETTANGOLO
    }

    // Classe base Forma
    abstract static class Forma {
        Main.TipoForma tipo;

        Forma(Main.TipoForma tipo) {
            this.tipo = tipo;
        }

        abstract double calcolaArea();
    }

}
