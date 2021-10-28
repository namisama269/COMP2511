package calculator;

public class SubtractionExpression implements Expression {
    private Expression a;
    private Expression b;

    public SubtractionExpression(Expression a, Expression b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculate() {
        return a.calculate() - b.calculate();
    }
}
