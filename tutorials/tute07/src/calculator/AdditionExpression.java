package calculator;

public class AdditionExpression implements Expression {
    private Expression a;
    private Expression b;

    public AdditionExpression(Expression a, Expression b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculate() {
        return a.calculate() + b.calculate();
    }
}
