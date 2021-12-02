/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.biblioteca;

import java.util.ArrayList;

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
    protected Emprestimo[] listaEmprestimos;
    private Reserva[] listaReservas;

    public Usuario(String nome, String numCelular, String email, String login, String senha) {
        this.nome = nome;
        this.numCelular = numCelular;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    
    
    public Usuario() {
        listaEmprestimos = new Emprestimo[maxEmprestimos];
    }

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

    public boolean setListaEmprestimos(Emprestimo emprestimo) {
        for(int i =0;i<listaEmprestimos.length;i++){
            if(listaEmprestimos[i] == null){
                listaEmprestimos[i] = emprestimo;
                return true;
            }
        }
        return false;
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

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", numCelular=" + numCelular + ", email=" + email + ", login=" + login + ", senha=" + senha + ", maxEmprestimos=" + maxEmprestimos + ", listaEmprestimos=" + listaEmprestimos.toString() + ", listaReservas=" + listaReservas + '}';
    }
    
}
