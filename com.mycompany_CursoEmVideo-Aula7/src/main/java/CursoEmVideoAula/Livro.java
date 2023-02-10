/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CursoEmVideoAula;

/**
 *
 * @author Amaro
 */
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa Leitor;

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

    public Pessoa getLeitor() {
        return Leitor;
    }

    public void setLeitor(Pessoa Leitor) {
        this.Leitor = Leitor;
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa Leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.Leitor = Leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }

    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + 
                ", totPaginas=" + totPaginas + ", pagAtual=" + pagAtual + 
                ", aberto=" + aberto + ", Leitor=" + Leitor.getNome() + '}';
    }
    
    @Override
    public void abrir() {
        if (this.isAberto()== false){
            this.setAberto(true);
        }
    }

    @Override
    public void fechar() {
         if (this.isAberto()== true){
            this.setAberto(false);
        }
    }

    @Override
    public void folhear(int pag) {
       if (pag > this.getTotPaginas()){
           this.setPagAtual(0);
       }else{
           this.setPagAtual(pag);
       }
    }

    @Override
    public void avançarPag() {
        if (this.isAberto()){
            if (this.getPagAtual() < this.getTotPaginas()){
                this.setPagAtual(this.getPagAtual() +1);
            }
            else{
                this.setAberto(false);
            }
        }
    }

    @Override
    public void voltarPag() {
        if (this.isAberto()){
            if (this.getPagAtual() != 1){
                this.setPagAtual(this.getPagAtual() -1);
            }
            else{
                this.setAberto(false);
            }
        }
    }
}
    
