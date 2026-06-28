package teste;
import binintroducaometodos.Estudantes;
import binintroducaometodos.dominio.ImprimirEstudantes;

public class estudanteTeste {
    static void main() {
        Estudantes estudante01 = new Estudantes();

        estudante01.name = "Bruno";
        estudante01.age = 26;
        estudante01.sexo = 'M';
        ImprimirEstudantes imprimirEstudante = new ImprimirEstudantes();
        Estudantes estudante02 = new Estudantes();

        estudante02.name = "Beatriz";
        estudante02.age = 24;
        estudante02.sexo = 'F';

        imprimirEstudante.imprimaEstudantes(estudante01);


    }
}
