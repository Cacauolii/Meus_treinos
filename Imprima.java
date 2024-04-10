public class Imprima {
    public static void main(String[] args) {

    Aluno aluno1 = new Aluno("Cauan", "12410020");
    Aluno aluno2 = new Aluno("Vitoria", "12048754");
    Calculo media1 = new Calculo(20, 50, 40);
    Calculo media2 = new Calculo(60, 30, 70);

    System.out.println(aluno1.falar());
    System.out.println(media1.calcular());
    System.out.println(aluno2.falar());
    System.out.println(media2.calcular());

}
}