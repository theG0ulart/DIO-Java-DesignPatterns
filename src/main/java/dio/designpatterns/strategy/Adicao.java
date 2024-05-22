package dio.designpatterns.strategy;

public class Adicao implements  OperationStrategy {

    @Override
    public int execute(int a, int b) {
        return a + b;
    }

}
