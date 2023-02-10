/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoemvideo.aula11;

/**
 *
 * @author Amaro
 */
public class Cachorro extends Lobo{
    
    public void reagir(String frase){
        if (frase.equals("toma comida") ||  frase.equals("ola")){
            System.out.println("abanar e latir");
        }
        else{
            System.out.println("rosnar");
        }
    }
    
    public void reagir(int hora, int min){
        if (hora <12){
            System.out.println("abanar");
        }
        else if (hora>=18){
            System.out.println("ignorar");
        }
        else{
            System.out.println("abanar e latir");
        }
    }
    
    public void reagir(boolean dono){
        if (dono){
            System.out.println("abanar");
        }
        else{
            System.out.println("rosnar e latir");
        }
    }
    
    public void reagir(int idade, float peso){
        if (idade < 5){
            if (peso < 10){
                System.out.println("abanr");
            }
            else{
                System.out.println("latir");
            }
        }
        else{
            if (peso > 10){
                System.out.println("rosnar");
            }
            else{
                System.out.println("ignorar");
            }
        }
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Au Au Au Au!");
    }
}
