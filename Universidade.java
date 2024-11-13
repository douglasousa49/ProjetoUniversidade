/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetouniversidade;

/**
 *
 * @author douglas.ssilva72
 */
public class Universidade {
    
    public Resultado calcularMensalidade(Opcoes opcoes){
        
        String nomeCurso = verificarNomeCurso(opcoes.codCurso);
        
        
        String programaBolsa = verificarProgramaBolsa(opcoes.codBolsa);
        
        double mensalidade = verificarMensalidade(opcoes.codCurso);   
                
        double desconto = verificarDesconto(opcoes.codBolsa);
        double descontoFinal = 0;
        
        if(desconto == 0.25)
            descontoFinal = mensalidade * desconto;
        
        if(desconto == 0.50)
            descontoFinal = mensalidade * desconto;
        
        if(desconto == 1.00)
            descontoFinal = mensalidade;
        
        if(desconto == 1000.00 && mensalidade > desconto)
            descontoFinal = 1000.00;
        
        if(desconto == 1000.00 && mensalidade < desconto)
            descontoFinal = mensalidade;
        
        if(desconto == 1500.00 && mensalidade > desconto)
            descontoFinal = 1500.00;
        
        if(desconto == 1500.00 && mensalidade < desconto)
            descontoFinal = mensalidade;        
        
        return new Resultado(mensalidade, descontoFinal, nomeCurso, programaBolsa);
    }
    
    private String verificarNomeCurso(String codCurso){
        
        if(codCurso.equals("TSI"))
            return "Sistemas para Internet";
        
        if(codCurso.equals("TADS"))
            return "Analise e Desenv. Sistemas";
        
        if(codCurso.equals("BCC"))
            return "Ciencia da Computacao";
        
        if(codCurso.equals("BSI"))
            return "Sistemas de Informacao";
        
        if(codCurso.equals("BEC"))
            return "Engenharia da Computacao";
        
        else
            return "Codigo do curso invalido";
    }
    
    private double verificarMensalidade(String codCurso){
        
        if(codCurso.equals("TSI"))
            return 915.00;
        
        if(codCurso.equals("TADS"))
            return 836.00;
        
        if(codCurso.equals("BCC"))
            return 1559.00;
        
        if(codCurso.equals("BSI"))
            return 1400.00;
        
        if(codCurso.equals("BEC"))
            return 1758.00;
        
        else
            return 0.00;        
    }
    
    private String verificarProgramaBolsa(String codBolsa){
        
        if(codBolsa.equals("MON"))
            return "Monitoria";
        
        if(codBolsa.equals("EMP"))
            return "Ensino Medio Publico";
        
        if(codBolsa.equals("ISE"))
            return "Isencao";
        
        if(codBolsa.equals("EXT"))
            return "Projeto de Extensao";
        
        if(codBolsa.equals("PES"))
            return "Pesquisa Cientifica";
        
        else
            return "Nenhuma bolsa foi vinculada";   
    }

    private double verificarDesconto(String codBolsa){
        
        if(codBolsa.equals("MON"))
            return 0.25;
        
        if(codBolsa.equals("EMP"))
            return 0.50;
        
        if(codBolsa.equals("ISE"))
            return 1.00;
        
        if(codBolsa.equals("EXT"))
            return 1000.00;
        
        if(codBolsa.equals("PES"))
            return 1500.00;
        
        else
            return 0.00;        
    }
}
