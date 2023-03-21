package br.edu.fesfafic.hotel.Model;
import java.util.ArrayList;
import java.util.List;

public class Camareira extends Colaboradores{
    public List<Suite> suites;
    public Camareira(String nome, String cpf, String rg){
        super(nome, cpf, rg);
        this.suites = new ArrayList<>();
    }
    public void addSuite(Suite suite) {this.suites.add(suite);}
    public void removeSuite(Suite suite) {this.suites.remove(suite);}

    @Override
    public String toString() {
        return "Camareira{" +
                "nome='" + this.nome +
                ", cpf='" + this.cpf +
                ", rg='" + this.rg +
                ", suites" + this.suites +
                "}";
    }
}
