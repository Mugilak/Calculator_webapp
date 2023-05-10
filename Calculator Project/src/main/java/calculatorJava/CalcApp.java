package calculatorJava;

import java.util.EmptyStackException;

public class CalcApp {
	private ExpressionValidation expressions;
	private PerformEvaluation perform;

	CalcApp() {
		expressions = new ExpressionValidation();
	}

	public String calculate(String expression) {
		String output = "";
		if (expressions.validate(expression)) {
			try {
				perform = new PerformEvaluation(expression);
				output = "" + perform.evaluate();
			} catch (ArithmeticException e) {
				output = " Infinity";
			} catch (NumberFormatException e) {
				output = "Invalid input";
			} catch (EmptyStackException e) {
				output = "Invalid input";
			} catch (Exception e) {
				output = "invalid input";
			}
		} else {
			output = "invalid expression";
		}
		return output;
	}
}
