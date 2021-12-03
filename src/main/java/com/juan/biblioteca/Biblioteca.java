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
public class Biblioteca {

    private static Usuario[] listaUsuarios;
    private static Obra[] listaObras;
    
    public Usuario[] getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(Usuario[] listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public Obra[] getListaObras() {
        return listaObras;
    }

    public void setListaObras(Obra[] listaObras) {
        this.listaObras = listaObras;
    }
    
    public static void adicionarObra(Obra obra){
        ArrayList<Obra> obras = new ArrayList<>();
        obras.add(obra);
        listaObras = (Obra[]) obras.toArray();
    }
    
    public static void removerObra(Obra obra){
        ArrayList<Obra> obras = new ArrayList<>();
        obras.addAll(Arrays.asList(listaObras));
        obras.remove(obra);
    }
    
    public static void adicionarUsuario(Usuario usuario){
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario);
        listaUsuarios = (Usuario[]) usuarios.toArray();
    }
    
    public static void removerUsuario(Usuario usuario){
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.addAll(Arrays.asList(listaUsuarios));
        usuarios.remove(usuario);
    }

    public static boolean emprestar(Usuario usuario, Obra obra) {
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();
        Emprestimo emprestimo = new Emprestimo(usuario,obra);
        if(emprestimos.size()<usuario.getMaxEmprestimos()){
            emprestimos.add(emprestimo);
            usuario.setListaEmprestimos(((Emprestimo[])emprestimos.toArray()));
            return true;
        }
        return false;
    }

    public static void devolver(Usuario usuario, Obra obra) {

    }

    public static void reservar(Usuario usuario, Obra obra) {

    }

    public static void renovar(Usuario usuario, Obra obra) {

    }

    public static void punirAtraso() {

    }

    public static void limparReservas() {

    }

}
