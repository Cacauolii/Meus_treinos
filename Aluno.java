public class Aluno {
    private String aluno;
    private String ra;

    public Aluno(String aluno , String ra){
        this.aluno = aluno;
        this.ra = ra;
    }

    public String falar(){
        return " Oi meu nome é " + aluno + "\n e o meu ra é: " + ra;
    }
    public String getAluno(){
        return aluno;
    }
    public String getRa(){
        return ra;
    }
}
