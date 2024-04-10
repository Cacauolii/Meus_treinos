import java.util.Scanner;
public class treino {
    public static void main(String[] args){
          Scanner teclado = new Scanner(System.in);
          double notas[] = new double[10];
          double maior = Double.NEGATIVE_INFINITY;
          double menor = Double.POSITIVE_INFINITY;
     for(int i = 0;i<notas.length; i++){
        System.out.print("Escreva o valor da nota " + i + ": ");
        notas[i]= teclado.nextDouble();
        maior = Math.max(maior , notas[i]);
        menor = Math.min(menor, notas[i]); 
   }   
     int[] indiceMaiorNota = encontrarIndices(notas, maior);
     int[] indiceMenorNota = encontrarIndices(notas, menor);
    
  System.out.print("A maior nota é " + maior + " e foi obtida pelos alunos nos índices: ");
  for(int indice : indiceMaiorNota){
    System.out.print(indice + " ");
  }
            System.out.print("A menor nota é " + menor + " e foi obtida pelo aluno nos índices: ");
            for(int indice : indiceMenorNota){
                System.out.print(indice + " ");
            }
            teclado.close();
      

}
        public static int[] encontrarIndices(double[] notas, double nota){
            int comeco = 0;
            for(double i : notas){
                if(i == nota){
                    comeco++;
                }
            }
            int[] indices = new int[comeco];
            int posicao = 0;
            for(int i =0; i<notas.length; i++){
                if(notas[i] == nota){
                    indices[posicao] = i;
                    posicao++;
                }
            }
                return(indices);
        }



        }



