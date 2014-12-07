package ro.antlr.lexer;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import ro.antlr.parser.ArrowLexer;
import ro.antlr.parser.ArrowParser;

public class Main {

	public static void main(String[] args) throws Exception{
		ANTLRInputStream input = new ANTLRFileStream("code.demo");
		ArrowLexer lexer = new ArrowLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ArrowParser parser = new ArrowParser(tokens);
		
		ParseTree tree = parser.statement();
		//new MyVisitor().visit(tree);
		System.out.println(tree.toStringTree(parser));
	}

}
