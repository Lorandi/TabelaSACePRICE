package com.rodrigolorandi.tabelas.services;

public interface Tabela {

    Double calculaPmt();

    Double calculaJuros();

    Double calculaAmort();

    Double calculaSaldoDevedor();

    Double calculaValorTotalPago();

    boolean criarTabela();

}
