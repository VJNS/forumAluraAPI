package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void bonusDeveSerIgualAZerosParaSalariosAcimaDe10000() {
        BonusService bonusService = new BonusService();

        assertThrows(IllegalArgumentException.class,
                () -> bonusService.calcularBonus(
                        new Funcionario("Valter", LocalDate.now(), new BigDecimal("25000"))));
    }

    @Test
    void bonusDeveSerIgualA10PorCentoDosSalariosMenoresQue10000() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Valter", LocalDate.now(), new BigDecimal("6000")));

        assertEquals(new BigDecimal("600.00"), bonus);
    }

    @Test
    void bonusDeveSerIgualA10PorCentoDoSalarioIgualA10000() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Valter", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.00"), bonus);
    }
}