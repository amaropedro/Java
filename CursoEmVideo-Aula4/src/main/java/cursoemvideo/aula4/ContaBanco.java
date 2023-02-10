/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoemvideo.aula4;

/**
 *
 * @author Amaro
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
   
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
     public void ContaBanco(){
        this.setStatus(false);
        this.setSaldo(0f);
    }
    
    public void abrirConta(String t){
        this.setStatus(true);
        this.setTipo(t);
        if (t == "cc"){
            this.setSaldo(50f);
        }
        else{
            this.setSaldo(150f);
        }
    }
    
    public void fecharConta(){
        if (this.getSaldo() == 0){
            this.setStatus(false);
        }
        else{
            System.out.println("Saldo Diferente de 0, não foi possivel fechar a conta");
        }
    }
    
    public void depositar(float q){
        if (this.isStatus() == true){
            this.setSaldo(this.getSaldo()+q);
        }
        else{
            System.out.println("Conta fechada");
        }
    }
    
    public void sacar(float q){
        if (this.isStatus() == true){
            if (this.getSaldo() >= q){
                this.setSaldo(this.getSaldo()-q);
            }
        }
        else{
            System.out.println("Conta fechada ou sauqe invalido");
        }
    }
    
    public void pagarMensal(){
        if(this.isStatus()){
            if (this.getTipo() == "cc"){
                this.setSaldo(this.getSaldo()-12f);
            }
            else{
                this.setSaldo(this.getSaldo()-20f);
            }
        }
    }
    
    public void estadoAtual(){
        System.out.println("------------------------");
        System.out.println("conta: " + this.getNumConta());
        System.out.println("tipo: " + this.getTipo());
        System.out.println("dono: " + this.getDono());
        System.out.println("saldo: " + this.getSaldo());
        System.out.println("status: " + this.isStatus());
    }
}