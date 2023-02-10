/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CursoEmVideoAula;

/**
 *
 * @author Amaro
 */
public class CursoEmVideoAula {
    public static void main (String [] args){
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 20, "m");
        p[1] = new Pessoa("Lara", 11, "f");
        
        l[0] = new Livro("Got", "Gorge rr Mar", 1550, p[0]);
        l[1] = new Livro("harry potter", "jk rol", 300, p[1]);
        l[2] = new Livro("Dracula","Bram Stoker", 500, p[0]);
        
        l[0].abrir();
        l[0].folhear(200);
        
        System.out.println(l[0].detalhes());
    }
}
