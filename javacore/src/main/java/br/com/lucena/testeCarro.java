package br.com.lucena;

import br.com.lucena.dominio.Carro;

public class testeCarro {
    static void main() {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.name="Fusca bala";
        carro1.ano= 1969;
        carro1.modelo = "Sport";

        carro2.name="Fusion";
        carro2.ano= 2000;
        carro2.modelo = "Comfort";

        System.out.println(carro1.name);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\n"+carro2.name);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);


    }
}
