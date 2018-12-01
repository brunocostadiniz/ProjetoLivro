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
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro l[] = new Livro [3];
        Pessoas p[] = new Pessoas [3];
        
        p[0]= new Pessoas ("Bruno",27,"Masculino");
        p[1]= new Pessoas ("Carla", 21, "Feminino ");
        p[2]= new Pessoas ("Ana ", 23, "Indefinido ");
        
        l[0]= new Livro ("Harry Potter ","Jk Rolling ", 752,p[0]);
        l[1] = new Livro ("A Culpa é das estrelas " ,"John Green", 325,p[1]);
        l[2]= new Livro ("APrendendo Java","José Carlos", 600, p[2]);
        
        
        
    }
    
}
