package cursoemvideo.aula1;
public class CursoEmVideoAula1 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "amarela", 0.4f);
        c1.setModelo("Bic");
        c1.setPonta(0.5f);
        System.out.println("Caneta: " + c1.getModelo() + " De ponta: " +c1.getPonta());
        System.out.println("----------");
        
        Caneta c2 = new Caneta("NIC", "vermelha", 0.6f);
        c2.status();
    }
}
