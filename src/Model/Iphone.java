package Model;

import Repository.AparelhoTelefonico;
import Repository.NavegadorNaInternet;
import Repository.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO..." + numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PAGINA..." + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONADO NOVA ABA...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA...");
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO...");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSADO...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONADO MUSICA..." + musica);
    }
}
