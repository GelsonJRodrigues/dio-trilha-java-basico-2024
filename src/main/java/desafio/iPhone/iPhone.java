package main.java.desafio.iPhone;
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    public void atender(String numero) {
        // Implementação aqui
    }

    public void iniciarCorreioVoz(String mensagem, String destinatario) {
        System.out.println("Mensagem: " + mensagem + " - Destinatário: " + destinatario);
    }

    public void exibirPagina(String url) {
        System.out.println("Carregando a página - " + url);
    }

    public void adicionarNovaAba(String url) {
        // Implementação aqui
    }

    public void atualizarPagina() {
        // Implementação aqui
    }

    public void tocar() {
        System.out.println("Tocando uma música!");
    }

    public void pausar() {
        System.out.println("Pausando a música!");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando uma música!");
    }

}
