/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MaisEnem;


/**
 *
 * @author Matheus
 */
public class Calc_raiZenem {

    /**
     * @param args the command line arguments
     */
    private String mediafinal = null;
    private String ciencias = null;
    private String humanas = null;
    private String linguagens = null;
    private String matematica = null;
    private String redacao = null;
    
    private Double n1v1 = 0.00;
    private Double n2v2 = 0.00;
    private Double n3v3 = 0.00;
    private Double n4v4 = 0.00;
    private Double n5v5 = 0.00;
    
    public void mediaENEM(String d1, String d2, String d3, String d4, String d5,
    String p1, String p2, String p3, String p4, String p5){
        
        Double n1 = Double.parseDouble(d1);
        Double n2 = Double.parseDouble(d2);
        Double n3 = Double.parseDouble(d3);
        Double n4 = Double.parseDouble(d4);
        Double n5 = Double.parseDouble(d5);
        
        Double v1 = Double.parseDouble(p1);
        Double v2 = Double.parseDouble(p2);
        Double v3 = Double.parseDouble(p3);
        Double v4 = Double.parseDouble(p4);
        Double v5 = Double.parseDouble(p5);
        
        n1v1 = n1 * v1;        
        n2v2 = n2 * v2;      
        n3v3 = n3 * v3;        
        n4v4 = n4 * v4;  
        n5v5 = n5 * v5;        
        
        Double media = 0.00;        
        media = (n1v1 + n2v2 + n3v3 + n4v4 + n5v5)/(v1+v2+v3+v4+v5);             
        mediafinal = Double.toString(media); 
        
    }
    public String mediafinal(){
        return mediafinal;
    }
    
    public String ciencias(){
     ciencias = Double.toString(n1v1);
        return ciencias;
    }
    
    public String humanas(){
     humanas = Double.toString(n2v2);
        return humanas;
    }
    
    public String linguagens(){
     linguagens = Double.toString(n3v3);
        return linguagens;
    }
    
    public String matematica(){
     matematica = Double.toString(n4v4);
        return matematica;
    }
        
    public String redacao(){
     redacao = Double.toString(n5v5);
        return redacao;
    }
    
}
    
