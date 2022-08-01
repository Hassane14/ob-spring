package com.elghafoud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        CalculatorService calculator = (CalculatorService) context.getBean("calculatorService");

        String texto = calculator.result();
        System.out.println(texto);
    }
}
