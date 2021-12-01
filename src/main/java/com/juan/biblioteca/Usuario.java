/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.biblioteca;

/**
 *
 * @author juann
 */
public class Usuario {
    private String nome;
    private String numCelular;
    private String email;
    private String login;
    private String senha;
    private int maxEmprestimos; //regra de negocio. a quantidade de emprest. depende do tipo de usuário
    private Emprestimo[] listaEmprestimos;
    private Reserva[] listaReservas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getMaxEmprestimos() {
        return maxEmprestimos;
    }

    public void setMaxEmprestimos(int maxEmprestimos) {
        this.maxEmprestimos = maxEmprestimos;
    }

    public Emprestimo[] getListaEmprestimos() {
        return listaEmprestimos;
    }

    public void setListaEmprestimos(Emprestimo[] listaEmprestimos) {
        this.listaEmprestimos = listaEmprestimos;
    }

    public Reserva[] getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(Reserva[] listaReservas) {
        this.listaReservas = listaReservas;
    }
    
    public boolean estaPunido(){
    
        return false;
    }
    
    
}
