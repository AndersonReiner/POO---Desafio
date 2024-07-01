package Fabrica;

import Model.Iphone;

public class Main {
    public static void main(String[] args) {

        String musica = "talking to the moon";
        String numeroTelefone = "(65) 99966 - 7788";
        String paginaWeb = "www.dio.me";

        Iphone iphone = new Iphone();

        iphone.selecionarMusica(musica);
        iphone.ligar(numeroTelefone);
        iphone.exibirPagina(paginaWeb);
    }
}