package cursoemvideo.aula1;
public class CursoEmVideoAula1 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        //c1.tampar();
        c1.status();
        //c1.rabiscar();
        c1.tampar();
        c1.rabiscar();
        System.out.println("------");
        Caneta c2 = new Caneta();
        c2.modelo = "bic";
        c2.cor = "Preta";
        c2.destampar();
        c2.rabiscar();
    }
}
