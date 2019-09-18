package com.example.iclean.entities;

public class Usuario {

    private static final String EMAIL = "TESTE";
    private static final String SENHA = "123456";

    public Usuario(){

    }
    private String email;
    private String senha;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean ValidarUsuario()
    {
        if (email.equals(""))
        {
            return false;
        }
        else if (senha.equals(""))
        {
            return false;
        }
        else if (!email.equals(EMAIL) || !senha.equals(SENHA))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
