package introducaometodos;

import introducaometodos.dominio.Calculadora;

public class testeCalculadora {
    static void main() {

        Calculadora soma = new Calculadora();

        soma.somaDoisNumeros(40,20);

        Calculadora multiplica = new Calculadora();
        System.out.println(multiplica.multiplicaDoisNumeros(50,2));
    }
}
