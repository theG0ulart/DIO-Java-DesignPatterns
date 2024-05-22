package dio.designpatterns.strategy;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.setStrategy(new Adicao());
        System.out.println("Adição: " + calculadora.calculate(3, 4));

        calculadora.setStrategy(new Subtracao());
        System.out.println("Subtração: " + calculadora.calculate(5, 1));

        calculadora.setStrategy(new Multiplicacao());
        System.out.println("Multiplicação: " + calculadora.calculate(3, 4));

        calculadora.setStrategy(new Divisao());
        System.out.println("Divisão normal: " + calculadora.calculate( 5, 5));
        System.out.println("Divisão por zero: " + calculadora.calculate( 5, 0));
    }
}
