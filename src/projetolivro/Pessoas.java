/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivro;

/**
 *
 * @author Bruno
 */
public class Pessoas {
    //Atributos 
    private String pessoas ;
    private int idade ;
    private String Sexo;
    
    
//Metodos 
    public void fazerAniversario(){
        this.idade++ ;
        
        
    }
    //Metodo Construtor

    public Pessoas(String pessoas, int idade, String Sexo) {
        this.pessoas = pessoas;
        this.idade = idade;
        this.Sexo = Sexo;
    }
    
   
    //Metdos Acessores

    public String getPessoas() {
        return pessoas;
    }

    public void setPessoas(String pessoas) {
        this.pessoas = pessoas;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
    
    
   
    
            
    
}
