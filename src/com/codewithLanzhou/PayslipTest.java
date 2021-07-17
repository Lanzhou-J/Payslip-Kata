package com.codewithLanzhou;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayslipTest {

    private Payslip payslip;

    @BeforeEach
    public void setUp() throws Exception {
        payslip = new Payslip();
    }

    @Test
    @DisplayName("calculateGrossIncome should return round down value of annual salary/12 months")
    public void testCalculateGrossIncome(){
        assertEquals(0, payslip.calculateGrossIncome(0));
    }

}