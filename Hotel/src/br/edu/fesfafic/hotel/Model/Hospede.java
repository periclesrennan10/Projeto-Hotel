package br.edu.fesfafic.hotel.Model;

public class Hospede {

    public String nome;
    public String cpf;
    public String rg;
    public int numPessoas;

    public Hospede(String nome, String cpf, String rg, int numPessoas){
        this.nome = nome;
        this.cpf = cpf;
        this.rg =rg;
        this.numPessoas = numPessoas;
    }

    public String getNome() {return nome;}
    public String getCpf() {return cpf;}
    public String getRg() {return rg;}
    public int getNumPessoas() {return numPessoas;}

    public void setNome (String nome) {this.nome = nome;}
    public void setCpf (String cpf) {this.cpf = cpf;}
    public void setRg (String rg) {this.rg = rg;}
    public void setNumPessoas (int numPessoas) {this.numPessoas = numPessoas;}

    @Override
    public String toString() {
        return "Hospede{" +
                "Nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", numPessoas='" +numPessoas +
                '}';
    }

}
