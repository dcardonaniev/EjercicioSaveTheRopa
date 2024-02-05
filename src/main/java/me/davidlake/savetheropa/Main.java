package me.davidlake.savetheropa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GuardaRopa test = new GuardaRopa();

        Prenda prenda1 = new Prenda(
                "Gucci",
                "Camisa"
        ), prenda2 = new Prenda(
                "Adidas",
                "Camiseta"
        );

        int codigo = test.guardarPrendas(new ArrayList<>(List.of(prenda1, prenda2)));
        System.out.printf("Codigo prendas guardadas: %d\n", codigo);
        List<Prenda> prendasTest = test.devolverPrendas(1);
        System.out.printf("Lista prendas con ese codigo: %s", prendasTest);
    }
}