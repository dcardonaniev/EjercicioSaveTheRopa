package me.davidlake.savetheropa;

import java.util.ArrayList;
import java.util.HashMap;

public class GuardaRopa {
    static HashMap<Integer, ArrayList<Prenda>> infoClientes = new HashMap<>();
    static int contador = 1;

    public Integer guardarPrendas(ArrayList<Prenda> prendas) {
        infoClientes.put(contador, prendas);
        contador++;

        return contador;
    }

    public void mostrarPrendas() {
        infoClientes.entrySet().forEach(System.out::println);
    }

    public ArrayList<Prenda> devolverPrendas(int identificador) {
        return infoClientes.get(identificador);
    }
}