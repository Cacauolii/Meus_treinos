package atividade_excecao;

    public class Main {
        public static void main(String[] args) {
            Arma ghost = new Arma("Ghost", 10, 20);
            Arma vandal = new Arma("Vandal", 30, 40);
    
            Jogador jogador = new Jogador();
            jogador.adicionarArma(ghost);
            jogador.adicionarArma(vandal);
    
            try {
                jogador.usarArma("Ghost");
                jogador.usarArma("Vandal");
                jogador.usarArma("Operator"); // Arma não encontrada
            } catch (SemMunicaoException e) {
                System.out.println(e.getMessage());
            }
    
            ghost.recarregar(15);
            System.out.println("Munições da ghost: " + ghost.consultarMunicoes());

            vandal.recarregar(30);
            System.out.println("Munições de vandal: " + vandal.consultarMunicoes());
}
}
