import org.junit.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TabelaPriceTest {

    Double pv = 100000.00;
    Double i = 1.00;
    Integer n = 100;
    TabelaPrice tabelaPrice = new TabelaPrice(pv, i, n);
    Double saldoDevedor = pv;

    @Test
    void calculaPmt_returnSuccessful(){
        assertEquals(1586.57, Math.round(tabelaPrice.calculaPmt()*100.0)/100.0);
    }

    @Test
    void calculaJuros_returnSuccessful() {
        assertEquals(1000, tabelaPrice.calculaJuros());
    }

    @Test
    void calculaAmort_returnsSuccessful(){
        tabelaPrice.setPmt(Math.round(tabelaPrice.calculaPmt()*100.0)/100.0);
        tabelaPrice.setJuros(tabelaPrice.calculaJuros());
        assertEquals( 586.57,  Math.round(tabelaPrice.calculaAmort()*100.0)/100.0 );
    }

    @Test
    void calculaSaldoDevedor_returnsSuccessful(){
        tabelaPrice.setAmort(586.57);
        assertEquals(  99413.43, tabelaPrice.calculaSaldoDevedor());
    }

    @Test
    void calculaValorTotalPago_returnsSuccessful() {
        tabelaPrice.setTotalPago(1000.00);
        tabelaPrice.setPmt(100.00);
        assertEquals(1100.00, tabelaPrice.calculaValorTotalPago());
    }

    @Test
    void criarTabela_returnsSuccessful() {
        assertEquals(true, tabelaPrice.criarTabela());
    }











}
