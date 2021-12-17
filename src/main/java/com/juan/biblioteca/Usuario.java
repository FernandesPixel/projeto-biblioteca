/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author juann
 */
public class Usuario {
    private int id;
    private String nome;
    private String numCelular;
    private String email;
    private String login;
    private String senha;
    private int maxEmprestimos; //regra de negocio. a quantidade de emprest. depende do tipo de usuário
    protected Emprestimo[] listaEmprestimos;
    private Reserva[] listaReservas;
    
    private static int contador;

    public Usuario(String nome, String numCelular, String email, String login, String senha) {
        this.id = contador;
        this.nome = nome;
        this.numCelular = numCelular;
        this.email = email;
        this.login = login;
        this.senha = senha;
        contador++;
        Biblioteca.adicionarUsuario(this);
    }

    
    
    public Usuario() {
        listaEmprestimos = new Emprestimo[maxEmprestimos];
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setListaEmprestimos(Emprestimo[] emprestimo) {
        this.listaEmprestimos = emprestimo;
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
    
    public static boolean podeEmprestar(Usuario usuario) {
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();
        for(Emprestimo emp:usuario.getListaEmprestimos()){
            if(emp != null){
                emprestimos.add(emp);
            }
        }
        System.out.println("listaEmprestimos: "+emprestimos.toString());
        if (emprestimos.size() < usuario.getMaxEmprestimos()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        /*
        String obraEmprestimo = "";
        for(Emprestimo emprestimo: listaEmprestimos){
            obraEmprestimo+= " "+emprestimo.getObra().getTitulo()+", ";
        }
        */
        return "Usuario{" + "nome=" + nome + ", numCelular=" + numCelular + ", email=" + email + ", login=" + login + ", senha=" + senha + ", maxEmprestimos=" + maxEmprestimos + ", listaEmprestimos=" + "VAZIO" + ", listaReservas=" + listaReservas + '}';
    }
    
}
