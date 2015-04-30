public class MathExpression extends Expression
{

	private VarExpression leftOperand = null;
	private MathExpression leftOperandMath = null;
	private VarExpression rightOperand = null;
	private MathExpression rightOperandMath = null;
	private OpExpression operator = null;
	private boolean isLeft;
	private boolean isRight;

	public MathExpression()
	{
	}

	public void add(String s)
	{
		if(operator == null)
		{
			if(isLeft)
			{
				leftOperandMath = new MathExpression();
				leftOperandMath.add(s);
			}
			else
			{
				leftOperand = new VarExpression();
				leftOperand.add(s);
			}
		}
		else
		{
			if(isRight)
			{
				rightOperandMath = new MathExpression();
				rightOperandMath.add(s);
			}
			else
			{
				rightOperand = new VarExpression();
				rightOperand.add(s);
			}
		}

	}

	public void add(boolean b)
	{
		if(operator == null)
		{
			isLeft = b;
		}
		else
		{
			isRight = b;
		}
	}

	public void add(char c)
	{
		if(operator == null)
		{
			if(isLeft)
			{
				leftOperandMath.add(c);
			}
			else
			{
				operator = new OpExpression();
				operator.add(c);
			}
		}
		else
		{
			rightOperandMath.add(c);
		}

	}


}