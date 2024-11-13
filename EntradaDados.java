/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetouniversidade;

import java.util.Scanner;

/**
 *
 * @author douglas.ssilva72
 */
public class EntradaDados {
    
    static Scanner ler = new Scanner(System.in);
    
    public String lerTexto() {
        return ler.nextLine();
    }
    
    public String lerCurso(){
        
        String curso = ler.nextLine();
        
        if(curso.equals("TSI"))
            return curso;
        
        if(curso.equals("TADS"))
            return curso;
        
        if(curso.equals("BCC"))
            return curso;
        
        if(curso.equals("BSI"))
            return curso;
        
        if(curso.equals("BEC"))
            return curso;
        
        else
            System.out.println("Qual a sigla do curso:");
            return lerCurso();
    }
    
    public int lerInt() {

        while (true) {
            var linha = ler.nextLine();
            try {
                return Integer.parseInt(linha);
                
            } catch (NumberFormatException erro) {

                System.out.println("Digite um número inteiro.");
            }
        }
    }    
}