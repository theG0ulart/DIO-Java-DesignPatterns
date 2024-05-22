package dio.designpatterns.strategy;

public class Divisao implements  OperationStrategy {


    @Override
    public int execute(int a, int b) {
        if(b == 0){
           throw new ArithmeticException("Não é possível dividir por zero");
        }
        return a / 2;
    }
}
