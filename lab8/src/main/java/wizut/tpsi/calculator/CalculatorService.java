/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizut.tpsi.calculator;

import org.springframework.stereotype.Service;

/**
 *
 * @author Treetacle
 */
@Service
public class CalculatorService {
public Integer add(Integer a, Integer b) {
    return a + b;
}

public Integer subtract(Integer a, Integer b) {
    return a - b;
}

public Integer multiply(Integer a, Integer b) {
    return a * b;
}

public Integer calculate(Integer x, Integer y, String operation) {
    switch(operation) {
        case "+":
            return add(x, y);
        case "-":
            return subtract(x, y);
        case "*":
            return multiply(x, y);
    }
    throw new IllegalArgumentException("Nieznana operacja: " + operation);
}
}
