/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CursoEmVideoAula;

import java.util.Random;

/**
 *
 * @author Amaro
 */
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aproavada) {
        this.aprovada = aproavada;
    }
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if ((l1.getCategoria() == l2.getCategoria()) && (l1 != l2)){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }
        else{
           this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null); 
        }
    }
    
    public void lutar(){
        if (this.isAprovada()){
            desafiado.apresentar();
            desafiante.apresentar();
            
            Random rand = new Random();
            
            int vencedor = rand.nextInt(3);
            
            System.out.println("=====Resultado======");
            
            switch(vencedor){
                case 0: 
                    System.out.println("Empate!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitoria de " + this.desafiante.getNome() + " !!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2:    
                    System.out.println("Vitoria de " + this.desafiado.getNome() + " !!");
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
            }
        }
        else{
            System.out.println("Luta não pode acontecer");
        }
        System.out.println("===========");
    }
}
