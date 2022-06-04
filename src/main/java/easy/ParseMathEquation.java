package easy;

import java.util.Stack;

public class ParseMathEquation {

    private Stack<String> opsStack;
    private Stack<Double> numbersStack;
    private String ops = "+-*/";

    public ParseMathEquation() {
        this.opsStack = new Stack<>();
        this.numbersStack = new Stack<>();
    }

    private void doOps() {
        String op = opsStack.pop();
        Double first = numbersStack.pop();
        Double second = numbersStack.pop();
        switch (op) {
            case "+" -> numbersStack.push(first + second);
            case "-" -> numbersStack.push(second - first);
            case "*" -> numbersStack.push(second * first);
            case "/" -> numbersStack.push(second / first);
        }
        System.out.printf("ops Stack: %s \n", opsStack.toString());
        System.out.printf("numbers Stack: %s \n", numbersStack.toString());
    }

    public Double parse(String equation) {
        String[] array = equation.split("");
        for (String s : array) {
            if (s.equals("(")) continue;
            else if (ops.contains(s)) opsStack.push(s);
            else if (s.equals(")")) doOps();
            else numbersStack.push(Double.valueOf(s));
        }
        while (!opsStack.empty() && !numbersStack.empty()) doOps();

        return numbersStack.pop();
    }

    public static void main(String[] args) {
        ParseMathEquation math = new ParseMathEquation();
        double parse = math.parse("((2+2)+(5*2))*2");
        System.out.println(parse);
    }
}
