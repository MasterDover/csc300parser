public class VarDefStatement 

{
	private VarExpression theVarExpr = null;
	private MathExpression theMathExpr = null;

	public VarDefStatement()
	{
	}
	
	public void add(String s, boolean isMathExpression)
	{
		if(theVarExpr == null)
		{
			theVarExpr = new VarExpression();
			theMathExpr = new MathExpression();
			theVarExpr.add(s);
		}
		else
		{
			if(isMathExpression)
			{
				theMathExpr.add(isMathExpression);
			}
			else
			{
				theMathExpr.add(s);
			}
		}
		
	}
	public void add(char c)
	{
		theMathExpr.add(c);
	}
}