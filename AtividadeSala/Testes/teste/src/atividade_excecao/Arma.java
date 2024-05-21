package atividade_excecao;

import java.util.HashMap;
import java.util.Map;

public class Arma {
        private String nome;
        private int municoes;
        private int danoPorTiro;
    
        public Arma(String nome, int municoes, int danoPorTiro) {
            this.nome = nome;
            this.municoes = municoes;
            this.danoPorTiro = danoPorTiro;
        }
    
        public void atirar() throws SemMunicaoException {
            if (municoes > 0) {
                System.out.println("Você atirou com a arma " + nome + ". Dano: " + danoPorTiro);
                municoes--;
            } else {
                throw new SemMunicaoException("Arma sem munição!");
            }
        }
    
        public void recarregar(int quantidadeMunicoes) {
            municoes += quantidadeMunicoes;
            System.out.println("Recarregou " + quantidadeMunicoes + " munições para a arma " + nome + ".");
        }
    
        public int consultarMunicoes() {
            return municoes;
        }

        public String getNome() {
            return nome;
         
        }
    }

    class Jogador {
        private Map<String, Arma> inventario;
    
        public Jogador() {
            inventario = new HashMap<>();
        }
    
        public void adicionarArma(Arma arma) {
            inventario.put(arma.getNome(), arma);
        }
    
        public void usarArma(String nomeArma) throws SemMunicaoException {
            Arma arma = inventario.get(nomeArma);
            if (arma != null) {
                arma.atirar();
            } else {
                System.out.println("Arma não encontrada no inventário.");
            }
        }
    }
