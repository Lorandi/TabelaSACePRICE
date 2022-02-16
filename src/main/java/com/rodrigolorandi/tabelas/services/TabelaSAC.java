package com.rodrigolorandi.tabelas.services;/*
PMT = prestação
PV = valor presente no momento da contratação
i = taxa de juros
n = número de prestações
amort = amortização
saldo devedor = saldo após desconto da armotização no período
 */

import lombok.Data;

@Data
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
    public boolean criarTabela(){
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

        return true;
    }
}
