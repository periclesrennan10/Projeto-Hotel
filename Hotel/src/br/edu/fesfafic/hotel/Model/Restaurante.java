package br.edu.fesfafic.hotel.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Restaurante {
    private String nome;
    private List<Cozinheiro> cozinheiros;
    private  List<Mesa> mesas;
    private List<String> pratos;

    public Restaurante(String nome) {
        this.nome = nome;
        this.cozinheiros = new ArrayList<>();
        this.mesas = new ArrayList<>();
        this.pratos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addCozinheiro(Cozinheiro cozinheiro){this.cozinheiros.add(cozinheiro);}
    public void removeCozinheiro(Cozinheiro cozinheiro){this.cozinheiros.remove(cozinheiro);}
    public void addMesa (Mesa mesa){this.mesas.add(mesa);}
    public void removeMesa (Mesa mesa){this.mesas.remove(mesa);}
    public void addPrato(String prato){
        this.pratos.add(prato);
    }
    public void removePrato(String prato){
        this.pratos.remove(prato);
    }

    public List<Cozinheiro> getCozinheiros() {
        return cozinheiros;
    }

    public List<Mesa> getMesas() {
        return mesas;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "nome='" + nome + '\'' +
                ", cozinheiros=" + cozinheiros +
                ", mesas=" + mesas +
                ", pratos=" + pratos +
                '}';
    }
}
