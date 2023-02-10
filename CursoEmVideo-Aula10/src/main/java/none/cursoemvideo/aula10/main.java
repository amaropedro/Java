/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package none.cursoemvideo.aula10;

/**
 *
 * @author Amaro
 */
public class main {
    public static void main(String[] args){
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara a = new Arara();
        
        
        m.setPeso(35.5f);
        m.setCorPelo("marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        c.locomover();
    }
    
}
