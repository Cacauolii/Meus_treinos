public class Calculo {
    private double nota1, nota2, nota3;
    private double total;
    public Calculo(double nota1 , double nota2 , double nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        total = nota1 + nota2 + nota3;
    }

    public double total(){
        return total;
    } 
    public String calcular(){
        return " Minha média das três notas é: " + total;
    }
    public double getNota1(){
        return nota1;
    }
    public double getNota2(){
        return nota2;
    }
    public double getNota3(){
        return nota3;
    }
}
