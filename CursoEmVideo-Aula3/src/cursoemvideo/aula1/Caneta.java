package cursoemvideo.aula1;
public class Caneta {
    private String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    //Alt + Insert abre o menu para criar construtores, getters e setters
    
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public Caneta(String m, String c, float p){  //construtor
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
        this.tampar();
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta (float p){
        this.ponta = p;
    }
    
    public void status(){
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Uma Caneta " + this.cor);
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro, tampada!");
        }
        else{
            System.out.println("Rabiscando!!!");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
}
