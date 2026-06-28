package binintroducaometodos.dominio;

import binintroducaometodos.Estudantes;

public class ImprimirEstudantes {
    public void imprimaEstudantes(Estudantes estudantes){
        System.out.println("Name: "+estudantes.name+"\nage:"+estudantes.age+"\nSexo:"+estudantes.sexo);
    }
}
