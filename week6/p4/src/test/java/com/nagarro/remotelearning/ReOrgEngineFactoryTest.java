package com.nagarro.remotelearning;

import com.nagarro.remotelearning.domain.Employee;
import com.nagarro.remotelearning.domain.Engine;
import com.nagarro.remotelearning.exception.UnqualifiedEmployeeException;
import com.nagarro.remotelearning.factory.EngineFactory;
import com.nagarro.remotelearning.service.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ReOrgEngineFactoryTest {

    private Employee employee = new Employee("Jake");
    private EngineFactory engineFactory;
    private EmployeeService employeeService;
    private final int numberOfEngines = 2;

    @BeforeEach
    public void setUp() {
        employeeService = Mockito.mock(EmployeeService.class);
        engineFactory = new EngineFactory(employeeService);
    }

    @Test
    public void testManufactureEnginesThrowsException() {
        // Given

        when(employeeService.isAssemblyLineWorker(employee)).thenReturn(false);
        // When & Then
        assertThrows(UnqualifiedEmployeeException.class, () -> {
            List<Engine> result = engineFactory.manufactureEngines(numberOfEngines, employee);
        });
    }

    @Test
    public void testManufactureEnginesReturnsEngineList() {
        // Given
        when(employeeService.isAssemblyLineWorker(employee)).thenReturn(true);
        // When
        List<Engine> result = engineFactory.manufactureEngines(numberOfEngines, employee);
        // Then
        assertEquals(result.size(), numberOfEngines);
    }
}