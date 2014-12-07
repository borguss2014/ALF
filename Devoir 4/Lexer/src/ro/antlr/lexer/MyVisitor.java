package ro.antlr.lexer;

import ro.antlr.parser.ArrowBaseVisitor;
import ro.antlr.parser.ArrowParser.StatementContext;

public class MyVisitor extends ArrowBaseVisitor<String>{
	@Override
	public String visitStatement(StatementContext ctx) {
		
		visitChildren(ctx);
		if(ctx.getChildCount() == 1){
			System.out.println(ctx.getChild(0));
			System.out.println("Entered this");
		}
		else {
			System.out.println(ctx.getChild(1));
			System.out.println("Addition");
		}
		
		return null;
	}
	
}
