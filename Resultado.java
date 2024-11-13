/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetouniversidade;

/**
 *
 * @author douglas.ssilva72
 */
public class Resultado {
    
    private double mensalidade;
    private String curso;
    private String programaBolsa;
    private double desconto;
    
    public Resultado(double mensalidade, double desconto, String curso, String bolsa){
        this.mensalidade = mensalidade;
        this.desconto = desconto;
        this.curso = curso;
        this.programaBolsa = bolsa;
    }
    
    public double lerMensalidade(){
        return this.mensalidade;
    }
    
    public String lerCurso(){
        return this.curso;
    }
    
    public String lerBolsa(){
        return this.programaBolsa;
    }
    
    public double lerDesconto(){
        return this.desconto;
    }    
}