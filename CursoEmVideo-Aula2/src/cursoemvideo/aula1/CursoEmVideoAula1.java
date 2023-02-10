package cursoemvideo.aula1;
public class CursoEmVideoAula1 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "bic cristal";
        c1.cor = "azul";
        c1.carga = 80;
        c1.tampar();
        c1.status();
        c1.destampar();
        c1.rabiscar();
    }
}
