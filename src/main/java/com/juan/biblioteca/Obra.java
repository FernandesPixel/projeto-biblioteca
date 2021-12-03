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
public class Obra {

    private int id;
    private String titulo;
    private Autor[] autores;
    private Editora editora;
    private int ano;
    private double penalidadeAtraso; //valor por atraso
    private int tempoReserva; //tempo permitido de reserva
    
    private static int contador;

    public Obra(String titulo, Autor[] autores, Editora editora, int ano, double penalidadeAtraso, int tempoReserva) {
        this.id = contador++;
        this.titulo = titulo;
        this.autores = autores;
        this.editora = editora;
        this.ano = ano;
        this.penalidadeAtraso = penalidadeAtraso;
        this.tempoReserva = tempoReserva;
        Biblioteca.adicionarObra(this);
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor[] getAutores() {
        return autores;
    }

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPenalidadeAtraso() {
        return penalidadeAtraso;
    }

    public void setPenalidadeAtraso(double penalidadeAtraso) {
        this.penalidadeAtraso = penalidadeAtraso;
    }

    public int getTempoReserva() {
        return tempoReserva;
    }

    public void setTempoReserva(int tempoReserva) {
        this.tempoReserva = tempoReserva;
    }

    
    
    public boolean estaEmprestado() {

        return true;
    }

    public boolean estaReservado() {

        return true;
    }
}

