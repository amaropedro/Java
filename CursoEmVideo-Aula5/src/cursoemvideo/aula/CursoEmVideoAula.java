package cursoemvideo.aula;
public class CursoEmVideoAula {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.abrirMenu();
        c.fecharMenu();
        c.ligarMudo();
        c.play();
        c.abrirMenu();
    }
}
