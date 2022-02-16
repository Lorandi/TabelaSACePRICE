/*
PMT = prestação
PV = valor presente no momento da contratação
i = taxa de juros
n = número de prestações
amort = amortização
saldo devedor = saldo após desconto da armotização no período
 */

public class TabelaSAC implements Tabela{
    Double pv;
    Double i;
    Integer n;
    Double pmt;
    Double juros;
    Double amort;
    Double saldoDevedor;
    Double totalPago = 0.00;


    public TabelaSAC(Double pv, Double i, Integer n) {
        this.pv = pv;
        this.i = i;
        this.n = n;
        saldoDevedor = pv;
    }

    @Override
    public Double calculaAmort() {
        return amort = pv / n;
    }

    @Override
    public Double calculaJuros() {
        juros = saldoDevedor * i/100;
        return juros;
    }

    @Override
    public Double calculaPmt() {
        pmt = amort + juros;
        return pmt;
    }

    @Override
    public Double calculaSaldoDevedor() {
        return saldoDevedor = saldoDevedor - amort;
    }

    @Override
    public Double calculaValorTotalPago() {
        return totalPago += pmt;
    }

    @Override
    public void criarTabela(){

        System.out.println("\n                 TABELA SAC    ");
        System.out.printf("Valor inicial R$%.2f \n", getPv());
        System.out.println("Parc    PMT         Juros      Amort      Saldo Devedor");
        calculaAmort();

        for (int j = 0; j < n;  j++ ){
            calculaJuros();
            calculaPmt();
            calculaSaldoDevedor();
            calculaValorTotalPago();
            System.out.printf("  %d   R$%.2f   R$%.2f   R$%.2f     R$%.2f",j + 1, getPmt(), getJuros(), getAmort(), getSaldoDevedor());
            System.out.println();
        }

        System.out.printf("Valor total pago: R$%.2f \n\n", getTotalPago());
    }

    public Double getPv() {
        return pv;
    }

    public void setPv(Double pv) {
        this.pv = pv;
    }

    public Double getI() {
        return i;
    }

    public void setI(Double i) {
        this.i = i;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public Double getPmt() {
        return pmt;
    }

    public void setPmt(Double pmt) {
        this.pmt = pmt;
    }

    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    public Double getAmort() {
        return amort;
    }

    public void setAmort(Double amort) {
        this.amort = amort;
    }

    public Double getSaldoDevedor() {
        return saldoDevedor;
    }

    public void setSaldoDevedor(Double saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }

    public Double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(Double totalPago) {
        this.totalPago = totalPago;
    }


}
