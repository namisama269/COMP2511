package calculator;

public class Calculator {
    private Expression e;

    public Calculator() {
    }

    public void setExpression(Expression e) {
        this.e = e;
    }

    public int getExpression() {
        return e.calculate();
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();

        // 1
        c.setExpression(new Number(1));
        System.out.println(c.getExpression());

        // 1 + 2
        c.setExpression(new AdditionExpression(
            new Number(1), 
            new Number(2))
        );
        System.out.println(c.getExpression());
        
        // 1 + (2 - 3)
        c.setExpression(new AdditionExpression(
            new Number(1), 
            new SubtractionExpression(
                new Number(2),
                new Number(3)
            )
        ));
        System.out.println(c.getExpression());

        // 1 + (2 - (3 * 4))
        c.setExpression(new AdditionExpression(
            new Number(1), 
            new SubtractionExpression(
                new Number(2),
                new MultiplicationExpression(
                    new Number(3),
                    new Number(4)
                )
            )
        ));
        System.out.println(c.getExpression());
    }
}
