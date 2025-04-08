package com.calc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Calculadora c1 = new Calculadora(5, 2);
        System.out.println(c1.suma());
    }
}
