package com.nagarro.remotelearning;

import com.nagarro.remotelearning.domain.Employee;
import com.nagarro.remotelearning.domain.Engine;
import com.nagarro.remotelearning.domain.EngineArchitecture;
import com.nagarro.remotelearning.domain.EngineComponent;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.*;

import com.nagarro.remotelearning.exception.InsufficientStockException;
import com.nagarro.remotelearning.exception.UnauthorizedEmployeeException;
import com.nagarro.remotelearning.exception.UnqualifiedEmployeeException;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.function.Executable;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InitialEngineFactoryTest {
    public Employee employee1 = new Employee("Jake", false, true);
    public Employee employee2 = new Employee("Daniel", false, true);
    public Employee employee3 = new Employee("Kate", true, false);
    public Employee exEmployee = new Employee("Michel", false, false);
    public Engine engine1 = new Engine(EngineArchitecture.L6, 5.5, 300);
    public EngineComponent cylinder = new EngineComponent("Cylinder", 0.5);
    public EngineComponent piston = new EngineComponent("Piston", 0.3);
    public List<Employee> employeesList = new ArrayList<>();
    public List<EngineComponent> engineComponentsList = new ArrayList<>();
    public EngineFactory engineFactory = new EngineFactory(employeesList, engineComponentsList);

    @Before
    public void setup() {
        employeesList.addAll(Arrays.asList(employee1, employee2, employee3));
        engineComponentsList.addAll(Arrays.asList(cylinder, cylinder, cylinder, cylinder, piston, piston, piston));
    }

    @Test
    public void testManufactureEnginesReturnsNewEngines() {
        int numberOfEngines = 2;
        List<Engine> resultEngines = engineFactory.manufactureEngines(numberOfEngines, this.employee1);
        assertTrue(resultEngines.size() == numberOfEngines);
    }

    @Test
    public void testManufactureEnginesInsufficientStockException() {
        int numberOfEngines = 10;
        assertThrows(InsufficientStockException.class,
                () -> engineFactory.manufactureEngines(numberOfEngines, this.employee1));
    }

    @Test
    public void testManufactureEnginesUnauthorizedEmployeeException() {
        int numberOfEngines = 2;
        assertThrows(UnauthorizedEmployeeException.class,
                () -> engineFactory.manufactureEngines(numberOfEngines, this.exEmployee));
    }

    @Test
    public void testManufactureEnginesUnqualifiedEmployeeException() {
        int numberOfEngines = 2;
        assertThrows(UnqualifiedEmployeeException.class,
                () -> engineFactory.manufactureEngines(numberOfEngines, this.employee3));
    }
}