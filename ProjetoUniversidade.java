/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetouniversidade;

/**
 *
 * @author douglas.ssilva72
 */
public class ProjetoUniversidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntradaDados entrada = new EntradaDados();
        Opcoes opcoes = new Opcoes();
        
        System.out.println("Qual a sigla do curso:");
        opcoes.codCurso = entrada.lerCurso();
        
        System.out.println("Qual a sigla do programa de bolsa:");
        opcoes.codBolsa = entrada.lerTexto();
        
        Universidade aluno1 = new Universidade();
        
        Resultado result = aluno1.calcularMensalidade(opcoes);
        
        System.out.println("");
        System.out.println("===== CENTRAL DO ALUNO =====");
        System.out.println("");
        System.out.println("Nome do curso: " + result.lerCurso());
        System.out.println("Valor do curso: " + result.lerMensalidade());
        System.out.println("Nome do programa da bolsa: " + result.lerBolsa());
        System.out.println("Valor do desconto: " + result.lerDesconto());
              
        System.out.println("");
        double valorFinal = result.lerMensalidade() - result.lerDesconto();
        System.out.println("Valor do curso com desconto: " + valorFinal);
        
    }    
}