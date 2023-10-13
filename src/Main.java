import component.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone newIphone = new Iphone();

        System.out.println("Chamada");
        newIphone.ligar();
        newIphone.atender();
        newIphone.iniciarCorreioDeVoz();

        System.out.println("Navegação");
        newIphone.selecionarMusica();
        newIphone.tocar();
        newIphone.pausar();

        System.out.println("Reproduzir Música");
        newIphone.adicionarNovaPagina();
        newIphone.exibirPagina();
        newIphone.atualizarPagina();
    }
}
