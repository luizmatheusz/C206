package classes.rede_social;

public abstract class RedeSocial {
    // membros da classe
    protected String senha;
    protected int numAmigos;

    // construtor da classe
    public RedeSocial(String senha, int numAmigos) {
        this.senha = senha;
        this.numAmigos = numAmigos;
    }

    // métodos da classe
    public abstract void postarFoto();

    public abstract void postarVideo();

    public abstract void postarComentario();

    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação!");
    }

    // getters e setters
    public String getSenha() {
        return senha;
    }

    public int getNumAmigos() {
        return numAmigos;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
