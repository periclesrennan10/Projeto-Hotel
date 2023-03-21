package br.edu.fesfafic.hotel.Model;

public class Suite {
    public int numero;
    public int camaDeCasal;
    public int camaDeSolteiro;
    public int capacidade;
    public boolean arcondicionado;
    public boolean banheira;
    public boolean varanda;
    public double diaria;
    public boolean ocupado;

    public Suite(int numero, int camaDeCasal, int camaDeSolteiro, boolean arcondicionado,
                 boolean banheira, boolean varanda, double diaria){
        this.numero = numero;
        this.camaDeCasal = camaDeCasal;
        this.camaDeSolteiro = camaDeSolteiro;
        this.capacidade = 2*this.camaDeCasal + this.camaDeSolteiro;
        this.arcondicionado = arcondicionado;
        this.banheira = banheira;
        this.varanda = varanda;
        this.diaria = diaria;
        this.ocupado = false;
    }


    public int getNumero() {
        return numero;
    }

    public int getCamaDeCasal() {
        return camaDeCasal;
    }

    public int getCamaDeSolteiro() {
        return camaDeSolteiro;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public boolean isArcondicionado() {
        return arcondicionado;
    }

    public boolean isBanheira() {
        return banheira;
    }

    public boolean isVaranda() {
        return varanda;
    }

    public double getDiaria() {
        return diaria;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setCamaDeCasal(int camaDeCasal) {
        this.camaDeCasal = camaDeCasal;
    }

    public void setCamaDeSolteiro(int camaDeSolteiro) {
        this.camaDeSolteiro = camaDeSolteiro;
    }

    public void setArcondicionado (boolean status) {this.arcondicionado = status;}

    public void setBanheira (boolean status) {this.banheira = status;}

    public void setVaranda (boolean status) {this.varanda = status;}

    public void setDiaria (double status) {this.diaria = status;}

    public void setOcupado (boolean status) {this.ocupado = status;}

    @Override
    public String toString() {
        return "suite{" +
                "Número da Suíte=" + numero +
                ", Camas de casal=" + camaDeCasal +
                ", Camas de solteiro=" + camaDeSolteiro +
                ", Capacidade=" + capacidade +
                ", Arcondicionado?=" + arcondicionado +
                ", Banheira?=" + banheira +
                ", Varanda?=" + varanda +
                ", Diaria=" + diaria +
                ", Quarto ocupado?=" + ocupado +
                "}";
    }
}
