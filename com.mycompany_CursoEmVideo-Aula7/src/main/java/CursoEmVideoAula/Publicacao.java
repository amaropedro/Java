/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CursoEmVideoAula;

/**
 *
 * @author Amaro
 */
public interface Publicacao {
    public abstract void abrir();
    
    public abstract void fechar();
    
    public abstract void folhear(int pag);
    
    public abstract void avançarPag();
    
    public abstract void voltarPag();
}
