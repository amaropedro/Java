/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoemvideo.aula;

/**
 *
 * @author Amaro
 */
public class Bolsista extends Aluno{
    private int bolsa;

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    public void RenovaBolsa(){
        
    }
    
    @Override
    public void PagarMensalidade(){
        System.out.println("Bolsista, pagamento diferente");
    }
    
}
