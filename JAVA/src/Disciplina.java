public class Disciplina {
    //Atributos
    String materia;
    String professor;
    int idade;

    public void Aula() {
        System.out.println("Disciplina=" + materia + ", a " + professor + " Está apresentando");
    }

    public void fazerNiver () {
        idade++;
    }
}
