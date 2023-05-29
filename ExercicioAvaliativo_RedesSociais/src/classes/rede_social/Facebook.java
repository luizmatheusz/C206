package classes.rede_social;

import interfaces.Compartilhamento;
import interfaces.VideoConferencia;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Facebook!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Facebook!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez um streaming no Facebook!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma publicação no Facebook!");
    }
}
