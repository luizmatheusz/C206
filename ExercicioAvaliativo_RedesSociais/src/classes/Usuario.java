package classes;

import classes.rede_social.RedeSocial;

public class Usuario {
    // membros da classe
    private String nome;
    private String email;
    private RedeSocial [] redesSociais;

    // construtor da classe
    public Usuario(String nome, String email, RedeSocial redesSociais[]) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = redesSociais;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public RedeSocial[] getRedesSociais() {
        return redesSociais;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
