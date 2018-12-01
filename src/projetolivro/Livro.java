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
public class Livro implements Publicacao {
    //Atributos
    private String titulo;
    private String autor ;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto ;
   private Pessoas leitor ;
    
    
    // Metodo 
    
    
     public String detalhes() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ","
                + " totPaginas=" + totPaginas + ", pagAtual=" + pagAtual + ","
                + " aberto=" + aberto + ", leitor=" + leitor + '}';
    }

    //Metodo Construtor

    public Livro(String titulo, String autor, int totPaginas, Pessoas leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.pagAtual=0;
        this.aberto=true;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }
    public String getTitulo() {
        return titulo;
               
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;    
    }

    public String getAutor() {    
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoas getLeitor() {
        return leitor;
    }

// Metodos acessores
    public void setLeitor(Pessoas leitor) {
        this.leitor = leitor;
    }

//Implementação
    @Override
    public void abrir() {
        this.aberto=true;
    }

    @Override
    public void fechar() {
        this.aberto=false;
    }

    public void folhear(int p ) {
        this.pagAtual= p;
       
    }

    @Override
    public void avançaPag() {
        this.pagAtual++;
       
    }

    @Override
    public void voltaPag() {
        this.pagAtual--;
        
    }
     

   

   
    
}


