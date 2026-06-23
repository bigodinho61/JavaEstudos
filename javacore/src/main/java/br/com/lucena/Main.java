import br.com.lucena.dominio.Pessoa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Pessoa bruno = new Pessoa();
    bruno.name = "Bruno Eduardo";
    bruno.idade = 26;
    bruno.sexo = 'M';
    System.out.println(bruno.name);
    System.out.println(bruno.idade);
    System.out.println(bruno.sexo);

    System.out.println(bruno); // Vai imprimir o enderço da memória

    Pessoa beatriz = new Pessoa();

    beatriz.name = "Beatriz Gonçalves";
    beatriz.idade = 24;
    beatriz.sexo = 'F';
    System.out.println(beatriz.name);
    System.out.println(beatriz.idade);
    System.out.println(beatriz.sexo);

}
