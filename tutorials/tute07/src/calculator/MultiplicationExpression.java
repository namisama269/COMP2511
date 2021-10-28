package calculator;

public class MultiplicationExpression implements Expression {
    private Expression a;
    private Expression b;

    public MultiplicationExpression(Expression a, Expression b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculate() {
        return a.calculate() * b.calculate();
    }
}
