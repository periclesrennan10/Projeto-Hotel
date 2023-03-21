package br.edu.fesfafic.hotel.Model;

public class Mesa {
    private int numero;
    private boolean ocupado;
    private boolean pedido;

    public Mesa(int numero, boolean ocupado, boolean pedido) {
        this.numero = numero;
        this.ocupado = ocupado;
        this.pedido = pedido;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public boolean isPedido() {
        return pedido;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void setPedido(boolean pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "numero=" + numero +
                ", ocupado=" + ocupado +
                ", pedido=" + pedido +
                '}';
    }
}
