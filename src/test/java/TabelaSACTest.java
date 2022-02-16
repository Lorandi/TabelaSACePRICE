import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TabelaSACTest {

    Double pv = 100000.00;
    Double i = 1.00;
    Integer n = 100;
    TabelaSAC tabelaSAC = new TabelaSAC(pv, i, n);
    Double saldoDevedor = pv;

    @Test
    void calculaPmt_returnSuccessful(){
        tabelaSAC.setAmort(1000.00);
        tabelaSAC.setJuros(1000.00);
        assertEquals(2000.00, tabelaSAC.calculaPmt());
    }

    @Test
    void calculaJuros_returnSuccessful() {
        assertEquals(1000, tabelaSAC.calculaJuros());
    }

    @Test
    void calculaAmort_returnsSuccessful(){
        assertEquals( pv/n,  tabelaSAC.calculaAmort());
    }

    @Test
    void calculaSaldoDevedor_returnsSuccessful(){
        tabelaSAC.setAmort(586.57);
        assertEquals(  99413.43, tabelaSAC.calculaSaldoDevedor());
    }

    @Test
    void calculaValorTotalPago_returnsSuccessful() {
        tabelaSAC.setTotalPago(1000.00);
        tabelaSAC.setPmt(100.00);
        assertEquals(1100.00, tabelaSAC.calculaValorTotalPago());
    }

    @Test
    void criarTabela_returnsSuccessful() {
        assertEquals(true, tabelaSAC.criarTabela());
    }
}
