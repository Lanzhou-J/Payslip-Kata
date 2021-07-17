package com.codewithLanzhou;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private Employee employee;

    @BeforeEach
    public void setUp() throws Exception {
        employee = new Employee();
    }

    @Test
    @DisplayName("createFullName should create full name consisted of Firstname + space + Lastname")
    public void testCalculateGrossIncome(){
        assertEquals("John Doe", employee.createFullName("John", "Doe"));
    }

}