package br.edu.fesfafic.hotel.Model;

import java.util.Calendar;

public class Checkout {
    private Checkin checkin;
    private Recepcionista recepcionista;
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minuto;
    private int diasHospedado;
    private double acrescimos;
    private double conta;
    private boolean pago;
    private boolean checkoutCompleto;

    public Checkout(Checkin checkin, Recepcionista recepcionista, double acrescimos){
        this.checkin = checkin;
        this.recepcionista = recepcionista;
        this.acrescimos = acrescimos;
        this.checkoutCompleto = false;
    }

    public void setDataHoje(){
        Calendar calendar = Calendar.getInstance();
        this.ano = calendar.get(Calendar.YEAR);
        this.mes = calendar.get(Calendar.MONTH) + 1;
        this.dia = calendar.get(Calendar.DAY_OF_MONTH);
        this.hora = calendar.get(Calendar.HOUR_OF_DAY);
        this.minuto = calendar.get(Calendar.MINUTE);
    }
    public void calcConta(int dia, int mes, int ano){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, ano);
        calendar.set(Calendar.MONTH, mes-1);
        calendar.set(Calendar.DAY_OF_MONTH, dia);
        this.diasHospedado = (int) ((calendar.getTimeInMillis() - this.checkin.getDataMilisegundos())/86400000);
        this.conta = this.diasHospedado * this.checkin.getSuite().getDiaria() + this.acrescimos;
    }
    public void calcConta(){
        Calendar calendar = Calendar.getInstance();
        this.diasHospedado = (int) ((calendar.getTimeInMillis() - this.checkin.getDataMilisegundos())/86400000);
        this.conta = this.diasHospedado * this.checkin.getSuite().getDiaria() + this.acrescimos;
    }
    public void exibirConta(int dia, int mes, int ano){
        if(this.conta == 0)
            calcConta(dia, mes, ano);
        System.out.println("-- Conta do hotel - hóspede: " + this.checkin.getHospede().getNome() + " --");
        System.out.printf("%d diárias no valor de R$ %.2f \n", this.diasHospedado, checkin.getSuite().getDiaria());
        System.out.printf("+ R$ %.2f de acréscimos \n", this.acrescimos);
        System.out.printf("Total: R$ %.2f \n", this.conta);
    }
    public void exibirConta(){
        if(this.conta == 0)
            calcConta();
        System.out.println("-- Conta do hotel - hóspede: " + this.checkin.getHospede().getNome() + " --");
        System.out.printf("%d diárias no valor de R$ %.2f \n", this.diasHospedado, checkin.getSuite().getDiaria());
        System.out.printf("+ R$ %.2f de acréscimos \n", this.acrescimos);
        System.out.printf("Total: R$ %.2f \n", this.conta);
    }

    public void fazerCheckout(int dia, int mes, int ano){
        if(checkoutCompleto)
            System.out.println("Check-out já feito anteriormente.");
        else {
            calcConta(dia, mes, ano);
            if(this.pago) {
                this.checkin.getSuite().setOcupado(false);
                System.out.println("Check-out concluído.");
                this.checkoutCompleto = true;
            } else
                System.out.println("Pague e tente novamente.");
        }
    }

    public void fazerCheckout(){
        if(checkoutCompleto)
            System.out.println("Check-out já feito anteriormente.");
        else {
            calcConta();
            if(this.pago) {
                this.checkin.getSuite().setOcupado(false);
                System.out.println("Check-out concluído.");
                this.checkoutCompleto = true;
            } else
                System.out.println("Pague e tente novamente.");
        }
    }

    public void setData(int dia, int mes, int ano) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    public void setAcrescimos(double acrescimos) {
        this.acrescimos = acrescimos;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public Checkin getCheckin() {
        return checkin;
    }

    public Recepcionista getRecepcionista() {
        return recepcionista;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getDiasHospedado() {
        return diasHospedado;
    }

    public double getAcrescimos() {
        return acrescimos;
    }

    public double getConta() {
        return conta;
    }

    public boolean isPago() {
        return pago;
    }

    @Override
    public String toString() {
        return "Checkout{" +
                "suite=" + this.checkin.getSuite() +
                ", hospede=" + this.checkin.getHospede() +
                ", recepcionista=" + this.recepcionista +
                ", data=" + this.dia + "/" + this.mes + "/" + this.ano +
                ", horário=" + this.hora + "h" + this.minuto +
                ", diasHospedado=" + this.diasHospedado +
                ", acrescimos=" + this.acrescimos +
                ", conta=" + this.conta +
                ", modo de pagamento=" + this.checkin.getModoPagamento() +
                ", pago=" + this.pago +
                ", checkoutCompleto=" + this.checkoutCompleto +
                "}";
    }
}

