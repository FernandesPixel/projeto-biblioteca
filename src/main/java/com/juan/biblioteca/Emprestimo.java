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
public class Emprestimo {
    private Usuario usuario;
    private Obra obra;
    private int qtdRenovado; //regra de negocio, pode renovar até 3 vez
    //private Date dataExpiracao;
    private boolean status;

    public Emprestimo(Usuario usuario, Obra obra) {
        this.usuario = usuario;
        this.obra = obra;
        this.status = true;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public int getQtdRenovado() {
        return qtdRenovado;
    }

    public void setQtdRenovado(int qtdRenovado) {
        this.qtdRenovado = qtdRenovado;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public static Emprestimo procurarEmprestimo(Usuario usuario, Obra obra){
        for(Emprestimo emprestimo: usuario.getListaEmprestimos()){
            if(emprestimo.getObra().equals(obra)){
                return emprestimo;
            }
        }
        return null;
    }
    
}
