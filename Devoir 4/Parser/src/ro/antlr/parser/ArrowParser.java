// Generated from Arrow.g4 by ANTLR 4.4
package ro.antlr.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArrowParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VARIABLENAME=1, INTEGER=2, OPERATION=3, PRINTBEGINNER=4, BEGINNER=5, EQUAL=6, 
		TERMINATOR=7, WHITESPACE=8;
	public static final String[] tokenNames = {
		"<INVALID>", "VARIABLENAME", "INTEGER", "OPERATION", "'>>'", "'>'", "'='", 
		"'<>'", "WHITESPACE"
	};
	public static final int
		RULE_statement = 0, RULE_type = 1, RULE_print = 2, RULE_declaration = 3, 
		RULE_expression = 4, RULE_variabledata = 5;
	public static final String[] ruleNames = {
		"statement", "type", "print", "declaration", "expression", "variabledata"
	};

	@Override
	public String getGrammarFileName() { return "Arrow.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArrowParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowVisitor ) return ((ArrowVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowVisitor ) return ((ArrowVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		try {
			setState(17);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14); declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(15); expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(16); print();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode TERMINATOR() { return getToken(ArrowParser.TERMINATOR, 0); }
		public TerminalNode PRINTBEGINNER() { return getToken(ArrowParser.PRINTBEGINNER, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowVisitor ) return ((ArrowVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(19); match(PRINTBEGINNER);
			setState(23);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(20);
					matchWildcard();
					}
					} 
				}
				setState(25);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(26); match(TERMINATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(ArrowParser.EQUAL, 0); }
		public VariabledataContext variabledata() {
			return getRuleContext(VariabledataContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(ArrowParser.TERMINATOR, 0); }
		public TerminalNode BEGINNER() { return getToken(ArrowParser.BEGINNER, 0); }
		public TerminalNode VARIABLENAME() { return getToken(ArrowParser.VARIABLENAME, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowVisitor ) return ((ArrowVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); match(BEGINNER);
			setState(29); match(VARIABLENAME);
			setState(30); match(EQUAL);
			setState(31); variabledata(0);
			setState(32); match(TERMINATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(ArrowParser.EQUAL, 0); }
		public List<VariabledataContext> variabledata() {
			return getRuleContexts(VariabledataContext.class);
		}
		public TerminalNode OPERATION() { return getToken(ArrowParser.OPERATION, 0); }
		public TerminalNode TERMINATOR() { return getToken(ArrowParser.TERMINATOR, 0); }
		public TerminalNode BEGINNER() { return getToken(ArrowParser.BEGINNER, 0); }
		public VariabledataContext variabledata(int i) {
			return getRuleContext(VariabledataContext.class,i);
		}
		public TerminalNode VARIABLENAME() { return getToken(ArrowParser.VARIABLENAME, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowVisitor ) return ((ArrowVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); match(BEGINNER);
			setState(35); match(VARIABLENAME);
			setState(36); match(EQUAL);
			setState(37); variabledata(0);
			setState(38); match(OPERATION);
			setState(39); variabledata(0);
			setState(40); match(TERMINATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariabledataContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ArrowParser.INTEGER, 0); }
		public VariabledataContext variabledata() {
			return getRuleContext(VariabledataContext.class,0);
		}
		public TerminalNode OPERATION() { return getToken(ArrowParser.OPERATION, 0); }
		public TerminalNode VARIABLENAME() { return getToken(ArrowParser.VARIABLENAME, 0); }
		public VariabledataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledata; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowVisitor ) return ((ArrowVisitor<? extends T>)visitor).visitVariabledata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariabledataContext variabledata() throws RecognitionException {
		return variabledata(0);
	}

	private VariabledataContext variabledata(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VariabledataContext _localctx = new VariabledataContext(_ctx, _parentState);
		VariabledataContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_variabledata, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(43); match(INTEGER);
				}
				break;
			case VARIABLENAME:
				{
				setState(44); match(VARIABLENAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariabledataContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variabledata);
					setState(47);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(48); match(OPERATION);
					setState(49); match(INTEGER);
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5: return variabledata_sempred((VariabledataContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean variabledata_sempred(VariabledataContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n:\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\5\3\24\n\3\3\4"+
		"\3\4\7\4\30\n\4\f\4\16\4\33\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7\60\n\7\3\7\3\7\3\7\7\7\65\n"+
		"\7\f\7\16\78\13\7\3\7\3\31\3\f\b\2\4\6\b\n\f\2\28\2\16\3\2\2\2\4\23\3"+
		"\2\2\2\6\25\3\2\2\2\b\36\3\2\2\2\n$\3\2\2\2\f/\3\2\2\2\16\17\5\4\3\2\17"+
		"\3\3\2\2\2\20\24\5\b\5\2\21\24\5\n\6\2\22\24\5\6\4\2\23\20\3\2\2\2\23"+
		"\21\3\2\2\2\23\22\3\2\2\2\24\5\3\2\2\2\25\31\7\6\2\2\26\30\13\2\2\2\27"+
		"\26\3\2\2\2\30\33\3\2\2\2\31\32\3\2\2\2\31\27\3\2\2\2\32\34\3\2\2\2\33"+
		"\31\3\2\2\2\34\35\7\t\2\2\35\7\3\2\2\2\36\37\7\7\2\2\37 \7\3\2\2 !\7\b"+
		"\2\2!\"\5\f\7\2\"#\7\t\2\2#\t\3\2\2\2$%\7\7\2\2%&\7\3\2\2&\'\7\b\2\2\'"+
		"(\5\f\7\2()\7\5\2\2)*\5\f\7\2*+\7\t\2\2+\13\3\2\2\2,-\b\7\1\2-\60\7\4"+
		"\2\2.\60\7\3\2\2/,\3\2\2\2/.\3\2\2\2\60\66\3\2\2\2\61\62\f\5\2\2\62\63"+
		"\7\5\2\2\63\65\7\4\2\2\64\61\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3"+
		"\2\2\2\67\r\3\2\2\28\66\3\2\2\2\6\23\31/\66";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}