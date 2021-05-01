// Generated from /Users/ducer/Company/ducesoft/babel/prince-rust/src/antlr4/RustParser.g4 by ANTLR 4.9.1
package com.ducesoft.babel.rust.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RustParser extends RustParserBase {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_AS=1, KW_BREAK=2, KW_CONST=3, KW_CONTINUE=4, KW_CRATE=5, KW_ELSE=6, 
		KW_ENUM=7, KW_EXTERN=8, KW_FALSE=9, KW_FN=10, KW_FOR=11, KW_IF=12, KW_IMPL=13, 
		KW_IN=14, KW_LET=15, KW_LOOP=16, KW_MATCH=17, KW_MOD=18, KW_MOVE=19, KW_MUT=20, 
		KW_PUB=21, KW_REF=22, KW_RETURN=23, KW_SELFVALUE=24, KW_SELFTYPE=25, KW_STATIC=26, 
		KW_STRUCT=27, KW_SUPER=28, KW_TRAIT=29, KW_TRUE=30, KW_TYPE=31, KW_UNSAFE=32, 
		KW_USE=33, KW_WHERE=34, KW_WHILE=35, KW_ASYNC=36, KW_AWAIT=37, KW_DYN=38, 
		KW_ABSTRACT=39, KW_BECOME=40, KW_BOX=41, KW_DO=42, KW_FINAL=43, KW_MACRO=44, 
		KW_OVERRIDE=45, KW_PRIV=46, KW_TYPEOF=47, KW_UNSIZED=48, KW_VIRTUAL=49, 
		KW_YIELD=50, KW_TRY=51, KW_UNION=52, KW_STATICLIFETIME=53, KW_MACRORULES=54, 
		KW_UNDERLINELIFETIME=55, KW_DOLLARCRATE=56, NON_KEYWORD_IDENTIFIER=57, 
		RAW_IDENTIFIER=58, LINE_COMMENT=59, BLOCK_COMMENT=60, INNER_LINE_DOC=61, 
		INNER_BLOCK_DOC=62, OUTER_LINE_DOC=63, OUTER_BLOCK_DOC=64, BLOCK_COMMENT_OR_DOC=65, 
		SHEBANG=66, WHITESPACE=67, NEWLINE=68, CHAR_LITERAL=69, STRING_LITERAL=70, 
		RAW_STRING_LITERAL=71, BYTE_LITERAL=72, BYTE_STRING_LITERAL=73, RAW_BYTE_STRING_LITERAL=74, 
		INTEGER_LITERAL=75, DEC_LITERAL=76, HEX_LITERAL=77, OCT_LITERAL=78, BIN_LITERAL=79, 
		FLOAT_LITERAL=80, LIFETIME_OR_LABEL=81, PLUS=82, MINUS=83, STAR=84, SLASH=85, 
		PERCENT=86, CARET=87, NOT=88, AND=89, OR=90, ANDAND=91, OROR=92, PLUSEQ=93, 
		MINUSEQ=94, STAREQ=95, SLASHEQ=96, PERCENTEQ=97, CARETEQ=98, ANDEQ=99, 
		OREQ=100, SHLEQ=101, SHREQ=102, EQ=103, EQEQ=104, NE=105, GT=106, LT=107, 
		GE=108, LE=109, AT=110, UNDERSCORE=111, DOT=112, DOTDOT=113, DOTDOTDOT=114, 
		DOTDOTEQ=115, COMMA=116, SEMI=117, COLON=118, PATHSEP=119, RARROW=120, 
		FATARROW=121, POUND=122, DOLLAR=123, QUESTION=124, LCURLYBRACE=125, RCURLYBRACE=126, 
		LSQUAREBRACKET=127, RSQUAREBRACKET=128, LPAREN=129, RPAREN=130;
	public static final int
		RULE_crate = 0, RULE_simplePath = 1, RULE_simplePathSegment = 2, RULE_pathInExpression = 3, 
		RULE_pathExprSegment = 4, RULE_pathIdentSegment = 5, RULE_genericArgs = 6, 
		RULE_genericArgsLifetimes = 7, RULE_genericArgsTypes = 8, RULE_genericArgsBindings = 9, 
		RULE_genericArgsBinding = 10, RULE_qualifiedPathInExpression = 11, RULE_qualifiedPathType = 12, 
		RULE_qualifiedPathInType = 13, RULE_typePath = 14, RULE_typePathSegment = 15, 
		RULE_typePathFn = 16, RULE_typePathInputs = 17, RULE_macroInvocation = 18, 
		RULE_delimTokenTree = 19, RULE_tokenTree = 20, RULE_tokenTreeToken = 21, 
		RULE_macroInvocationSemi = 22, RULE_macroRulesDefinition = 23, RULE_macroRulesDef = 24, 
		RULE_macroRules = 25, RULE_macroRule = 26, RULE_macroMatcher = 27, RULE_macroMatch = 28, 
		RULE_macroMatchToken = 29, RULE_macroFragSpec = 30, RULE_macroRepSep = 31, 
		RULE_macroRepOp = 32, RULE_macroTranscriber = 33, RULE_item = 34, RULE_visItem = 35, 
		RULE_macroItem = 36, RULE_module = 37, RULE_externCrate = 38, RULE_crateRef = 39, 
		RULE_asClause = 40, RULE_useDeclaration = 41, RULE_useTree = 42, RULE_function = 43, 
		RULE_functionQualifiers = 44, RULE_asyncConstQualifiers = 45, RULE_abi = 46, 
		RULE_functionParameters = 47, RULE_functionParam = 48, RULE_functionReturnType = 49, 
		RULE_typeAlias = 50, RULE_struct_ = 51, RULE_structStruct = 52, RULE_tupleStruct = 53, 
		RULE_structFields = 54, RULE_structField = 55, RULE_tupleFields = 56, 
		RULE_tupleField = 57, RULE_enumeration = 58, RULE_enumItems = 59, RULE_enumItem = 60, 
		RULE_enumItemTuple = 61, RULE_enumItemStruct = 62, RULE_enumItemDiscriminant = 63, 
		RULE_union_ = 64, RULE_constantItem = 65, RULE_staticItem = 66, RULE_trait = 67, 
		RULE_traitItem = 68, RULE_traitFunc = 69, RULE_traitMethod = 70, RULE_traitFunctionDecl = 71, 
		RULE_traitMethodDecl = 72, RULE_traitFunctionParameters = 73, RULE_traitFunctionParam = 74, 
		RULE_traitConst = 75, RULE_traitType = 76, RULE_implementation = 77, RULE_inherentImpl = 78, 
		RULE_inherentImplItem = 79, RULE_traitImpl = 80, RULE_traitImplItem = 81, 
		RULE_externBlock = 82, RULE_externalItem = 83, RULE_externalStaticItem = 84, 
		RULE_externalFunctionItem = 85, RULE_namedFunctionParameters = 86, RULE_namedFunctionParam = 87, 
		RULE_namedFunctionParametersWithVariadics = 88, RULE_generics = 89, RULE_genericParams = 90, 
		RULE_lifetimeParams = 91, RULE_lifetimeParam = 92, RULE_typeParams = 93, 
		RULE_typeParam = 94, RULE_whereClause = 95, RULE_whereClauseItem = 96, 
		RULE_lifetimeWhereClauseItem = 97, RULE_typeBoundWhereClauseItem = 98, 
		RULE_forLifetimes = 99, RULE_method = 100, RULE_selfParam = 101, RULE_shorthandSelf = 102, 
		RULE_typedSelf = 103, RULE_visibility = 104, RULE_innerAttribute = 105, 
		RULE_outerAttribute = 106, RULE_attr = 107, RULE_attrInput = 108, RULE_statement = 109, 
		RULE_letStatement = 110, RULE_expressionStatement = 111, RULE_expression = 112, 
		RULE_comparisonOperator = 113, RULE_compoundAssignOperator = 114, RULE_expressionWithBlock = 115, 
		RULE_literalExpression = 116, RULE_pathExpression = 117, RULE_blockExpression = 118, 
		RULE_statements = 119, RULE_asyncBlockExpression = 120, RULE_unsafeBlockExpression = 121, 
		RULE_arrayElements = 122, RULE_tupleElements = 123, RULE_tupleIndex = 124, 
		RULE_structExpression = 125, RULE_structExprStruct = 126, RULE_structExprFields = 127, 
		RULE_structExprField = 128, RULE_structBase = 129, RULE_structExprTuple = 130, 
		RULE_structExprUnit = 131, RULE_enumerationVariantExpression = 132, RULE_enumExprStruct = 133, 
		RULE_enumExprFields = 134, RULE_enumExprField = 135, RULE_enumExprTuple = 136, 
		RULE_enumExprFieldless = 137, RULE_callParams = 138, RULE_closureExpression = 139, 
		RULE_closureParameters = 140, RULE_closureParam = 141, RULE_loopExpression = 142, 
		RULE_infiniteLoopExpression = 143, RULE_predicateLoopExpression = 144, 
		RULE_predicatePatternLoopExpression = 145, RULE_iteratorLoopExpression = 146, 
		RULE_loopLabel = 147, RULE_ifExpression = 148, RULE_ifLetExpression = 149, 
		RULE_matchExpression = 150, RULE_matchArms = 151, RULE_matchArmExpression = 152, 
		RULE_matchArm = 153, RULE_matchArmPatterns = 154, RULE_matchArmGuard = 155, 
		RULE_pattern = 156, RULE_patternWithoutRange = 157, RULE_literalPattern = 158, 
		RULE_identifierPattern = 159, RULE_wildcardPattern = 160, RULE_restPattern = 161, 
		RULE_rangePattern = 162, RULE_obsoleteRangePattern = 163, RULE_rangePatternBound = 164, 
		RULE_referencePattern = 165, RULE_structPattern = 166, RULE_structPatternElements = 167, 
		RULE_structPatternFields = 168, RULE_structPatternField = 169, RULE_structPatternEtCetera = 170, 
		RULE_tupleStructPattern = 171, RULE_tupleStructItems = 172, RULE_tuplePattern = 173, 
		RULE_tuplePatternItems = 174, RULE_groupedPattern = 175, RULE_slicePattern = 176, 
		RULE_slicePatternItems = 177, RULE_pathPattern = 178, RULE_type = 179, 
		RULE_typeNoBounds = 180, RULE_parenthesizedType = 181, RULE_neverType = 182, 
		RULE_tupleType = 183, RULE_arrayType = 184, RULE_sliceType = 185, RULE_referenceType = 186, 
		RULE_rawPointerType = 187, RULE_bareFunctionType = 188, RULE_bareFunctionReturnType = 189, 
		RULE_functionParametersMaybeNamedVariadic = 190, RULE_maybeNamedFunctionParameters = 191, 
		RULE_maybeNamedParam = 192, RULE_maybeNamedFunctionParametersVariadic = 193, 
		RULE_traitObjectType = 194, RULE_traitObjectTypeOneBound = 195, RULE_implTraitType = 196, 
		RULE_implTraitTypeOneBound = 197, RULE_inferredType = 198, RULE_typeParamBounds = 199, 
		RULE_typeParamBound = 200, RULE_traitBound = 201, RULE_lifetimeBounds = 202, 
		RULE_lifetime = 203, RULE_identifier = 204, RULE_keyword = 205, RULE_macroIdentifierLikeToken = 206, 
		RULE_macroLiteralToken = 207, RULE_macroPunctuationToken = 208, RULE_shl = 209, 
		RULE_shr = 210;
	private static String[] makeRuleNames() {
		return new String[] {
			"crate", "simplePath", "simplePathSegment", "pathInExpression", "pathExprSegment", 
			"pathIdentSegment", "genericArgs", "genericArgsLifetimes", "genericArgsTypes", 
			"genericArgsBindings", "genericArgsBinding", "qualifiedPathInExpression", 
			"qualifiedPathType", "qualifiedPathInType", "typePath", "typePathSegment", 
			"typePathFn", "typePathInputs", "macroInvocation", "delimTokenTree", 
			"tokenTree", "tokenTreeToken", "macroInvocationSemi", "macroRulesDefinition", 
			"macroRulesDef", "macroRules", "macroRule", "macroMatcher", "macroMatch", 
			"macroMatchToken", "macroFragSpec", "macroRepSep", "macroRepOp", "macroTranscriber", 
			"item", "visItem", "macroItem", "module", "externCrate", "crateRef", 
			"asClause", "useDeclaration", "useTree", "function", "functionQualifiers", 
			"asyncConstQualifiers", "abi", "functionParameters", "functionParam", 
			"functionReturnType", "typeAlias", "struct_", "structStruct", "tupleStruct", 
			"structFields", "structField", "tupleFields", "tupleField", "enumeration", 
			"enumItems", "enumItem", "enumItemTuple", "enumItemStruct", "enumItemDiscriminant", 
			"union_", "constantItem", "staticItem", "trait", "traitItem", "traitFunc", 
			"traitMethod", "traitFunctionDecl", "traitMethodDecl", "traitFunctionParameters", 
			"traitFunctionParam", "traitConst", "traitType", "implementation", "inherentImpl", 
			"inherentImplItem", "traitImpl", "traitImplItem", "externBlock", "externalItem", 
			"externalStaticItem", "externalFunctionItem", "namedFunctionParameters", 
			"namedFunctionParam", "namedFunctionParametersWithVariadics", "generics", 
			"genericParams", "lifetimeParams", "lifetimeParam", "typeParams", "typeParam", 
			"whereClause", "whereClauseItem", "lifetimeWhereClauseItem", "typeBoundWhereClauseItem", 
			"forLifetimes", "method", "selfParam", "shorthandSelf", "typedSelf", 
			"visibility", "innerAttribute", "outerAttribute", "attr", "attrInput", 
			"statement", "letStatement", "expressionStatement", "expression", "comparisonOperator", 
			"compoundAssignOperator", "expressionWithBlock", "literalExpression", 
			"pathExpression", "blockExpression", "statements", "asyncBlockExpression", 
			"unsafeBlockExpression", "arrayElements", "tupleElements", "tupleIndex", 
			"structExpression", "structExprStruct", "structExprFields", "structExprField", 
			"structBase", "structExprTuple", "structExprUnit", "enumerationVariantExpression", 
			"enumExprStruct", "enumExprFields", "enumExprField", "enumExprTuple", 
			"enumExprFieldless", "callParams", "closureExpression", "closureParameters", 
			"closureParam", "loopExpression", "infiniteLoopExpression", "predicateLoopExpression", 
			"predicatePatternLoopExpression", "iteratorLoopExpression", "loopLabel", 
			"ifExpression", "ifLetExpression", "matchExpression", "matchArms", "matchArmExpression", 
			"matchArm", "matchArmPatterns", "matchArmGuard", "pattern", "patternWithoutRange", 
			"literalPattern", "identifierPattern", "wildcardPattern", "restPattern", 
			"rangePattern", "obsoleteRangePattern", "rangePatternBound", "referencePattern", 
			"structPattern", "structPatternElements", "structPatternFields", "structPatternField", 
			"structPatternEtCetera", "tupleStructPattern", "tupleStructItems", "tuplePattern", 
			"tuplePatternItems", "groupedPattern", "slicePattern", "slicePatternItems", 
			"pathPattern", "type", "typeNoBounds", "parenthesizedType", "neverType", 
			"tupleType", "arrayType", "sliceType", "referenceType", "rawPointerType", 
			"bareFunctionType", "bareFunctionReturnType", "functionParametersMaybeNamedVariadic", 
			"maybeNamedFunctionParameters", "maybeNamedParam", "maybeNamedFunctionParametersVariadic", 
			"traitObjectType", "traitObjectTypeOneBound", "implTraitType", "implTraitTypeOneBound", 
			"inferredType", "typeParamBounds", "typeParamBound", "traitBound", "lifetimeBounds", 
			"lifetime", "identifier", "keyword", "macroIdentifierLikeToken", "macroLiteralToken", 
			"macroPunctuationToken", "shl", "shr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'as'", "'break'", "'const'", "'continue'", "'crate'", "'else'", 
			"'enum'", "'extern'", "'false'", "'fn'", "'for'", "'if'", "'impl'", "'in'", 
			"'let'", "'loop'", "'match'", "'mod'", "'move'", "'mut'", "'pub'", "'ref'", 
			"'return'", "'self'", "'Self'", "'static'", "'struct'", "'super'", "'trait'", 
			"'true'", "'type'", "'unsafe'", "'use'", "'where'", "'while'", "'async'", 
			"'await'", "'dyn'", "'abstract'", "'become'", "'box'", "'do'", "'final'", 
			"'macro'", "'override'", "'priv'", "'typeof'", "'unsized'", "'virtual'", 
			"'yield'", "'try'", "'union'", "''static'", "'macro_rules'", "''_'", 
			"'$crate'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "'&'", 
			"'|'", "'&&'", "'||'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", 
			"'&='", "'|='", "'<<='", "'>>='", "'='", "'=='", "'!='", "'>'", "'<'", 
			"'>='", "'<='", "'@'", "'_'", "'.'", "'..'", "'...'", "'..='", "','", 
			"';'", "':'", "'::'", "'->'", "'=>'", "'#'", "'$'", "'?'", "'{'", "'}'", 
			"'['", "']'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KW_AS", "KW_BREAK", "KW_CONST", "KW_CONTINUE", "KW_CRATE", "KW_ELSE", 
			"KW_ENUM", "KW_EXTERN", "KW_FALSE", "KW_FN", "KW_FOR", "KW_IF", "KW_IMPL", 
			"KW_IN", "KW_LET", "KW_LOOP", "KW_MATCH", "KW_MOD", "KW_MOVE", "KW_MUT", 
			"KW_PUB", "KW_REF", "KW_RETURN", "KW_SELFVALUE", "KW_SELFTYPE", "KW_STATIC", 
			"KW_STRUCT", "KW_SUPER", "KW_TRAIT", "KW_TRUE", "KW_TYPE", "KW_UNSAFE", 
			"KW_USE", "KW_WHERE", "KW_WHILE", "KW_ASYNC", "KW_AWAIT", "KW_DYN", "KW_ABSTRACT", 
			"KW_BECOME", "KW_BOX", "KW_DO", "KW_FINAL", "KW_MACRO", "KW_OVERRIDE", 
			"KW_PRIV", "KW_TYPEOF", "KW_UNSIZED", "KW_VIRTUAL", "KW_YIELD", "KW_TRY", 
			"KW_UNION", "KW_STATICLIFETIME", "KW_MACRORULES", "KW_UNDERLINELIFETIME", 
			"KW_DOLLARCRATE", "NON_KEYWORD_IDENTIFIER", "RAW_IDENTIFIER", "LINE_COMMENT", 
			"BLOCK_COMMENT", "INNER_LINE_DOC", "INNER_BLOCK_DOC", "OUTER_LINE_DOC", 
			"OUTER_BLOCK_DOC", "BLOCK_COMMENT_OR_DOC", "SHEBANG", "WHITESPACE", "NEWLINE", 
			"CHAR_LITERAL", "STRING_LITERAL", "RAW_STRING_LITERAL", "BYTE_LITERAL", 
			"BYTE_STRING_LITERAL", "RAW_BYTE_STRING_LITERAL", "INTEGER_LITERAL", 
			"DEC_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BIN_LITERAL", "FLOAT_LITERAL", 
			"LIFETIME_OR_LABEL", "PLUS", "MINUS", "STAR", "SLASH", "PERCENT", "CARET", 
			"NOT", "AND", "OR", "ANDAND", "OROR", "PLUSEQ", "MINUSEQ", "STAREQ", 
			"SLASHEQ", "PERCENTEQ", "CARETEQ", "ANDEQ", "OREQ", "SHLEQ", "SHREQ", 
			"EQ", "EQEQ", "NE", "GT", "LT", "GE", "LE", "AT", "UNDERSCORE", "DOT", 
			"DOTDOT", "DOTDOTDOT", "DOTDOTEQ", "COMMA", "SEMI", "COLON", "PATHSEP", 
			"RARROW", "FATARROW", "POUND", "DOLLAR", "QUESTION", "LCURLYBRACE", "RCURLYBRACE", 
			"LSQUAREBRACKET", "RSQUAREBRACKET", "LPAREN", "RPAREN"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RustParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RustParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CrateContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RustParser.EOF, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public CrateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterCrate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitCrate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitCrate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrateContext crate() throws RecognitionException {
		CrateContext _localctx = new CrateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_crate);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(422);
					innerAttribute();
					}
					} 
				}
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CONST) | (1L << KW_CRATE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_IMPL) | (1L << KW_MOD) | (1L << KW_PUB) | (1L << KW_SELFVALUE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_ASYNC) | (1L << KW_UNION) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || _la==PATHSEP || _la==POUND) {
				{
				{
				setState(428);
				item();
				}
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(434);
			match(EOF);
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

	public static class SimplePathContext extends ParserRuleContext {
		public List<SimplePathSegmentContext> simplePathSegment() {
			return getRuleContexts(SimplePathSegmentContext.class);
		}
		public SimplePathSegmentContext simplePathSegment(int i) {
			return getRuleContext(SimplePathSegmentContext.class,i);
		}
		public List<TerminalNode> PATHSEP() { return getTokens(RustParser.PATHSEP); }
		public TerminalNode PATHSEP(int i) {
			return getToken(RustParser.PATHSEP, i);
		}
		public SimplePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterSimplePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitSimplePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitSimplePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplePathContext simplePath() throws RecognitionException {
		SimplePathContext _localctx = new SimplePathContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_simplePath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATHSEP) {
				{
				setState(436);
				match(PATHSEP);
				}
			}

			setState(439);
			simplePathSegment();
			setState(444);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(440);
					match(PATHSEP);
					setState(441);
					simplePathSegment();
					}
					} 
				}
				setState(446);
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
			exitRule();
		}
		return _localctx;
	}

	public static class SimplePathSegmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_SUPER() { return getToken(RustParser.KW_SUPER, 0); }
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public TerminalNode KW_CRATE() { return getToken(RustParser.KW_CRATE, 0); }
		public TerminalNode KW_DOLLARCRATE() { return getToken(RustParser.KW_DOLLARCRATE, 0); }
		public SimplePathSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplePathSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterSimplePathSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitSimplePathSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitSimplePathSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplePathSegmentContext simplePathSegment() throws RecognitionException {
		SimplePathSegmentContext _localctx = new SimplePathSegmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simplePathSegment);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_MACRORULES:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				identifier();
				}
				break;
			case KW_SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(KW_SUPER);
				}
				break;
			case KW_SELFVALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				match(KW_SELFVALUE);
				}
				break;
			case KW_CRATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(450);
				match(KW_CRATE);
				}
				break;
			case KW_DOLLARCRATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(451);
				match(KW_DOLLARCRATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PathInExpressionContext extends ParserRuleContext {
		public List<PathExprSegmentContext> pathExprSegment() {
			return getRuleContexts(PathExprSegmentContext.class);
		}
		public PathExprSegmentContext pathExprSegment(int i) {
			return getRuleContext(PathExprSegmentContext.class,i);
		}
		public List<TerminalNode> PATHSEP() { return getTokens(RustParser.PATHSEP); }
		public TerminalNode PATHSEP(int i) {
			return getToken(RustParser.PATHSEP, i);
		}
		public PathInExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathInExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPathInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPathInExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPathInExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathInExpressionContext pathInExpression() throws RecognitionException {
		PathInExpressionContext _localctx = new PathInExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pathInExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATHSEP) {
				{
				setState(454);
				match(PATHSEP);
				}
			}

			setState(457);
			pathExprSegment();
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(458);
					match(PATHSEP);
					setState(459);
					pathExprSegment();
					}
					} 
				}
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
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

	public static class PathExprSegmentContext extends ParserRuleContext {
		public PathIdentSegmentContext pathIdentSegment() {
			return getRuleContext(PathIdentSegmentContext.class,0);
		}
		public TerminalNode PATHSEP() { return getToken(RustParser.PATHSEP, 0); }
		public GenericArgsContext genericArgs() {
			return getRuleContext(GenericArgsContext.class,0);
		}
		public PathExprSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathExprSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPathExprSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPathExprSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPathExprSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathExprSegmentContext pathExprSegment() throws RecognitionException {
		PathExprSegmentContext _localctx = new PathExprSegmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pathExprSegment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			pathIdentSegment();
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(466);
				match(PATHSEP);
				setState(467);
				genericArgs();
				}
				break;
			}
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

	public static class PathIdentSegmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_SUPER() { return getToken(RustParser.KW_SUPER, 0); }
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public TerminalNode KW_SELFTYPE() { return getToken(RustParser.KW_SELFTYPE, 0); }
		public TerminalNode KW_CRATE() { return getToken(RustParser.KW_CRATE, 0); }
		public TerminalNode KW_DOLLARCRATE() { return getToken(RustParser.KW_DOLLARCRATE, 0); }
		public PathIdentSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathIdentSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPathIdentSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPathIdentSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPathIdentSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathIdentSegmentContext pathIdentSegment() throws RecognitionException {
		PathIdentSegmentContext _localctx = new PathIdentSegmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pathIdentSegment);
		try {
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_MACRORULES:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				identifier();
				}
				break;
			case KW_SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				match(KW_SUPER);
				}
				break;
			case KW_SELFVALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
				match(KW_SELFVALUE);
				}
				break;
			case KW_SELFTYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(473);
				match(KW_SELFTYPE);
				}
				break;
			case KW_CRATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(474);
				match(KW_CRATE);
				}
				break;
			case KW_DOLLARCRATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(475);
				match(KW_DOLLARCRATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class GenericArgsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(RustParser.LT, 0); }
		public TerminalNode GT() { return getToken(RustParser.GT, 0); }
		public GenericArgsLifetimesContext genericArgsLifetimes() {
			return getRuleContext(GenericArgsLifetimesContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public GenericArgsTypesContext genericArgsTypes() {
			return getRuleContext(GenericArgsTypesContext.class,0);
		}
		public GenericArgsBindingsContext genericArgsBindings() {
			return getRuleContext(GenericArgsBindingsContext.class,0);
		}
		public GenericArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgsContext genericArgs() throws RecognitionException {
		GenericArgsContext _localctx = new GenericArgsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_genericArgs);
		int _la;
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				match(LT);
				setState(479);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				match(LT);
				setState(481);
				genericArgsLifetimes();
				setState(484);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(482);
					match(COMMA);
					setState(483);
					genericArgsTypes();
					}
					break;
				}
				setState(488);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(486);
					match(COMMA);
					setState(487);
					genericArgsBindings();
					}
					break;
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(490);
					match(COMMA);
					}
				}

				setState(493);
				match(GT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				match(LT);
				setState(496);
				genericArgsTypes();
				setState(499);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(497);
					match(COMMA);
					setState(498);
					genericArgsBindings();
					}
					break;
				}
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(501);
					match(COMMA);
					}
				}

				setState(504);
				match(GT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(506);
				match(LT);
				setState(507);
				genericArgsBindings();
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(508);
					match(COMMA);
					}
				}

				setState(511);
				match(GT);
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

	public static class GenericArgsLifetimesContext extends ParserRuleContext {
		public List<LifetimeContext> lifetime() {
			return getRuleContexts(LifetimeContext.class);
		}
		public LifetimeContext lifetime(int i) {
			return getRuleContext(LifetimeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public GenericArgsLifetimesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgsLifetimes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericArgsLifetimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericArgsLifetimes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericArgsLifetimes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgsLifetimesContext genericArgsLifetimes() throws RecognitionException {
		GenericArgsLifetimesContext _localctx = new GenericArgsLifetimesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_genericArgsLifetimes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			lifetime();
			setState(520);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(516);
					match(COMMA);
					setState(517);
					lifetime();
					}
					} 
				}
				setState(522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
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

	public static class GenericArgsTypesContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public GenericArgsTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgsTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericArgsTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericArgsTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericArgsTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgsTypesContext genericArgsTypes() throws RecognitionException {
		GenericArgsTypesContext _localctx = new GenericArgsTypesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_genericArgsTypes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			type();
			setState(528);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(524);
					match(COMMA);
					setState(525);
					type();
					}
					} 
				}
				setState(530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
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

	public static class GenericArgsBindingsContext extends ParserRuleContext {
		public List<GenericArgsBindingContext> genericArgsBinding() {
			return getRuleContexts(GenericArgsBindingContext.class);
		}
		public GenericArgsBindingContext genericArgsBinding(int i) {
			return getRuleContext(GenericArgsBindingContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public GenericArgsBindingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgsBindings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericArgsBindings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericArgsBindings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericArgsBindings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgsBindingsContext genericArgsBindings() throws RecognitionException {
		GenericArgsBindingsContext _localctx = new GenericArgsBindingsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_genericArgsBindings);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			genericArgsBinding();
			setState(536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(532);
					match(COMMA);
					setState(533);
					genericArgsBinding();
					}
					} 
				}
				setState(538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
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

	public static class GenericArgsBindingContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public GenericArgsBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgsBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericArgsBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericArgsBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericArgsBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgsBindingContext genericArgsBinding() throws RecognitionException {
		GenericArgsBindingContext _localctx = new GenericArgsBindingContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_genericArgsBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			identifier();
			setState(540);
			match(EQ);
			setState(541);
			type();
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

	public static class QualifiedPathInExpressionContext extends ParserRuleContext {
		public QualifiedPathTypeContext qualifiedPathType() {
			return getRuleContext(QualifiedPathTypeContext.class,0);
		}
		public List<TerminalNode> PATHSEP() { return getTokens(RustParser.PATHSEP); }
		public TerminalNode PATHSEP(int i) {
			return getToken(RustParser.PATHSEP, i);
		}
		public List<PathExprSegmentContext> pathExprSegment() {
			return getRuleContexts(PathExprSegmentContext.class);
		}
		public PathExprSegmentContext pathExprSegment(int i) {
			return getRuleContext(PathExprSegmentContext.class,i);
		}
		public QualifiedPathInExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedPathInExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterQualifiedPathInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitQualifiedPathInExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitQualifiedPathInExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedPathInExpressionContext qualifiedPathInExpression() throws RecognitionException {
		QualifiedPathInExpressionContext _localctx = new QualifiedPathInExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_qualifiedPathInExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			qualifiedPathType();
			setState(546); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(544);
					match(PATHSEP);
					setState(545);
					pathExprSegment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(548); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class QualifiedPathTypeContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(RustParser.LT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode GT() { return getToken(RustParser.GT, 0); }
		public TerminalNode KW_AS() { return getToken(RustParser.KW_AS, 0); }
		public TypePathContext typePath() {
			return getRuleContext(TypePathContext.class,0);
		}
		public QualifiedPathTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedPathType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterQualifiedPathType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitQualifiedPathType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitQualifiedPathType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedPathTypeContext qualifiedPathType() throws RecognitionException {
		QualifiedPathTypeContext _localctx = new QualifiedPathTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_qualifiedPathType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(LT);
			setState(551);
			type();
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(552);
				match(KW_AS);
				setState(553);
				typePath();
				}
			}

			setState(556);
			match(GT);
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

	public static class QualifiedPathInTypeContext extends ParserRuleContext {
		public QualifiedPathTypeContext qualifiedPathType() {
			return getRuleContext(QualifiedPathTypeContext.class,0);
		}
		public List<TerminalNode> PATHSEP() { return getTokens(RustParser.PATHSEP); }
		public TerminalNode PATHSEP(int i) {
			return getToken(RustParser.PATHSEP, i);
		}
		public List<TypePathSegmentContext> typePathSegment() {
			return getRuleContexts(TypePathSegmentContext.class);
		}
		public TypePathSegmentContext typePathSegment(int i) {
			return getRuleContext(TypePathSegmentContext.class,i);
		}
		public QualifiedPathInTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedPathInType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterQualifiedPathInType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitQualifiedPathInType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitQualifiedPathInType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedPathInTypeContext qualifiedPathInType() throws RecognitionException {
		QualifiedPathInTypeContext _localctx = new QualifiedPathInTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_qualifiedPathInType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			qualifiedPathType();
			setState(561); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(559);
					match(PATHSEP);
					setState(560);
					typePathSegment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(563); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TypePathContext extends ParserRuleContext {
		public List<TypePathSegmentContext> typePathSegment() {
			return getRuleContexts(TypePathSegmentContext.class);
		}
		public TypePathSegmentContext typePathSegment(int i) {
			return getRuleContext(TypePathSegmentContext.class,i);
		}
		public List<TerminalNode> PATHSEP() { return getTokens(RustParser.PATHSEP); }
		public TerminalNode PATHSEP(int i) {
			return getToken(RustParser.PATHSEP, i);
		}
		public TypePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePathContext typePath() throws RecognitionException {
		TypePathContext _localctx = new TypePathContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typePath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATHSEP) {
				{
				setState(565);
				match(PATHSEP);
				}
			}

			setState(568);
			typePathSegment();
			setState(573);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(569);
					match(PATHSEP);
					setState(570);
					typePathSegment();
					}
					} 
				}
				setState(575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
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

	public static class TypePathSegmentContext extends ParserRuleContext {
		public PathIdentSegmentContext pathIdentSegment() {
			return getRuleContext(PathIdentSegmentContext.class,0);
		}
		public TerminalNode PATHSEP() { return getToken(RustParser.PATHSEP, 0); }
		public GenericArgsContext genericArgs() {
			return getRuleContext(GenericArgsContext.class,0);
		}
		public TypePathFnContext typePathFn() {
			return getRuleContext(TypePathFnContext.class,0);
		}
		public TypePathSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePathSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypePathSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypePathSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypePathSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePathSegmentContext typePathSegment() throws RecognitionException {
		TypePathSegmentContext _localctx = new TypePathSegmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typePathSegment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			pathIdentSegment();
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(577);
				match(PATHSEP);
				}
				break;
			}
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(580);
				genericArgs();
				}
				break;
			case 2:
				{
				setState(581);
				typePathFn();
				}
				break;
			}
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

	public static class TypePathFnContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TypePathInputsContext typePathInputs() {
			return getRuleContext(TypePathInputsContext.class,0);
		}
		public TerminalNode RARROW() { return getToken(RustParser.RARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypePathFnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePathFn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypePathFn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypePathFn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypePathFn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePathFnContext typePathFn() throws RecognitionException {
		TypePathFnContext _localctx = new TypePathFnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typePathFn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(LPAREN);
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CONST) | (1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IMPL) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_UNSAFE) | (1L << KW_ASYNC) | (1L << KW_DYN) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LIFETIME_OR_LABEL - 81)) | (1L << (STAR - 81)) | (1L << (NOT - 81)) | (1L << (AND - 81)) | (1L << (LT - 81)) | (1L << (UNDERSCORE - 81)) | (1L << (PATHSEP - 81)) | (1L << (QUESTION - 81)) | (1L << (LSQUAREBRACKET - 81)) | (1L << (LPAREN - 81)))) != 0)) {
				{
				setState(585);
				typePathInputs();
				}
			}

			setState(588);
			match(RPAREN);
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(589);
				match(RARROW);
				setState(590);
				type();
				}
				break;
			}
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

	public static class TypePathInputsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TypePathInputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePathInputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypePathInputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypePathInputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypePathInputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePathInputsContext typePathInputs() throws RecognitionException {
		TypePathInputsContext _localctx = new TypePathInputsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typePathInputs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			type();
			setState(598);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(594);
					match(COMMA);
					setState(595);
					type();
					}
					} 
				}
				setState(600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(601);
				match(COMMA);
				}
			}

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

	public static class MacroInvocationContext extends ParserRuleContext {
		public SimplePathContext simplePath() {
			return getRuleContext(SimplePathContext.class,0);
		}
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public DelimTokenTreeContext delimTokenTree() {
			return getRuleContext(DelimTokenTreeContext.class,0);
		}
		public MacroInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroInvocationContext macroInvocation() throws RecognitionException {
		MacroInvocationContext _localctx = new MacroInvocationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_macroInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			simplePath();
			setState(605);
			match(NOT);
			setState(606);
			delimTokenTree();
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

	public static class DelimTokenTreeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public List<TokenTreeContext> tokenTree() {
			return getRuleContexts(TokenTreeContext.class);
		}
		public TokenTreeContext tokenTree(int i) {
			return getRuleContext(TokenTreeContext.class,i);
		}
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public DelimTokenTreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimTokenTree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterDelimTokenTree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitDelimTokenTree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitDelimTokenTree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelimTokenTreeContext delimTokenTree() throws RecognitionException {
		DelimTokenTreeContext _localctx = new DelimTokenTreeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_delimTokenTree);
		int _la;
		try {
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				match(LPAREN);
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (PLUS - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (SLASH - 69)) | (1L << (PERCENT - 69)) | (1L << (CARET - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (PLUSEQ - 69)) | (1L << (MINUSEQ - 69)) | (1L << (STAREQ - 69)) | (1L << (SLASHEQ - 69)) | (1L << (PERCENTEQ - 69)) | (1L << (CARETEQ - 69)) | (1L << (ANDEQ - 69)) | (1L << (OREQ - 69)) | (1L << (SHLEQ - 69)) | (1L << (SHREQ - 69)) | (1L << (EQ - 69)) | (1L << (EQEQ - 69)) | (1L << (NE - 69)) | (1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (GE - 69)) | (1L << (LE - 69)) | (1L << (AT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (COMMA - 69)) | (1L << (SEMI - 69)) | (1L << (COLON - 69)) | (1L << (PATHSEP - 69)) | (1L << (RARROW - 69)) | (1L << (FATARROW - 69)) | (1L << (POUND - 69)) | (1L << (DOLLAR - 69)) | (1L << (QUESTION - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					{
					setState(609);
					tokenTree();
					}
					}
					setState(614);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(615);
				match(RPAREN);
				}
				break;
			case LSQUAREBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				match(LSQUAREBRACKET);
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (PLUS - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (SLASH - 69)) | (1L << (PERCENT - 69)) | (1L << (CARET - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (PLUSEQ - 69)) | (1L << (MINUSEQ - 69)) | (1L << (STAREQ - 69)) | (1L << (SLASHEQ - 69)) | (1L << (PERCENTEQ - 69)) | (1L << (CARETEQ - 69)) | (1L << (ANDEQ - 69)) | (1L << (OREQ - 69)) | (1L << (SHLEQ - 69)) | (1L << (SHREQ - 69)) | (1L << (EQ - 69)) | (1L << (EQEQ - 69)) | (1L << (NE - 69)) | (1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (GE - 69)) | (1L << (LE - 69)) | (1L << (AT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (COMMA - 69)) | (1L << (SEMI - 69)) | (1L << (COLON - 69)) | (1L << (PATHSEP - 69)) | (1L << (RARROW - 69)) | (1L << (FATARROW - 69)) | (1L << (POUND - 69)) | (1L << (DOLLAR - 69)) | (1L << (QUESTION - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					{
					setState(617);
					tokenTree();
					}
					}
					setState(622);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(623);
				match(RSQUAREBRACKET);
				}
				break;
			case LCURLYBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(624);
				match(LCURLYBRACE);
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (PLUS - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (SLASH - 69)) | (1L << (PERCENT - 69)) | (1L << (CARET - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (PLUSEQ - 69)) | (1L << (MINUSEQ - 69)) | (1L << (STAREQ - 69)) | (1L << (SLASHEQ - 69)) | (1L << (PERCENTEQ - 69)) | (1L << (CARETEQ - 69)) | (1L << (ANDEQ - 69)) | (1L << (OREQ - 69)) | (1L << (SHLEQ - 69)) | (1L << (SHREQ - 69)) | (1L << (EQ - 69)) | (1L << (EQEQ - 69)) | (1L << (NE - 69)) | (1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (GE - 69)) | (1L << (LE - 69)) | (1L << (AT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (COMMA - 69)) | (1L << (SEMI - 69)) | (1L << (COLON - 69)) | (1L << (PATHSEP - 69)) | (1L << (RARROW - 69)) | (1L << (FATARROW - 69)) | (1L << (POUND - 69)) | (1L << (DOLLAR - 69)) | (1L << (QUESTION - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					{
					setState(625);
					tokenTree();
					}
					}
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(631);
				match(RCURLYBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TokenTreeContext extends ParserRuleContext {
		public List<TokenTreeTokenContext> tokenTreeToken() {
			return getRuleContexts(TokenTreeTokenContext.class);
		}
		public TokenTreeTokenContext tokenTreeToken(int i) {
			return getRuleContext(TokenTreeTokenContext.class,i);
		}
		public DelimTokenTreeContext delimTokenTree() {
			return getRuleContext(DelimTokenTreeContext.class,0);
		}
		public TokenTreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenTree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTokenTree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTokenTree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTokenTree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenTreeContext tokenTree() throws RecognitionException {
		TokenTreeContext _localctx = new TokenTreeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tokenTree);
		try {
			int _alt;
			setState(640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_AS:
			case KW_BREAK:
			case KW_CONST:
			case KW_CONTINUE:
			case KW_CRATE:
			case KW_ELSE:
			case KW_ENUM:
			case KW_EXTERN:
			case KW_FALSE:
			case KW_FN:
			case KW_FOR:
			case KW_IF:
			case KW_IMPL:
			case KW_IN:
			case KW_LET:
			case KW_LOOP:
			case KW_MATCH:
			case KW_MOD:
			case KW_MOVE:
			case KW_MUT:
			case KW_PUB:
			case KW_REF:
			case KW_RETURN:
			case KW_SELFVALUE:
			case KW_SELFTYPE:
			case KW_STATIC:
			case KW_STRUCT:
			case KW_SUPER:
			case KW_TRAIT:
			case KW_TRUE:
			case KW_TYPE:
			case KW_UNSAFE:
			case KW_USE:
			case KW_WHERE:
			case KW_WHILE:
			case KW_ASYNC:
			case KW_AWAIT:
			case KW_DYN:
			case KW_ABSTRACT:
			case KW_BECOME:
			case KW_BOX:
			case KW_DO:
			case KW_FINAL:
			case KW_MACRO:
			case KW_OVERRIDE:
			case KW_PRIV:
			case KW_TYPEOF:
			case KW_UNSIZED:
			case KW_VIRTUAL:
			case KW_YIELD:
			case KW_TRY:
			case KW_UNION:
			case KW_STATICLIFETIME:
			case KW_MACRORULES:
			case KW_UNDERLINELIFETIME:
			case KW_DOLLARCRATE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case RAW_STRING_LITERAL:
			case BYTE_LITERAL:
			case BYTE_STRING_LITERAL:
			case RAW_BYTE_STRING_LITERAL:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case LIFETIME_OR_LABEL:
			case PLUS:
			case MINUS:
			case STAR:
			case SLASH:
			case PERCENT:
			case CARET:
			case NOT:
			case AND:
			case OR:
			case ANDAND:
			case OROR:
			case PLUSEQ:
			case MINUSEQ:
			case STAREQ:
			case SLASHEQ:
			case PERCENTEQ:
			case CARETEQ:
			case ANDEQ:
			case OREQ:
			case SHLEQ:
			case SHREQ:
			case EQ:
			case EQEQ:
			case NE:
			case GT:
			case LT:
			case GE:
			case LE:
			case AT:
			case UNDERSCORE:
			case DOT:
			case DOTDOT:
			case DOTDOTDOT:
			case DOTDOTEQ:
			case COMMA:
			case SEMI:
			case COLON:
			case PATHSEP:
			case RARROW:
			case FATARROW:
			case POUND:
			case DOLLAR:
			case QUESTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(635); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(634);
						tokenTreeToken();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(637); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case LCURLYBRACE:
			case LSQUAREBRACKET:
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				delimTokenTree();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TokenTreeTokenContext extends ParserRuleContext {
		public MacroIdentifierLikeTokenContext macroIdentifierLikeToken() {
			return getRuleContext(MacroIdentifierLikeTokenContext.class,0);
		}
		public MacroLiteralTokenContext macroLiteralToken() {
			return getRuleContext(MacroLiteralTokenContext.class,0);
		}
		public MacroPunctuationTokenContext macroPunctuationToken() {
			return getRuleContext(MacroPunctuationTokenContext.class,0);
		}
		public MacroRepOpContext macroRepOp() {
			return getRuleContext(MacroRepOpContext.class,0);
		}
		public TerminalNode DOLLAR() { return getToken(RustParser.DOLLAR, 0); }
		public TokenTreeTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenTreeToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTokenTreeToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTokenTreeToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTokenTreeToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenTreeTokenContext tokenTreeToken() throws RecognitionException {
		TokenTreeTokenContext _localctx = new TokenTreeTokenContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tokenTreeToken);
		try {
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				macroIdentifierLikeToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				macroLiteralToken();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(644);
				macroPunctuationToken();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(645);
				macroRepOp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(646);
				match(DOLLAR);
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

	public static class MacroInvocationSemiContext extends ParserRuleContext {
		public SimplePathContext simplePath() {
			return getRuleContext(SimplePathContext.class,0);
		}
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public List<TokenTreeContext> tokenTree() {
			return getRuleContexts(TokenTreeContext.class);
		}
		public TokenTreeContext tokenTree(int i) {
			return getRuleContext(TokenTreeContext.class,i);
		}
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public MacroInvocationSemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroInvocationSemi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroInvocationSemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroInvocationSemi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroInvocationSemi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroInvocationSemiContext macroInvocationSemi() throws RecognitionException {
		MacroInvocationSemiContext _localctx = new MacroInvocationSemiContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_macroInvocationSemi);
		int _la;
		try {
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				simplePath();
				setState(650);
				match(NOT);
				setState(651);
				match(LPAREN);
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (PLUS - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (SLASH - 69)) | (1L << (PERCENT - 69)) | (1L << (CARET - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (PLUSEQ - 69)) | (1L << (MINUSEQ - 69)) | (1L << (STAREQ - 69)) | (1L << (SLASHEQ - 69)) | (1L << (PERCENTEQ - 69)) | (1L << (CARETEQ - 69)) | (1L << (ANDEQ - 69)) | (1L << (OREQ - 69)) | (1L << (SHLEQ - 69)) | (1L << (SHREQ - 69)) | (1L << (EQ - 69)) | (1L << (EQEQ - 69)) | (1L << (NE - 69)) | (1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (GE - 69)) | (1L << (LE - 69)) | (1L << (AT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (COMMA - 69)) | (1L << (SEMI - 69)) | (1L << (COLON - 69)) | (1L << (PATHSEP - 69)) | (1L << (RARROW - 69)) | (1L << (FATARROW - 69)) | (1L << (POUND - 69)) | (1L << (DOLLAR - 69)) | (1L << (QUESTION - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					{
					setState(652);
					tokenTree();
					}
					}
					setState(657);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(658);
				match(RPAREN);
				setState(659);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				simplePath();
				setState(662);
				match(NOT);
				setState(663);
				match(LSQUAREBRACKET);
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (PLUS - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (SLASH - 69)) | (1L << (PERCENT - 69)) | (1L << (CARET - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (PLUSEQ - 69)) | (1L << (MINUSEQ - 69)) | (1L << (STAREQ - 69)) | (1L << (SLASHEQ - 69)) | (1L << (PERCENTEQ - 69)) | (1L << (CARETEQ - 69)) | (1L << (ANDEQ - 69)) | (1L << (OREQ - 69)) | (1L << (SHLEQ - 69)) | (1L << (SHREQ - 69)) | (1L << (EQ - 69)) | (1L << (EQEQ - 69)) | (1L << (NE - 69)) | (1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (GE - 69)) | (1L << (LE - 69)) | (1L << (AT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (COMMA - 69)) | (1L << (SEMI - 69)) | (1L << (COLON - 69)) | (1L << (PATHSEP - 69)) | (1L << (RARROW - 69)) | (1L << (FATARROW - 69)) | (1L << (POUND - 69)) | (1L << (DOLLAR - 69)) | (1L << (QUESTION - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					{
					setState(664);
					tokenTree();
					}
					}
					setState(669);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(670);
				match(RSQUAREBRACKET);
				setState(671);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(673);
				simplePath();
				setState(674);
				match(NOT);
				setState(675);
				match(LCURLYBRACE);
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (PLUS - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (SLASH - 69)) | (1L << (PERCENT - 69)) | (1L << (CARET - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (PLUSEQ - 69)) | (1L << (MINUSEQ - 69)) | (1L << (STAREQ - 69)) | (1L << (SLASHEQ - 69)) | (1L << (PERCENTEQ - 69)) | (1L << (CARETEQ - 69)) | (1L << (ANDEQ - 69)) | (1L << (OREQ - 69)) | (1L << (SHLEQ - 69)) | (1L << (SHREQ - 69)) | (1L << (EQ - 69)) | (1L << (EQEQ - 69)) | (1L << (NE - 69)) | (1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (GE - 69)) | (1L << (LE - 69)) | (1L << (AT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (COMMA - 69)) | (1L << (SEMI - 69)) | (1L << (COLON - 69)) | (1L << (PATHSEP - 69)) | (1L << (RARROW - 69)) | (1L << (FATARROW - 69)) | (1L << (POUND - 69)) | (1L << (DOLLAR - 69)) | (1L << (QUESTION - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					{
					setState(676);
					tokenTree();
					}
					}
					setState(681);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(682);
				match(RCURLYBRACE);
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

	public static class MacroRulesDefinitionContext extends ParserRuleContext {
		public TerminalNode KW_MACRORULES() { return getToken(RustParser.KW_MACRORULES, 0); }
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MacroRulesDefContext macroRulesDef() {
			return getRuleContext(MacroRulesDefContext.class,0);
		}
		public MacroRulesDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroRulesDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroRulesDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroRulesDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroRulesDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroRulesDefinitionContext macroRulesDefinition() throws RecognitionException {
		MacroRulesDefinitionContext _localctx = new MacroRulesDefinitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_macroRulesDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(KW_MACRORULES);
			setState(687);
			match(NOT);
			setState(688);
			identifier();
			setState(689);
			macroRulesDef();
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

	public static class MacroRulesDefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public MacroRulesContext macroRules() {
			return getRuleContext(MacroRulesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public MacroRulesDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroRulesDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroRulesDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroRulesDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroRulesDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroRulesDefContext macroRulesDef() throws RecognitionException {
		MacroRulesDefContext _localctx = new MacroRulesDefContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_macroRulesDef);
		try {
			setState(705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				match(LPAREN);
				setState(692);
				macroRules();
				setState(693);
				match(RPAREN);
				setState(694);
				match(SEMI);
				}
				break;
			case LSQUAREBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				match(LSQUAREBRACKET);
				setState(697);
				macroRules();
				setState(698);
				match(RSQUAREBRACKET);
				setState(699);
				match(SEMI);
				}
				break;
			case LCURLYBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(701);
				match(LCURLYBRACE);
				setState(702);
				macroRules();
				setState(703);
				match(RCURLYBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MacroRulesContext extends ParserRuleContext {
		public List<MacroRuleContext> macroRule() {
			return getRuleContexts(MacroRuleContext.class);
		}
		public MacroRuleContext macroRule(int i) {
			return getRuleContext(MacroRuleContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(RustParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(RustParser.SEMI, i);
		}
		public MacroRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroRulesContext macroRules() throws RecognitionException {
		MacroRulesContext _localctx = new MacroRulesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_macroRules);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			macroRule();
			setState(712);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(708);
					match(SEMI);
					setState(709);
					macroRule();
					}
					} 
				}
				setState(714);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(715);
				match(SEMI);
				}
			}

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

	public static class MacroRuleContext extends ParserRuleContext {
		public MacroMatcherContext macroMatcher() {
			return getRuleContext(MacroMatcherContext.class,0);
		}
		public TerminalNode FATARROW() { return getToken(RustParser.FATARROW, 0); }
		public MacroTranscriberContext macroTranscriber() {
			return getRuleContext(MacroTranscriberContext.class,0);
		}
		public MacroRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroRuleContext macroRule() throws RecognitionException {
		MacroRuleContext _localctx = new MacroRuleContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_macroRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			macroMatcher();
			setState(719);
			match(FATARROW);
			setState(720);
			macroTranscriber();
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

	public static class MacroMatcherContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public List<MacroMatchContext> macroMatch() {
			return getRuleContexts(MacroMatchContext.class);
		}
		public MacroMatchContext macroMatch(int i) {
			return getRuleContext(MacroMatchContext.class,i);
		}
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public MacroMatcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroMatcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroMatcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroMatcher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroMatcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroMatcherContext macroMatcher() throws RecognitionException {
		MacroMatcherContext _localctx = new MacroMatcherContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_macroMatcher);
		int _la;
		try {
			setState(746);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				match(LPAREN);
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (PLUS - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (SLASH - 69)) | (1L << (PERCENT - 69)) | (1L << (CARET - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (PLUSEQ - 69)) | (1L << (MINUSEQ - 69)) | (1L << (STAREQ - 69)) | (1L << (SLASHEQ - 69)) | (1L << (PERCENTEQ - 69)) | (1L << (CARETEQ - 69)) | (1L << (ANDEQ - 69)) | (1L << (OREQ - 69)) | (1L << (SHLEQ - 69)) | (1L << (SHREQ - 69)) | (1L << (EQ - 69)) | (1L << (EQEQ - 69)) | (1L << (NE - 69)) | (1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (GE - 69)) | (1L << (LE - 69)) | (1L << (AT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (COMMA - 69)) | (1L << (SEMI - 69)) | (1L << (COLON - 69)) | (1L << (PATHSEP - 69)) | (1L << (RARROW - 69)) | (1L << (FATARROW - 69)) | (1L << (POUND - 69)) | (1L << (DOLLAR - 69)) | (1L << (QUESTION - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					{
					setState(723);
					macroMatch();
					}
					}
					setState(728);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(729);
				match(RPAREN);
				}
				break;
			case LSQUAREBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				match(LSQUAREBRACKET);
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (PLUS - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (SLASH - 69)) | (1L << (PERCENT - 69)) | (1L << (CARET - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (PLUSEQ - 69)) | (1L << (MINUSEQ - 69)) | (1L << (STAREQ - 69)) | (1L << (SLASHEQ - 69)) | (1L << (PERCENTEQ - 69)) | (1L << (CARETEQ - 69)) | (1L << (ANDEQ - 69)) | (1L << (OREQ - 69)) | (1L << (SHLEQ - 69)) | (1L << (SHREQ - 69)) | (1L << (EQ - 69)) | (1L << (EQEQ - 69)) | (1L << (NE - 69)) | (1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (GE - 69)) | (1L << (LE - 69)) | (1L << (AT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (COMMA - 69)) | (1L << (SEMI - 69)) | (1L << (COLON - 69)) | (1L << (PATHSEP - 69)) | (1L << (RARROW - 69)) | (1L << (FATARROW - 69)) | (1L << (POUND - 69)) | (1L << (DOLLAR - 69)) | (1L << (QUESTION - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					{
					setState(731);
					macroMatch();
					}
					}
					setState(736);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(737);
				match(RSQUAREBRACKET);
				}
				break;
			case LCURLYBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(738);
				match(LCURLYBRACE);
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (PLUS - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (SLASH - 69)) | (1L << (PERCENT - 69)) | (1L << (CARET - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (PLUSEQ - 69)) | (1L << (MINUSEQ - 69)) | (1L << (STAREQ - 69)) | (1L << (SLASHEQ - 69)) | (1L << (PERCENTEQ - 69)) | (1L << (CARETEQ - 69)) | (1L << (ANDEQ - 69)) | (1L << (OREQ - 69)) | (1L << (SHLEQ - 69)) | (1L << (SHREQ - 69)) | (1L << (EQ - 69)) | (1L << (EQEQ - 69)) | (1L << (NE - 69)) | (1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (GE - 69)) | (1L << (LE - 69)) | (1L << (AT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (COMMA - 69)) | (1L << (SEMI - 69)) | (1L << (COLON - 69)) | (1L << (PATHSEP - 69)) | (1L << (RARROW - 69)) | (1L << (FATARROW - 69)) | (1L << (POUND - 69)) | (1L << (DOLLAR - 69)) | (1L << (QUESTION - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					{
					setState(739);
					macroMatch();
					}
					}
					setState(744);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(745);
				match(RCURLYBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MacroMatchContext extends ParserRuleContext {
		public List<MacroMatchTokenContext> macroMatchToken() {
			return getRuleContexts(MacroMatchTokenContext.class);
		}
		public MacroMatchTokenContext macroMatchToken(int i) {
			return getRuleContext(MacroMatchTokenContext.class,i);
		}
		public MacroMatcherContext macroMatcher() {
			return getRuleContext(MacroMatcherContext.class,0);
		}
		public TerminalNode DOLLAR() { return getToken(RustParser.DOLLAR, 0); }
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public MacroFragSpecContext macroFragSpec() {
			return getRuleContext(MacroFragSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public MacroRepOpContext macroRepOp() {
			return getRuleContext(MacroRepOpContext.class,0);
		}
		public List<MacroMatchContext> macroMatch() {
			return getRuleContexts(MacroMatchContext.class);
		}
		public MacroMatchContext macroMatch(int i) {
			return getRuleContext(MacroMatchContext.class,i);
		}
		public MacroRepSepContext macroRepSep() {
			return getRuleContext(MacroRepSepContext.class,0);
		}
		public MacroMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroMatchContext macroMatch() throws RecognitionException {
		MacroMatchContext _localctx = new MacroMatchContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_macroMatch);
		int _la;
		try {
			int _alt;
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(749); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(748);
						macroMatchToken();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(751); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				macroMatcher();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(754);
				match(DOLLAR);
				setState(757);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_MACRORULES:
				case NON_KEYWORD_IDENTIFIER:
				case RAW_IDENTIFIER:
					{
					setState(755);
					identifier();
					}
					break;
				case KW_SELFVALUE:
					{
					setState(756);
					match(KW_SELFVALUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(759);
				match(COLON);
				setState(760);
				macroFragSpec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(761);
				match(DOLLAR);
				setState(762);
				match(LPAREN);
				setState(764); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(763);
					macroMatch();
					}
					}
					setState(766); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (PLUS - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (SLASH - 69)) | (1L << (PERCENT - 69)) | (1L << (CARET - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (PLUSEQ - 69)) | (1L << (MINUSEQ - 69)) | (1L << (STAREQ - 69)) | (1L << (SLASHEQ - 69)) | (1L << (PERCENTEQ - 69)) | (1L << (CARETEQ - 69)) | (1L << (ANDEQ - 69)) | (1L << (OREQ - 69)) | (1L << (SHLEQ - 69)) | (1L << (SHREQ - 69)) | (1L << (EQ - 69)) | (1L << (EQEQ - 69)) | (1L << (NE - 69)) | (1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (GE - 69)) | (1L << (LE - 69)) | (1L << (AT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (COMMA - 69)) | (1L << (SEMI - 69)) | (1L << (COLON - 69)) | (1L << (PATHSEP - 69)) | (1L << (RARROW - 69)) | (1L << (FATARROW - 69)) | (1L << (POUND - 69)) | (1L << (DOLLAR - 69)) | (1L << (QUESTION - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0) );
				setState(768);
				match(RPAREN);
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (MINUS - 69)) | (1L << (SLASH - 69)) | (1L << (PERCENT - 69)) | (1L << (CARET - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (PLUSEQ - 69)) | (1L << (MINUSEQ - 69)) | (1L << (STAREQ - 69)) | (1L << (SLASHEQ - 69)) | (1L << (PERCENTEQ - 69)) | (1L << (CARETEQ - 69)) | (1L << (ANDEQ - 69)) | (1L << (OREQ - 69)) | (1L << (SHLEQ - 69)) | (1L << (SHREQ - 69)) | (1L << (EQ - 69)) | (1L << (EQEQ - 69)) | (1L << (NE - 69)) | (1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (GE - 69)) | (1L << (LE - 69)) | (1L << (AT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (COMMA - 69)) | (1L << (SEMI - 69)) | (1L << (COLON - 69)) | (1L << (PATHSEP - 69)) | (1L << (RARROW - 69)) | (1L << (FATARROW - 69)) | (1L << (POUND - 69)) | (1L << (DOLLAR - 69)))) != 0)) {
					{
					setState(769);
					macroRepSep();
					}
				}

				setState(772);
				macroRepOp();
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

	public static class MacroMatchTokenContext extends ParserRuleContext {
		public MacroIdentifierLikeTokenContext macroIdentifierLikeToken() {
			return getRuleContext(MacroIdentifierLikeTokenContext.class,0);
		}
		public MacroLiteralTokenContext macroLiteralToken() {
			return getRuleContext(MacroLiteralTokenContext.class,0);
		}
		public MacroPunctuationTokenContext macroPunctuationToken() {
			return getRuleContext(MacroPunctuationTokenContext.class,0);
		}
		public MacroRepOpContext macroRepOp() {
			return getRuleContext(MacroRepOpContext.class,0);
		}
		public MacroMatchTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroMatchToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroMatchToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroMatchToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroMatchToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroMatchTokenContext macroMatchToken() throws RecognitionException {
		MacroMatchTokenContext _localctx = new MacroMatchTokenContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_macroMatchToken);
		try {
			setState(780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(776);
				macroIdentifierLikeToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(777);
				macroLiteralToken();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(778);
				macroPunctuationToken();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(779);
				macroRepOp();
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

	public static class MacroFragSpecContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MacroFragSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroFragSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroFragSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroFragSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroFragSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroFragSpecContext macroFragSpec() throws RecognitionException {
		MacroFragSpecContext _localctx = new MacroFragSpecContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_macroFragSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			identifier();
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

	public static class MacroRepSepContext extends ParserRuleContext {
		public MacroIdentifierLikeTokenContext macroIdentifierLikeToken() {
			return getRuleContext(MacroIdentifierLikeTokenContext.class,0);
		}
		public MacroLiteralTokenContext macroLiteralToken() {
			return getRuleContext(MacroLiteralTokenContext.class,0);
		}
		public MacroPunctuationTokenContext macroPunctuationToken() {
			return getRuleContext(MacroPunctuationTokenContext.class,0);
		}
		public TerminalNode DOLLAR() { return getToken(RustParser.DOLLAR, 0); }
		public MacroRepSepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroRepSep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroRepSep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroRepSep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroRepSep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroRepSepContext macroRepSep() throws RecognitionException {
		MacroRepSepContext _localctx = new MacroRepSepContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_macroRepSep);
		try {
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				macroIdentifierLikeToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
				macroLiteralToken();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(786);
				macroPunctuationToken();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(787);
				match(DOLLAR);
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

	public static class MacroRepOpContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(RustParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(RustParser.PLUS, 0); }
		public TerminalNode QUESTION() { return getToken(RustParser.QUESTION, 0); }
		public MacroRepOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroRepOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroRepOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroRepOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroRepOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroRepOpContext macroRepOp() throws RecognitionException {
		MacroRepOpContext _localctx = new MacroRepOpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_macroRepOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (PLUS - 82)) | (1L << (STAR - 82)) | (1L << (QUESTION - 82)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class MacroTranscriberContext extends ParserRuleContext {
		public DelimTokenTreeContext delimTokenTree() {
			return getRuleContext(DelimTokenTreeContext.class,0);
		}
		public MacroTranscriberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroTranscriber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroTranscriber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroTranscriber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroTranscriber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroTranscriberContext macroTranscriber() throws RecognitionException {
		MacroTranscriberContext _localctx = new MacroTranscriberContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_macroTranscriber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			delimTokenTree();
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

	public static class ItemContext extends ParserRuleContext {
		public VisItemContext visItem() {
			return getRuleContext(VisItemContext.class,0);
		}
		public MacroItemContext macroItem() {
			return getRuleContext(MacroItemContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(794);
				outerAttribute();
				}
				}
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(802);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CONST:
			case KW_ENUM:
			case KW_EXTERN:
			case KW_FN:
			case KW_IMPL:
			case KW_MOD:
			case KW_PUB:
			case KW_STATIC:
			case KW_STRUCT:
			case KW_TRAIT:
			case KW_TYPE:
			case KW_UNSAFE:
			case KW_USE:
			case KW_ASYNC:
			case KW_UNION:
				{
				setState(800);
				visItem();
				}
				break;
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_SUPER:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case PATHSEP:
				{
				setState(801);
				macroItem();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class VisItemContext extends ParserRuleContext {
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public ExternCrateContext externCrate() {
			return getRuleContext(ExternCrateContext.class,0);
		}
		public UseDeclarationContext useDeclaration() {
			return getRuleContext(UseDeclarationContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TypeAliasContext typeAlias() {
			return getRuleContext(TypeAliasContext.class,0);
		}
		public Struct_Context struct_() {
			return getRuleContext(Struct_Context.class,0);
		}
		public EnumerationContext enumeration() {
			return getRuleContext(EnumerationContext.class,0);
		}
		public Union_Context union_() {
			return getRuleContext(Union_Context.class,0);
		}
		public ConstantItemContext constantItem() {
			return getRuleContext(ConstantItemContext.class,0);
		}
		public StaticItemContext staticItem() {
			return getRuleContext(StaticItemContext.class,0);
		}
		public TraitContext trait() {
			return getRuleContext(TraitContext.class,0);
		}
		public ImplementationContext implementation() {
			return getRuleContext(ImplementationContext.class,0);
		}
		public ExternBlockContext externBlock() {
			return getRuleContext(ExternBlockContext.class,0);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public VisItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterVisItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitVisItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitVisItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisItemContext visItem() throws RecognitionException {
		VisItemContext _localctx = new VisItemContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_visItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(804);
				visibility();
				}
			}

			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(807);
				module();
				}
				break;
			case 2:
				{
				setState(808);
				externCrate();
				}
				break;
			case 3:
				{
				setState(809);
				useDeclaration();
				}
				break;
			case 4:
				{
				setState(810);
				function();
				}
				break;
			case 5:
				{
				setState(811);
				typeAlias();
				}
				break;
			case 6:
				{
				setState(812);
				struct_();
				}
				break;
			case 7:
				{
				setState(813);
				enumeration();
				}
				break;
			case 8:
				{
				setState(814);
				union_();
				}
				break;
			case 9:
				{
				setState(815);
				constantItem();
				}
				break;
			case 10:
				{
				setState(816);
				staticItem();
				}
				break;
			case 11:
				{
				setState(817);
				trait();
				}
				break;
			case 12:
				{
				setState(818);
				implementation();
				}
				break;
			case 13:
				{
				setState(819);
				externBlock();
				}
				break;
			}
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

	public static class MacroItemContext extends ParserRuleContext {
		public MacroInvocationSemiContext macroInvocationSemi() {
			return getRuleContext(MacroInvocationSemiContext.class,0);
		}
		public MacroRulesDefinitionContext macroRulesDefinition() {
			return getRuleContext(MacroRulesDefinitionContext.class,0);
		}
		public MacroItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroItemContext macroItem() throws RecognitionException {
		MacroItemContext _localctx = new MacroItemContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_macroItem);
		try {
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				macroInvocationSemi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(823);
				macroRulesDefinition();
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

	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode KW_MOD() { return getToken(RustParser.KW_MOD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_module);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE) {
				{
				setState(826);
				match(KW_UNSAFE);
				}
			}

			setState(829);
			match(KW_MOD);
			setState(830);
			identifier();
			setState(846);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				{
				setState(831);
				match(SEMI);
				}
				break;
			case LCURLYBRACE:
				{
				setState(832);
				match(LCURLYBRACE);
				setState(836);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(833);
						innerAttribute();
						}
						} 
					}
					setState(838);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CONST) | (1L << KW_CRATE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_IMPL) | (1L << KW_MOD) | (1L << KW_PUB) | (1L << KW_SELFVALUE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_ASYNC) | (1L << KW_UNION) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || _la==PATHSEP || _la==POUND) {
					{
					{
					setState(839);
					item();
					}
					}
					setState(844);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(845);
				match(RCURLYBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class ExternCrateContext extends ParserRuleContext {
		public TerminalNode KW_EXTERN() { return getToken(RustParser.KW_EXTERN, 0); }
		public TerminalNode KW_CRATE() { return getToken(RustParser.KW_CRATE, 0); }
		public CrateRefContext crateRef() {
			return getRuleContext(CrateRefContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public AsClauseContext asClause() {
			return getRuleContext(AsClauseContext.class,0);
		}
		public ExternCrateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externCrate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterExternCrate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitExternCrate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitExternCrate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternCrateContext externCrate() throws RecognitionException {
		ExternCrateContext _localctx = new ExternCrateContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_externCrate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(KW_EXTERN);
			setState(849);
			match(KW_CRATE);
			setState(850);
			crateRef();
			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(851);
				asClause();
				}
			}

			setState(854);
			match(SEMI);
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

	public static class CrateRefContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public CrateRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crateRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterCrateRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitCrateRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitCrateRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrateRefContext crateRef() throws RecognitionException {
		CrateRefContext _localctx = new CrateRefContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_crateRef);
		try {
			setState(858);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_MACRORULES:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				identifier();
				}
				break;
			case KW_SELFVALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(857);
				match(KW_SELFVALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AsClauseContext extends ParserRuleContext {
		public TerminalNode KW_AS() { return getToken(RustParser.KW_AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public AsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsClauseContext asClause() throws RecognitionException {
		AsClauseContext _localctx = new AsClauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_asClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(KW_AS);
			setState(863);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_MACRORULES:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
				{
				setState(861);
				identifier();
				}
				break;
			case UNDERSCORE:
				{
				setState(862);
				match(UNDERSCORE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class UseDeclarationContext extends ParserRuleContext {
		public TerminalNode KW_USE() { return getToken(RustParser.KW_USE, 0); }
		public UseTreeContext useTree() {
			return getRuleContext(UseTreeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public UseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterUseDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitUseDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitUseDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseDeclarationContext useDeclaration() throws RecognitionException {
		UseDeclarationContext _localctx = new UseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_useDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			match(KW_USE);
			setState(866);
			useTree();
			setState(867);
			match(SEMI);
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

	public static class UseTreeContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(RustParser.STAR, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public TerminalNode PATHSEP() { return getToken(RustParser.PATHSEP, 0); }
		public List<UseTreeContext> useTree() {
			return getRuleContexts(UseTreeContext.class);
		}
		public UseTreeContext useTree(int i) {
			return getRuleContext(UseTreeContext.class,i);
		}
		public SimplePathContext simplePath() {
			return getRuleContext(SimplePathContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TerminalNode KW_AS() { return getToken(RustParser.KW_AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public UseTreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useTree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterUseTree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitUseTree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitUseTree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseTreeContext useTree() throws RecognitionException {
		UseTreeContext _localctx = new UseTreeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_useTree);
		int _la;
		try {
			int _alt;
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_SELFVALUE) | (1L << KW_SUPER) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || _la==PATHSEP) {
					{
					setState(870);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						setState(869);
						simplePath();
						}
						break;
					}
					setState(872);
					match(PATHSEP);
					}
				}

				setState(891);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(875);
					match(STAR);
					}
					break;
				case LCURLYBRACE:
					{
					setState(876);
					match(LCURLYBRACE);
					setState(888);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_SELFVALUE) | (1L << KW_SUPER) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STAR - 84)) | (1L << (PATHSEP - 84)) | (1L << (LCURLYBRACE - 84)))) != 0)) {
						{
						setState(877);
						useTree();
						setState(882);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(878);
								match(COMMA);
								setState(879);
								useTree();
								}
								} 
							}
							setState(884);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
						}
						setState(886);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(885);
							match(COMMA);
							}
						}

						}
					}

					setState(890);
					match(RCURLYBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(893);
				simplePath();
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(894);
					match(KW_AS);
					setState(897);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case KW_MACRORULES:
					case NON_KEYWORD_IDENTIFIER:
					case RAW_IDENTIFIER:
						{
						setState(895);
						identifier();
						}
						break;
					case UNDERSCORE:
						{
						setState(896);
						match(UNDERSCORE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionQualifiersContext functionQualifiers() {
			return getRuleContext(FunctionQualifiersContext.class,0);
		}
		public TerminalNode KW_FN() { return getToken(RustParser.KW_FN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public GenericsContext generics() {
			return getRuleContext(GenericsContext.class,0);
		}
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public FunctionReturnTypeContext functionReturnType() {
			return getRuleContext(FunctionReturnTypeContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			functionQualifiers();
			setState(904);
			match(KW_FN);
			setState(905);
			identifier();
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(906);
				generics();
				}
			}

			setState(909);
			match(LPAREN);
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_MUT) | (1L << KW_REF) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (MINUS - 69)) | (1L << (AND - 69)) | (1L << (ANDAND - 69)) | (1L << (LT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOTDOT - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
				{
				setState(910);
				functionParameters();
				}
			}

			setState(913);
			match(RPAREN);
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(914);
				functionReturnType();
				}
			}

			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(917);
				whereClause();
				}
			}

			setState(920);
			blockExpression();
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

	public static class FunctionQualifiersContext extends ParserRuleContext {
		public AsyncConstQualifiersContext asyncConstQualifiers() {
			return getRuleContext(AsyncConstQualifiersContext.class,0);
		}
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public TerminalNode KW_EXTERN() { return getToken(RustParser.KW_EXTERN, 0); }
		public AbiContext abi() {
			return getRuleContext(AbiContext.class,0);
		}
		public FunctionQualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionQualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterFunctionQualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitFunctionQualifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitFunctionQualifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionQualifiersContext functionQualifiers() throws RecognitionException {
		FunctionQualifiersContext _localctx = new FunctionQualifiersContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functionQualifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONST || _la==KW_ASYNC) {
				{
				setState(922);
				asyncConstQualifiers();
				}
			}

			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE) {
				{
				setState(925);
				match(KW_UNSAFE);
				}
			}

			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_EXTERN) {
				{
				setState(928);
				match(KW_EXTERN);
				setState(930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING_LITERAL || _la==RAW_STRING_LITERAL) {
					{
					setState(929);
					abi();
					}
				}

				}
			}

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

	public static class AsyncConstQualifiersContext extends ParserRuleContext {
		public TerminalNode KW_ASYNC() { return getToken(RustParser.KW_ASYNC, 0); }
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public AsyncConstQualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asyncConstQualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAsyncConstQualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAsyncConstQualifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAsyncConstQualifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsyncConstQualifiersContext asyncConstQualifiers() throws RecognitionException {
		AsyncConstQualifiersContext _localctx = new AsyncConstQualifiersContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_asyncConstQualifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			_la = _input.LA(1);
			if ( !(_la==KW_CONST || _la==KW_ASYNC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class AbiContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(RustParser.STRING_LITERAL, 0); }
		public TerminalNode RAW_STRING_LITERAL() { return getToken(RustParser.RAW_STRING_LITERAL, 0); }
		public AbiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAbi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAbi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAbi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbiContext abi() throws RecognitionException {
		AbiContext _localctx = new AbiContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_abi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==RAW_STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class FunctionParametersContext extends ParserRuleContext {
		public List<FunctionParamContext> functionParam() {
			return getRuleContexts(FunctionParamContext.class);
		}
		public FunctionParamContext functionParam(int i) {
			return getRuleContext(FunctionParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_functionParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			functionParam();
			setState(943);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(939);
					match(COMMA);
					setState(940);
					functionParam();
					}
					} 
				}
				setState(945);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			setState(947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(946);
				match(COMMA);
				}
			}

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

	public static class FunctionParamContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public FunctionParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterFunctionParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitFunctionParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitFunctionParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParamContext functionParam() throws RecognitionException {
		FunctionParamContext _localctx = new FunctionParamContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_functionParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(949);
				outerAttribute();
				}
				}
				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(955);
			pattern();
			setState(956);
			match(COLON);
			setState(957);
			type();
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

	public static class FunctionReturnTypeContext extends ParserRuleContext {
		public TerminalNode RARROW() { return getToken(RustParser.RARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterFunctionReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitFunctionReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitFunctionReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnTypeContext functionReturnType() throws RecognitionException {
		FunctionReturnTypeContext _localctx = new FunctionReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_functionReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			match(RARROW);
			setState(960);
			type();
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

	public static class TypeAliasContext extends ParserRuleContext {
		public TerminalNode KW_TYPE() { return getToken(RustParser.KW_TYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public GenericsContext generics() {
			return getRuleContext(GenericsContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TypeAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypeAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypeAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypeAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAliasContext typeAlias() throws RecognitionException {
		TypeAliasContext _localctx = new TypeAliasContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_typeAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			match(KW_TYPE);
			setState(963);
			identifier();
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(964);
				generics();
				}
			}

			setState(968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(967);
				whereClause();
				}
			}

			setState(970);
			match(EQ);
			setState(971);
			type();
			setState(972);
			match(SEMI);
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

	public static class Struct_Context extends ParserRuleContext {
		public StructStructContext structStruct() {
			return getRuleContext(StructStructContext.class,0);
		}
		public TupleStructContext tupleStruct() {
			return getRuleContext(TupleStructContext.class,0);
		}
		public Struct_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStruct_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStruct_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStruct_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_Context struct_() throws RecognitionException {
		Struct_Context _localctx = new Struct_Context(_ctx, getState());
		enterRule(_localctx, 102, RULE_struct_);
		try {
			setState(976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(974);
				structStruct();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(975);
				tupleStruct();
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

	public static class StructStructContext extends ParserRuleContext {
		public TerminalNode KW_STRUCT() { return getToken(RustParser.KW_STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public GenericsContext generics() {
			return getRuleContext(GenericsContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public StructFieldsContext structFields() {
			return getRuleContext(StructFieldsContext.class,0);
		}
		public StructStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructStructContext structStruct() throws RecognitionException {
		StructStructContext _localctx = new StructStructContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_structStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(KW_STRUCT);
			setState(979);
			identifier();
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(980);
				generics();
				}
			}

			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(983);
				whereClause();
				}
			}

			setState(992);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLYBRACE:
				{
				setState(986);
				match(LCURLYBRACE);
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_PUB) | (1L << KW_MACRORULES) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || _la==POUND) {
					{
					setState(987);
					structFields();
					}
				}

				setState(990);
				match(RCURLYBRACE);
				}
				break;
			case SEMI:
				{
				setState(991);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class TupleStructContext extends ParserRuleContext {
		public TerminalNode KW_STRUCT() { return getToken(RustParser.KW_STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public GenericsContext generics() {
			return getRuleContext(GenericsContext.class,0);
		}
		public TupleFieldsContext tupleFields() {
			return getRuleContext(TupleFieldsContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TupleStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleStructContext tupleStruct() throws RecognitionException {
		TupleStructContext _localctx = new TupleStructContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_tupleStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			match(KW_STRUCT);
			setState(995);
			identifier();
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(996);
				generics();
				}
			}

			setState(999);
			match(LPAREN);
			setState(1001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CONST) | (1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IMPL) | (1L << KW_PUB) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_UNSAFE) | (1L << KW_ASYNC) | (1L << KW_DYN) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LIFETIME_OR_LABEL - 81)) | (1L << (STAR - 81)) | (1L << (NOT - 81)) | (1L << (AND - 81)) | (1L << (LT - 81)) | (1L << (UNDERSCORE - 81)) | (1L << (PATHSEP - 81)) | (1L << (POUND - 81)) | (1L << (QUESTION - 81)) | (1L << (LSQUAREBRACKET - 81)) | (1L << (LPAREN - 81)))) != 0)) {
				{
				setState(1000);
				tupleFields();
				}
			}

			setState(1003);
			match(RPAREN);
			setState(1005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1004);
				whereClause();
				}
			}

			setState(1007);
			match(SEMI);
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

	public static class StructFieldsContext extends ParserRuleContext {
		public List<StructFieldContext> structField() {
			return getRuleContexts(StructFieldContext.class);
		}
		public StructFieldContext structField(int i) {
			return getRuleContext(StructFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public StructFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldsContext structFields() throws RecognitionException {
		StructFieldsContext _localctx = new StructFieldsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_structFields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			structField();
			setState(1014);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1010);
					match(COMMA);
					setState(1011);
					structField();
					}
					} 
				}
				setState(1016);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			setState(1018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1017);
				match(COMMA);
				}
			}

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

	public static class StructFieldContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public StructFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldContext structField() throws RecognitionException {
		StructFieldContext _localctx = new StructFieldContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_structField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1020);
				outerAttribute();
				}
				}
				setState(1025);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(1026);
				visibility();
				}
			}

			setState(1029);
			identifier();
			setState(1030);
			match(COLON);
			setState(1031);
			type();
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

	public static class TupleFieldsContext extends ParserRuleContext {
		public List<TupleFieldContext> tupleField() {
			return getRuleContexts(TupleFieldContext.class);
		}
		public TupleFieldContext tupleField(int i) {
			return getRuleContext(TupleFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TupleFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleFieldsContext tupleFields() throws RecognitionException {
		TupleFieldsContext _localctx = new TupleFieldsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_tupleFields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			tupleField();
			setState(1038);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1034);
					match(COMMA);
					setState(1035);
					tupleField();
					}
					} 
				}
				setState(1040);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			}
			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1041);
				match(COMMA);
				}
			}

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

	public static class TupleFieldContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TupleFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleFieldContext tupleField() throws RecognitionException {
		TupleFieldContext _localctx = new TupleFieldContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_tupleField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1044);
				outerAttribute();
				}
				}
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(1050);
				visibility();
				}
			}

			setState(1053);
			type();
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

	public static class EnumerationContext extends ParserRuleContext {
		public TerminalNode KW_ENUM() { return getToken(RustParser.KW_ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public GenericsContext generics() {
			return getRuleContext(GenericsContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public EnumItemsContext enumItems() {
			return getRuleContext(EnumItemsContext.class,0);
		}
		public EnumerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumeration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumeration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationContext enumeration() throws RecognitionException {
		EnumerationContext _localctx = new EnumerationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_enumeration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			match(KW_ENUM);
			setState(1056);
			identifier();
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1057);
				generics();
				}
			}

			setState(1061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1060);
				whereClause();
				}
			}

			setState(1063);
			match(LCURLYBRACE);
			setState(1065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_PUB) | (1L << KW_MACRORULES) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || _la==POUND) {
				{
				setState(1064);
				enumItems();
				}
			}

			setState(1067);
			match(RCURLYBRACE);
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

	public static class EnumItemsContext extends ParserRuleContext {
		public List<EnumItemContext> enumItem() {
			return getRuleContexts(EnumItemContext.class);
		}
		public EnumItemContext enumItem(int i) {
			return getRuleContext(EnumItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public EnumItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumItemsContext enumItems() throws RecognitionException {
		EnumItemsContext _localctx = new EnumItemsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_enumItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			enumItem();
			setState(1074);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1070);
					match(COMMA);
					setState(1071);
					enumItem();
					}
					} 
				}
				setState(1076);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			}
			setState(1078);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1077);
				match(COMMA);
				}
			}

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

	public static class EnumItemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public EnumItemTupleContext enumItemTuple() {
			return getRuleContext(EnumItemTupleContext.class,0);
		}
		public EnumItemStructContext enumItemStruct() {
			return getRuleContext(EnumItemStructContext.class,0);
		}
		public EnumItemDiscriminantContext enumItemDiscriminant() {
			return getRuleContext(EnumItemDiscriminantContext.class,0);
		}
		public EnumItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumItemContext enumItem() throws RecognitionException {
		EnumItemContext _localctx = new EnumItemContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_enumItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1080);
				outerAttribute();
				}
				}
				setState(1085);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(1086);
				visibility();
				}
			}

			setState(1089);
			identifier();
			setState(1093);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1090);
				enumItemTuple();
				}
				break;
			case LCURLYBRACE:
				{
				setState(1091);
				enumItemStruct();
				}
				break;
			case EQ:
				{
				setState(1092);
				enumItemDiscriminant();
				}
				break;
			case COMMA:
			case RCURLYBRACE:
				break;
			default:
				break;
			}
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

	public static class EnumItemTupleContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TupleFieldsContext tupleFields() {
			return getRuleContext(TupleFieldsContext.class,0);
		}
		public EnumItemTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumItemTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumItemTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumItemTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumItemTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumItemTupleContext enumItemTuple() throws RecognitionException {
		EnumItemTupleContext _localctx = new EnumItemTupleContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_enumItemTuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			match(LPAREN);
			setState(1097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CONST) | (1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IMPL) | (1L << KW_PUB) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_UNSAFE) | (1L << KW_ASYNC) | (1L << KW_DYN) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LIFETIME_OR_LABEL - 81)) | (1L << (STAR - 81)) | (1L << (NOT - 81)) | (1L << (AND - 81)) | (1L << (LT - 81)) | (1L << (UNDERSCORE - 81)) | (1L << (PATHSEP - 81)) | (1L << (POUND - 81)) | (1L << (QUESTION - 81)) | (1L << (LSQUAREBRACKET - 81)) | (1L << (LPAREN - 81)))) != 0)) {
				{
				setState(1096);
				tupleFields();
				}
			}

			setState(1099);
			match(RPAREN);
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

	public static class EnumItemStructContext extends ParserRuleContext {
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public StructFieldsContext structFields() {
			return getRuleContext(StructFieldsContext.class,0);
		}
		public EnumItemStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumItemStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumItemStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumItemStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumItemStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumItemStructContext enumItemStruct() throws RecognitionException {
		EnumItemStructContext _localctx = new EnumItemStructContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_enumItemStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			match(LCURLYBRACE);
			setState(1103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_PUB) | (1L << KW_MACRORULES) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || _la==POUND) {
				{
				setState(1102);
				structFields();
				}
			}

			setState(1105);
			match(RCURLYBRACE);
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

	public static class EnumItemDiscriminantContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnumItemDiscriminantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumItemDiscriminant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumItemDiscriminant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumItemDiscriminant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumItemDiscriminant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumItemDiscriminantContext enumItemDiscriminant() throws RecognitionException {
		EnumItemDiscriminantContext _localctx = new EnumItemDiscriminantContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_enumItemDiscriminant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(EQ);
			setState(1108);
			expression(0);
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

	public static class Union_Context extends ParserRuleContext {
		public TerminalNode KW_UNION() { return getToken(RustParser.KW_UNION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public StructFieldsContext structFields() {
			return getRuleContext(StructFieldsContext.class,0);
		}
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public GenericsContext generics() {
			return getRuleContext(GenericsContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public Union_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterUnion_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitUnion_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitUnion_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_Context union_() throws RecognitionException {
		Union_Context _localctx = new Union_Context(_ctx, getState());
		enterRule(_localctx, 128, RULE_union_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			match(KW_UNION);
			setState(1111);
			identifier();
			setState(1113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1112);
				generics();
				}
			}

			setState(1116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1115);
				whereClause();
				}
			}

			setState(1118);
			match(LCURLYBRACE);
			setState(1119);
			structFields();
			setState(1120);
			match(RCURLYBRACE);
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

	public static class ConstantItemContext extends ParserRuleContext {
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public ConstantItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterConstantItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitConstantItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitConstantItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantItemContext constantItem() throws RecognitionException {
		ConstantItemContext _localctx = new ConstantItemContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_constantItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			match(KW_CONST);
			setState(1125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_MACRORULES:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
				{
				setState(1123);
				identifier();
				}
				break;
			case UNDERSCORE:
				{
				setState(1124);
				match(UNDERSCORE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1127);
			match(COLON);
			setState(1128);
			type();
			setState(1129);
			match(EQ);
			setState(1130);
			expression(0);
			setState(1131);
			match(SEMI);
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

	public static class StaticItemContext extends ParserRuleContext {
		public TerminalNode KW_STATIC() { return getToken(RustParser.KW_STATIC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public StaticItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStaticItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStaticItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStaticItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticItemContext staticItem() throws RecognitionException {
		StaticItemContext _localctx = new StaticItemContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_staticItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			match(KW_STATIC);
			setState(1135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUT) {
				{
				setState(1134);
				match(KW_MUT);
				}
			}

			setState(1137);
			identifier();
			setState(1138);
			match(COLON);
			setState(1139);
			type();
			setState(1140);
			match(EQ);
			setState(1141);
			expression(0);
			setState(1142);
			match(SEMI);
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

	public static class TraitContext extends ParserRuleContext {
		public TerminalNode KW_TRAIT() { return getToken(RustParser.KW_TRAIT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public GenericsContext generics() {
			return getRuleContext(GenericsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public List<TraitItemContext> traitItem() {
			return getRuleContexts(TraitItemContext.class);
		}
		public TraitItemContext traitItem(int i) {
			return getRuleContext(TraitItemContext.class,i);
		}
		public TypeParamBoundsContext typeParamBounds() {
			return getRuleContext(TypeParamBoundsContext.class,0);
		}
		public TraitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTrait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTrait(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTrait(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitContext trait() throws RecognitionException {
		TraitContext _localctx = new TraitContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_trait);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE) {
				{
				setState(1144);
				match(KW_UNSAFE);
				}
			}

			setState(1147);
			match(KW_TRAIT);
			setState(1148);
			identifier();
			setState(1150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1149);
				generics();
				}
			}

			setState(1156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1152);
				match(COLON);
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_FOR) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LIFETIME_OR_LABEL - 81)) | (1L << (PATHSEP - 81)) | (1L << (QUESTION - 81)) | (1L << (LPAREN - 81)))) != 0)) {
					{
					setState(1153);
					typeParamBounds();
					}
				}

				}
			}

			setState(1159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1158);
				whereClause();
				}
			}

			setState(1161);
			match(LCURLYBRACE);
			setState(1165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1162);
					innerAttribute();
					}
					} 
				}
				setState(1167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			}
			setState(1171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CONST) | (1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_PUB) | (1L << KW_SELFVALUE) | (1L << KW_SUPER) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || _la==PATHSEP || _la==POUND) {
				{
				{
				setState(1168);
				traitItem();
				}
				}
				setState(1173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1174);
			match(RCURLYBRACE);
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

	public static class TraitItemContext extends ParserRuleContext {
		public TraitFuncContext traitFunc() {
			return getRuleContext(TraitFuncContext.class,0);
		}
		public TraitMethodContext traitMethod() {
			return getRuleContext(TraitMethodContext.class,0);
		}
		public TraitConstContext traitConst() {
			return getRuleContext(TraitConstContext.class,0);
		}
		public TraitTypeContext traitType() {
			return getRuleContext(TraitTypeContext.class,0);
		}
		public MacroInvocationSemiContext macroInvocationSemi() {
			return getRuleContext(MacroInvocationSemiContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TraitItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTraitItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTraitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTraitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitItemContext traitItem() throws RecognitionException {
		TraitItemContext _localctx = new TraitItemContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_traitItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1176);
				outerAttribute();
				}
				}
				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(1182);
				visibility();
				}
			}

			setState(1190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1185);
				traitFunc();
				}
				break;
			case 2:
				{
				setState(1186);
				traitMethod();
				}
				break;
			case 3:
				{
				setState(1187);
				traitConst();
				}
				break;
			case 4:
				{
				setState(1188);
				traitType();
				}
				break;
			case 5:
				{
				setState(1189);
				macroInvocationSemi();
				}
				break;
			}
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

	public static class TraitFuncContext extends ParserRuleContext {
		public TraitFunctionDeclContext traitFunctionDecl() {
			return getRuleContext(TraitFunctionDeclContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public TraitFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTraitFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTraitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTraitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitFuncContext traitFunc() throws RecognitionException {
		TraitFuncContext _localctx = new TraitFuncContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_traitFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			traitFunctionDecl();
			setState(1195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				{
				setState(1193);
				match(SEMI);
				}
				break;
			case LCURLYBRACE:
				{
				setState(1194);
				blockExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class TraitMethodContext extends ParserRuleContext {
		public TraitMethodDeclContext traitMethodDecl() {
			return getRuleContext(TraitMethodDeclContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public TraitMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTraitMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTraitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTraitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitMethodContext traitMethod() throws RecognitionException {
		TraitMethodContext _localctx = new TraitMethodContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_traitMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			traitMethodDecl();
			setState(1200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				{
				setState(1198);
				match(SEMI);
				}
				break;
			case LCURLYBRACE:
				{
				setState(1199);
				blockExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class TraitFunctionDeclContext extends ParserRuleContext {
		public FunctionQualifiersContext functionQualifiers() {
			return getRuleContext(FunctionQualifiersContext.class,0);
		}
		public TerminalNode KW_FN() { return getToken(RustParser.KW_FN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public GenericsContext generics() {
			return getRuleContext(GenericsContext.class,0);
		}
		public TraitFunctionParametersContext traitFunctionParameters() {
			return getRuleContext(TraitFunctionParametersContext.class,0);
		}
		public FunctionReturnTypeContext functionReturnType() {
			return getRuleContext(FunctionReturnTypeContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TraitFunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitFunctionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTraitFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTraitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTraitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitFunctionDeclContext traitFunctionDecl() throws RecognitionException {
		TraitFunctionDeclContext _localctx = new TraitFunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_traitFunctionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			functionQualifiers();
			setState(1203);
			match(KW_FN);
			setState(1204);
			identifier();
			setState(1206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1205);
				generics();
				}
			}

			setState(1208);
			match(LPAREN);
			setState(1210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CONST) | (1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IMPL) | (1L << KW_MUT) | (1L << KW_REF) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_UNSAFE) | (1L << KW_ASYNC) | (1L << KW_DYN) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (ANDAND - 69)) | (1L << (LT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOTDOT - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (QUESTION - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
				{
				setState(1209);
				traitFunctionParameters();
				}
			}

			setState(1212);
			match(RPAREN);
			setState(1214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(1213);
				functionReturnType();
				}
			}

			setState(1217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1216);
				whereClause();
				}
			}

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

	public static class TraitMethodDeclContext extends ParserRuleContext {
		public FunctionQualifiersContext functionQualifiers() {
			return getRuleContext(FunctionQualifiersContext.class,0);
		}
		public TerminalNode KW_FN() { return getToken(RustParser.KW_FN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public SelfParamContext selfParam() {
			return getRuleContext(SelfParamContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public GenericsContext generics() {
			return getRuleContext(GenericsContext.class,0);
		}
		public List<TraitFunctionParamContext> traitFunctionParam() {
			return getRuleContexts(TraitFunctionParamContext.class);
		}
		public TraitFunctionParamContext traitFunctionParam(int i) {
			return getRuleContext(TraitFunctionParamContext.class,i);
		}
		public FunctionReturnTypeContext functionReturnType() {
			return getRuleContext(FunctionReturnTypeContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TraitMethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitMethodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTraitMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTraitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTraitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitMethodDeclContext traitMethodDecl() throws RecognitionException {
		TraitMethodDeclContext _localctx = new TraitMethodDeclContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_traitMethodDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			functionQualifiers();
			setState(1220);
			match(KW_FN);
			setState(1221);
			identifier();
			setState(1223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1222);
				generics();
				}
			}

			setState(1225);
			match(LPAREN);
			setState(1226);
			selfParam();
			setState(1231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1227);
					match(COMMA);
					setState(1228);
					traitFunctionParam();
					}
					} 
				}
				setState(1233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			setState(1234);
			match(COMMA);
			setState(1235);
			match(RPAREN);
			setState(1237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(1236);
				functionReturnType();
				}
			}

			setState(1240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1239);
				whereClause();
				}
			}

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

	public static class TraitFunctionParametersContext extends ParserRuleContext {
		public List<TraitFunctionParamContext> traitFunctionParam() {
			return getRuleContexts(TraitFunctionParamContext.class);
		}
		public TraitFunctionParamContext traitFunctionParam(int i) {
			return getRuleContext(TraitFunctionParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TraitFunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitFunctionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTraitFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTraitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTraitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitFunctionParametersContext traitFunctionParameters() throws RecognitionException {
		TraitFunctionParametersContext _localctx = new TraitFunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_traitFunctionParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			traitFunctionParam();
			setState(1247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1243);
					match(COMMA);
					setState(1244);
					traitFunctionParam();
					}
					} 
				}
				setState(1249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			}
			setState(1251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1250);
				match(COMMA);
				}
			}

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

	public static class TraitFunctionParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public TraitFunctionParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitFunctionParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTraitFunctionParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTraitFunctionParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTraitFunctionParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitFunctionParamContext traitFunctionParam() throws RecognitionException {
		TraitFunctionParamContext _localctx = new TraitFunctionParamContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_traitFunctionParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1253);
				outerAttribute();
				}
				}
				setState(1258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1259);
				pattern();
				setState(1260);
				match(COLON);
				}
				break;
			}
			setState(1264);
			type();
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

	public static class TraitConstContext extends ParserRuleContext {
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TraitConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTraitConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTraitConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTraitConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitConstContext traitConst() throws RecognitionException {
		TraitConstContext _localctx = new TraitConstContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_traitConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			match(KW_CONST);
			setState(1267);
			identifier();
			setState(1268);
			match(COLON);
			setState(1269);
			type();
			setState(1272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1270);
				match(EQ);
				setState(1271);
				expression(0);
				}
			}

			setState(1274);
			match(SEMI);
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

	public static class TraitTypeContext extends ParserRuleContext {
		public TerminalNode KW_TYPE() { return getToken(RustParser.KW_TYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public TypeParamBoundsContext typeParamBounds() {
			return getRuleContext(TypeParamBoundsContext.class,0);
		}
		public TraitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTraitType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTraitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTraitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitTypeContext traitType() throws RecognitionException {
		TraitTypeContext _localctx = new TraitTypeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_traitType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			match(KW_TYPE);
			setState(1277);
			identifier();
			setState(1282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1278);
				match(COLON);
				setState(1280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_FOR) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LIFETIME_OR_LABEL - 81)) | (1L << (PATHSEP - 81)) | (1L << (QUESTION - 81)) | (1L << (LPAREN - 81)))) != 0)) {
					{
					setState(1279);
					typeParamBounds();
					}
				}

				}
			}

			setState(1284);
			match(SEMI);
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

	public static class ImplementationContext extends ParserRuleContext {
		public InherentImplContext inherentImpl() {
			return getRuleContext(InherentImplContext.class,0);
		}
		public TraitImplContext traitImpl() {
			return getRuleContext(TraitImplContext.class,0);
		}
		public ImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterImplementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitImplementation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitImplementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementationContext implementation() throws RecognitionException {
		ImplementationContext _localctx = new ImplementationContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_implementation);
		try {
			setState(1288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1286);
				inherentImpl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1287);
				traitImpl();
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

	public static class InherentImplContext extends ParserRuleContext {
		public TerminalNode KW_IMPL() { return getToken(RustParser.KW_IMPL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public GenericsContext generics() {
			return getRuleContext(GenericsContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public List<InherentImplItemContext> inherentImplItem() {
			return getRuleContexts(InherentImplItemContext.class);
		}
		public InherentImplItemContext inherentImplItem(int i) {
			return getRuleContext(InherentImplItemContext.class,i);
		}
		public InherentImplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherentImpl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterInherentImpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitInherentImpl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitInherentImpl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InherentImplContext inherentImpl() throws RecognitionException {
		InherentImplContext _localctx = new InherentImplContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_inherentImpl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			match(KW_IMPL);
			setState(1292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1291);
				generics();
				}
				break;
			}
			setState(1294);
			type();
			setState(1296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1295);
				whereClause();
				}
			}

			setState(1298);
			match(LCURLYBRACE);
			setState(1302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1299);
					innerAttribute();
					}
					} 
				}
				setState(1304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			setState(1308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CONST) | (1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_PUB) | (1L << KW_SELFVALUE) | (1L << KW_SUPER) | (1L << KW_UNSAFE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || _la==PATHSEP || _la==POUND) {
				{
				{
				setState(1305);
				inherentImplItem();
				}
				}
				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1311);
			match(RCURLYBRACE);
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

	public static class InherentImplItemContext extends ParserRuleContext {
		public MacroInvocationSemiContext macroInvocationSemi() {
			return getRuleContext(MacroInvocationSemiContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public ConstantItemContext constantItem() {
			return getRuleContext(ConstantItemContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public InherentImplItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherentImplItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterInherentImplItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitInherentImplItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitInherentImplItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InherentImplItemContext inherentImplItem() throws RecognitionException {
		InherentImplItemContext _localctx = new InherentImplItemContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_inherentImplItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1313);
				outerAttribute();
				}
				}
				setState(1318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_SUPER:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case PATHSEP:
				{
				setState(1319);
				macroInvocationSemi();
				}
				break;
			case KW_CONST:
			case KW_EXTERN:
			case KW_FN:
			case KW_PUB:
			case KW_UNSAFE:
			case KW_ASYNC:
				{
				setState(1321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_PUB) {
					{
					setState(1320);
					visibility();
					}
				}

				setState(1326);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1323);
					constantItem();
					}
					break;
				case 2:
					{
					setState(1324);
					function();
					}
					break;
				case 3:
					{
					setState(1325);
					method();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class TraitImplContext extends ParserRuleContext {
		public TerminalNode KW_IMPL() { return getToken(RustParser.KW_IMPL, 0); }
		public TypePathContext typePath() {
			return getRuleContext(TypePathContext.class,0);
		}
		public TerminalNode KW_FOR() { return getToken(RustParser.KW_FOR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public GenericsContext generics() {
			return getRuleContext(GenericsContext.class,0);
		}
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public List<TraitImplItemContext> traitImplItem() {
			return getRuleContexts(TraitImplItemContext.class);
		}
		public TraitImplItemContext traitImplItem(int i) {
			return getRuleContext(TraitImplItemContext.class,i);
		}
		public TraitImplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitImpl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTraitImpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTraitImpl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTraitImpl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitImplContext traitImpl() throws RecognitionException {
		TraitImplContext _localctx = new TraitImplContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_traitImpl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE) {
				{
				setState(1330);
				match(KW_UNSAFE);
				}
			}

			setState(1333);
			match(KW_IMPL);
			setState(1335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1334);
				generics();
				}
			}

			setState(1338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1337);
				match(NOT);
				}
			}

			setState(1340);
			typePath();
			setState(1341);
			match(KW_FOR);
			setState(1342);
			type();
			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1343);
				whereClause();
				}
			}

			setState(1346);
			match(LCURLYBRACE);
			setState(1350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1347);
					innerAttribute();
					}
					} 
				}
				setState(1352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			}
			setState(1356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CONST) | (1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_PUB) | (1L << KW_SELFVALUE) | (1L << KW_SUPER) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || _la==PATHSEP || _la==POUND) {
				{
				{
				setState(1353);
				traitImplItem();
				}
				}
				setState(1358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1359);
			match(RCURLYBRACE);
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

	public static class TraitImplItemContext extends ParserRuleContext {
		public MacroInvocationSemiContext macroInvocationSemi() {
			return getRuleContext(MacroInvocationSemiContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public TypeAliasContext typeAlias() {
			return getRuleContext(TypeAliasContext.class,0);
		}
		public ConstantItemContext constantItem() {
			return getRuleContext(ConstantItemContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TraitImplItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitImplItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTraitImplItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTraitImplItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTraitImplItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitImplItemContext traitImplItem() throws RecognitionException {
		TraitImplItemContext _localctx = new TraitImplItemContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_traitImplItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1361);
				outerAttribute();
				}
				}
				setState(1366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_SUPER:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case PATHSEP:
				{
				setState(1367);
				macroInvocationSemi();
				}
				break;
			case KW_CONST:
			case KW_EXTERN:
			case KW_FN:
			case KW_PUB:
			case KW_TYPE:
			case KW_UNSAFE:
			case KW_ASYNC:
				{
				setState(1369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_PUB) {
					{
					setState(1368);
					visibility();
					}
				}

				setState(1375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1371);
					typeAlias();
					}
					break;
				case 2:
					{
					setState(1372);
					constantItem();
					}
					break;
				case 3:
					{
					setState(1373);
					method();
					}
					break;
				case 4:
					{
					setState(1374);
					function();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class ExternBlockContext extends ParserRuleContext {
		public TerminalNode KW_EXTERN() { return getToken(RustParser.KW_EXTERN, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public AbiContext abi() {
			return getRuleContext(AbiContext.class,0);
		}
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public List<ExternalItemContext> externalItem() {
			return getRuleContexts(ExternalItemContext.class);
		}
		public ExternalItemContext externalItem(int i) {
			return getRuleContext(ExternalItemContext.class,i);
		}
		public ExternBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterExternBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitExternBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitExternBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternBlockContext externBlock() throws RecognitionException {
		ExternBlockContext _localctx = new ExternBlockContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_externBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			match(KW_EXTERN);
			setState(1381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL || _la==RAW_STRING_LITERAL) {
				{
				setState(1380);
				abi();
				}
			}

			setState(1383);
			match(LCURLYBRACE);
			setState(1387);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1384);
					innerAttribute();
					}
					} 
				}
				setState(1389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			}
			setState(1393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_FN) | (1L << KW_PUB) | (1L << KW_SELFVALUE) | (1L << KW_STATIC) | (1L << KW_SUPER) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || _la==PATHSEP || _la==POUND) {
				{
				{
				setState(1390);
				externalItem();
				}
				}
				setState(1395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1396);
			match(RCURLYBRACE);
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

	public static class ExternalItemContext extends ParserRuleContext {
		public MacroInvocationSemiContext macroInvocationSemi() {
			return getRuleContext(MacroInvocationSemiContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public ExternalStaticItemContext externalStaticItem() {
			return getRuleContext(ExternalStaticItemContext.class,0);
		}
		public ExternalFunctionItemContext externalFunctionItem() {
			return getRuleContext(ExternalFunctionItemContext.class,0);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public ExternalItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterExternalItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitExternalItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitExternalItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalItemContext externalItem() throws RecognitionException {
		ExternalItemContext _localctx = new ExternalItemContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_externalItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1398);
				outerAttribute();
				}
				}
				setState(1403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_SUPER:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case PATHSEP:
				{
				setState(1404);
				macroInvocationSemi();
				}
				break;
			case KW_FN:
			case KW_PUB:
			case KW_STATIC:
				{
				setState(1406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_PUB) {
					{
					setState(1405);
					visibility();
					}
				}

				setState(1410);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_STATIC:
					{
					setState(1408);
					externalStaticItem();
					}
					break;
				case KW_FN:
					{
					setState(1409);
					externalFunctionItem();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class ExternalStaticItemContext extends ParserRuleContext {
		public TerminalNode KW_STATIC() { return getToken(RustParser.KW_STATIC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public ExternalStaticItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalStaticItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterExternalStaticItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitExternalStaticItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitExternalStaticItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalStaticItemContext externalStaticItem() throws RecognitionException {
		ExternalStaticItemContext _localctx = new ExternalStaticItemContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_externalStaticItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			match(KW_STATIC);
			setState(1416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUT) {
				{
				setState(1415);
				match(KW_MUT);
				}
			}

			setState(1418);
			identifier();
			setState(1419);
			match(COLON);
			setState(1420);
			type();
			setState(1421);
			match(SEMI);
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

	public static class ExternalFunctionItemContext extends ParserRuleContext {
		public TerminalNode KW_FN() { return getToken(RustParser.KW_FN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public GenericsContext generics() {
			return getRuleContext(GenericsContext.class,0);
		}
		public NamedFunctionParametersContext namedFunctionParameters() {
			return getRuleContext(NamedFunctionParametersContext.class,0);
		}
		public NamedFunctionParametersWithVariadicsContext namedFunctionParametersWithVariadics() {
			return getRuleContext(NamedFunctionParametersWithVariadicsContext.class,0);
		}
		public FunctionReturnTypeContext functionReturnType() {
			return getRuleContext(FunctionReturnTypeContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ExternalFunctionItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalFunctionItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterExternalFunctionItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitExternalFunctionItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitExternalFunctionItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalFunctionItemContext externalFunctionItem() throws RecognitionException {
		ExternalFunctionItemContext _localctx = new ExternalFunctionItemContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_externalFunctionItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			match(KW_FN);
			setState(1424);
			identifier();
			setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1425);
				generics();
				}
			}

			setState(1428);
			match(LPAREN);
			setState(1431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1429);
				namedFunctionParameters();
				}
				break;
			case 2:
				{
				setState(1430);
				namedFunctionParametersWithVariadics();
				}
				break;
			}
			setState(1433);
			match(RPAREN);
			setState(1435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(1434);
				functionReturnType();
				}
			}

			setState(1438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1437);
				whereClause();
				}
			}

			setState(1440);
			match(SEMI);
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

	public static class NamedFunctionParametersContext extends ParserRuleContext {
		public List<NamedFunctionParamContext> namedFunctionParam() {
			return getRuleContexts(NamedFunctionParamContext.class);
		}
		public NamedFunctionParamContext namedFunctionParam(int i) {
			return getRuleContext(NamedFunctionParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public NamedFunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedFunctionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterNamedFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitNamedFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitNamedFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedFunctionParametersContext namedFunctionParameters() throws RecognitionException {
		NamedFunctionParametersContext _localctx = new NamedFunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_namedFunctionParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			namedFunctionParam();
			setState(1447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1443);
					match(COMMA);
					setState(1444);
					namedFunctionParam();
					}
					} 
				}
				setState(1449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			}
			setState(1451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1450);
				match(COMMA);
				}
			}

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

	public static class NamedFunctionParamContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public NamedFunctionParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedFunctionParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterNamedFunctionParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitNamedFunctionParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitNamedFunctionParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedFunctionParamContext namedFunctionParam() throws RecognitionException {
		NamedFunctionParamContext _localctx = new NamedFunctionParamContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_namedFunctionParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1453);
				outerAttribute();
				}
				}
				setState(1458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_MACRORULES:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
				{
				setState(1459);
				identifier();
				}
				break;
			case UNDERSCORE:
				{
				setState(1460);
				match(UNDERSCORE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1463);
			match(COLON);
			setState(1464);
			type();
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

	public static class NamedFunctionParametersWithVariadicsContext extends ParserRuleContext {
		public List<NamedFunctionParamContext> namedFunctionParam() {
			return getRuleContexts(NamedFunctionParamContext.class);
		}
		public NamedFunctionParamContext namedFunctionParam(int i) {
			return getRuleContext(NamedFunctionParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TerminalNode DOTDOTDOT() { return getToken(RustParser.DOTDOTDOT, 0); }
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public NamedFunctionParametersWithVariadicsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedFunctionParametersWithVariadics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterNamedFunctionParametersWithVariadics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitNamedFunctionParametersWithVariadics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitNamedFunctionParametersWithVariadics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedFunctionParametersWithVariadicsContext namedFunctionParametersWithVariadics() throws RecognitionException {
		NamedFunctionParametersWithVariadicsContext _localctx = new NamedFunctionParametersWithVariadicsContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_namedFunctionParametersWithVariadics);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1471);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1466);
					namedFunctionParam();
					setState(1467);
					match(COMMA);
					}
					} 
				}
				setState(1473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			}
			setState(1474);
			namedFunctionParam();
			setState(1475);
			match(COMMA);
			setState(1479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1476);
				outerAttribute();
				}
				}
				setState(1481);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1482);
			match(DOTDOTDOT);
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

	public static class GenericsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(RustParser.LT, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public TerminalNode GT() { return getToken(RustParser.GT, 0); }
		public GenericsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenerics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenerics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenerics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericsContext generics() throws RecognitionException {
		GenericsContext _localctx = new GenericsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_generics);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
			match(LT);
			setState(1485);
			genericParams();
			setState(1486);
			match(GT);
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

	public static class GenericParamsContext extends ParserRuleContext {
		public LifetimeParamsContext lifetimeParams() {
			return getRuleContext(LifetimeParamsContext.class,0);
		}
		public TypeParamsContext typeParams() {
			return getRuleContext(TypeParamsContext.class,0);
		}
		public List<LifetimeParamContext> lifetimeParam() {
			return getRuleContexts(LifetimeParamContext.class);
		}
		public LifetimeParamContext lifetimeParam(int i) {
			return getRuleContext(LifetimeParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public GenericParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericParamsContext genericParams() throws RecognitionException {
		GenericParamsContext _localctx = new GenericParamsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_genericParams);
		try {
			int _alt;
			setState(1498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1488);
				lifetimeParams();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1489);
						lifetimeParam();
						setState(1490);
						match(COMMA);
						}
						} 
					}
					setState(1496);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				}
				setState(1497);
				typeParams();
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

	public static class LifetimeParamsContext extends ParserRuleContext {
		public List<LifetimeParamContext> lifetimeParam() {
			return getRuleContexts(LifetimeParamContext.class);
		}
		public LifetimeParamContext lifetimeParam(int i) {
			return getRuleContext(LifetimeParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public LifetimeParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lifetimeParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLifetimeParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLifetimeParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLifetimeParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LifetimeParamsContext lifetimeParams() throws RecognitionException {
		LifetimeParamsContext _localctx = new LifetimeParamsContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_lifetimeParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1500);
					lifetimeParam();
					setState(1501);
					match(COMMA);
					}
					} 
				}
				setState(1507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			}
			setState(1509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIFETIME_OR_LABEL || _la==POUND) {
				{
				setState(1508);
				lifetimeParam();
				}
			}

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

	public static class LifetimeParamContext extends ParserRuleContext {
		public TerminalNode LIFETIME_OR_LABEL() { return getToken(RustParser.LIFETIME_OR_LABEL, 0); }
		public OuterAttributeContext outerAttribute() {
			return getRuleContext(OuterAttributeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public LifetimeBoundsContext lifetimeBounds() {
			return getRuleContext(LifetimeBoundsContext.class,0);
		}
		public LifetimeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lifetimeParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLifetimeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLifetimeParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLifetimeParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LifetimeParamContext lifetimeParam() throws RecognitionException {
		LifetimeParamContext _localctx = new LifetimeParamContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_lifetimeParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POUND) {
				{
				setState(1511);
				outerAttribute();
				}
			}

			setState(1514);
			match(LIFETIME_OR_LABEL);
			setState(1517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1515);
				match(COLON);
				setState(1516);
				lifetimeBounds();
				}
			}

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

	public static class TypeParamsContext extends ParserRuleContext {
		public List<TypeParamContext> typeParam() {
			return getRuleContexts(TypeParamContext.class);
		}
		public TypeParamContext typeParam(int i) {
			return getRuleContext(TypeParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TypeParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypeParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypeParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypeParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamsContext typeParams() throws RecognitionException {
		TypeParamsContext _localctx = new TypeParamsContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_typeParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1519);
					typeParam();
					setState(1520);
					match(COMMA);
					}
					} 
				}
				setState(1526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			}
			setState(1528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_MACRORULES) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || _la==POUND) {
				{
				setState(1527);
				typeParam();
				}
			}

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

	public static class TypeParamContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OuterAttributeContext outerAttribute() {
			return getRuleContext(OuterAttributeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParamBoundsContext typeParamBounds() {
			return getRuleContext(TypeParamBoundsContext.class,0);
		}
		public TypeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypeParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypeParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamContext typeParam() throws RecognitionException {
		TypeParamContext _localctx = new TypeParamContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_typeParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POUND) {
				{
				setState(1530);
				outerAttribute();
				}
			}

			setState(1533);
			identifier();
			setState(1538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1534);
				match(COLON);
				setState(1536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_FOR) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LIFETIME_OR_LABEL - 81)) | (1L << (PATHSEP - 81)) | (1L << (QUESTION - 81)) | (1L << (LPAREN - 81)))) != 0)) {
					{
					setState(1535);
					typeParamBounds();
					}
				}

				}
			}

			setState(1542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1540);
				match(EQ);
				setState(1541);
				type();
				}
			}

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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode KW_WHERE() { return getToken(RustParser.KW_WHERE, 0); }
		public List<WhereClauseItemContext> whereClauseItem() {
			return getRuleContexts(WhereClauseItemContext.class);
		}
		public WhereClauseItemContext whereClauseItem(int i) {
			return getRuleContext(WhereClauseItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_whereClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
			match(KW_WHERE);
			setState(1550);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1545);
					whereClauseItem();
					setState(1546);
					match(COMMA);
					}
					} 
				}
				setState(1552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			}
			setState(1554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CONST) | (1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IMPL) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_UNSAFE) | (1L << KW_ASYNC) | (1L << KW_DYN) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LIFETIME_OR_LABEL - 81)) | (1L << (STAR - 81)) | (1L << (NOT - 81)) | (1L << (AND - 81)) | (1L << (LT - 81)) | (1L << (UNDERSCORE - 81)) | (1L << (PATHSEP - 81)) | (1L << (QUESTION - 81)) | (1L << (LSQUAREBRACKET - 81)) | (1L << (LPAREN - 81)))) != 0)) {
				{
				setState(1553);
				whereClauseItem();
				}
			}

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

	public static class WhereClauseItemContext extends ParserRuleContext {
		public LifetimeWhereClauseItemContext lifetimeWhereClauseItem() {
			return getRuleContext(LifetimeWhereClauseItemContext.class,0);
		}
		public TypeBoundWhereClauseItemContext typeBoundWhereClauseItem() {
			return getRuleContext(TypeBoundWhereClauseItemContext.class,0);
		}
		public WhereClauseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClauseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterWhereClauseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitWhereClauseItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitWhereClauseItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseItemContext whereClauseItem() throws RecognitionException {
		WhereClauseItemContext _localctx = new WhereClauseItemContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_whereClauseItem);
		try {
			setState(1558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1556);
				lifetimeWhereClauseItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1557);
				typeBoundWhereClauseItem();
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

	public static class LifetimeWhereClauseItemContext extends ParserRuleContext {
		public LifetimeContext lifetime() {
			return getRuleContext(LifetimeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public LifetimeBoundsContext lifetimeBounds() {
			return getRuleContext(LifetimeBoundsContext.class,0);
		}
		public LifetimeWhereClauseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lifetimeWhereClauseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLifetimeWhereClauseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLifetimeWhereClauseItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLifetimeWhereClauseItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LifetimeWhereClauseItemContext lifetimeWhereClauseItem() throws RecognitionException {
		LifetimeWhereClauseItemContext _localctx = new LifetimeWhereClauseItemContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_lifetimeWhereClauseItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1560);
			lifetime();
			setState(1561);
			match(COLON);
			setState(1562);
			lifetimeBounds();
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

	public static class TypeBoundWhereClauseItemContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public ForLifetimesContext forLifetimes() {
			return getRuleContext(ForLifetimesContext.class,0);
		}
		public TypeParamBoundsContext typeParamBounds() {
			return getRuleContext(TypeParamBoundsContext.class,0);
		}
		public TypeBoundWhereClauseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBoundWhereClauseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypeBoundWhereClauseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypeBoundWhereClauseItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypeBoundWhereClauseItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundWhereClauseItemContext typeBoundWhereClauseItem() throws RecognitionException {
		TypeBoundWhereClauseItemContext _localctx = new TypeBoundWhereClauseItemContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_typeBoundWhereClauseItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1564);
				forLifetimes();
				}
				break;
			}
			setState(1567);
			type();
			setState(1568);
			match(COLON);
			setState(1570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_FOR) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LIFETIME_OR_LABEL - 81)) | (1L << (PATHSEP - 81)) | (1L << (QUESTION - 81)) | (1L << (LPAREN - 81)))) != 0)) {
				{
				setState(1569);
				typeParamBounds();
				}
			}

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

	public static class ForLifetimesContext extends ParserRuleContext {
		public TerminalNode KW_FOR() { return getToken(RustParser.KW_FOR, 0); }
		public TerminalNode LT() { return getToken(RustParser.LT, 0); }
		public LifetimeParamsContext lifetimeParams() {
			return getRuleContext(LifetimeParamsContext.class,0);
		}
		public TerminalNode GT() { return getToken(RustParser.GT, 0); }
		public ForLifetimesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLifetimes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterForLifetimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitForLifetimes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitForLifetimes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLifetimesContext forLifetimes() throws RecognitionException {
		ForLifetimesContext _localctx = new ForLifetimesContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_forLifetimes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			match(KW_FOR);
			setState(1573);
			match(LT);
			setState(1574);
			lifetimeParams();
			setState(1575);
			match(GT);
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

	public static class MethodContext extends ParserRuleContext {
		public FunctionQualifiersContext functionQualifiers() {
			return getRuleContext(FunctionQualifiersContext.class,0);
		}
		public TerminalNode KW_FN() { return getToken(RustParser.KW_FN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public SelfParamContext selfParam() {
			return getRuleContext(SelfParamContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public GenericsContext generics() {
			return getRuleContext(GenericsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public List<FunctionParamContext> functionParam() {
			return getRuleContexts(FunctionParamContext.class);
		}
		public FunctionParamContext functionParam(int i) {
			return getRuleContext(FunctionParamContext.class,i);
		}
		public FunctionReturnTypeContext functionReturnType() {
			return getRuleContext(FunctionReturnTypeContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_method);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			functionQualifiers();
			setState(1578);
			match(KW_FN);
			setState(1579);
			identifier();
			setState(1581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1580);
				generics();
				}
			}

			setState(1583);
			match(LPAREN);
			setState(1584);
			selfParam();
			setState(1589);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1585);
					match(COMMA);
					setState(1586);
					functionParam();
					}
					} 
				}
				setState(1591);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			}
			setState(1593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1592);
				match(COMMA);
				}
			}

			setState(1595);
			match(RPAREN);
			setState(1597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(1596);
				functionReturnType();
				}
			}

			setState(1600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1599);
				whereClause();
				}
			}

			setState(1602);
			blockExpression();
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

	public static class SelfParamContext extends ParserRuleContext {
		public ShorthandSelfContext shorthandSelf() {
			return getRuleContext(ShorthandSelfContext.class,0);
		}
		public TypedSelfContext typedSelf() {
			return getRuleContext(TypedSelfContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public SelfParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterSelfParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitSelfParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitSelfParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfParamContext selfParam() throws RecognitionException {
		SelfParamContext _localctx = new SelfParamContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_selfParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1604);
				outerAttribute();
				}
				}
				setState(1609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1610);
				shorthandSelf();
				}
				break;
			case 2:
				{
				setState(1611);
				typedSelf();
				}
				break;
			}
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

	public static class ShorthandSelfContext extends ParserRuleContext {
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public TerminalNode AND() { return getToken(RustParser.AND, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public LifetimeContext lifetime() {
			return getRuleContext(LifetimeContext.class,0);
		}
		public ShorthandSelfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shorthandSelf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterShorthandSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitShorthandSelf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitShorthandSelf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShorthandSelfContext shorthandSelf() throws RecognitionException {
		ShorthandSelfContext _localctx = new ShorthandSelfContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_shorthandSelf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1614);
				match(AND);
				setState(1616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (KW_STATICLIFETIME - 53)) | (1L << (KW_UNDERLINELIFETIME - 53)) | (1L << (LIFETIME_OR_LABEL - 53)))) != 0)) {
					{
					setState(1615);
					lifetime();
					}
				}

				}
			}

			setState(1621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUT) {
				{
				setState(1620);
				match(KW_MUT);
				}
			}

			setState(1623);
			match(KW_SELFVALUE);
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

	public static class TypedSelfContext extends ParserRuleContext {
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public TypedSelfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedSelf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypedSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypedSelf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypedSelf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedSelfContext typedSelf() throws RecognitionException {
		TypedSelfContext _localctx = new TypedSelfContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_typedSelf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUT) {
				{
				setState(1625);
				match(KW_MUT);
				}
			}

			setState(1628);
			match(KW_SELFVALUE);
			setState(1629);
			match(COLON);
			setState(1630);
			type();
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

	public static class VisibilityContext extends ParserRuleContext {
		public TerminalNode KW_PUB() { return getToken(RustParser.KW_PUB, 0); }
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TerminalNode KW_CRATE() { return getToken(RustParser.KW_CRATE, 0); }
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public TerminalNode KW_SUPER() { return getToken(RustParser.KW_SUPER, 0); }
		public TerminalNode KW_IN() { return getToken(RustParser.KW_IN, 0); }
		public SimplePathContext simplePath() {
			return getRuleContext(SimplePathContext.class,0);
		}
		public VisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterVisibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitVisibility(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitVisibility(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisibilityContext visibility() throws RecognitionException {
		VisibilityContext _localctx = new VisibilityContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_visibility);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1632);
			match(KW_PUB);
			setState(1642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1633);
				match(LPAREN);
				setState(1639);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_CRATE:
					{
					setState(1634);
					match(KW_CRATE);
					}
					break;
				case KW_SELFVALUE:
					{
					setState(1635);
					match(KW_SELFVALUE);
					}
					break;
				case KW_SUPER:
					{
					setState(1636);
					match(KW_SUPER);
					}
					break;
				case KW_IN:
					{
					setState(1637);
					match(KW_IN);
					setState(1638);
					simplePath();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1641);
				match(RPAREN);
				}
				break;
			}
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

	public static class InnerAttributeContext extends ParserRuleContext {
		public TerminalNode POUND() { return getToken(RustParser.POUND, 0); }
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public InnerAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterInnerAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitInnerAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitInnerAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerAttributeContext innerAttribute() throws RecognitionException {
		InnerAttributeContext _localctx = new InnerAttributeContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_innerAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1644);
			match(POUND);
			setState(1645);
			match(NOT);
			setState(1646);
			match(LSQUAREBRACKET);
			setState(1647);
			attr();
			setState(1648);
			match(RSQUAREBRACKET);
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

	public static class OuterAttributeContext extends ParserRuleContext {
		public TerminalNode POUND() { return getToken(RustParser.POUND, 0); }
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public OuterAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outerAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterOuterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitOuterAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitOuterAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OuterAttributeContext outerAttribute() throws RecognitionException {
		OuterAttributeContext _localctx = new OuterAttributeContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_outerAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1650);
			match(POUND);
			setState(1651);
			match(LSQUAREBRACKET);
			setState(1652);
			attr();
			setState(1653);
			match(RSQUAREBRACKET);
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

	public static class AttrContext extends ParserRuleContext {
		public SimplePathContext simplePath() {
			return getRuleContext(SimplePathContext.class,0);
		}
		public AttrInputContext attrInput() {
			return getRuleContext(AttrInputContext.class,0);
		}
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_attr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			simplePath();
			setState(1657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (EQ - 103)) | (1L << (LCURLYBRACE - 103)) | (1L << (LSQUAREBRACKET - 103)) | (1L << (LPAREN - 103)))) != 0)) {
				{
				setState(1656);
				attrInput();
				}
			}

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

	public static class AttrInputContext extends ParserRuleContext {
		public DelimTokenTreeContext delimTokenTree() {
			return getRuleContext(DelimTokenTreeContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public LiteralExpressionContext literalExpression() {
			return getRuleContext(LiteralExpressionContext.class,0);
		}
		public AttrInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAttrInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAttrInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAttrInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrInputContext attrInput() throws RecognitionException {
		AttrInputContext _localctx = new AttrInputContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_attrInput);
		try {
			setState(1662);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLYBRACE:
			case LSQUAREBRACKET:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1659);
				delimTokenTree();
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(1660);
				match(EQ);
				setState(1661);
				literalExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public LetStatementContext letStatement() {
			return getRuleContext(LetStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public MacroInvocationSemiContext macroInvocationSemi() {
			return getRuleContext(MacroInvocationSemiContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_statement);
		try {
			setState(1669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1664);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1665);
				item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1666);
				letStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1667);
				expressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1668);
				macroInvocationSemi();
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

	public static class LetStatementContext extends ParserRuleContext {
		public TerminalNode KW_LET() { return getToken(RustParser.KW_LET, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetStatementContext letStatement() throws RecognitionException {
		LetStatementContext _localctx = new LetStatementContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_letStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1671);
				outerAttribute();
				}
				}
				setState(1676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1677);
			match(KW_LET);
			setState(1678);
			pattern();
			setState(1681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1679);
				match(COLON);
				setState(1680);
				type();
				}
			}

			setState(1685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1683);
				match(EQ);
				setState(1684);
				expression(0);
				}
			}

			setState(1687);
			match(SEMI);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public ExpressionWithBlockContext expressionWithBlock() {
			return getRuleContext(ExpressionWithBlockContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_expressionStatement);
		try {
			setState(1696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1689);
				expression(0);
				setState(1690);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1692);
				expressionWithBlock();
				setState(1694);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1693);
					match(SEMI);
					}
					break;
				}
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeCastExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(RustParser.KW_AS, 0); }
		public TypeNoBoundsContext typeNoBounds() {
			return getRuleContext(TypeNoBoundsContext.class,0);
		}
		public TypeCastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypeCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypeCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypeCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PathExpression_Context extends ExpressionContext {
		public PathExpressionContext pathExpression() {
			return getRuleContext(PathExpressionContext.class,0);
		}
		public PathExpression_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPathExpression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPathExpression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPathExpression_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TupleExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public TupleElementsContext tupleElements() {
			return getRuleContext(TupleElementsContext.class,0);
		}
		public TupleExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public IndexExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitIndexExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RangeExpressionContext extends ExpressionContext {
		public TerminalNode DOTDOT() { return getToken(RustParser.DOTDOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOTDOTEQ() { return getToken(RustParser.DOTDOTEQ, 0); }
		public RangeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitRangeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitRangeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MacroInvocationAsExpressionContext extends ExpressionContext {
		public MacroInvocationContext macroInvocation() {
			return getRuleContext(MacroInvocationContext.class,0);
		}
		public MacroInvocationAsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroInvocationAsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroInvocationAsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroInvocationAsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnExpressionContext extends ExpressionContext {
		public TerminalNode KW_RETURN() { return getToken(RustParser.KW_RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterReturnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitReturnExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitReturnExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AwaitExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RustParser.DOT, 0); }
		public TerminalNode KW_AWAIT() { return getToken(RustParser.KW_AWAIT, 0); }
		public AwaitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAwaitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAwaitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAwaitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ErrorPropagationExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(RustParser.QUESTION, 0); }
		public ErrorPropagationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterErrorPropagationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitErrorPropagationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitErrorPropagationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueExpressionContext extends ExpressionContext {
		public TerminalNode KW_CONTINUE() { return getToken(RustParser.KW_CONTINUE, 0); }
		public TerminalNode LIFETIME_OR_LABEL() { return getToken(RustParser.LIFETIME_OR_LABEL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ContinueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterContinueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitContinueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitContinueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public AssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RustParser.DOT, 0); }
		public PathExprSegmentContext pathExprSegment() {
			return getRuleContext(PathExprSegmentContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public CallParamsContext callParams() {
			return getRuleContext(CallParamsContext.class,0);
		}
		public MethodCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMethodCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMethodCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMethodCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExpression_Context extends ExpressionContext {
		public LiteralExpressionContext literalExpression() {
			return getRuleContext(LiteralExpressionContext.class,0);
		}
		public LiteralExpression_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLiteralExpression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLiteralExpression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLiteralExpression_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructExpression_Context extends ExpressionContext {
		public StructExpressionContext structExpression() {
			return getRuleContext(StructExpressionContext.class,0);
		}
		public StructExpression_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructExpression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructExpression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructExpression_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TupleIndexingExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RustParser.DOT, 0); }
		public TupleIndexContext tupleIndex() {
			return getRuleContext(TupleIndexContext.class,0);
		}
		public TupleIndexingExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleIndexingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleIndexingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleIndexingExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegationExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(RustParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public NegationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterNegationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitNegationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitNegationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public CallParamsContext callParams() {
			return getRuleContext(CallParamsContext.class,0);
		}
		public CallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LazyBooleanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ANDAND() { return getToken(RustParser.ANDAND, 0); }
		public TerminalNode OROR() { return getToken(RustParser.OROR, 0); }
		public LazyBooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLazyBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLazyBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLazyBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceExpressionContext extends ExpressionContext {
		public TerminalNode STAR() { return getToken(RustParser.STAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DereferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterDereferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitDereferenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitDereferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionWithBlock_Context extends ExpressionContext {
		public ExpressionWithBlockContext expressionWithBlock() {
			return getRuleContext(ExpressionWithBlockContext.class,0);
		}
		public ExpressionWithBlock_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterExpressionWithBlock_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitExpressionWithBlock_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitExpressionWithBlock_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupedExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public GroupedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGroupedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGroupedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGroupedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakExpressionContext extends ExpressionContext {
		public TerminalNode KW_BREAK() { return getToken(RustParser.KW_BREAK, 0); }
		public TerminalNode LIFETIME_OR_LABEL() { return getToken(RustParser.LIFETIME_OR_LABEL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BreakExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterBreakExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitBreakExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitBreakExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticOrLogicalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(RustParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(RustParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(RustParser.PERCENT, 0); }
		public TerminalNode PLUS() { return getToken(RustParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RustParser.MINUS, 0); }
		public ShlContext shl() {
			return getRuleContext(ShlContext.class,0);
		}
		public ShrContext shr() {
			return getRuleContext(ShrContext.class,0);
		}
		public TerminalNode AND() { return getToken(RustParser.AND, 0); }
		public TerminalNode CARET() { return getToken(RustParser.CARET, 0); }
		public TerminalNode OR() { return getToken(RustParser.OR, 0); }
		public ArithmeticOrLogicalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterArithmeticOrLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitArithmeticOrLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitArithmeticOrLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RustParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FieldExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterFieldExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitFieldExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitFieldExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EnumerationVariantExpression_Context extends ExpressionContext {
		public EnumerationVariantExpressionContext enumerationVariantExpression() {
			return getRuleContext(EnumerationVariantExpressionContext.class,0);
		}
		public EnumerationVariantExpression_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumerationVariantExpression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumerationVariantExpression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumerationVariantExpression_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttributedExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public AttributedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAttributedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAttributedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAttributedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BorrowExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(RustParser.AND, 0); }
		public TerminalNode ANDAND() { return getToken(RustParser.ANDAND, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public BorrowExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterBorrowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitBorrowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitBorrowExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompoundAssignmentExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompoundAssignOperatorContext compoundAssignOperator() {
			return getRuleContext(CompoundAssignOperatorContext.class,0);
		}
		public CompoundAssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterCompoundAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitCompoundAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitCompoundAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClosureExpression_Context extends ExpressionContext {
		public ClosureExpressionContext closureExpression() {
			return getRuleContext(ClosureExpressionContext.class,0);
		}
		public ClosureExpression_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterClosureExpression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitClosureExpression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitClosureExpression_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExpressionContext extends ExpressionContext {
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public ArrayElementsContext arrayElements() {
			return getRuleContext(ArrayElementsContext.class,0);
		}
		public ArrayExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 224;
		enterRecursionRule(_localctx, 224, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				_localctx = new AttributedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1700); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1699);
						outerAttribute();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1702); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1704);
				expression(40);
				}
				break;
			case 2:
				{
				_localctx = new LiteralExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1706);
				literalExpression();
				}
				break;
			case 3:
				{
				_localctx = new PathExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1707);
				pathExpression();
				}
				break;
			case 4:
				{
				_localctx = new BorrowExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1708);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==ANDAND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_MUT) {
					{
					setState(1709);
					match(KW_MUT);
					}
				}

				setState(1712);
				expression(30);
				}
				break;
			case 5:
				{
				_localctx = new DereferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1713);
				match(STAR);
				setState(1714);
				expression(29);
				}
				break;
			case 6:
				{
				_localctx = new NegationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1715);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1716);
				expression(28);
				}
				break;
			case 7:
				{
				_localctx = new RangeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1717);
				match(DOTDOT);
				setState(1719);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1718);
					expression(0);
					}
					break;
				}
				}
				break;
			case 8:
				{
				_localctx = new RangeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1721);
				match(DOTDOTEQ);
				setState(1722);
				expression(15);
				}
				break;
			case 9:
				{
				_localctx = new ContinueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1723);
				match(KW_CONTINUE);
				setState(1725);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1724);
					match(LIFETIME_OR_LABEL);
					}
					break;
				}
				setState(1728);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1727);
					expression(0);
					}
					break;
				}
				}
				break;
			case 10:
				{
				_localctx = new BreakExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1730);
				match(KW_BREAK);
				setState(1732);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					{
					setState(1731);
					match(LIFETIME_OR_LABEL);
					}
					break;
				}
				setState(1735);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1734);
					expression(0);
					}
					break;
				}
				}
				break;
			case 11:
				{
				_localctx = new ReturnExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1737);
				match(KW_RETURN);
				setState(1739);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1738);
					expression(0);
					}
					break;
				}
				}
				break;
			case 12:
				{
				_localctx = new GroupedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1741);
				match(LPAREN);
				setState(1745);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1742);
						innerAttribute();
						}
						} 
					}
					setState(1747);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
				}
				setState(1748);
				expression(0);
				setState(1749);
				match(RPAREN);
				}
				break;
			case 13:
				{
				_localctx = new ArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1751);
				match(LSQUAREBRACKET);
				setState(1755);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1752);
						innerAttribute();
						}
						} 
					}
					setState(1757);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
				}
				setState(1759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOVE) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_UNSAFE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (LT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					setState(1758);
					arrayElements();
					}
				}

				setState(1761);
				match(RSQUAREBRACKET);
				}
				break;
			case 14:
				{
				_localctx = new TupleExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1762);
				match(LPAREN);
				setState(1766);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1763);
						innerAttribute();
						}
						} 
					}
					setState(1768);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
				}
				setState(1770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOVE) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_UNSAFE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (LT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					setState(1769);
					tupleElements();
					}
				}

				setState(1772);
				match(RPAREN);
				}
				break;
			case 15:
				{
				_localctx = new StructExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1773);
				structExpression();
				}
				break;
			case 16:
				{
				_localctx = new EnumerationVariantExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1774);
				enumerationVariantExpression();
				}
				break;
			case 17:
				{
				_localctx = new ClosureExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1775);
				closureExpression();
				}
				break;
			case 18:
				{
				_localctx = new ExpressionWithBlock_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1776);
				expressionWithBlock();
				}
				break;
			case 19:
				{
				_localctx = new MacroInvocationAsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1777);
				macroInvocation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1863);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1861);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1780);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1781);
						_la = _input.LA(1);
						if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STAR - 84)) | (1L << (SLASH - 84)) | (1L << (PERCENT - 84)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1782);
						expression(27);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1783);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1784);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1785);
						expression(26);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1786);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1789);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LT:
							{
							setState(1787);
							shl();
							}
							break;
						case GT:
							{
							setState(1788);
							shr();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1791);
						expression(25);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1793);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1794);
						match(AND);
						setState(1795);
						expression(24);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1796);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1797);
						match(CARET);
						setState(1798);
						expression(23);
						}
						break;
					case 6:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1799);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1800);
						match(OR);
						setState(1801);
						expression(22);
						}
						break;
					case 7:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1802);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1803);
						comparisonOperator();
						setState(1804);
						expression(21);
						}
						break;
					case 8:
						{
						_localctx = new LazyBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1806);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1807);
						match(ANDAND);
						setState(1808);
						expression(20);
						}
						break;
					case 9:
						{
						_localctx = new LazyBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1809);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1810);
						match(OROR);
						setState(1811);
						expression(19);
						}
						break;
					case 10:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1812);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1813);
						match(DOTDOTEQ);
						setState(1814);
						expression(15);
						}
						break;
					case 11:
						{
						_localctx = new AssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1815);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1816);
						match(EQ);
						setState(1817);
						expression(14);
						}
						break;
					case 12:
						{
						_localctx = new CompoundAssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1818);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1819);
						compoundAssignOperator();
						setState(1820);
						expression(13);
						}
						break;
					case 13:
						{
						_localctx = new MethodCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1822);
						if (!(precpred(_ctx, 37))) throw new FailedPredicateException(this, "precpred(_ctx, 37)");
						setState(1823);
						match(DOT);
						setState(1824);
						pathExprSegment();
						setState(1825);
						match(LPAREN);
						setState(1827);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOVE) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_UNSAFE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (LT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
							{
							setState(1826);
							callParams();
							}
						}

						setState(1829);
						match(RPAREN);
						}
						break;
					case 14:
						{
						_localctx = new FieldExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1831);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(1832);
						match(DOT);
						setState(1833);
						identifier();
						}
						break;
					case 15:
						{
						_localctx = new TupleIndexingExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1834);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(1835);
						match(DOT);
						setState(1836);
						tupleIndex();
						}
						break;
					case 16:
						{
						_localctx = new AwaitExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1837);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(1838);
						match(DOT);
						setState(1839);
						match(KW_AWAIT);
						}
						break;
					case 17:
						{
						_localctx = new CallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1840);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(1841);
						match(LPAREN);
						setState(1843);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOVE) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_UNSAFE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (LT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
							{
							setState(1842);
							callParams();
							}
						}

						setState(1845);
						match(RPAREN);
						}
						break;
					case 18:
						{
						_localctx = new IndexExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1846);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(1847);
						match(LSQUAREBRACKET);
						setState(1848);
						expression(0);
						setState(1849);
						match(RSQUAREBRACKET);
						}
						break;
					case 19:
						{
						_localctx = new ErrorPropagationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1851);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(1852);
						match(QUESTION);
						}
						break;
					case 20:
						{
						_localctx = new TypeCastExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1853);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1854);
						match(KW_AS);
						setState(1855);
						typeNoBounds();
						}
						break;
					case 21:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1856);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1857);
						match(DOTDOT);
						setState(1859);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
						case 1:
							{
							setState(1858);
							expression(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1865);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQEQ() { return getToken(RustParser.EQEQ, 0); }
		public TerminalNode NE() { return getToken(RustParser.NE, 0); }
		public TerminalNode GT() { return getToken(RustParser.GT, 0); }
		public TerminalNode LT() { return getToken(RustParser.LT, 0); }
		public TerminalNode GE() { return getToken(RustParser.GE, 0); }
		public TerminalNode LE() { return getToken(RustParser.LE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (EQEQ - 104)) | (1L << (NE - 104)) | (1L << (GT - 104)) | (1L << (LT - 104)) | (1L << (GE - 104)) | (1L << (LE - 104)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class CompoundAssignOperatorContext extends ParserRuleContext {
		public TerminalNode PLUSEQ() { return getToken(RustParser.PLUSEQ, 0); }
		public TerminalNode MINUSEQ() { return getToken(RustParser.MINUSEQ, 0); }
		public TerminalNode STAREQ() { return getToken(RustParser.STAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(RustParser.SLASHEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(RustParser.PERCENTEQ, 0); }
		public TerminalNode ANDEQ() { return getToken(RustParser.ANDEQ, 0); }
		public TerminalNode OREQ() { return getToken(RustParser.OREQ, 0); }
		public TerminalNode CARETEQ() { return getToken(RustParser.CARETEQ, 0); }
		public TerminalNode SHLEQ() { return getToken(RustParser.SHLEQ, 0); }
		public TerminalNode SHREQ() { return getToken(RustParser.SHREQ, 0); }
		public CompoundAssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundAssignOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterCompoundAssignOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitCompoundAssignOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitCompoundAssignOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundAssignOperatorContext compoundAssignOperator() throws RecognitionException {
		CompoundAssignOperatorContext _localctx = new CompoundAssignOperatorContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_compoundAssignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1868);
			_la = _input.LA(1);
			if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (PLUSEQ - 93)) | (1L << (MINUSEQ - 93)) | (1L << (STAREQ - 93)) | (1L << (SLASHEQ - 93)) | (1L << (PERCENTEQ - 93)) | (1L << (CARETEQ - 93)) | (1L << (ANDEQ - 93)) | (1L << (OREQ - 93)) | (1L << (SHLEQ - 93)) | (1L << (SHREQ - 93)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ExpressionWithBlockContext extends ParserRuleContext {
		public ExpressionWithBlockContext expressionWithBlock() {
			return getRuleContext(ExpressionWithBlockContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public AsyncBlockExpressionContext asyncBlockExpression() {
			return getRuleContext(AsyncBlockExpressionContext.class,0);
		}
		public UnsafeBlockExpressionContext unsafeBlockExpression() {
			return getRuleContext(UnsafeBlockExpressionContext.class,0);
		}
		public LoopExpressionContext loopExpression() {
			return getRuleContext(LoopExpressionContext.class,0);
		}
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public IfLetExpressionContext ifLetExpression() {
			return getRuleContext(IfLetExpressionContext.class,0);
		}
		public MatchExpressionContext matchExpression() {
			return getRuleContext(MatchExpressionContext.class,0);
		}
		public ExpressionWithBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionWithBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterExpressionWithBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitExpressionWithBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitExpressionWithBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionWithBlockContext expressionWithBlock() throws RecognitionException {
		ExpressionWithBlockContext _localctx = new ExpressionWithBlockContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_expressionWithBlock);
		try {
			int _alt;
			setState(1884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1871); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1870);
						outerAttribute();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1873); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1875);
				expressionWithBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1877);
				blockExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1878);
				asyncBlockExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1879);
				unsafeBlockExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1880);
				loopExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1881);
				ifExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1882);
				ifLetExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1883);
				matchExpression();
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

	public static class LiteralExpressionContext extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(RustParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(RustParser.STRING_LITERAL, 0); }
		public TerminalNode RAW_STRING_LITERAL() { return getToken(RustParser.RAW_STRING_LITERAL, 0); }
		public TerminalNode BYTE_LITERAL() { return getToken(RustParser.BYTE_LITERAL, 0); }
		public TerminalNode BYTE_STRING_LITERAL() { return getToken(RustParser.BYTE_STRING_LITERAL, 0); }
		public TerminalNode RAW_BYTE_STRING_LITERAL() { return getToken(RustParser.RAW_BYTE_STRING_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(RustParser.INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(RustParser.FLOAT_LITERAL, 0); }
		public TerminalNode KW_TRUE() { return getToken(RustParser.KW_TRUE, 0); }
		public TerminalNode KW_FALSE() { return getToken(RustParser.KW_FALSE, 0); }
		public LiteralExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralExpressionContext literalExpression() throws RecognitionException {
		LiteralExpressionContext _localctx = new LiteralExpressionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_literalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1886);
			_la = _input.LA(1);
			if ( !(_la==KW_FALSE || _la==KW_TRUE || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class PathExpressionContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public QualifiedPathInExpressionContext qualifiedPathInExpression() {
			return getRuleContext(QualifiedPathInExpressionContext.class,0);
		}
		public PathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPathExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPathExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathExpressionContext pathExpression() throws RecognitionException {
		PathExpressionContext _localctx = new PathExpressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_pathExpression);
		try {
			setState(1890);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case PATHSEP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1888);
				pathInExpression();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1889);
				qualifiedPathInExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BlockExpressionContext extends ParserRuleContext {
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterBlockExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitBlockExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitBlockExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockExpressionContext blockExpression() throws RecognitionException {
		BlockExpressionContext _localctx = new BlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_blockExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1892);
			match(LCURLYBRACE);
			setState(1896);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1893);
					innerAttribute();
					}
					} 
				}
				setState(1898);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			}
			setState(1900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_PUB) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_UNION) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (LT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (SEMI - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
				{
				setState(1899);
				statements();
				}
			}

			setState(1902);
			match(RCURLYBRACE);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_statements);
		int _la;
		try {
			int _alt;
			setState(1913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1905); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1904);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1907); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1910);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOVE) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_UNSAFE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (LT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					setState(1909);
					expression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1912);
				expression(0);
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

	public static class AsyncBlockExpressionContext extends ParserRuleContext {
		public TerminalNode KW_ASYNC() { return getToken(RustParser.KW_ASYNC, 0); }
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public TerminalNode KW_MOVE() { return getToken(RustParser.KW_MOVE, 0); }
		public AsyncBlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asyncBlockExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAsyncBlockExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAsyncBlockExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAsyncBlockExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsyncBlockExpressionContext asyncBlockExpression() throws RecognitionException {
		AsyncBlockExpressionContext _localctx = new AsyncBlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_asyncBlockExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1915);
			match(KW_ASYNC);
			setState(1917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MOVE) {
				{
				setState(1916);
				match(KW_MOVE);
				}
			}

			setState(1919);
			blockExpression();
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

	public static class UnsafeBlockExpressionContext extends ParserRuleContext {
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public UnsafeBlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsafeBlockExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterUnsafeBlockExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitUnsafeBlockExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitUnsafeBlockExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsafeBlockExpressionContext unsafeBlockExpression() throws RecognitionException {
		UnsafeBlockExpressionContext _localctx = new UnsafeBlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_unsafeBlockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1921);
			match(KW_UNSAFE);
			setState(1922);
			blockExpression();
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

	public static class ArrayElementsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public ArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterArrayElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitArrayElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitArrayElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementsContext arrayElements() throws RecognitionException {
		ArrayElementsContext _localctx = new ArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_arrayElements);
		int _la;
		try {
			int _alt;
			setState(1939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1924);
				expression(0);
				setState(1929);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1925);
						match(COMMA);
						setState(1926);
						expression(0);
						}
						} 
					}
					setState(1931);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
				}
				setState(1933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1932);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1935);
				expression(0);
				setState(1936);
				match(SEMI);
				setState(1937);
				expression(0);
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

	public static class TupleElementsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TupleElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleElementsContext tupleElements() throws RecognitionException {
		TupleElementsContext _localctx = new TupleElementsContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_tupleElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1944); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1941);
					expression(0);
					setState(1942);
					match(COMMA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1946); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOVE) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_UNSAFE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (LT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
				{
				setState(1948);
				expression(0);
				}
			}

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

	public static class TupleIndexContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(RustParser.INTEGER_LITERAL, 0); }
		public TupleIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleIndexContext tupleIndex() throws RecognitionException {
		TupleIndexContext _localctx = new TupleIndexContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_tupleIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1951);
			match(INTEGER_LITERAL);
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

	public static class StructExpressionContext extends ParserRuleContext {
		public StructExprStructContext structExprStruct() {
			return getRuleContext(StructExprStructContext.class,0);
		}
		public StructExprTupleContext structExprTuple() {
			return getRuleContext(StructExprTupleContext.class,0);
		}
		public StructExprUnitContext structExprUnit() {
			return getRuleContext(StructExprUnitContext.class,0);
		}
		public StructExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructExpressionContext structExpression() throws RecognitionException {
		StructExpressionContext _localctx = new StructExpressionContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_structExpression);
		try {
			setState(1956);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1953);
				structExprStruct();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1954);
				structExprTuple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1955);
				structExprUnit();
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

	public static class StructExprStructContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public StructExprFieldsContext structExprFields() {
			return getRuleContext(StructExprFieldsContext.class,0);
		}
		public StructBaseContext structBase() {
			return getRuleContext(StructBaseContext.class,0);
		}
		public StructExprStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structExprStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructExprStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructExprStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructExprStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructExprStructContext structExprStruct() throws RecognitionException {
		StructExprStructContext _localctx = new StructExprStructContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_structExprStruct);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1958);
			pathInExpression();
			setState(1959);
			match(LCURLYBRACE);
			setState(1963);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1960);
					innerAttribute();
					}
					} 
				}
				setState(1965);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			}
			setState(1968);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_MACRORULES:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case INTEGER_LITERAL:
			case POUND:
				{
				setState(1966);
				structExprFields();
				}
				break;
			case DOTDOT:
				{
				setState(1967);
				structBase();
				}
				break;
			case RCURLYBRACE:
				break;
			default:
				break;
			}
			setState(1970);
			match(RCURLYBRACE);
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

	public static class StructExprFieldsContext extends ParserRuleContext {
		public List<StructExprFieldContext> structExprField() {
			return getRuleContexts(StructExprFieldContext.class);
		}
		public StructExprFieldContext structExprField(int i) {
			return getRuleContext(StructExprFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public StructBaseContext structBase() {
			return getRuleContext(StructBaseContext.class,0);
		}
		public StructExprFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structExprFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructExprFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructExprFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructExprFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructExprFieldsContext structExprFields() throws RecognitionException {
		StructExprFieldsContext _localctx = new StructExprFieldsContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_structExprFields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1972);
			structExprField();
			setState(1977);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1973);
					match(COMMA);
					setState(1974);
					structExprField();
					}
					} 
				}
				setState(1979);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
			}
			setState(1985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				{
				setState(1980);
				match(COMMA);
				setState(1981);
				structBase();
				}
				break;
			case 2:
				{
				setState(1983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1982);
					match(COMMA);
					}
				}

				}
				break;
			}
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

	public static class StructExprFieldContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public TupleIndexContext tupleIndex() {
			return getRuleContext(TupleIndexContext.class,0);
		}
		public StructExprFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structExprField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructExprField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructExprField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructExprField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructExprFieldContext structExprField() throws RecognitionException {
		StructExprFieldContext _localctx = new StructExprFieldContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_structExprField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1987);
				outerAttribute();
				}
				}
				setState(1992);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				{
				setState(1993);
				identifier();
				}
				break;
			case 2:
				{
				setState(1996);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_MACRORULES:
				case NON_KEYWORD_IDENTIFIER:
				case RAW_IDENTIFIER:
					{
					setState(1994);
					identifier();
					}
					break;
				case INTEGER_LITERAL:
					{
					setState(1995);
					tupleIndex();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1998);
				match(COLON);
				setState(1999);
				expression(0);
				}
				break;
			}
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

	public static class StructBaseContext extends ParserRuleContext {
		public TerminalNode DOTDOT() { return getToken(RustParser.DOTDOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StructBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructBaseContext structBase() throws RecognitionException {
		StructBaseContext _localctx = new StructBaseContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_structBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2003);
			match(DOTDOT);
			setState(2004);
			expression(0);
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

	public static class StructExprTupleContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public StructExprTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structExprTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructExprTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructExprTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructExprTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructExprTupleContext structExprTuple() throws RecognitionException {
		StructExprTupleContext _localctx = new StructExprTupleContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_structExprTuple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2006);
			pathInExpression();
			setState(2007);
			match(LPAREN);
			setState(2011);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2008);
					innerAttribute();
					}
					} 
				}
				setState(2013);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			}
			setState(2025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOVE) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_UNSAFE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (LT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
				{
				setState(2014);
				expression(0);
				setState(2019);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2015);
						match(COMMA);
						setState(2016);
						expression(0);
						}
						} 
					}
					setState(2021);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
				}
				setState(2023);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2022);
					match(COMMA);
					}
				}

				}
			}

			setState(2027);
			match(RPAREN);
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

	public static class StructExprUnitContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public StructExprUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structExprUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructExprUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructExprUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructExprUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructExprUnitContext structExprUnit() throws RecognitionException {
		StructExprUnitContext _localctx = new StructExprUnitContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_structExprUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2029);
			pathInExpression();
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

	public static class EnumerationVariantExpressionContext extends ParserRuleContext {
		public EnumExprStructContext enumExprStruct() {
			return getRuleContext(EnumExprStructContext.class,0);
		}
		public EnumExprTupleContext enumExprTuple() {
			return getRuleContext(EnumExprTupleContext.class,0);
		}
		public EnumExprFieldlessContext enumExprFieldless() {
			return getRuleContext(EnumExprFieldlessContext.class,0);
		}
		public EnumerationVariantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationVariantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumerationVariantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumerationVariantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumerationVariantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationVariantExpressionContext enumerationVariantExpression() throws RecognitionException {
		EnumerationVariantExpressionContext _localctx = new EnumerationVariantExpressionContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_enumerationVariantExpression);
		try {
			setState(2034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2031);
				enumExprStruct();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2032);
				enumExprTuple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2033);
				enumExprFieldless();
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

	public static class EnumExprStructContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public EnumExprFieldsContext enumExprFields() {
			return getRuleContext(EnumExprFieldsContext.class,0);
		}
		public EnumExprStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumExprStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumExprStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumExprStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumExprStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumExprStructContext enumExprStruct() throws RecognitionException {
		EnumExprStructContext _localctx = new EnumExprStructContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_enumExprStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2036);
			pathInExpression();
			setState(2037);
			match(LCURLYBRACE);
			setState(2039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (KW_MACRORULES - 54)) | (1L << (NON_KEYWORD_IDENTIFIER - 54)) | (1L << (RAW_IDENTIFIER - 54)) | (1L << (INTEGER_LITERAL - 54)))) != 0)) {
				{
				setState(2038);
				enumExprFields();
				}
			}

			setState(2041);
			match(RCURLYBRACE);
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

	public static class EnumExprFieldsContext extends ParserRuleContext {
		public List<EnumExprFieldContext> enumExprField() {
			return getRuleContexts(EnumExprFieldContext.class);
		}
		public EnumExprFieldContext enumExprField(int i) {
			return getRuleContext(EnumExprFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public EnumExprFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumExprFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumExprFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumExprFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumExprFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumExprFieldsContext enumExprFields() throws RecognitionException {
		EnumExprFieldsContext _localctx = new EnumExprFieldsContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_enumExprFields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2043);
			enumExprField();
			setState(2048);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2044);
					match(COMMA);
					setState(2045);
					enumExprField();
					}
					} 
				}
				setState(2050);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
			}
			setState(2052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2051);
				match(COMMA);
				}
			}

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

	public static class EnumExprFieldContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TupleIndexContext tupleIndex() {
			return getRuleContext(TupleIndexContext.class,0);
		}
		public EnumExprFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumExprField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumExprField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumExprField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumExprField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumExprFieldContext enumExprField() throws RecognitionException {
		EnumExprFieldContext _localctx = new EnumExprFieldContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_enumExprField);
		try {
			setState(2062);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2054);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2057);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_MACRORULES:
				case NON_KEYWORD_IDENTIFIER:
				case RAW_IDENTIFIER:
					{
					setState(2055);
					identifier();
					}
					break;
				case INTEGER_LITERAL:
					{
					setState(2056);
					tupleIndex();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2059);
				match(COLON);
				setState(2060);
				expression(0);
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

	public static class EnumExprTupleContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public EnumExprTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumExprTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumExprTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumExprTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumExprTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumExprTupleContext enumExprTuple() throws RecognitionException {
		EnumExprTupleContext _localctx = new EnumExprTupleContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_enumExprTuple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2064);
			pathInExpression();
			setState(2065);
			match(LPAREN);
			setState(2077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOVE) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_UNSAFE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (LT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
				{
				setState(2066);
				expression(0);
				setState(2071);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2067);
						match(COMMA);
						setState(2068);
						expression(0);
						}
						} 
					}
					setState(2073);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
				}
				setState(2075);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2074);
					match(COMMA);
					}
				}

				}
			}

			setState(2079);
			match(RPAREN);
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

	public static class EnumExprFieldlessContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public EnumExprFieldlessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumExprFieldless; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumExprFieldless(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumExprFieldless(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumExprFieldless(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumExprFieldlessContext enumExprFieldless() throws RecognitionException {
		EnumExprFieldlessContext _localctx = new EnumExprFieldlessContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_enumExprFieldless);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2081);
			pathInExpression();
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

	public static class CallParamsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public CallParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterCallParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitCallParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitCallParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallParamsContext callParams() throws RecognitionException {
		CallParamsContext _localctx = new CallParamsContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_callParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2083);
			expression(0);
			setState(2088);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2084);
					match(COMMA);
					setState(2085);
					expression(0);
					}
					} 
				}
				setState(2090);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			}
			setState(2092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2091);
				match(COMMA);
				}
			}

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

	public static class ClosureExpressionContext extends ParserRuleContext {
		public TerminalNode OROR() { return getToken(RustParser.OROR, 0); }
		public List<TerminalNode> OR() { return getTokens(RustParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(RustParser.OR, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RARROW() { return getToken(RustParser.RARROW, 0); }
		public TypeNoBoundsContext typeNoBounds() {
			return getRuleContext(TypeNoBoundsContext.class,0);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public TerminalNode KW_MOVE() { return getToken(RustParser.KW_MOVE, 0); }
		public ClosureParametersContext closureParameters() {
			return getRuleContext(ClosureParametersContext.class,0);
		}
		public ClosureExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterClosureExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitClosureExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitClosureExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureExpressionContext closureExpression() throws RecognitionException {
		ClosureExpressionContext _localctx = new ClosureExpressionContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_closureExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2095);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MOVE) {
				{
				setState(2094);
				match(KW_MOVE);
				}
			}

			setState(2103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OROR:
				{
				setState(2097);
				match(OROR);
				}
				break;
			case OR:
				{
				setState(2098);
				match(OR);
				setState(2100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_MUT) | (1L << KW_REF) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (MINUS - 69)) | (1L << (AND - 69)) | (1L << (ANDAND - 69)) | (1L << (LT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOTDOT - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					setState(2099);
					closureParameters();
					}
				}

				setState(2102);
				match(OR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_BREAK:
			case KW_CONTINUE:
			case KW_CRATE:
			case KW_FALSE:
			case KW_FOR:
			case KW_IF:
			case KW_LOOP:
			case KW_MATCH:
			case KW_MOVE:
			case KW_RETURN:
			case KW_SELFVALUE:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_TRUE:
			case KW_UNSAFE:
			case KW_WHILE:
			case KW_ASYNC:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case RAW_STRING_LITERAL:
			case BYTE_LITERAL:
			case BYTE_STRING_LITERAL:
			case RAW_BYTE_STRING_LITERAL:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case LIFETIME_OR_LABEL:
			case MINUS:
			case STAR:
			case NOT:
			case AND:
			case OR:
			case ANDAND:
			case OROR:
			case LT:
			case DOTDOT:
			case DOTDOTEQ:
			case PATHSEP:
			case POUND:
			case LCURLYBRACE:
			case LSQUAREBRACKET:
			case LPAREN:
				{
				setState(2105);
				expression(0);
				}
				break;
			case RARROW:
				{
				setState(2106);
				match(RARROW);
				setState(2107);
				typeNoBounds();
				setState(2108);
				blockExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class ClosureParametersContext extends ParserRuleContext {
		public List<ClosureParamContext> closureParam() {
			return getRuleContexts(ClosureParamContext.class);
		}
		public ClosureParamContext closureParam(int i) {
			return getRuleContext(ClosureParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public ClosureParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterClosureParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitClosureParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitClosureParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureParametersContext closureParameters() throws RecognitionException {
		ClosureParametersContext _localctx = new ClosureParametersContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_closureParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2112);
			closureParam();
			setState(2117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,283,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2113);
					match(COMMA);
					setState(2114);
					closureParam();
					}
					} 
				}
				setState(2119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,283,_ctx);
			}
			setState(2121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2120);
				match(COMMA);
				}
			}

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

	public static class ClosureParamContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ClosureParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterClosureParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitClosureParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitClosureParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureParamContext closureParam() throws RecognitionException {
		ClosureParamContext _localctx = new ClosureParamContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_closureParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2123);
				outerAttribute();
				}
				}
				setState(2128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2129);
			pattern();
			setState(2132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2130);
				match(COLON);
				setState(2131);
				type();
				}
			}

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

	public static class LoopExpressionContext extends ParserRuleContext {
		public InfiniteLoopExpressionContext infiniteLoopExpression() {
			return getRuleContext(InfiniteLoopExpressionContext.class,0);
		}
		public PredicateLoopExpressionContext predicateLoopExpression() {
			return getRuleContext(PredicateLoopExpressionContext.class,0);
		}
		public PredicatePatternLoopExpressionContext predicatePatternLoopExpression() {
			return getRuleContext(PredicatePatternLoopExpressionContext.class,0);
		}
		public IteratorLoopExpressionContext iteratorLoopExpression() {
			return getRuleContext(IteratorLoopExpressionContext.class,0);
		}
		public LoopLabelContext loopLabel() {
			return getRuleContext(LoopLabelContext.class,0);
		}
		public LoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLoopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopExpressionContext loopExpression() throws RecognitionException {
		LoopExpressionContext _localctx = new LoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_loopExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIFETIME_OR_LABEL) {
				{
				setState(2134);
				loopLabel();
				}
			}

			setState(2141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				{
				setState(2137);
				infiniteLoopExpression();
				}
				break;
			case 2:
				{
				setState(2138);
				predicateLoopExpression();
				}
				break;
			case 3:
				{
				setState(2139);
				predicatePatternLoopExpression();
				}
				break;
			case 4:
				{
				setState(2140);
				iteratorLoopExpression();
				}
				break;
			}
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

	public static class InfiniteLoopExpressionContext extends ParserRuleContext {
		public TerminalNode KW_LOOP() { return getToken(RustParser.KW_LOOP, 0); }
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public InfiniteLoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infiniteLoopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterInfiniteLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitInfiniteLoopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitInfiniteLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfiniteLoopExpressionContext infiniteLoopExpression() throws RecognitionException {
		InfiniteLoopExpressionContext _localctx = new InfiniteLoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_infiniteLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2143);
			match(KW_LOOP);
			setState(2144);
			blockExpression();
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

	public static class PredicateLoopExpressionContext extends ParserRuleContext {
		public TerminalNode KW_WHILE() { return getToken(RustParser.KW_WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public PredicateLoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateLoopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPredicateLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPredicateLoopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPredicateLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateLoopExpressionContext predicateLoopExpression() throws RecognitionException {
		PredicateLoopExpressionContext _localctx = new PredicateLoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_predicateLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2146);
			match(KW_WHILE);
			setState(2147);
			expression(0);
			setState(2148);
			blockExpression();
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

	public static class PredicatePatternLoopExpressionContext extends ParserRuleContext {
		public TerminalNode KW_WHILE() { return getToken(RustParser.KW_WHILE, 0); }
		public TerminalNode KW_LET() { return getToken(RustParser.KW_LET, 0); }
		public MatchArmPatternsContext matchArmPatterns() {
			return getRuleContext(MatchArmPatternsContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public PredicatePatternLoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicatePatternLoopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPredicatePatternLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPredicatePatternLoopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPredicatePatternLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicatePatternLoopExpressionContext predicatePatternLoopExpression() throws RecognitionException {
		PredicatePatternLoopExpressionContext _localctx = new PredicatePatternLoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_predicatePatternLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2150);
			match(KW_WHILE);
			setState(2151);
			match(KW_LET);
			setState(2152);
			matchArmPatterns();
			setState(2153);
			match(EQ);
			setState(2154);
			expression(0);
			setState(2155);
			blockExpression();
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

	public static class IteratorLoopExpressionContext extends ParserRuleContext {
		public TerminalNode KW_FOR() { return getToken(RustParser.KW_FOR, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode KW_IN() { return getToken(RustParser.KW_IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public IteratorLoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteratorLoopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterIteratorLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitIteratorLoopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitIteratorLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IteratorLoopExpressionContext iteratorLoopExpression() throws RecognitionException {
		IteratorLoopExpressionContext _localctx = new IteratorLoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_iteratorLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2157);
			match(KW_FOR);
			setState(2158);
			pattern();
			setState(2159);
			match(KW_IN);
			setState(2160);
			expression(0);
			setState(2161);
			blockExpression();
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

	public static class LoopLabelContext extends ParserRuleContext {
		public TerminalNode LIFETIME_OR_LABEL() { return getToken(RustParser.LIFETIME_OR_LABEL, 0); }
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public LoopLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLoopLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLoopLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLoopLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopLabelContext loopLabel() throws RecognitionException {
		LoopLabelContext _localctx = new LoopLabelContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_loopLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2163);
			match(LIFETIME_OR_LABEL);
			setState(2164);
			match(COLON);
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

	public static class IfExpressionContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(RustParser.KW_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockExpressionContext> blockExpression() {
			return getRuleContexts(BlockExpressionContext.class);
		}
		public BlockExpressionContext blockExpression(int i) {
			return getRuleContext(BlockExpressionContext.class,i);
		}
		public TerminalNode KW_ELSE() { return getToken(RustParser.KW_ELSE, 0); }
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public IfLetExpressionContext ifLetExpression() {
			return getRuleContext(IfLetExpressionContext.class,0);
		}
		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitIfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitIfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_ifExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2166);
			match(KW_IF);
			setState(2167);
			expression(0);
			setState(2168);
			blockExpression();
			setState(2175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(2169);
				match(KW_ELSE);
				setState(2173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(2170);
					blockExpression();
					}
					break;
				case 2:
					{
					setState(2171);
					ifExpression();
					}
					break;
				case 3:
					{
					setState(2172);
					ifLetExpression();
					}
					break;
				}
				}
				break;
			}
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

	public static class IfLetExpressionContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(RustParser.KW_IF, 0); }
		public TerminalNode KW_LET() { return getToken(RustParser.KW_LET, 0); }
		public MatchArmPatternsContext matchArmPatterns() {
			return getRuleContext(MatchArmPatternsContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockExpressionContext> blockExpression() {
			return getRuleContexts(BlockExpressionContext.class);
		}
		public BlockExpressionContext blockExpression(int i) {
			return getRuleContext(BlockExpressionContext.class,i);
		}
		public TerminalNode KW_ELSE() { return getToken(RustParser.KW_ELSE, 0); }
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public IfLetExpressionContext ifLetExpression() {
			return getRuleContext(IfLetExpressionContext.class,0);
		}
		public IfLetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifLetExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterIfLetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitIfLetExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitIfLetExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfLetExpressionContext ifLetExpression() throws RecognitionException {
		IfLetExpressionContext _localctx = new IfLetExpressionContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_ifLetExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2177);
			match(KW_IF);
			setState(2178);
			match(KW_LET);
			setState(2179);
			matchArmPatterns();
			setState(2180);
			match(EQ);
			setState(2181);
			expression(0);
			setState(2182);
			blockExpression();
			setState(2189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				{
				setState(2183);
				match(KW_ELSE);
				setState(2187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2184);
					blockExpression();
					}
					break;
				case 2:
					{
					setState(2185);
					ifExpression();
					}
					break;
				case 3:
					{
					setState(2186);
					ifLetExpression();
					}
					break;
				}
				}
				break;
			}
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

	public static class MatchExpressionContext extends ParserRuleContext {
		public TerminalNode KW_MATCH() { return getToken(RustParser.KW_MATCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public MatchArmsContext matchArms() {
			return getRuleContext(MatchArmsContext.class,0);
		}
		public MatchExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMatchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMatchExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMatchExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchExpressionContext matchExpression() throws RecognitionException {
		MatchExpressionContext _localctx = new MatchExpressionContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_matchExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2191);
			match(KW_MATCH);
			setState(2192);
			expression(0);
			setState(2193);
			match(LCURLYBRACE);
			setState(2197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2194);
					innerAttribute();
					}
					} 
				}
				setState(2199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
			}
			setState(2201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_MUT) | (1L << KW_REF) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (MINUS - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (LT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOTDOT - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
				{
				setState(2200);
				matchArms();
				}
			}

			setState(2203);
			match(RCURLYBRACE);
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

	public static class MatchArmsContext extends ParserRuleContext {
		public List<MatchArmContext> matchArm() {
			return getRuleContexts(MatchArmContext.class);
		}
		public MatchArmContext matchArm(int i) {
			return getRuleContext(MatchArmContext.class,i);
		}
		public List<TerminalNode> FATARROW() { return getTokens(RustParser.FATARROW); }
		public TerminalNode FATARROW(int i) {
			return getToken(RustParser.FATARROW, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<MatchArmExpressionContext> matchArmExpression() {
			return getRuleContexts(MatchArmExpressionContext.class);
		}
		public MatchArmExpressionContext matchArmExpression(int i) {
			return getRuleContext(MatchArmExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(RustParser.COMMA, 0); }
		public MatchArmsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchArms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMatchArms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMatchArms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMatchArms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchArmsContext matchArms() throws RecognitionException {
		MatchArmsContext _localctx = new MatchArmsContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_matchArms);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2205);
					matchArm();
					setState(2206);
					match(FATARROW);
					setState(2207);
					matchArmExpression();
					}
					} 
				}
				setState(2213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
			}
			setState(2214);
			matchArm();
			setState(2215);
			match(FATARROW);
			setState(2216);
			expression(0);
			setState(2218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2217);
				match(COMMA);
				}
			}

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

	public static class MatchArmExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RustParser.COMMA, 0); }
		public ExpressionWithBlockContext expressionWithBlock() {
			return getRuleContext(ExpressionWithBlockContext.class,0);
		}
		public MatchArmExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchArmExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMatchArmExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMatchArmExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMatchArmExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchArmExpressionContext matchArmExpression() throws RecognitionException {
		MatchArmExpressionContext _localctx = new MatchArmExpressionContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_matchArmExpression);
		int _la;
		try {
			setState(2227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2220);
				expression(0);
				setState(2221);
				match(COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2223);
				expressionWithBlock();
				setState(2225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2224);
					match(COMMA);
					}
				}

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

	public static class MatchArmContext extends ParserRuleContext {
		public MatchArmPatternsContext matchArmPatterns() {
			return getRuleContext(MatchArmPatternsContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public MatchArmGuardContext matchArmGuard() {
			return getRuleContext(MatchArmGuardContext.class,0);
		}
		public MatchArmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchArm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMatchArm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMatchArm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMatchArm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchArmContext matchArm() throws RecognitionException {
		MatchArmContext _localctx = new MatchArmContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_matchArm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2229);
				outerAttribute();
				}
				}
				setState(2234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2235);
			matchArmPatterns();
			setState(2237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(2236);
				matchArmGuard();
				}
			}

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

	public static class MatchArmPatternsContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(RustParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(RustParser.OR, i);
		}
		public MatchArmPatternsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchArmPatterns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMatchArmPatterns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMatchArmPatterns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMatchArmPatterns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchArmPatternsContext matchArmPatterns() throws RecognitionException {
		MatchArmPatternsContext _localctx = new MatchArmPatternsContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_matchArmPatterns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(2239);
				match(OR);
				}
			}

			setState(2242);
			pattern();
			setState(2247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(2243);
				match(OR);
				setState(2244);
				pattern();
				}
				}
				setState(2249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class MatchArmGuardContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(RustParser.KW_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MatchArmGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchArmGuard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMatchArmGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMatchArmGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMatchArmGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchArmGuardContext matchArmGuard() throws RecognitionException {
		MatchArmGuardContext _localctx = new MatchArmGuardContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_matchArmGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2250);
			match(KW_IF);
			setState(2251);
			expression(0);
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

	public static class PatternContext extends ParserRuleContext {
		public PatternWithoutRangeContext patternWithoutRange() {
			return getRuleContext(PatternWithoutRangeContext.class,0);
		}
		public RangePatternContext rangePattern() {
			return getRuleContext(RangePatternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_pattern);
		try {
			setState(2255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2253);
				patternWithoutRange();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2254);
				rangePattern();
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

	public static class PatternWithoutRangeContext extends ParserRuleContext {
		public LiteralPatternContext literalPattern() {
			return getRuleContext(LiteralPatternContext.class,0);
		}
		public IdentifierPatternContext identifierPattern() {
			return getRuleContext(IdentifierPatternContext.class,0);
		}
		public WildcardPatternContext wildcardPattern() {
			return getRuleContext(WildcardPatternContext.class,0);
		}
		public RestPatternContext restPattern() {
			return getRuleContext(RestPatternContext.class,0);
		}
		public ObsoleteRangePatternContext obsoleteRangePattern() {
			return getRuleContext(ObsoleteRangePatternContext.class,0);
		}
		public ReferencePatternContext referencePattern() {
			return getRuleContext(ReferencePatternContext.class,0);
		}
		public StructPatternContext structPattern() {
			return getRuleContext(StructPatternContext.class,0);
		}
		public TupleStructPatternContext tupleStructPattern() {
			return getRuleContext(TupleStructPatternContext.class,0);
		}
		public TuplePatternContext tuplePattern() {
			return getRuleContext(TuplePatternContext.class,0);
		}
		public GroupedPatternContext groupedPattern() {
			return getRuleContext(GroupedPatternContext.class,0);
		}
		public SlicePatternContext slicePattern() {
			return getRuleContext(SlicePatternContext.class,0);
		}
		public PathPatternContext pathPattern() {
			return getRuleContext(PathPatternContext.class,0);
		}
		public MacroInvocationContext macroInvocation() {
			return getRuleContext(MacroInvocationContext.class,0);
		}
		public PatternWithoutRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternWithoutRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPatternWithoutRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPatternWithoutRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPatternWithoutRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternWithoutRangeContext patternWithoutRange() throws RecognitionException {
		PatternWithoutRangeContext _localctx = new PatternWithoutRangeContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_patternWithoutRange);
		try {
			setState(2270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2257);
				literalPattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2258);
				identifierPattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2259);
				wildcardPattern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2260);
				restPattern();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2261);
				obsoleteRangePattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2262);
				referencePattern();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2263);
				structPattern();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2264);
				tupleStructPattern();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2265);
				tuplePattern();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2266);
				groupedPattern();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2267);
				slicePattern();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2268);
				pathPattern();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2269);
				macroInvocation();
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

	public static class LiteralPatternContext extends ParserRuleContext {
		public TerminalNode KW_TRUE() { return getToken(RustParser.KW_TRUE, 0); }
		public TerminalNode KW_FALSE() { return getToken(RustParser.KW_FALSE, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(RustParser.CHAR_LITERAL, 0); }
		public TerminalNode BYTE_LITERAL() { return getToken(RustParser.BYTE_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(RustParser.STRING_LITERAL, 0); }
		public TerminalNode RAW_STRING_LITERAL() { return getToken(RustParser.RAW_STRING_LITERAL, 0); }
		public TerminalNode BYTE_STRING_LITERAL() { return getToken(RustParser.BYTE_STRING_LITERAL, 0); }
		public TerminalNode RAW_BYTE_STRING_LITERAL() { return getToken(RustParser.RAW_BYTE_STRING_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(RustParser.INTEGER_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(RustParser.MINUS, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(RustParser.FLOAT_LITERAL, 0); }
		public LiteralPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLiteralPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLiteralPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLiteralPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralPatternContext literalPattern() throws RecognitionException {
		LiteralPatternContext _localctx = new LiteralPatternContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_literalPattern);
		int _la;
		try {
			setState(2288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2272);
				match(KW_TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2273);
				match(KW_FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2274);
				match(CHAR_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2275);
				match(BYTE_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2276);
				match(STRING_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2277);
				match(RAW_STRING_LITERAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2278);
				match(BYTE_STRING_LITERAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2279);
				match(RAW_BYTE_STRING_LITERAL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2280);
					match(MINUS);
					}
				}

				setState(2283);
				match(INTEGER_LITERAL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2284);
					match(MINUS);
					}
				}

				setState(2287);
				match(FLOAT_LITERAL);
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

	public static class IdentifierPatternContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_REF() { return getToken(RustParser.KW_REF, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public TerminalNode AT() { return getToken(RustParser.AT, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public IdentifierPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterIdentifierPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitIdentifierPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitIdentifierPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierPatternContext identifierPattern() throws RecognitionException {
		IdentifierPatternContext _localctx = new IdentifierPatternContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_identifierPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_REF) {
				{
				setState(2290);
				match(KW_REF);
				}
			}

			setState(2294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUT) {
				{
				setState(2293);
				match(KW_MUT);
				}
			}

			setState(2296);
			identifier();
			setState(2299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(2297);
				match(AT);
				setState(2298);
				pattern();
				}
			}

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

	public static class WildcardPatternContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public WildcardPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterWildcardPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitWildcardPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitWildcardPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardPatternContext wildcardPattern() throws RecognitionException {
		WildcardPatternContext _localctx = new WildcardPatternContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_wildcardPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2301);
			match(UNDERSCORE);
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

	public static class RestPatternContext extends ParserRuleContext {
		public TerminalNode DOTDOT() { return getToken(RustParser.DOTDOT, 0); }
		public RestPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterRestPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitRestPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitRestPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestPatternContext restPattern() throws RecognitionException {
		RestPatternContext _localctx = new RestPatternContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_restPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2303);
			match(DOTDOT);
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

	public static class RangePatternContext extends ParserRuleContext {
		public List<RangePatternBoundContext> rangePatternBound() {
			return getRuleContexts(RangePatternBoundContext.class);
		}
		public RangePatternBoundContext rangePatternBound(int i) {
			return getRuleContext(RangePatternBoundContext.class,i);
		}
		public TerminalNode DOTDOTEQ() { return getToken(RustParser.DOTDOTEQ, 0); }
		public RangePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterRangePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitRangePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitRangePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangePatternContext rangePattern() throws RecognitionException {
		RangePatternContext _localctx = new RangePatternContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_rangePattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2305);
			rangePatternBound();
			setState(2306);
			match(DOTDOTEQ);
			setState(2307);
			rangePatternBound();
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

	public static class ObsoleteRangePatternContext extends ParserRuleContext {
		public List<RangePatternBoundContext> rangePatternBound() {
			return getRuleContexts(RangePatternBoundContext.class);
		}
		public RangePatternBoundContext rangePatternBound(int i) {
			return getRuleContext(RangePatternBoundContext.class,i);
		}
		public TerminalNode DOTDOTDOT() { return getToken(RustParser.DOTDOTDOT, 0); }
		public ObsoleteRangePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obsoleteRangePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterObsoleteRangePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitObsoleteRangePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitObsoleteRangePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObsoleteRangePatternContext obsoleteRangePattern() throws RecognitionException {
		ObsoleteRangePatternContext _localctx = new ObsoleteRangePatternContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_obsoleteRangePattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2309);
			rangePatternBound();
			setState(2310);
			match(DOTDOTDOT);
			setState(2311);
			rangePatternBound();
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

	public static class RangePatternBoundContext extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(RustParser.CHAR_LITERAL, 0); }
		public TerminalNode BYTE_LITERAL() { return getToken(RustParser.BYTE_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(RustParser.INTEGER_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(RustParser.MINUS, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(RustParser.FLOAT_LITERAL, 0); }
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public QualifiedPathInExpressionContext qualifiedPathInExpression() {
			return getRuleContext(QualifiedPathInExpressionContext.class,0);
		}
		public RangePatternBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangePatternBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterRangePatternBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitRangePatternBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitRangePatternBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangePatternBoundContext rangePatternBound() throws RecognitionException {
		RangePatternBoundContext _localctx = new RangePatternBoundContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_rangePatternBound);
		int _la;
		try {
			setState(2325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2313);
				match(CHAR_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2314);
				match(BYTE_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2315);
					match(MINUS);
					}
				}

				setState(2318);
				match(INTEGER_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2319);
					match(MINUS);
					}
				}

				setState(2322);
				match(FLOAT_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2323);
				pathInExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2324);
				qualifiedPathInExpression();
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

	public static class ReferencePatternContext extends ParserRuleContext {
		public PatternWithoutRangeContext patternWithoutRange() {
			return getRuleContext(PatternWithoutRangeContext.class,0);
		}
		public TerminalNode AND() { return getToken(RustParser.AND, 0); }
		public TerminalNode ANDAND() { return getToken(RustParser.ANDAND, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public ReferencePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterReferencePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitReferencePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitReferencePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferencePatternContext referencePattern() throws RecognitionException {
		ReferencePatternContext _localctx = new ReferencePatternContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_referencePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2327);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==ANDAND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				{
				setState(2328);
				match(KW_MUT);
				}
				break;
			}
			setState(2331);
			patternWithoutRange();
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

	public static class StructPatternContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public StructPatternElementsContext structPatternElements() {
			return getRuleContext(StructPatternElementsContext.class,0);
		}
		public StructPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructPatternContext structPattern() throws RecognitionException {
		StructPatternContext _localctx = new StructPatternContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_structPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2333);
			pathInExpression();
			setState(2334);
			match(LCURLYBRACE);
			setState(2336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_MUT) | (1L << KW_REF) | (1L << KW_MACRORULES) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (INTEGER_LITERAL - 75)) | (1L << (DOTDOT - 75)) | (1L << (POUND - 75)))) != 0)) {
				{
				setState(2335);
				structPatternElements();
				}
			}

			setState(2338);
			match(RCURLYBRACE);
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

	public static class StructPatternElementsContext extends ParserRuleContext {
		public StructPatternFieldsContext structPatternFields() {
			return getRuleContext(StructPatternFieldsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RustParser.COMMA, 0); }
		public StructPatternEtCeteraContext structPatternEtCetera() {
			return getRuleContext(StructPatternEtCeteraContext.class,0);
		}
		public StructPatternElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structPatternElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructPatternElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructPatternElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructPatternElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructPatternElementsContext structPatternElements() throws RecognitionException {
		StructPatternElementsContext _localctx = new StructPatternElementsContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_structPatternElements);
		int _la;
		try {
			setState(2348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2340);
				structPatternFields();
				setState(2345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2341);
					match(COMMA);
					setState(2343);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOTDOT || _la==POUND) {
						{
						setState(2342);
						structPatternEtCetera();
						}
					}

					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2347);
				structPatternEtCetera();
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

	public static class StructPatternFieldsContext extends ParserRuleContext {
		public List<StructPatternFieldContext> structPatternField() {
			return getRuleContexts(StructPatternFieldContext.class);
		}
		public StructPatternFieldContext structPatternField(int i) {
			return getRuleContext(StructPatternFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public StructPatternFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structPatternFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructPatternFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructPatternFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructPatternFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructPatternFieldsContext structPatternFields() throws RecognitionException {
		StructPatternFieldsContext _localctx = new StructPatternFieldsContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_structPatternFields);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2350);
			structPatternField();
			setState(2355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2351);
					match(COMMA);
					setState(2352);
					structPatternField();
					}
					} 
				}
				setState(2357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
			}
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

	public static class StructPatternFieldContext extends ParserRuleContext {
		public TupleIndexContext tupleIndex() {
			return getRuleContext(TupleIndexContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public TerminalNode KW_REF() { return getToken(RustParser.KW_REF, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public StructPatternFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structPatternField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructPatternField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructPatternField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructPatternField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructPatternFieldContext structPatternField() throws RecognitionException {
		StructPatternFieldContext _localctx = new StructPatternFieldContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_structPatternField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2358);
				outerAttribute();
				}
				}
				setState(2363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
			case 1:
				{
				setState(2364);
				tupleIndex();
				setState(2365);
				match(COLON);
				setState(2366);
				pattern();
				}
				break;
			case 2:
				{
				setState(2368);
				identifier();
				setState(2369);
				match(COLON);
				setState(2370);
				pattern();
				}
				break;
			case 3:
				{
				setState(2373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_REF) {
					{
					setState(2372);
					match(KW_REF);
					}
				}

				setState(2376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_MUT) {
					{
					setState(2375);
					match(KW_MUT);
					}
				}

				setState(2378);
				identifier();
				}
				break;
			}
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

	public static class StructPatternEtCeteraContext extends ParserRuleContext {
		public TerminalNode DOTDOT() { return getToken(RustParser.DOTDOT, 0); }
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public StructPatternEtCeteraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structPatternEtCetera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructPatternEtCetera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructPatternEtCetera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructPatternEtCetera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructPatternEtCeteraContext structPatternEtCetera() throws RecognitionException {
		StructPatternEtCeteraContext _localctx = new StructPatternEtCeteraContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_structPatternEtCetera);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2381);
				outerAttribute();
				}
				}
				setState(2386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2387);
			match(DOTDOT);
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

	public static class TupleStructPatternContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TupleStructItemsContext tupleStructItems() {
			return getRuleContext(TupleStructItemsContext.class,0);
		}
		public TupleStructPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleStructPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleStructPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleStructPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleStructPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleStructPatternContext tupleStructPattern() throws RecognitionException {
		TupleStructPatternContext _localctx = new TupleStructPatternContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_tupleStructPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2389);
			pathInExpression();
			setState(2390);
			match(LPAREN);
			setState(2392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_MUT) | (1L << KW_REF) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (MINUS - 69)) | (1L << (AND - 69)) | (1L << (ANDAND - 69)) | (1L << (LT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOTDOT - 69)) | (1L << (PATHSEP - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
				{
				setState(2391);
				tupleStructItems();
				}
			}

			setState(2394);
			match(RPAREN);
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

	public static class TupleStructItemsContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TupleStructItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleStructItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleStructItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleStructItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleStructItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleStructItemsContext tupleStructItems() throws RecognitionException {
		TupleStructItemsContext _localctx = new TupleStructItemsContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_tupleStructItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2396);
			pattern();
			setState(2401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2397);
					match(COMMA);
					setState(2398);
					pattern();
					}
					} 
				}
				setState(2403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			}
			setState(2405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2404);
				match(COMMA);
				}
			}

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

	public static class TuplePatternContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TuplePatternItemsContext tuplePatternItems() {
			return getRuleContext(TuplePatternItemsContext.class,0);
		}
		public TuplePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTuplePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTuplePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTuplePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TuplePatternContext tuplePattern() throws RecognitionException {
		TuplePatternContext _localctx = new TuplePatternContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_tuplePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2407);
			match(LPAREN);
			setState(2409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_MUT) | (1L << KW_REF) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (MINUS - 69)) | (1L << (AND - 69)) | (1L << (ANDAND - 69)) | (1L << (LT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOTDOT - 69)) | (1L << (PATHSEP - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
				{
				setState(2408);
				tuplePatternItems();
				}
			}

			setState(2411);
			match(RPAREN);
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

	public static class TuplePatternItemsContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public RestPatternContext restPattern() {
			return getRuleContext(RestPatternContext.class,0);
		}
		public TuplePatternItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplePatternItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTuplePatternItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTuplePatternItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTuplePatternItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TuplePatternItemsContext tuplePatternItems() throws RecognitionException {
		TuplePatternItemsContext _localctx = new TuplePatternItemsContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_tuplePatternItems);
		int _la;
		try {
			int _alt;
			setState(2427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2413);
				pattern();
				setState(2414);
				match(COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2416);
				restPattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2417);
				pattern();
				setState(2420); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2418);
						match(COMMA);
						setState(2419);
						pattern();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2422); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2424);
					match(COMMA);
					}
				}

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

	public static class GroupedPatternContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public GroupedPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupedPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGroupedPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGroupedPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGroupedPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupedPatternContext groupedPattern() throws RecognitionException {
		GroupedPatternContext _localctx = new GroupedPatternContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_groupedPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2429);
			match(LPAREN);
			setState(2430);
			pattern();
			setState(2431);
			match(RPAREN);
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

	public static class SlicePatternContext extends ParserRuleContext {
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public SlicePatternItemsContext slicePatternItems() {
			return getRuleContext(SlicePatternItemsContext.class,0);
		}
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public SlicePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slicePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterSlicePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitSlicePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitSlicePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlicePatternContext slicePattern() throws RecognitionException {
		SlicePatternContext _localctx = new SlicePatternContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_slicePattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2433);
			match(LSQUAREBRACKET);
			setState(2434);
			slicePatternItems();
			setState(2435);
			match(RSQUAREBRACKET);
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

	public static class SlicePatternItemsContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public SlicePatternItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slicePatternItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterSlicePatternItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitSlicePatternItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitSlicePatternItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlicePatternItemsContext slicePatternItems() throws RecognitionException {
		SlicePatternItemsContext _localctx = new SlicePatternItemsContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_slicePatternItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2437);
			pattern();
			setState(2442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,332,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2438);
					match(COMMA);
					setState(2439);
					pattern();
					}
					} 
				}
				setState(2444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,332,_ctx);
			}
			setState(2446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2445);
				match(COMMA);
				}
			}

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

	public static class PathPatternContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public QualifiedPathInExpressionContext qualifiedPathInExpression() {
			return getRuleContext(QualifiedPathInExpressionContext.class,0);
		}
		public PathPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPathPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPathPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPathPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathPatternContext pathPattern() throws RecognitionException {
		PathPatternContext _localctx = new PathPatternContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_pathPattern);
		try {
			setState(2450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case PATHSEP:
				enterOuterAlt(_localctx, 1);
				{
				setState(2448);
				pathInExpression();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2449);
				qualifiedPathInExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TypeNoBoundsContext typeNoBounds() {
			return getRuleContext(TypeNoBoundsContext.class,0);
		}
		public ImplTraitTypeContext implTraitType() {
			return getRuleContext(ImplTraitTypeContext.class,0);
		}
		public TraitObjectTypeContext traitObjectType() {
			return getRuleContext(TraitObjectTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_type);
		try {
			setState(2455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2452);
				typeNoBounds();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2453);
				implTraitType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2454);
				traitObjectType();
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

	public static class TypeNoBoundsContext extends ParserRuleContext {
		public ParenthesizedTypeContext parenthesizedType() {
			return getRuleContext(ParenthesizedTypeContext.class,0);
		}
		public ImplTraitTypeOneBoundContext implTraitTypeOneBound() {
			return getRuleContext(ImplTraitTypeOneBoundContext.class,0);
		}
		public TraitObjectTypeOneBoundContext traitObjectTypeOneBound() {
			return getRuleContext(TraitObjectTypeOneBoundContext.class,0);
		}
		public TypePathContext typePath() {
			return getRuleContext(TypePathContext.class,0);
		}
		public TupleTypeContext tupleType() {
			return getRuleContext(TupleTypeContext.class,0);
		}
		public NeverTypeContext neverType() {
			return getRuleContext(NeverTypeContext.class,0);
		}
		public RawPointerTypeContext rawPointerType() {
			return getRuleContext(RawPointerTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public InferredTypeContext inferredType() {
			return getRuleContext(InferredTypeContext.class,0);
		}
		public QualifiedPathInTypeContext qualifiedPathInType() {
			return getRuleContext(QualifiedPathInTypeContext.class,0);
		}
		public BareFunctionTypeContext bareFunctionType() {
			return getRuleContext(BareFunctionTypeContext.class,0);
		}
		public MacroInvocationContext macroInvocation() {
			return getRuleContext(MacroInvocationContext.class,0);
		}
		public TypeNoBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNoBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypeNoBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypeNoBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypeNoBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNoBoundsContext typeNoBounds() throws RecognitionException {
		TypeNoBoundsContext _localctx = new TypeNoBoundsContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_typeNoBounds);
		try {
			setState(2471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2457);
				parenthesizedType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2458);
				implTraitTypeOneBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2459);
				traitObjectTypeOneBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2460);
				typePath();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2461);
				tupleType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2462);
				neverType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2463);
				rawPointerType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2464);
				referenceType();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2465);
				arrayType();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2466);
				sliceType();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2467);
				inferredType();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2468);
				qualifiedPathInType();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2469);
				bareFunctionType();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2470);
				macroInvocation();
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

	public static class ParenthesizedTypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public ParenthesizedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterParenthesizedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitParenthesizedType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitParenthesizedType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesizedTypeContext parenthesizedType() throws RecognitionException {
		ParenthesizedTypeContext _localctx = new ParenthesizedTypeContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_parenthesizedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2473);
			match(LPAREN);
			setState(2474);
			type();
			setState(2475);
			match(RPAREN);
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

	public static class NeverTypeContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public NeverTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neverType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterNeverType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitNeverType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitNeverType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NeverTypeContext neverType() throws RecognitionException {
		NeverTypeContext _localctx = new NeverTypeContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_neverType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2477);
			match(NOT);
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

	public static class TupleTypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TupleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleTypeContext tupleType() throws RecognitionException {
		TupleTypeContext _localctx = new TupleTypeContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_tupleType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2479);
			match(LPAREN);
			setState(2490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CONST) | (1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IMPL) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_UNSAFE) | (1L << KW_ASYNC) | (1L << KW_DYN) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LIFETIME_OR_LABEL - 81)) | (1L << (STAR - 81)) | (1L << (NOT - 81)) | (1L << (AND - 81)) | (1L << (LT - 81)) | (1L << (UNDERSCORE - 81)) | (1L << (PATHSEP - 81)) | (1L << (QUESTION - 81)) | (1L << (LSQUAREBRACKET - 81)) | (1L << (LPAREN - 81)))) != 0)) {
				{
				setState(2483); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2480);
						type();
						setState(2481);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2485); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,337,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CONST) | (1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IMPL) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_UNSAFE) | (1L << KW_ASYNC) | (1L << KW_DYN) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LIFETIME_OR_LABEL - 81)) | (1L << (STAR - 81)) | (1L << (NOT - 81)) | (1L << (AND - 81)) | (1L << (LT - 81)) | (1L << (UNDERSCORE - 81)) | (1L << (PATHSEP - 81)) | (1L << (QUESTION - 81)) | (1L << (LSQUAREBRACKET - 81)) | (1L << (LPAREN - 81)))) != 0)) {
					{
					setState(2487);
					type();
					}
				}

				}
			}

			setState(2492);
			match(RPAREN);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2494);
			match(LSQUAREBRACKET);
			setState(2495);
			type();
			setState(2496);
			match(SEMI);
			setState(2497);
			expression(0);
			setState(2498);
			match(RSQUAREBRACKET);
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

	public static class SliceTypeContext extends ParserRuleContext {
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public SliceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterSliceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitSliceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitSliceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceTypeContext sliceType() throws RecognitionException {
		SliceTypeContext _localctx = new SliceTypeContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_sliceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2500);
			match(LSQUAREBRACKET);
			setState(2501);
			type();
			setState(2502);
			match(RSQUAREBRACKET);
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

	public static class ReferenceTypeContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(RustParser.AND, 0); }
		public TypeNoBoundsContext typeNoBounds() {
			return getRuleContext(TypeNoBoundsContext.class,0);
		}
		public LifetimeContext lifetime() {
			return getRuleContext(LifetimeContext.class,0);
		}
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_referenceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2504);
			match(AND);
			setState(2506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (KW_STATICLIFETIME - 53)) | (1L << (KW_UNDERLINELIFETIME - 53)) | (1L << (LIFETIME_OR_LABEL - 53)))) != 0)) {
				{
				setState(2505);
				lifetime();
				}
			}

			setState(2509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUT) {
				{
				setState(2508);
				match(KW_MUT);
				}
			}

			setState(2511);
			typeNoBounds();
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

	public static class RawPointerTypeContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(RustParser.STAR, 0); }
		public TypeNoBoundsContext typeNoBounds() {
			return getRuleContext(TypeNoBoundsContext.class,0);
		}
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public RawPointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawPointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterRawPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitRawPointerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitRawPointerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RawPointerTypeContext rawPointerType() throws RecognitionException {
		RawPointerTypeContext _localctx = new RawPointerTypeContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_rawPointerType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2513);
			match(STAR);
			setState(2514);
			_la = _input.LA(1);
			if ( !(_la==KW_CONST || _la==KW_MUT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2515);
			typeNoBounds();
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

	public static class BareFunctionTypeContext extends ParserRuleContext {
		public FunctionQualifiersContext functionQualifiers() {
			return getRuleContext(FunctionQualifiersContext.class,0);
		}
		public TerminalNode KW_FN() { return getToken(RustParser.KW_FN, 0); }
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public ForLifetimesContext forLifetimes() {
			return getRuleContext(ForLifetimesContext.class,0);
		}
		public FunctionParametersMaybeNamedVariadicContext functionParametersMaybeNamedVariadic() {
			return getRuleContext(FunctionParametersMaybeNamedVariadicContext.class,0);
		}
		public BareFunctionReturnTypeContext bareFunctionReturnType() {
			return getRuleContext(BareFunctionReturnTypeContext.class,0);
		}
		public BareFunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bareFunctionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterBareFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitBareFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitBareFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BareFunctionTypeContext bareFunctionType() throws RecognitionException {
		BareFunctionTypeContext _localctx = new BareFunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_bareFunctionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_FOR) {
				{
				setState(2517);
				forLifetimes();
				}
			}

			setState(2520);
			functionQualifiers();
			setState(2521);
			match(KW_FN);
			setState(2522);
			match(LPAREN);
			setState(2524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CONST) | (1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IMPL) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_UNSAFE) | (1L << KW_ASYNC) | (1L << KW_DYN) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LIFETIME_OR_LABEL - 81)) | (1L << (STAR - 81)) | (1L << (NOT - 81)) | (1L << (AND - 81)) | (1L << (LT - 81)) | (1L << (UNDERSCORE - 81)) | (1L << (PATHSEP - 81)) | (1L << (POUND - 81)) | (1L << (QUESTION - 81)) | (1L << (LSQUAREBRACKET - 81)) | (1L << (LPAREN - 81)))) != 0)) {
				{
				setState(2523);
				functionParametersMaybeNamedVariadic();
				}
			}

			setState(2526);
			match(RPAREN);
			setState(2528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
			case 1:
				{
				setState(2527);
				bareFunctionReturnType();
				}
				break;
			}
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

	public static class BareFunctionReturnTypeContext extends ParserRuleContext {
		public TerminalNode RARROW() { return getToken(RustParser.RARROW, 0); }
		public TypeNoBoundsContext typeNoBounds() {
			return getRuleContext(TypeNoBoundsContext.class,0);
		}
		public BareFunctionReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bareFunctionReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterBareFunctionReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitBareFunctionReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitBareFunctionReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BareFunctionReturnTypeContext bareFunctionReturnType() throws RecognitionException {
		BareFunctionReturnTypeContext _localctx = new BareFunctionReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_bareFunctionReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2530);
			match(RARROW);
			setState(2531);
			typeNoBounds();
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

	public static class FunctionParametersMaybeNamedVariadicContext extends ParserRuleContext {
		public MaybeNamedFunctionParametersContext maybeNamedFunctionParameters() {
			return getRuleContext(MaybeNamedFunctionParametersContext.class,0);
		}
		public MaybeNamedFunctionParametersVariadicContext maybeNamedFunctionParametersVariadic() {
			return getRuleContext(MaybeNamedFunctionParametersVariadicContext.class,0);
		}
		public FunctionParametersMaybeNamedVariadicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParametersMaybeNamedVariadic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterFunctionParametersMaybeNamedVariadic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitFunctionParametersMaybeNamedVariadic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitFunctionParametersMaybeNamedVariadic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersMaybeNamedVariadicContext functionParametersMaybeNamedVariadic() throws RecognitionException {
		FunctionParametersMaybeNamedVariadicContext _localctx = new FunctionParametersMaybeNamedVariadicContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_functionParametersMaybeNamedVariadic);
		try {
			setState(2535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2533);
				maybeNamedFunctionParameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2534);
				maybeNamedFunctionParametersVariadic();
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

	public static class MaybeNamedFunctionParametersContext extends ParserRuleContext {
		public List<MaybeNamedParamContext> maybeNamedParam() {
			return getRuleContexts(MaybeNamedParamContext.class);
		}
		public MaybeNamedParamContext maybeNamedParam(int i) {
			return getRuleContext(MaybeNamedParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public MaybeNamedFunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybeNamedFunctionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMaybeNamedFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMaybeNamedFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMaybeNamedFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaybeNamedFunctionParametersContext maybeNamedFunctionParameters() throws RecognitionException {
		MaybeNamedFunctionParametersContext _localctx = new MaybeNamedFunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_maybeNamedFunctionParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2537);
			maybeNamedParam();
			setState(2542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,346,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2538);
					match(COMMA);
					setState(2539);
					maybeNamedParam();
					}
					} 
				}
				setState(2544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,346,_ctx);
			}
			setState(2546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2545);
				match(COMMA);
				}
			}

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

	public static class MaybeNamedParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public MaybeNamedParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybeNamedParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMaybeNamedParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMaybeNamedParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMaybeNamedParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaybeNamedParamContext maybeNamedParam() throws RecognitionException {
		MaybeNamedParamContext _localctx = new MaybeNamedParamContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_maybeNamedParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2548);
				outerAttribute();
				}
				}
				setState(2553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
			case 1:
				{
				setState(2556);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_MACRORULES:
				case NON_KEYWORD_IDENTIFIER:
				case RAW_IDENTIFIER:
					{
					setState(2554);
					identifier();
					}
					break;
				case UNDERSCORE:
					{
					setState(2555);
					match(UNDERSCORE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2558);
				match(COLON);
				}
				break;
			}
			setState(2561);
			type();
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

	public static class MaybeNamedFunctionParametersVariadicContext extends ParserRuleContext {
		public List<MaybeNamedParamContext> maybeNamedParam() {
			return getRuleContexts(MaybeNamedParamContext.class);
		}
		public MaybeNamedParamContext maybeNamedParam(int i) {
			return getRuleContext(MaybeNamedParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TerminalNode DOTDOTDOT() { return getToken(RustParser.DOTDOTDOT, 0); }
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public MaybeNamedFunctionParametersVariadicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybeNamedFunctionParametersVariadic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMaybeNamedFunctionParametersVariadic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMaybeNamedFunctionParametersVariadic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMaybeNamedFunctionParametersVariadic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaybeNamedFunctionParametersVariadicContext maybeNamedFunctionParametersVariadic() throws RecognitionException {
		MaybeNamedFunctionParametersVariadicContext _localctx = new MaybeNamedFunctionParametersVariadicContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_maybeNamedFunctionParametersVariadic);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2568);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,351,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2563);
					maybeNamedParam();
					setState(2564);
					match(COMMA);
					}
					} 
				}
				setState(2570);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,351,_ctx);
			}
			setState(2571);
			maybeNamedParam();
			setState(2572);
			match(COMMA);
			setState(2576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2573);
				outerAttribute();
				}
				}
				setState(2578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2579);
			match(DOTDOTDOT);
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

	public static class TraitObjectTypeContext extends ParserRuleContext {
		public TypeParamBoundsContext typeParamBounds() {
			return getRuleContext(TypeParamBoundsContext.class,0);
		}
		public TerminalNode KW_DYN() { return getToken(RustParser.KW_DYN, 0); }
		public TraitObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitObjectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTraitObjectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTraitObjectType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTraitObjectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitObjectTypeContext traitObjectType() throws RecognitionException {
		TraitObjectTypeContext _localctx = new TraitObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_traitObjectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DYN) {
				{
				setState(2581);
				match(KW_DYN);
				}
			}

			setState(2584);
			typeParamBounds();
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

	public static class TraitObjectTypeOneBoundContext extends ParserRuleContext {
		public TraitBoundContext traitBound() {
			return getRuleContext(TraitBoundContext.class,0);
		}
		public TerminalNode KW_DYN() { return getToken(RustParser.KW_DYN, 0); }
		public TraitObjectTypeOneBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitObjectTypeOneBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTraitObjectTypeOneBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTraitObjectTypeOneBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTraitObjectTypeOneBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitObjectTypeOneBoundContext traitObjectTypeOneBound() throws RecognitionException {
		TraitObjectTypeOneBoundContext _localctx = new TraitObjectTypeOneBoundContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_traitObjectTypeOneBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DYN) {
				{
				setState(2586);
				match(KW_DYN);
				}
			}

			setState(2589);
			traitBound();
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

	public static class ImplTraitTypeContext extends ParserRuleContext {
		public TerminalNode KW_IMPL() { return getToken(RustParser.KW_IMPL, 0); }
		public TypeParamBoundsContext typeParamBounds() {
			return getRuleContext(TypeParamBoundsContext.class,0);
		}
		public ImplTraitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implTraitType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterImplTraitType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitImplTraitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitImplTraitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplTraitTypeContext implTraitType() throws RecognitionException {
		ImplTraitTypeContext _localctx = new ImplTraitTypeContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_implTraitType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2591);
			match(KW_IMPL);
			setState(2592);
			typeParamBounds();
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

	public static class ImplTraitTypeOneBoundContext extends ParserRuleContext {
		public TerminalNode KW_IMPL() { return getToken(RustParser.KW_IMPL, 0); }
		public TraitBoundContext traitBound() {
			return getRuleContext(TraitBoundContext.class,0);
		}
		public ImplTraitTypeOneBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implTraitTypeOneBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterImplTraitTypeOneBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitImplTraitTypeOneBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitImplTraitTypeOneBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplTraitTypeOneBoundContext implTraitTypeOneBound() throws RecognitionException {
		ImplTraitTypeOneBoundContext _localctx = new ImplTraitTypeOneBoundContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_implTraitTypeOneBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2594);
			match(KW_IMPL);
			setState(2595);
			traitBound();
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

	public static class InferredTypeContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public InferredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterInferredType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitInferredType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitInferredType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InferredTypeContext inferredType() throws RecognitionException {
		InferredTypeContext _localctx = new InferredTypeContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_inferredType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2597);
			match(UNDERSCORE);
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

	public static class TypeParamBoundsContext extends ParserRuleContext {
		public List<TypeParamBoundContext> typeParamBound() {
			return getRuleContexts(TypeParamBoundContext.class);
		}
		public TypeParamBoundContext typeParamBound(int i) {
			return getRuleContext(TypeParamBoundContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(RustParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(RustParser.PLUS, i);
		}
		public TypeParamBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParamBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypeParamBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypeParamBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypeParamBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamBoundsContext typeParamBounds() throws RecognitionException {
		TypeParamBoundsContext _localctx = new TypeParamBoundsContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_typeParamBounds);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2599);
			typeParamBound();
			setState(2604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,355,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2600);
					match(PLUS);
					setState(2601);
					typeParamBound();
					}
					} 
				}
				setState(2606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,355,_ctx);
			}
			setState(2608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
			case 1:
				{
				setState(2607);
				match(PLUS);
				}
				break;
			}
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

	public static class TypeParamBoundContext extends ParserRuleContext {
		public LifetimeContext lifetime() {
			return getRuleContext(LifetimeContext.class,0);
		}
		public TraitBoundContext traitBound() {
			return getRuleContext(TraitBoundContext.class,0);
		}
		public TypeParamBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParamBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypeParamBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypeParamBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypeParamBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamBoundContext typeParamBound() throws RecognitionException {
		TypeParamBoundContext _localctx = new TypeParamBoundContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_typeParamBound);
		try {
			setState(2612);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_STATICLIFETIME:
			case KW_UNDERLINELIFETIME:
			case LIFETIME_OR_LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2610);
				lifetime();
				}
				break;
			case KW_CRATE:
			case KW_FOR:
			case KW_SELFVALUE:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case PATHSEP:
			case QUESTION:
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2611);
				traitBound();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TraitBoundContext extends ParserRuleContext {
		public TypePathContext typePath() {
			return getRuleContext(TypePathContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(RustParser.QUESTION, 0); }
		public ForLifetimesContext forLifetimes() {
			return getRuleContext(ForLifetimesContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TraitBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTraitBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTraitBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTraitBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitBoundContext traitBound() throws RecognitionException {
		TraitBoundContext _localctx = new TraitBoundContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_traitBound);
		int _la;
		try {
			setState(2631);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_FOR:
			case KW_SELFVALUE:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case PATHSEP:
			case QUESTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(2615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2614);
					match(QUESTION);
					}
				}

				setState(2618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_FOR) {
					{
					setState(2617);
					forLifetimes();
					}
				}

				setState(2620);
				typePath();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2621);
				match(LPAREN);
				setState(2623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2622);
					match(QUESTION);
					}
				}

				setState(2626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_FOR) {
					{
					setState(2625);
					forLifetimes();
					}
				}

				setState(2628);
				typePath();
				setState(2629);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LifetimeBoundsContext extends ParserRuleContext {
		public List<LifetimeContext> lifetime() {
			return getRuleContexts(LifetimeContext.class);
		}
		public LifetimeContext lifetime(int i) {
			return getRuleContext(LifetimeContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(RustParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(RustParser.PLUS, i);
		}
		public LifetimeBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lifetimeBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLifetimeBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLifetimeBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLifetimeBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LifetimeBoundsContext lifetimeBounds() throws RecognitionException {
		LifetimeBoundsContext _localctx = new LifetimeBoundsContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_lifetimeBounds);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2638);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,363,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2633);
					lifetime();
					setState(2634);
					match(PLUS);
					}
					} 
				}
				setState(2640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,363,_ctx);
			}
			setState(2642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (KW_STATICLIFETIME - 53)) | (1L << (KW_UNDERLINELIFETIME - 53)) | (1L << (LIFETIME_OR_LABEL - 53)))) != 0)) {
				{
				setState(2641);
				lifetime();
				}
			}

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

	public static class LifetimeContext extends ParserRuleContext {
		public TerminalNode LIFETIME_OR_LABEL() { return getToken(RustParser.LIFETIME_OR_LABEL, 0); }
		public TerminalNode KW_STATICLIFETIME() { return getToken(RustParser.KW_STATICLIFETIME, 0); }
		public TerminalNode KW_UNDERLINELIFETIME() { return getToken(RustParser.KW_UNDERLINELIFETIME, 0); }
		public LifetimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lifetime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLifetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLifetime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLifetime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LifetimeContext lifetime() throws RecognitionException {
		LifetimeContext _localctx = new LifetimeContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_lifetime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2644);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (KW_STATICLIFETIME - 53)) | (1L << (KW_UNDERLINELIFETIME - 53)) | (1L << (LIFETIME_OR_LABEL - 53)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode NON_KEYWORD_IDENTIFIER() { return getToken(RustParser.NON_KEYWORD_IDENTIFIER, 0); }
		public TerminalNode RAW_IDENTIFIER() { return getToken(RustParser.RAW_IDENTIFIER, 0); }
		public TerminalNode KW_MACRORULES() { return getToken(RustParser.KW_MACRORULES, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2646);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_MACRORULES) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode KW_AS() { return getToken(RustParser.KW_AS, 0); }
		public TerminalNode KW_BREAK() { return getToken(RustParser.KW_BREAK, 0); }
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public TerminalNode KW_CONTINUE() { return getToken(RustParser.KW_CONTINUE, 0); }
		public TerminalNode KW_CRATE() { return getToken(RustParser.KW_CRATE, 0); }
		public TerminalNode KW_ELSE() { return getToken(RustParser.KW_ELSE, 0); }
		public TerminalNode KW_ENUM() { return getToken(RustParser.KW_ENUM, 0); }
		public TerminalNode KW_EXTERN() { return getToken(RustParser.KW_EXTERN, 0); }
		public TerminalNode KW_FALSE() { return getToken(RustParser.KW_FALSE, 0); }
		public TerminalNode KW_FN() { return getToken(RustParser.KW_FN, 0); }
		public TerminalNode KW_FOR() { return getToken(RustParser.KW_FOR, 0); }
		public TerminalNode KW_IF() { return getToken(RustParser.KW_IF, 0); }
		public TerminalNode KW_IMPL() { return getToken(RustParser.KW_IMPL, 0); }
		public TerminalNode KW_IN() { return getToken(RustParser.KW_IN, 0); }
		public TerminalNode KW_LET() { return getToken(RustParser.KW_LET, 0); }
		public TerminalNode KW_LOOP() { return getToken(RustParser.KW_LOOP, 0); }
		public TerminalNode KW_MATCH() { return getToken(RustParser.KW_MATCH, 0); }
		public TerminalNode KW_MOD() { return getToken(RustParser.KW_MOD, 0); }
		public TerminalNode KW_MOVE() { return getToken(RustParser.KW_MOVE, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public TerminalNode KW_PUB() { return getToken(RustParser.KW_PUB, 0); }
		public TerminalNode KW_REF() { return getToken(RustParser.KW_REF, 0); }
		public TerminalNode KW_RETURN() { return getToken(RustParser.KW_RETURN, 0); }
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public TerminalNode KW_SELFTYPE() { return getToken(RustParser.KW_SELFTYPE, 0); }
		public TerminalNode KW_STATIC() { return getToken(RustParser.KW_STATIC, 0); }
		public TerminalNode KW_STRUCT() { return getToken(RustParser.KW_STRUCT, 0); }
		public TerminalNode KW_SUPER() { return getToken(RustParser.KW_SUPER, 0); }
		public TerminalNode KW_TRAIT() { return getToken(RustParser.KW_TRAIT, 0); }
		public TerminalNode KW_TRUE() { return getToken(RustParser.KW_TRUE, 0); }
		public TerminalNode KW_TYPE() { return getToken(RustParser.KW_TYPE, 0); }
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public TerminalNode KW_USE() { return getToken(RustParser.KW_USE, 0); }
		public TerminalNode KW_WHERE() { return getToken(RustParser.KW_WHERE, 0); }
		public TerminalNode KW_WHILE() { return getToken(RustParser.KW_WHILE, 0); }
		public TerminalNode KW_ASYNC() { return getToken(RustParser.KW_ASYNC, 0); }
		public TerminalNode KW_AWAIT() { return getToken(RustParser.KW_AWAIT, 0); }
		public TerminalNode KW_DYN() { return getToken(RustParser.KW_DYN, 0); }
		public TerminalNode KW_ABSTRACT() { return getToken(RustParser.KW_ABSTRACT, 0); }
		public TerminalNode KW_BECOME() { return getToken(RustParser.KW_BECOME, 0); }
		public TerminalNode KW_BOX() { return getToken(RustParser.KW_BOX, 0); }
		public TerminalNode KW_DO() { return getToken(RustParser.KW_DO, 0); }
		public TerminalNode KW_FINAL() { return getToken(RustParser.KW_FINAL, 0); }
		public TerminalNode KW_MACRO() { return getToken(RustParser.KW_MACRO, 0); }
		public TerminalNode KW_OVERRIDE() { return getToken(RustParser.KW_OVERRIDE, 0); }
		public TerminalNode KW_PRIV() { return getToken(RustParser.KW_PRIV, 0); }
		public TerminalNode KW_TYPEOF() { return getToken(RustParser.KW_TYPEOF, 0); }
		public TerminalNode KW_UNSIZED() { return getToken(RustParser.KW_UNSIZED, 0); }
		public TerminalNode KW_VIRTUAL() { return getToken(RustParser.KW_VIRTUAL, 0); }
		public TerminalNode KW_YIELD() { return getToken(RustParser.KW_YIELD, 0); }
		public TerminalNode KW_TRY() { return getToken(RustParser.KW_TRY, 0); }
		public TerminalNode KW_UNION() { return getToken(RustParser.KW_UNION, 0); }
		public TerminalNode KW_STATICLIFETIME() { return getToken(RustParser.KW_STATICLIFETIME, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2648);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class MacroIdentifierLikeTokenContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_MACRORULES() { return getToken(RustParser.KW_MACRORULES, 0); }
		public TerminalNode KW_UNDERLINELIFETIME() { return getToken(RustParser.KW_UNDERLINELIFETIME, 0); }
		public TerminalNode KW_DOLLARCRATE() { return getToken(RustParser.KW_DOLLARCRATE, 0); }
		public TerminalNode LIFETIME_OR_LABEL() { return getToken(RustParser.LIFETIME_OR_LABEL, 0); }
		public MacroIdentifierLikeTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroIdentifierLikeToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroIdentifierLikeToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroIdentifierLikeToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroIdentifierLikeToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroIdentifierLikeTokenContext macroIdentifierLikeToken() throws RecognitionException {
		MacroIdentifierLikeTokenContext _localctx = new MacroIdentifierLikeTokenContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_macroIdentifierLikeToken);
		try {
			setState(2656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2650);
				keyword();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2651);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2652);
				match(KW_MACRORULES);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2653);
				match(KW_UNDERLINELIFETIME);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2654);
				match(KW_DOLLARCRATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2655);
				match(LIFETIME_OR_LABEL);
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

	public static class MacroLiteralTokenContext extends ParserRuleContext {
		public LiteralExpressionContext literalExpression() {
			return getRuleContext(LiteralExpressionContext.class,0);
		}
		public MacroLiteralTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroLiteralToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroLiteralToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroLiteralToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroLiteralToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroLiteralTokenContext macroLiteralToken() throws RecognitionException {
		MacroLiteralTokenContext _localctx = new MacroLiteralTokenContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_macroLiteralToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2658);
			literalExpression();
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

	public static class MacroPunctuationTokenContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(RustParser.MINUS, 0); }
		public TerminalNode SLASH() { return getToken(RustParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(RustParser.PERCENT, 0); }
		public TerminalNode CARET() { return getToken(RustParser.CARET, 0); }
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public TerminalNode AND() { return getToken(RustParser.AND, 0); }
		public TerminalNode OR() { return getToken(RustParser.OR, 0); }
		public TerminalNode ANDAND() { return getToken(RustParser.ANDAND, 0); }
		public TerminalNode OROR() { return getToken(RustParser.OROR, 0); }
		public TerminalNode PLUSEQ() { return getToken(RustParser.PLUSEQ, 0); }
		public TerminalNode MINUSEQ() { return getToken(RustParser.MINUSEQ, 0); }
		public TerminalNode STAREQ() { return getToken(RustParser.STAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(RustParser.SLASHEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(RustParser.PERCENTEQ, 0); }
		public TerminalNode CARETEQ() { return getToken(RustParser.CARETEQ, 0); }
		public TerminalNode ANDEQ() { return getToken(RustParser.ANDEQ, 0); }
		public TerminalNode OREQ() { return getToken(RustParser.OREQ, 0); }
		public TerminalNode SHLEQ() { return getToken(RustParser.SHLEQ, 0); }
		public TerminalNode SHREQ() { return getToken(RustParser.SHREQ, 0); }
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public TerminalNode EQEQ() { return getToken(RustParser.EQEQ, 0); }
		public TerminalNode NE() { return getToken(RustParser.NE, 0); }
		public TerminalNode GT() { return getToken(RustParser.GT, 0); }
		public TerminalNode LT() { return getToken(RustParser.LT, 0); }
		public TerminalNode GE() { return getToken(RustParser.GE, 0); }
		public TerminalNode LE() { return getToken(RustParser.LE, 0); }
		public TerminalNode AT() { return getToken(RustParser.AT, 0); }
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public TerminalNode DOT() { return getToken(RustParser.DOT, 0); }
		public TerminalNode DOTDOT() { return getToken(RustParser.DOTDOT, 0); }
		public TerminalNode DOTDOTDOT() { return getToken(RustParser.DOTDOTDOT, 0); }
		public TerminalNode DOTDOTEQ() { return getToken(RustParser.DOTDOTEQ, 0); }
		public TerminalNode COMMA() { return getToken(RustParser.COMMA, 0); }
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public TerminalNode PATHSEP() { return getToken(RustParser.PATHSEP, 0); }
		public TerminalNode RARROW() { return getToken(RustParser.RARROW, 0); }
		public TerminalNode FATARROW() { return getToken(RustParser.FATARROW, 0); }
		public TerminalNode POUND() { return getToken(RustParser.POUND, 0); }
		public MacroPunctuationTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroPunctuationToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroPunctuationToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroPunctuationToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroPunctuationToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroPunctuationTokenContext macroPunctuationToken() throws RecognitionException {
		MacroPunctuationTokenContext _localctx = new MacroPunctuationTokenContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_macroPunctuationToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2660);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (MINUS - 83)) | (1L << (SLASH - 83)) | (1L << (PERCENT - 83)) | (1L << (CARET - 83)) | (1L << (NOT - 83)) | (1L << (AND - 83)) | (1L << (OR - 83)) | (1L << (ANDAND - 83)) | (1L << (OROR - 83)) | (1L << (PLUSEQ - 83)) | (1L << (MINUSEQ - 83)) | (1L << (STAREQ - 83)) | (1L << (SLASHEQ - 83)) | (1L << (PERCENTEQ - 83)) | (1L << (CARETEQ - 83)) | (1L << (ANDEQ - 83)) | (1L << (OREQ - 83)) | (1L << (SHLEQ - 83)) | (1L << (SHREQ - 83)) | (1L << (EQ - 83)) | (1L << (EQEQ - 83)) | (1L << (NE - 83)) | (1L << (GT - 83)) | (1L << (LT - 83)) | (1L << (GE - 83)) | (1L << (LE - 83)) | (1L << (AT - 83)) | (1L << (UNDERSCORE - 83)) | (1L << (DOT - 83)) | (1L << (DOTDOT - 83)) | (1L << (DOTDOTDOT - 83)) | (1L << (DOTDOTEQ - 83)) | (1L << (COMMA - 83)) | (1L << (SEMI - 83)) | (1L << (COLON - 83)) | (1L << (PATHSEP - 83)) | (1L << (RARROW - 83)) | (1L << (FATARROW - 83)) | (1L << (POUND - 83)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ShlContext extends ParserRuleContext {
		public List<TerminalNode> LT() { return getTokens(RustParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(RustParser.LT, i);
		}
		public ShlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterShl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitShl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitShl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShlContext shl() throws RecognitionException {
		ShlContext _localctx = new ShlContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_shl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2662);
			match(LT);
			setState(2663);
			if (!(this.next('<'))) throw new FailedPredicateException(this, "this.next('<')");
			setState(2664);
			match(LT);
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

	public static class ShrContext extends ParserRuleContext {
		public List<TerminalNode> GT() { return getTokens(RustParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(RustParser.GT, i);
		}
		public ShrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterShr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitShr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitShr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShrContext shr() throws RecognitionException {
		ShrContext _localctx = new ShrContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_shr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2666);
			match(GT);
			setState(2667);
			if (!(this.next('>'))) throw new FailedPredicateException(this, "this.next('>')");
			setState(2668);
			match(GT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 112:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 209:
			return shl_sempred((ShlContext)_localctx, predIndex);
		case 210:
			return shr_sempred((ShrContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 26);
		case 1:
			return precpred(_ctx, 25);
		case 2:
			return precpred(_ctx, 24);
		case 3:
			return precpred(_ctx, 23);
		case 4:
			return precpred(_ctx, 22);
		case 5:
			return precpred(_ctx, 21);
		case 6:
			return precpred(_ctx, 20);
		case 7:
			return precpred(_ctx, 19);
		case 8:
			return precpred(_ctx, 18);
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 13);
		case 11:
			return precpred(_ctx, 12);
		case 12:
			return precpred(_ctx, 37);
		case 13:
			return precpred(_ctx, 36);
		case 14:
			return precpred(_ctx, 35);
		case 15:
			return precpred(_ctx, 34);
		case 16:
			return precpred(_ctx, 33);
		case 17:
			return precpred(_ctx, 32);
		case 18:
			return precpred(_ctx, 31);
		case 19:
			return precpred(_ctx, 27);
		case 20:
			return precpred(_ctx, 17);
		}
		return true;
	}
	private boolean shl_sempred(ShlContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return this.next('<');
		}
		return true;
	}
	private boolean shr_sempred(ShrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return this.next('>');
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0084\u0a71\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\3\2\7\2\u01aa\n\2\f\2"+
		"\16\2\u01ad\13\2\3\2\7\2\u01b0\n\2\f\2\16\2\u01b3\13\2\3\2\3\2\3\3\5\3"+
		"\u01b8\n\3\3\3\3\3\3\3\7\3\u01bd\n\3\f\3\16\3\u01c0\13\3\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\u01c7\n\4\3\5\5\5\u01ca\n\5\3\5\3\5\3\5\7\5\u01cf\n\5\f\5\16"+
		"\5\u01d2\13\5\3\6\3\6\3\6\5\6\u01d7\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01df"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01e7\n\b\3\b\3\b\5\b\u01eb\n\b\3\b\5"+
		"\b\u01ee\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01f6\n\b\3\b\5\b\u01f9\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u0200\n\b\3\b\3\b\5\b\u0204\n\b\3\t\3\t\3\t\7\t"+
		"\u0209\n\t\f\t\16\t\u020c\13\t\3\n\3\n\3\n\7\n\u0211\n\n\f\n\16\n\u0214"+
		"\13\n\3\13\3\13\3\13\7\13\u0219\n\13\f\13\16\13\u021c\13\13\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\6\r\u0225\n\r\r\r\16\r\u0226\3\16\3\16\3\16\3\16\5"+
		"\16\u022d\n\16\3\16\3\16\3\17\3\17\3\17\6\17\u0234\n\17\r\17\16\17\u0235"+
		"\3\20\5\20\u0239\n\20\3\20\3\20\3\20\7\20\u023e\n\20\f\20\16\20\u0241"+
		"\13\20\3\21\3\21\5\21\u0245\n\21\3\21\3\21\5\21\u0249\n\21\3\22\3\22\5"+
		"\22\u024d\n\22\3\22\3\22\3\22\5\22\u0252\n\22\3\23\3\23\3\23\7\23\u0257"+
		"\n\23\f\23\16\23\u025a\13\23\3\23\5\23\u025d\n\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\7\25\u0265\n\25\f\25\16\25\u0268\13\25\3\25\3\25\3\25\7\25"+
		"\u026d\n\25\f\25\16\25\u0270\13\25\3\25\3\25\3\25\7\25\u0275\n\25\f\25"+
		"\16\25\u0278\13\25\3\25\5\25\u027b\n\25\3\26\6\26\u027e\n\26\r\26\16\26"+
		"\u027f\3\26\5\26\u0283\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u028a\n\27\3"+
		"\30\3\30\3\30\3\30\7\30\u0290\n\30\f\30\16\30\u0293\13\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\7\30\u029c\n\30\f\30\16\30\u029f\13\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\7\30\u02a8\n\30\f\30\16\30\u02ab\13\30\3"+
		"\30\3\30\5\30\u02af\n\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u02c4\n\32\3\33"+
		"\3\33\3\33\7\33\u02c9\n\33\f\33\16\33\u02cc\13\33\3\33\5\33\u02cf\n\33"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\7\35\u02d7\n\35\f\35\16\35\u02da\13\35"+
		"\3\35\3\35\3\35\7\35\u02df\n\35\f\35\16\35\u02e2\13\35\3\35\3\35\3\35"+
		"\7\35\u02e7\n\35\f\35\16\35\u02ea\13\35\3\35\5\35\u02ed\n\35\3\36\6\36"+
		"\u02f0\n\36\r\36\16\36\u02f1\3\36\3\36\3\36\3\36\5\36\u02f8\n\36\3\36"+
		"\3\36\3\36\3\36\3\36\6\36\u02ff\n\36\r\36\16\36\u0300\3\36\3\36\5\36\u0305"+
		"\n\36\3\36\3\36\5\36\u0309\n\36\3\37\3\37\3\37\3\37\5\37\u030f\n\37\3"+
		" \3 \3!\3!\3!\3!\5!\u0317\n!\3\"\3\"\3#\3#\3$\7$\u031e\n$\f$\16$\u0321"+
		"\13$\3$\3$\5$\u0325\n$\3%\5%\u0328\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\5%\u0337\n%\3&\3&\5&\u033b\n&\3\'\5\'\u033e\n\'\3\'\3\'\3\'\3"+
		"\'\3\'\7\'\u0345\n\'\f\'\16\'\u0348\13\'\3\'\7\'\u034b\n\'\f\'\16\'\u034e"+
		"\13\'\3\'\5\'\u0351\n\'\3(\3(\3(\3(\5(\u0357\n(\3(\3(\3)\3)\5)\u035d\n"+
		")\3*\3*\3*\5*\u0362\n*\3+\3+\3+\3+\3,\5,\u0369\n,\3,\5,\u036c\n,\3,\3"+
		",\3,\3,\3,\7,\u0373\n,\f,\16,\u0376\13,\3,\5,\u0379\n,\5,\u037b\n,\3,"+
		"\5,\u037e\n,\3,\3,\3,\3,\5,\u0384\n,\5,\u0386\n,\5,\u0388\n,\3-\3-\3-"+
		"\3-\5-\u038e\n-\3-\3-\5-\u0392\n-\3-\3-\5-\u0396\n-\3-\5-\u0399\n-\3-"+
		"\3-\3.\5.\u039e\n.\3.\5.\u03a1\n.\3.\3.\5.\u03a5\n.\5.\u03a7\n.\3/\3/"+
		"\3\60\3\60\3\61\3\61\3\61\7\61\u03b0\n\61\f\61\16\61\u03b3\13\61\3\61"+
		"\5\61\u03b6\n\61\3\62\7\62\u03b9\n\62\f\62\16\62\u03bc\13\62\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\5\64\u03c8\n\64\3\64\5\64\u03cb"+
		"\n\64\3\64\3\64\3\64\3\64\3\65\3\65\5\65\u03d3\n\65\3\66\3\66\3\66\5\66"+
		"\u03d8\n\66\3\66\5\66\u03db\n\66\3\66\3\66\5\66\u03df\n\66\3\66\3\66\5"+
		"\66\u03e3\n\66\3\67\3\67\3\67\5\67\u03e8\n\67\3\67\3\67\5\67\u03ec\n\67"+
		"\3\67\3\67\5\67\u03f0\n\67\3\67\3\67\38\38\38\78\u03f7\n8\f8\168\u03fa"+
		"\138\38\58\u03fd\n8\39\79\u0400\n9\f9\169\u0403\139\39\59\u0406\n9\39"+
		"\39\39\39\3:\3:\3:\7:\u040f\n:\f:\16:\u0412\13:\3:\5:\u0415\n:\3;\7;\u0418"+
		"\n;\f;\16;\u041b\13;\3;\5;\u041e\n;\3;\3;\3<\3<\3<\5<\u0425\n<\3<\5<\u0428"+
		"\n<\3<\3<\5<\u042c\n<\3<\3<\3=\3=\3=\7=\u0433\n=\f=\16=\u0436\13=\3=\5"+
		"=\u0439\n=\3>\7>\u043c\n>\f>\16>\u043f\13>\3>\5>\u0442\n>\3>\3>\3>\3>"+
		"\5>\u0448\n>\3?\3?\5?\u044c\n?\3?\3?\3@\3@\5@\u0452\n@\3@\3@\3A\3A\3A"+
		"\3B\3B\3B\5B\u045c\nB\3B\5B\u045f\nB\3B\3B\3B\3B\3C\3C\3C\5C\u0468\nC"+
		"\3C\3C\3C\3C\3C\3C\3D\3D\5D\u0472\nD\3D\3D\3D\3D\3D\3D\3D\3E\5E\u047c"+
		"\nE\3E\3E\3E\5E\u0481\nE\3E\3E\5E\u0485\nE\5E\u0487\nE\3E\5E\u048a\nE"+
		"\3E\3E\7E\u048e\nE\fE\16E\u0491\13E\3E\7E\u0494\nE\fE\16E\u0497\13E\3"+
		"E\3E\3F\7F\u049c\nF\fF\16F\u049f\13F\3F\5F\u04a2\nF\3F\3F\3F\3F\3F\5F"+
		"\u04a9\nF\3G\3G\3G\5G\u04ae\nG\3H\3H\3H\5H\u04b3\nH\3I\3I\3I\3I\5I\u04b9"+
		"\nI\3I\3I\5I\u04bd\nI\3I\3I\5I\u04c1\nI\3I\5I\u04c4\nI\3J\3J\3J\3J\5J"+
		"\u04ca\nJ\3J\3J\3J\3J\7J\u04d0\nJ\fJ\16J\u04d3\13J\3J\3J\3J\5J\u04d8\n"+
		"J\3J\5J\u04db\nJ\3K\3K\3K\7K\u04e0\nK\fK\16K\u04e3\13K\3K\5K\u04e6\nK"+
		"\3L\7L\u04e9\nL\fL\16L\u04ec\13L\3L\3L\3L\5L\u04f1\nL\3L\3L\3M\3M\3M\3"+
		"M\3M\3M\5M\u04fb\nM\3M\3M\3N\3N\3N\3N\5N\u0503\nN\5N\u0505\nN\3N\3N\3"+
		"O\3O\5O\u050b\nO\3P\3P\5P\u050f\nP\3P\3P\5P\u0513\nP\3P\3P\7P\u0517\n"+
		"P\fP\16P\u051a\13P\3P\7P\u051d\nP\fP\16P\u0520\13P\3P\3P\3Q\7Q\u0525\n"+
		"Q\fQ\16Q\u0528\13Q\3Q\3Q\5Q\u052c\nQ\3Q\3Q\3Q\5Q\u0531\nQ\5Q\u0533\nQ"+
		"\3R\5R\u0536\nR\3R\3R\5R\u053a\nR\3R\5R\u053d\nR\3R\3R\3R\3R\5R\u0543"+
		"\nR\3R\3R\7R\u0547\nR\fR\16R\u054a\13R\3R\7R\u054d\nR\fR\16R\u0550\13"+
		"R\3R\3R\3S\7S\u0555\nS\fS\16S\u0558\13S\3S\3S\5S\u055c\nS\3S\3S\3S\3S"+
		"\5S\u0562\nS\5S\u0564\nS\3T\3T\5T\u0568\nT\3T\3T\7T\u056c\nT\fT\16T\u056f"+
		"\13T\3T\7T\u0572\nT\fT\16T\u0575\13T\3T\3T\3U\7U\u057a\nU\fU\16U\u057d"+
		"\13U\3U\3U\5U\u0581\nU\3U\3U\5U\u0585\nU\5U\u0587\nU\3V\3V\5V\u058b\n"+
		"V\3V\3V\3V\3V\3V\3W\3W\3W\5W\u0595\nW\3W\3W\3W\5W\u059a\nW\3W\3W\5W\u059e"+
		"\nW\3W\5W\u05a1\nW\3W\3W\3X\3X\3X\7X\u05a8\nX\fX\16X\u05ab\13X\3X\5X\u05ae"+
		"\nX\3Y\7Y\u05b1\nY\fY\16Y\u05b4\13Y\3Y\3Y\5Y\u05b8\nY\3Y\3Y\3Y\3Z\3Z\3"+
		"Z\7Z\u05c0\nZ\fZ\16Z\u05c3\13Z\3Z\3Z\3Z\7Z\u05c8\nZ\fZ\16Z\u05cb\13Z\3"+
		"Z\3Z\3[\3[\3[\3[\3\\\3\\\3\\\3\\\7\\\u05d7\n\\\f\\\16\\\u05da\13\\\3\\"+
		"\5\\\u05dd\n\\\3]\3]\3]\7]\u05e2\n]\f]\16]\u05e5\13]\3]\5]\u05e8\n]\3"+
		"^\5^\u05eb\n^\3^\3^\3^\5^\u05f0\n^\3_\3_\3_\7_\u05f5\n_\f_\16_\u05f8\13"+
		"_\3_\5_\u05fb\n_\3`\5`\u05fe\n`\3`\3`\3`\5`\u0603\n`\5`\u0605\n`\3`\3"+
		"`\5`\u0609\n`\3a\3a\3a\3a\7a\u060f\na\fa\16a\u0612\13a\3a\5a\u0615\na"+
		"\3b\3b\5b\u0619\nb\3c\3c\3c\3c\3d\5d\u0620\nd\3d\3d\3d\5d\u0625\nd\3e"+
		"\3e\3e\3e\3e\3f\3f\3f\3f\5f\u0630\nf\3f\3f\3f\3f\7f\u0636\nf\ff\16f\u0639"+
		"\13f\3f\5f\u063c\nf\3f\3f\5f\u0640\nf\3f\5f\u0643\nf\3f\3f\3g\7g\u0648"+
		"\ng\fg\16g\u064b\13g\3g\3g\5g\u064f\ng\3h\3h\5h\u0653\nh\5h\u0655\nh\3"+
		"h\5h\u0658\nh\3h\3h\3i\5i\u065d\ni\3i\3i\3i\3i\3j\3j\3j\3j\3j\3j\3j\5"+
		"j\u066a\nj\3j\5j\u066d\nj\3k\3k\3k\3k\3k\3k\3l\3l\3l\3l\3l\3m\3m\5m\u067c"+
		"\nm\3n\3n\3n\5n\u0681\nn\3o\3o\3o\3o\3o\5o\u0688\no\3p\7p\u068b\np\fp"+
		"\16p\u068e\13p\3p\3p\3p\3p\5p\u0694\np\3p\3p\5p\u0698\np\3p\3p\3q\3q\3"+
		"q\3q\3q\5q\u06a1\nq\5q\u06a3\nq\3r\3r\6r\u06a7\nr\rr\16r\u06a8\3r\3r\3"+
		"r\3r\3r\3r\5r\u06b1\nr\3r\3r\3r\3r\3r\3r\3r\5r\u06ba\nr\3r\3r\3r\3r\5"+
		"r\u06c0\nr\3r\5r\u06c3\nr\3r\3r\5r\u06c7\nr\3r\5r\u06ca\nr\3r\3r\5r\u06ce"+
		"\nr\3r\3r\7r\u06d2\nr\fr\16r\u06d5\13r\3r\3r\3r\3r\3r\7r\u06dc\nr\fr\16"+
		"r\u06df\13r\3r\5r\u06e2\nr\3r\3r\3r\7r\u06e7\nr\fr\16r\u06ea\13r\3r\5"+
		"r\u06ed\nr\3r\3r\3r\3r\3r\3r\5r\u06f5\nr\3r\3r\3r\3r\3r\3r\3r\3r\3r\5"+
		"r\u0700\nr\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3"+
		"r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\5r\u0726\nr\3r\3r\3"+
		"r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\5r\u0736\nr\3r\3r\3r\3r\3r\3r\3r\3"+
		"r\3r\3r\3r\3r\3r\3r\5r\u0746\nr\7r\u0748\nr\fr\16r\u074b\13r\3s\3s\3t"+
		"\3t\3u\6u\u0752\nu\ru\16u\u0753\3u\3u\3u\3u\3u\3u\3u\3u\3u\5u\u075f\n"+
		"u\3v\3v\3w\3w\5w\u0765\nw\3x\3x\7x\u0769\nx\fx\16x\u076c\13x\3x\5x\u076f"+
		"\nx\3x\3x\3y\6y\u0774\ny\ry\16y\u0775\3y\5y\u0779\ny\3y\5y\u077c\ny\3"+
		"z\3z\5z\u0780\nz\3z\3z\3{\3{\3{\3|\3|\3|\7|\u078a\n|\f|\16|\u078d\13|"+
		"\3|\5|\u0790\n|\3|\3|\3|\3|\5|\u0796\n|\3}\3}\3}\6}\u079b\n}\r}\16}\u079c"+
		"\3}\5}\u07a0\n}\3~\3~\3\177\3\177\3\177\5\177\u07a7\n\177\3\u0080\3\u0080"+
		"\3\u0080\7\u0080\u07ac\n\u0080\f\u0080\16\u0080\u07af\13\u0080\3\u0080"+
		"\3\u0080\5\u0080\u07b3\n\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081"+
		"\7\u0081\u07ba\n\u0081\f\u0081\16\u0081\u07bd\13\u0081\3\u0081\3\u0081"+
		"\3\u0081\5\u0081\u07c2\n\u0081\5\u0081\u07c4\n\u0081\3\u0082\7\u0082\u07c7"+
		"\n\u0082\f\u0082\16\u0082\u07ca\13\u0082\3\u0082\3\u0082\3\u0082\5\u0082"+
		"\u07cf\n\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u07d4\n\u0082\3\u0083\3"+
		"\u0083\3\u0083\3\u0084\3\u0084\3\u0084\7\u0084\u07dc\n\u0084\f\u0084\16"+
		"\u0084\u07df\13\u0084\3\u0084\3\u0084\3\u0084\7\u0084\u07e4\n\u0084\f"+
		"\u0084\16\u0084\u07e7\13\u0084\3\u0084\5\u0084\u07ea\n\u0084\5\u0084\u07ec"+
		"\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\5\u0086"+
		"\u07f5\n\u0086\3\u0087\3\u0087\3\u0087\5\u0087\u07fa\n\u0087\3\u0087\3"+
		"\u0087\3\u0088\3\u0088\3\u0088\7\u0088\u0801\n\u0088\f\u0088\16\u0088"+
		"\u0804\13\u0088\3\u0088\5\u0088\u0807\n\u0088\3\u0089\3\u0089\3\u0089"+
		"\5\u0089\u080c\n\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0811\n\u0089\3"+
		"\u008a\3\u008a\3\u008a\3\u008a\3\u008a\7\u008a\u0818\n\u008a\f\u008a\16"+
		"\u008a\u081b\13\u008a\3\u008a\5\u008a\u081e\n\u008a\5\u008a\u0820\n\u008a"+
		"\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\7\u008c\u0829"+
		"\n\u008c\f\u008c\16\u008c\u082c\13\u008c\3\u008c\5\u008c\u082f\n\u008c"+
		"\3\u008d\5\u008d\u0832\n\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0837\n"+
		"\u008d\3\u008d\5\u008d\u083a\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3"+
		"\u008d\5\u008d\u0841\n\u008d\3\u008e\3\u008e\3\u008e\7\u008e\u0846\n\u008e"+
		"\f\u008e\16\u008e\u0849\13\u008e\3\u008e\5\u008e\u084c\n\u008e\3\u008f"+
		"\7\u008f\u084f\n\u008f\f\u008f\16\u008f\u0852\13\u008f\3\u008f\3\u008f"+
		"\3\u008f\5\u008f\u0857\n\u008f\3\u0090\5\u0090\u085a\n\u0090\3\u0090\3"+
		"\u0090\3\u0090\3\u0090\5\u0090\u0860\n\u0090\3\u0091\3\u0091\3\u0091\3"+
		"\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0095"+
		"\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\5\u0096\u0880\n\u0096\5\u0096\u0882\n\u0096\3\u0097\3\u0097\3\u0097\3"+
		"\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u088e\n"+
		"\u0097\5\u0097\u0890\n\u0097\3\u0098\3\u0098\3\u0098\3\u0098\7\u0098\u0896"+
		"\n\u0098\f\u0098\16\u0098\u0899\13\u0098\3\u0098\5\u0098\u089c\n\u0098"+
		"\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\7\u0099\u08a4\n\u0099"+
		"\f\u0099\16\u0099\u08a7\13\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099"+
		"\u08ad\n\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u08b4\n"+
		"\u009a\5\u009a\u08b6\n\u009a\3\u009b\7\u009b\u08b9\n\u009b\f\u009b\16"+
		"\u009b\u08bc\13\u009b\3\u009b\3\u009b\5\u009b\u08c0\n\u009b\3\u009c\5"+
		"\u009c\u08c3\n\u009c\3\u009c\3\u009c\3\u009c\7\u009c\u08c8\n\u009c\f\u009c"+
		"\16\u009c\u08cb\13\u009c\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e\5\u009e"+
		"\u08d2\n\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u08e1\n\u009f"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\5\u00a0\u08ec\n\u00a0\3\u00a0\3\u00a0\5\u00a0\u08f0\n\u00a0\3\u00a0\5"+
		"\u00a0\u08f3\n\u00a0\3\u00a1\5\u00a1\u08f6\n\u00a1\3\u00a1\5\u00a1\u08f9"+
		"\n\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u08fe\n\u00a1\3\u00a2\3\u00a2"+
		"\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u090f\n\u00a6\3\u00a6\3\u00a6"+
		"\5\u00a6\u0913\n\u00a6\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u0918\n\u00a6\3"+
		"\u00a7\3\u00a7\5\u00a7\u091c\n\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3"+
		"\u00a8\5\u00a8\u0923\n\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\5"+
		"\u00a9\u092a\n\u00a9\5\u00a9\u092c\n\u00a9\3\u00a9\5\u00a9\u092f\n\u00a9"+
		"\3\u00aa\3\u00aa\3\u00aa\7\u00aa\u0934\n\u00aa\f\u00aa\16\u00aa\u0937"+
		"\13\u00aa\3\u00ab\7\u00ab\u093a\n\u00ab\f\u00ab\16\u00ab\u093d\13\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\5\u00ab\u0948\n\u00ab\3\u00ab\5\u00ab\u094b\n\u00ab\3\u00ab\5\u00ab\u094e"+
		"\n\u00ab\3\u00ac\7\u00ac\u0951\n\u00ac\f\u00ac\16\u00ac\u0954\13\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u095b\n\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ae\3\u00ae\3\u00ae\7\u00ae\u0962\n\u00ae\f\u00ae\16\u00ae"+
		"\u0965\13\u00ae\3\u00ae\5\u00ae\u0968\n\u00ae\3\u00af\3\u00af\5\u00af"+
		"\u096c\n\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\6\u00b0\u0977\n\u00b0\r\u00b0\16\u00b0\u0978\3\u00b0"+
		"\5\u00b0\u097c\n\u00b0\5\u00b0\u097e\n\u00b0\3\u00b1\3\u00b1\3\u00b1\3"+
		"\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\7\u00b3"+
		"\u098b\n\u00b3\f\u00b3\16\u00b3\u098e\13\u00b3\3\u00b3\5\u00b3\u0991\n"+
		"\u00b3\3\u00b4\3\u00b4\5\u00b4\u0995\n\u00b4\3\u00b5\3\u00b5\3\u00b5\5"+
		"\u00b5\u099a\n\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3"+
		"\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6"+
		"\u09aa\n\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\6\u00b9\u09b6\n\u00b9\r\u00b9\16\u00b9\u09b7"+
		"\3\u00b9\5\u00b9\u09bb\n\u00b9\5\u00b9\u09bd\n\u00b9\3\u00b9\3\u00b9\3"+
		"\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bc\3\u00bc\5\u00bc\u09cd\n\u00bc\3\u00bc\5\u00bc\u09d0\n"+
		"\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00be\5\u00be"+
		"\u09d9\n\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u09df\n\u00be\3"+
		"\u00be\3\u00be\5\u00be\u09e3\n\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00c0\3"+
		"\u00c0\5\u00c0\u09ea\n\u00c0\3\u00c1\3\u00c1\3\u00c1\7\u00c1\u09ef\n\u00c1"+
		"\f\u00c1\16\u00c1\u09f2\13\u00c1\3\u00c1\5\u00c1\u09f5\n\u00c1\3\u00c2"+
		"\7\u00c2\u09f8\n\u00c2\f\u00c2\16\u00c2\u09fb\13\u00c2\3\u00c2\3\u00c2"+
		"\5\u00c2\u09ff\n\u00c2\3\u00c2\5\u00c2\u0a02\n\u00c2\3\u00c2\3\u00c2\3"+
		"\u00c3\3\u00c3\3\u00c3\7\u00c3\u0a09\n\u00c3\f\u00c3\16\u00c3\u0a0c\13"+
		"\u00c3\3\u00c3\3\u00c3\3\u00c3\7\u00c3\u0a11\n\u00c3\f\u00c3\16\u00c3"+
		"\u0a14\13\u00c3\3\u00c3\3\u00c3\3\u00c4\5\u00c4\u0a19\n\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c5\5\u00c5\u0a1e\n\u00c5\3\u00c5\3\u00c5\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9"+
		"\7\u00c9\u0a2d\n\u00c9\f\u00c9\16\u00c9\u0a30\13\u00c9\3\u00c9\5\u00c9"+
		"\u0a33\n\u00c9\3\u00ca\3\u00ca\5\u00ca\u0a37\n\u00ca\3\u00cb\5\u00cb\u0a3a"+
		"\n\u00cb\3\u00cb\5\u00cb\u0a3d\n\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb"+
		"\u0a42\n\u00cb\3\u00cb\5\u00cb\u0a45\n\u00cb\3\u00cb\3\u00cb\3\u00cb\5"+
		"\u00cb\u0a4a\n\u00cb\3\u00cc\3\u00cc\3\u00cc\7\u00cc\u0a4f\n\u00cc\f\u00cc"+
		"\16\u00cc\u0a52\13\u00cc\3\u00cc\5\u00cc\u0a55\n\u00cc\3\u00cd\3\u00cd"+
		"\3\u00ce\3\u00ce\3\u00cf\3\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\5\u00d0\u0a63\n\u00d0\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d3"+
		"\3\u00d3\3\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\2\3\u00e2"+
		"\u00d5\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a"+
		"\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132"+
		"\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a"+
		"\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162"+
		"\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a"+
		"\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192"+
		"\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\2\21\5\2"+
		"TTVV~~\4\2\5\5&&\3\2HI\4\2[[]]\4\2UUZZ\3\2VX\3\2TU\3\2jo\3\2_h\6\2\13"+
		"\13  GMRR\4\2\5\5\26\26\5\2\67\6799SS\4\288;<\3\2\3\67\4\2UUW|\2\u0b96"+
		"\2\u01ab\3\2\2\2\4\u01b7\3\2\2\2\6\u01c6\3\2\2\2\b\u01c9\3\2\2\2\n\u01d3"+
		"\3\2\2\2\f\u01de\3\2\2\2\16\u0203\3\2\2\2\20\u0205\3\2\2\2\22\u020d\3"+
		"\2\2\2\24\u0215\3\2\2\2\26\u021d\3\2\2\2\30\u0221\3\2\2\2\32\u0228\3\2"+
		"\2\2\34\u0230\3\2\2\2\36\u0238\3\2\2\2 \u0242\3\2\2\2\"\u024a\3\2\2\2"+
		"$\u0253\3\2\2\2&\u025e\3\2\2\2(\u027a\3\2\2\2*\u0282\3\2\2\2,\u0289\3"+
		"\2\2\2.\u02ae\3\2\2\2\60\u02b0\3\2\2\2\62\u02c3\3\2\2\2\64\u02c5\3\2\2"+
		"\2\66\u02d0\3\2\2\28\u02ec\3\2\2\2:\u0308\3\2\2\2<\u030e\3\2\2\2>\u0310"+
		"\3\2\2\2@\u0316\3\2\2\2B\u0318\3\2\2\2D\u031a\3\2\2\2F\u031f\3\2\2\2H"+
		"\u0327\3\2\2\2J\u033a\3\2\2\2L\u033d\3\2\2\2N\u0352\3\2\2\2P\u035c\3\2"+
		"\2\2R\u035e\3\2\2\2T\u0363\3\2\2\2V\u0387\3\2\2\2X\u0389\3\2\2\2Z\u039d"+
		"\3\2\2\2\\\u03a8\3\2\2\2^\u03aa\3\2\2\2`\u03ac\3\2\2\2b\u03ba\3\2\2\2"+
		"d\u03c1\3\2\2\2f\u03c4\3\2\2\2h\u03d2\3\2\2\2j\u03d4\3\2\2\2l\u03e4\3"+
		"\2\2\2n\u03f3\3\2\2\2p\u0401\3\2\2\2r\u040b\3\2\2\2t\u0419\3\2\2\2v\u0421"+
		"\3\2\2\2x\u042f\3\2\2\2z\u043d\3\2\2\2|\u0449\3\2\2\2~\u044f\3\2\2\2\u0080"+
		"\u0455\3\2\2\2\u0082\u0458\3\2\2\2\u0084\u0464\3\2\2\2\u0086\u046f\3\2"+
		"\2\2\u0088\u047b\3\2\2\2\u008a\u049d\3\2\2\2\u008c\u04aa\3\2\2\2\u008e"+
		"\u04af\3\2\2\2\u0090\u04b4\3\2\2\2\u0092\u04c5\3\2\2\2\u0094\u04dc\3\2"+
		"\2\2\u0096\u04ea\3\2\2\2\u0098\u04f4\3\2\2\2\u009a\u04fe\3\2\2\2\u009c"+
		"\u050a\3\2\2\2\u009e\u050c\3\2\2\2\u00a0\u0526\3\2\2\2\u00a2\u0535\3\2"+
		"\2\2\u00a4\u0556\3\2\2\2\u00a6\u0565\3\2\2\2\u00a8\u057b\3\2\2\2\u00aa"+
		"\u0588\3\2\2\2\u00ac\u0591\3\2\2\2\u00ae\u05a4\3\2\2\2\u00b0\u05b2\3\2"+
		"\2\2\u00b2\u05c1\3\2\2\2\u00b4\u05ce\3\2\2\2\u00b6\u05dc\3\2\2\2\u00b8"+
		"\u05e3\3\2\2\2\u00ba\u05ea\3\2\2\2\u00bc\u05f6\3\2\2\2\u00be\u05fd\3\2"+
		"\2\2\u00c0\u060a\3\2\2\2\u00c2\u0618\3\2\2\2\u00c4\u061a\3\2\2\2\u00c6"+
		"\u061f\3\2\2\2\u00c8\u0626\3\2\2\2\u00ca\u062b\3\2\2\2\u00cc\u0649\3\2"+
		"\2\2\u00ce\u0654\3\2\2\2\u00d0\u065c\3\2\2\2\u00d2\u0662\3\2\2\2\u00d4"+
		"\u066e\3\2\2\2\u00d6\u0674\3\2\2\2\u00d8\u0679\3\2\2\2\u00da\u0680\3\2"+
		"\2\2\u00dc\u0687\3\2\2\2\u00de\u068c\3\2\2\2\u00e0\u06a2\3\2\2\2\u00e2"+
		"\u06f4\3\2\2\2\u00e4\u074c\3\2\2\2\u00e6\u074e\3\2\2\2\u00e8\u075e\3\2"+
		"\2\2\u00ea\u0760\3\2\2\2\u00ec\u0764\3\2\2\2\u00ee\u0766\3\2\2\2\u00f0"+
		"\u077b\3\2\2\2\u00f2\u077d\3\2\2\2\u00f4\u0783\3\2\2\2\u00f6\u0795\3\2"+
		"\2\2\u00f8\u079a\3\2\2\2\u00fa\u07a1\3\2\2\2\u00fc\u07a6\3\2\2\2\u00fe"+
		"\u07a8\3\2\2\2\u0100\u07b6\3\2\2\2\u0102\u07c8\3\2\2\2\u0104\u07d5\3\2"+
		"\2\2\u0106\u07d8\3\2\2\2\u0108\u07ef\3\2\2\2\u010a\u07f4\3\2\2\2\u010c"+
		"\u07f6\3\2\2\2\u010e\u07fd\3\2\2\2\u0110\u0810\3\2\2\2\u0112\u0812\3\2"+
		"\2\2\u0114\u0823\3\2\2\2\u0116\u0825\3\2\2\2\u0118\u0831\3\2\2\2\u011a"+
		"\u0842\3\2\2\2\u011c\u0850\3\2\2\2\u011e\u0859\3\2\2\2\u0120\u0861\3\2"+
		"\2\2\u0122\u0864\3\2\2\2\u0124\u0868\3\2\2\2\u0126\u086f\3\2\2\2\u0128"+
		"\u0875\3\2\2\2\u012a\u0878\3\2\2\2\u012c\u0883\3\2\2\2\u012e\u0891\3\2"+
		"\2\2\u0130\u08a5\3\2\2\2\u0132\u08b5\3\2\2\2\u0134\u08ba\3\2\2\2\u0136"+
		"\u08c2\3\2\2\2\u0138\u08cc\3\2\2\2\u013a\u08d1\3\2\2\2\u013c\u08e0\3\2"+
		"\2\2\u013e\u08f2\3\2\2\2\u0140\u08f5\3\2\2\2\u0142\u08ff\3\2\2\2\u0144"+
		"\u0901\3\2\2\2\u0146\u0903\3\2\2\2\u0148\u0907\3\2\2\2\u014a\u0917\3\2"+
		"\2\2\u014c\u0919\3\2\2\2\u014e\u091f\3\2\2\2\u0150\u092e\3\2\2\2\u0152"+
		"\u0930\3\2\2\2\u0154\u093b\3\2\2\2\u0156\u0952\3\2\2\2\u0158\u0957\3\2"+
		"\2\2\u015a\u095e\3\2\2\2\u015c\u0969\3\2\2\2\u015e\u097d\3\2\2\2\u0160"+
		"\u097f\3\2\2\2\u0162\u0983\3\2\2\2\u0164\u0987\3\2\2\2\u0166\u0994\3\2"+
		"\2\2\u0168\u0999\3\2\2\2\u016a\u09a9\3\2\2\2\u016c\u09ab\3\2\2\2\u016e"+
		"\u09af\3\2\2\2\u0170\u09b1\3\2\2\2\u0172\u09c0\3\2\2\2\u0174\u09c6\3\2"+
		"\2\2\u0176\u09ca\3\2\2\2\u0178\u09d3\3\2\2\2\u017a\u09d8\3\2\2\2\u017c"+
		"\u09e4\3\2\2\2\u017e\u09e9\3\2\2\2\u0180\u09eb\3\2\2\2\u0182\u09f9\3\2"+
		"\2\2\u0184\u0a0a\3\2\2\2\u0186\u0a18\3\2\2\2\u0188\u0a1d\3\2\2\2\u018a"+
		"\u0a21\3\2\2\2\u018c\u0a24\3\2\2\2\u018e\u0a27\3\2\2\2\u0190\u0a29\3\2"+
		"\2\2\u0192\u0a36\3\2\2\2\u0194\u0a49\3\2\2\2\u0196\u0a50\3\2\2\2\u0198"+
		"\u0a56\3\2\2\2\u019a\u0a58\3\2\2\2\u019c\u0a5a\3\2\2\2\u019e\u0a62\3\2"+
		"\2\2\u01a0\u0a64\3\2\2\2\u01a2\u0a66\3\2\2\2\u01a4\u0a68\3\2\2\2\u01a6"+
		"\u0a6c\3\2\2\2\u01a8\u01aa\5\u00d4k\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad"+
		"\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01b1\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ae\u01b0\5F$\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3\2\2"+
		"\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b1"+
		"\3\2\2\2\u01b4\u01b5\7\2\2\3\u01b5\3\3\2\2\2\u01b6\u01b8\7y\2\2\u01b7"+
		"\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01be\5\6"+
		"\4\2\u01ba\u01bb\7y\2\2\u01bb\u01bd\5\6\4\2\u01bc\u01ba\3\2\2\2\u01bd"+
		"\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\5\3\2\2\2"+
		"\u01c0\u01be\3\2\2\2\u01c1\u01c7\5\u019a\u00ce\2\u01c2\u01c7\7\36\2\2"+
		"\u01c3\u01c7\7\32\2\2\u01c4\u01c7\7\7\2\2\u01c5\u01c7\7:\2\2\u01c6\u01c1"+
		"\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c6\u01c3\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6"+
		"\u01c5\3\2\2\2\u01c7\7\3\2\2\2\u01c8\u01ca\7y\2\2\u01c9\u01c8\3\2\2\2"+
		"\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01d0\5\n\6\2\u01cc\u01cd"+
		"\7y\2\2\u01cd\u01cf\5\n\6\2\u01ce\u01cc\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0"+
		"\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\t\3\2\2\2\u01d2\u01d0\3\2\2\2"+
		"\u01d3\u01d6\5\f\7\2\u01d4\u01d5\7y\2\2\u01d5\u01d7\5\16\b\2\u01d6\u01d4"+
		"\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\13\3\2\2\2\u01d8\u01df\5\u019a\u00ce"+
		"\2\u01d9\u01df\7\36\2\2\u01da\u01df\7\32\2\2\u01db\u01df\7\33\2\2\u01dc"+
		"\u01df\7\7\2\2\u01dd\u01df\7:\2\2\u01de\u01d8\3\2\2\2\u01de\u01d9\3\2"+
		"\2\2\u01de\u01da\3\2\2\2\u01de\u01db\3\2\2\2\u01de\u01dc\3\2\2\2\u01de"+
		"\u01dd\3\2\2\2\u01df\r\3\2\2\2\u01e0\u01e1\7m\2\2\u01e1\u0204\7l\2\2\u01e2"+
		"\u01e3\7m\2\2\u01e3\u01e6\5\20\t\2\u01e4\u01e5\7v\2\2\u01e5\u01e7\5\22"+
		"\n\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8"+
		"\u01e9\7v\2\2\u01e9\u01eb\5\24\13\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3"+
		"\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ee\7v\2\2\u01ed\u01ec\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\7l\2\2\u01f0\u0204\3\2"+
		"\2\2\u01f1\u01f2\7m\2\2\u01f2\u01f5\5\22\n\2\u01f3\u01f4\7v\2\2\u01f4"+
		"\u01f6\5\24\13\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3"+
		"\2\2\2\u01f7\u01f9\7v\2\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fa\3\2\2\2\u01fa\u01fb\7l\2\2\u01fb\u0204\3\2\2\2\u01fc\u01fd\7m\2"+
		"\2\u01fd\u01ff\5\24\13\2\u01fe\u0200\7v\2\2\u01ff\u01fe\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\7l\2\2\u0202\u0204\3\2"+
		"\2\2\u0203\u01e0\3\2\2\2\u0203\u01e2\3\2\2\2\u0203\u01f1\3\2\2\2\u0203"+
		"\u01fc\3\2\2\2\u0204\17\3\2\2\2\u0205\u020a\5\u0198\u00cd\2\u0206\u0207"+
		"\7v\2\2\u0207\u0209\5\u0198\u00cd\2\u0208\u0206\3\2\2\2\u0209\u020c\3"+
		"\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\21\3\2\2\2\u020c"+
		"\u020a\3\2\2\2\u020d\u0212\5\u0168\u00b5\2\u020e\u020f\7v\2\2\u020f\u0211"+
		"\5\u0168\u00b5\2\u0210\u020e\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3"+
		"\2\2\2\u0212\u0213\3\2\2\2\u0213\23\3\2\2\2\u0214\u0212\3\2\2\2\u0215"+
		"\u021a\5\26\f\2\u0216\u0217\7v\2\2\u0217\u0219\5\26\f\2\u0218\u0216\3"+
		"\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\25\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021e\5\u019a\u00ce\2\u021e\u021f"+
		"\7i\2\2\u021f\u0220\5\u0168\u00b5\2\u0220\27\3\2\2\2\u0221\u0224\5\32"+
		"\16\2\u0222\u0223\7y\2\2\u0223\u0225\5\n\6\2\u0224\u0222\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\31\3\2\2"+
		"\2\u0228\u0229\7m\2\2\u0229\u022c\5\u0168\u00b5\2\u022a\u022b\7\3\2\2"+
		"\u022b\u022d\5\36\20\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e"+
		"\3\2\2\2\u022e\u022f\7l\2\2\u022f\33\3\2\2\2\u0230\u0233\5\32\16\2\u0231"+
		"\u0232\7y\2\2\u0232\u0234\5 \21\2\u0233\u0231\3\2\2\2\u0234\u0235\3\2"+
		"\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\35\3\2\2\2\u0237\u0239"+
		"\7y\2\2\u0238\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"\u023f\5 \21\2\u023b\u023c\7y\2\2\u023c\u023e\5 \21\2\u023d\u023b\3\2"+
		"\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\37\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0244\5\f\7\2\u0243\u0245\7y\2\2"+
		"\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0248\3\2\2\2\u0246\u0249"+
		"\5\16\b\2\u0247\u0249\5\"\22\2\u0248\u0246\3\2\2\2\u0248\u0247\3\2\2\2"+
		"\u0248\u0249\3\2\2\2\u0249!\3\2\2\2\u024a\u024c\7\u0083\2\2\u024b\u024d"+
		"\5$\23\2\u024c\u024b\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\3\2\2\2\u024e"+
		"\u0251\7\u0084\2\2\u024f\u0250\7z\2\2\u0250\u0252\5\u0168\u00b5\2\u0251"+
		"\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252#\3\2\2\2\u0253\u0258\5\u0168"+
		"\u00b5\2\u0254\u0255\7v\2\2\u0255\u0257\5\u0168\u00b5\2\u0256\u0254\3"+
		"\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259"+
		"\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025d\7v\2\2\u025c\u025b\3\2"+
		"\2\2\u025c\u025d\3\2\2\2\u025d%\3\2\2\2\u025e\u025f\5\4\3\2\u025f\u0260"+
		"\7Z\2\2\u0260\u0261\5(\25\2\u0261\'\3\2\2\2\u0262\u0266\7\u0083\2\2\u0263"+
		"\u0265\5*\26\2\u0264\u0263\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2"+
		"\2\2\u0266\u0267\3\2\2\2\u0267\u0269\3\2\2\2\u0268\u0266\3\2\2\2\u0269"+
		"\u027b\7\u0084\2\2\u026a\u026e\7\u0081\2\2\u026b\u026d\5*\26\2\u026c\u026b"+
		"\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"\u0271\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u027b\7\u0082\2\2\u0272\u0276"+
		"\7\177\2\2\u0273\u0275\5*\26\2\u0274\u0273\3\2\2\2\u0275\u0278\3\2\2\2"+
		"\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0279\3\2\2\2\u0278\u0276"+
		"\3\2\2\2\u0279\u027b\7\u0080\2\2\u027a\u0262\3\2\2\2\u027a\u026a\3\2\2"+
		"\2\u027a\u0272\3\2\2\2\u027b)\3\2\2\2\u027c\u027e\5,\27\2\u027d\u027c"+
		"\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280"+
		"\u0283\3\2\2\2\u0281\u0283\5(\25\2\u0282\u027d\3\2\2\2\u0282\u0281\3\2"+
		"\2\2\u0283+\3\2\2\2\u0284\u028a\5\u019e\u00d0\2\u0285\u028a\5\u01a0\u00d1"+
		"\2\u0286\u028a\5\u01a2\u00d2\2\u0287\u028a\5B\"\2\u0288\u028a\7}\2\2\u0289"+
		"\u0284\3\2\2\2\u0289\u0285\3\2\2\2\u0289\u0286\3\2\2\2\u0289\u0287\3\2"+
		"\2\2\u0289\u0288\3\2\2\2\u028a-\3\2\2\2\u028b\u028c\5\4\3\2\u028c\u028d"+
		"\7Z\2\2\u028d\u0291\7\u0083\2\2\u028e\u0290\5*\26\2\u028f\u028e\3\2\2"+
		"\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294"+
		"\3\2\2\2\u0293\u0291\3\2\2\2\u0294\u0295\7\u0084\2\2\u0295\u0296\7w\2"+
		"\2\u0296\u02af\3\2\2\2\u0297\u0298\5\4\3\2\u0298\u0299\7Z\2\2\u0299\u029d"+
		"\7\u0081\2\2\u029a\u029c\5*\26\2\u029b\u029a\3\2\2\2\u029c\u029f\3\2\2"+
		"\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a0\3\2\2\2\u029f\u029d"+
		"\3\2\2\2\u02a0\u02a1\7\u0082\2\2\u02a1\u02a2\7w\2\2\u02a2\u02af\3\2\2"+
		"\2\u02a3\u02a4\5\4\3\2\u02a4\u02a5\7Z\2\2\u02a5\u02a9\7\177\2\2\u02a6"+
		"\u02a8\5*\26\2\u02a7\u02a6\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2"+
		"\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ac\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac"+
		"\u02ad\7\u0080\2\2\u02ad\u02af\3\2\2\2\u02ae\u028b\3\2\2\2\u02ae\u0297"+
		"\3\2\2\2\u02ae\u02a3\3\2\2\2\u02af/\3\2\2\2\u02b0\u02b1\78\2\2\u02b1\u02b2"+
		"\7Z\2\2\u02b2\u02b3\5\u019a\u00ce\2\u02b3\u02b4\5\62\32\2\u02b4\61\3\2"+
		"\2\2\u02b5\u02b6\7\u0083\2\2\u02b6\u02b7\5\64\33\2\u02b7\u02b8\7\u0084"+
		"\2\2\u02b8\u02b9\7w\2\2\u02b9\u02c4\3\2\2\2\u02ba\u02bb\7\u0081\2\2\u02bb"+
		"\u02bc\5\64\33\2\u02bc\u02bd\7\u0082\2\2\u02bd\u02be\7w\2\2\u02be\u02c4"+
		"\3\2\2\2\u02bf\u02c0\7\177\2\2\u02c0\u02c1\5\64\33\2\u02c1\u02c2\7\u0080"+
		"\2\2\u02c2\u02c4\3\2\2\2\u02c3\u02b5\3\2\2\2\u02c3\u02ba\3\2\2\2\u02c3"+
		"\u02bf\3\2\2\2\u02c4\63\3\2\2\2\u02c5\u02ca\5\66\34\2\u02c6\u02c7\7w\2"+
		"\2\u02c7\u02c9\5\66\34\2\u02c8\u02c6\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca"+
		"\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2"+
		"\2\2\u02cd\u02cf\7w\2\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf"+
		"\65\3\2\2\2\u02d0\u02d1\58\35\2\u02d1\u02d2\7{\2\2\u02d2\u02d3\5D#\2\u02d3"+
		"\67\3\2\2\2\u02d4\u02d8\7\u0083\2\2\u02d5\u02d7\5:\36\2\u02d6\u02d5\3"+
		"\2\2\2\u02d7\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9"+
		"\u02db\3\2\2\2\u02da\u02d8\3\2\2\2\u02db\u02ed\7\u0084\2\2\u02dc\u02e0"+
		"\7\u0081\2\2\u02dd\u02df\5:\36\2\u02de\u02dd\3\2\2\2\u02df\u02e2\3\2\2"+
		"\2\u02e0\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e3\3\2\2\2\u02e2\u02e0"+
		"\3\2\2\2\u02e3\u02ed\7\u0082\2\2\u02e4\u02e8\7\177\2\2\u02e5\u02e7\5:"+
		"\36\2\u02e6\u02e5\3\2\2\2\u02e7\u02ea\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8"+
		"\u02e9\3\2\2\2\u02e9\u02eb\3\2\2\2\u02ea\u02e8\3\2\2\2\u02eb\u02ed\7\u0080"+
		"\2\2\u02ec\u02d4\3\2\2\2\u02ec\u02dc\3\2\2\2\u02ec\u02e4\3\2\2\2\u02ed"+
		"9\3\2\2\2\u02ee\u02f0\5<\37\2\u02ef\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2"+
		"\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u0309\3\2\2\2\u02f3\u0309"+
		"\58\35\2\u02f4\u02f7\7}\2\2\u02f5\u02f8\5\u019a\u00ce\2\u02f6\u02f8\7"+
		"\32\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9"+
		"\u02fa\7x\2\2\u02fa\u0309\5> \2\u02fb\u02fc\7}\2\2\u02fc\u02fe\7\u0083"+
		"\2\2\u02fd\u02ff\5:\36\2\u02fe\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300"+
		"\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0304\7\u0084"+
		"\2\2\u0303\u0305\5@!\2\u0304\u0303\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0306"+
		"\3\2\2\2\u0306\u0307\5B\"\2\u0307\u0309\3\2\2\2\u0308\u02ef\3\2\2\2\u0308"+
		"\u02f3\3\2\2\2\u0308\u02f4\3\2\2\2\u0308\u02fb\3\2\2\2\u0309;\3\2\2\2"+
		"\u030a\u030f\5\u019e\u00d0\2\u030b\u030f\5\u01a0\u00d1\2\u030c\u030f\5"+
		"\u01a2\u00d2\2\u030d\u030f\5B\"\2\u030e\u030a\3\2\2\2\u030e\u030b\3\2"+
		"\2\2\u030e\u030c\3\2\2\2\u030e\u030d\3\2\2\2\u030f=\3\2\2\2\u0310\u0311"+
		"\5\u019a\u00ce\2\u0311?\3\2\2\2\u0312\u0317\5\u019e\u00d0\2\u0313\u0317"+
		"\5\u01a0\u00d1\2\u0314\u0317\5\u01a2\u00d2\2\u0315\u0317\7}\2\2\u0316"+
		"\u0312\3\2\2\2\u0316\u0313\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0315\3\2"+
		"\2\2\u0317A\3\2\2\2\u0318\u0319\t\2\2\2\u0319C\3\2\2\2\u031a\u031b\5("+
		"\25\2\u031bE\3\2\2\2\u031c\u031e\5\u00d6l\2\u031d\u031c\3\2\2\2\u031e"+
		"\u0321\3\2\2\2\u031f\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0324\3\2"+
		"\2\2\u0321\u031f\3\2\2\2\u0322\u0325\5H%\2\u0323\u0325\5J&\2\u0324\u0322"+
		"\3\2\2\2\u0324\u0323\3\2\2\2\u0325G\3\2\2\2\u0326\u0328\5\u00d2j\2\u0327"+
		"\u0326\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0336\3\2\2\2\u0329\u0337\5L"+
		"\'\2\u032a\u0337\5N(\2\u032b\u0337\5T+\2\u032c\u0337\5X-\2\u032d\u0337"+
		"\5f\64\2\u032e\u0337\5h\65\2\u032f\u0337\5v<\2\u0330\u0337\5\u0082B\2"+
		"\u0331\u0337\5\u0084C\2\u0332\u0337\5\u0086D\2\u0333\u0337\5\u0088E\2"+
		"\u0334\u0337\5\u009cO\2\u0335\u0337\5\u00a6T\2\u0336\u0329\3\2\2\2\u0336"+
		"\u032a\3\2\2\2\u0336\u032b\3\2\2\2\u0336\u032c\3\2\2\2\u0336\u032d\3\2"+
		"\2\2\u0336\u032e\3\2\2\2\u0336\u032f\3\2\2\2\u0336\u0330\3\2\2\2\u0336"+
		"\u0331\3\2\2\2\u0336\u0332\3\2\2\2\u0336\u0333\3\2\2\2\u0336\u0334\3\2"+
		"\2\2\u0336\u0335\3\2\2\2\u0337I\3\2\2\2\u0338\u033b\5.\30\2\u0339\u033b"+
		"\5\60\31\2\u033a\u0338\3\2\2\2\u033a\u0339\3\2\2\2\u033bK\3\2\2\2\u033c"+
		"\u033e\7\"\2\2\u033d\u033c\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u033f\3\2"+
		"\2\2\u033f\u0340\7\24\2\2\u0340\u0350\5\u019a\u00ce\2\u0341\u0351\7w\2"+
		"\2\u0342\u0346\7\177\2\2\u0343\u0345\5\u00d4k\2\u0344\u0343\3\2\2\2\u0345"+
		"\u0348\3\2\2\2\u0346\u0344\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u034c\3\2"+
		"\2\2\u0348\u0346\3\2\2\2\u0349\u034b\5F$\2\u034a\u0349\3\2\2\2\u034b\u034e"+
		"\3\2\2\2\u034c\u034a\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034f\3\2\2\2\u034e"+
		"\u034c\3\2\2\2\u034f\u0351\7\u0080\2\2\u0350\u0341\3\2\2\2\u0350\u0342"+
		"\3\2\2\2\u0351M\3\2\2\2\u0352\u0353\7\n\2\2\u0353\u0354\7\7\2\2\u0354"+
		"\u0356\5P)\2\u0355\u0357\5R*\2\u0356\u0355\3\2\2\2\u0356\u0357\3\2\2\2"+
		"\u0357\u0358\3\2\2\2\u0358\u0359\7w\2\2\u0359O\3\2\2\2\u035a\u035d\5\u019a"+
		"\u00ce\2\u035b\u035d\7\32\2\2\u035c\u035a\3\2\2\2\u035c\u035b\3\2\2\2"+
		"\u035dQ\3\2\2\2\u035e\u0361\7\3\2\2\u035f\u0362\5\u019a\u00ce\2\u0360"+
		"\u0362\7q\2\2\u0361\u035f\3\2\2\2\u0361\u0360\3\2\2\2\u0362S\3\2\2\2\u0363"+
		"\u0364\7#\2\2\u0364\u0365\5V,\2\u0365\u0366\7w\2\2\u0366U\3\2\2\2\u0367"+
		"\u0369\5\4\3\2\u0368\u0367\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036a\3\2"+
		"\2\2\u036a\u036c\7y\2\2\u036b\u0368\3\2\2\2\u036b\u036c\3\2\2\2\u036c"+
		"\u037d\3\2\2\2\u036d\u037e\7V\2\2\u036e\u037a\7\177\2\2\u036f\u0374\5"+
		"V,\2\u0370\u0371\7v\2\2\u0371\u0373\5V,\2\u0372\u0370\3\2\2\2\u0373\u0376"+
		"\3\2\2\2\u0374\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0378\3\2\2\2\u0376"+
		"\u0374\3\2\2\2\u0377\u0379\7v\2\2\u0378\u0377\3\2\2\2\u0378\u0379\3\2"+
		"\2\2\u0379\u037b\3\2\2\2\u037a\u036f\3\2\2\2\u037a\u037b\3\2\2\2\u037b"+
		"\u037c\3\2\2\2\u037c\u037e\7\u0080\2\2\u037d\u036d\3\2\2\2\u037d\u036e"+
		"\3\2\2\2\u037e\u0388\3\2\2\2\u037f\u0385\5\4\3\2\u0380\u0383\7\3\2\2\u0381"+
		"\u0384\5\u019a\u00ce\2\u0382\u0384\7q\2\2\u0383\u0381\3\2\2\2\u0383\u0382"+
		"\3\2\2\2\u0384\u0386\3\2\2\2\u0385\u0380\3\2\2\2\u0385\u0386\3\2\2\2\u0386"+
		"\u0388\3\2\2\2\u0387\u036b\3\2\2\2\u0387\u037f\3\2\2\2\u0388W\3\2\2\2"+
		"\u0389\u038a\5Z.\2\u038a\u038b\7\f\2\2\u038b\u038d\5\u019a\u00ce\2\u038c"+
		"\u038e\5\u00b4[\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f"+
		"\3\2\2\2\u038f\u0391\7\u0083\2\2\u0390\u0392\5`\61\2\u0391\u0390\3\2\2"+
		"\2\u0391\u0392\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0395\7\u0084\2\2\u0394"+
		"\u0396\5d\63\2\u0395\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0398\3\2"+
		"\2\2\u0397\u0399\5\u00c0a\2\u0398\u0397\3\2\2\2\u0398\u0399\3\2\2\2\u0399"+
		"\u039a\3\2\2\2\u039a\u039b\5\u00eex\2\u039bY\3\2\2\2\u039c\u039e\5\\/"+
		"\2\u039d\u039c\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a0\3\2\2\2\u039f\u03a1"+
		"\7\"\2\2\u03a0\u039f\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a6\3\2\2\2\u03a2"+
		"\u03a4\7\n\2\2\u03a3\u03a5\5^\60\2\u03a4\u03a3\3\2\2\2\u03a4\u03a5\3\2"+
		"\2\2\u03a5\u03a7\3\2\2\2\u03a6\u03a2\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7"+
		"[\3\2\2\2\u03a8\u03a9\t\3\2\2\u03a9]\3\2\2\2\u03aa\u03ab\t\4\2\2\u03ab"+
		"_\3\2\2\2\u03ac\u03b1\5b\62\2\u03ad\u03ae\7v\2\2\u03ae\u03b0\5b\62\2\u03af"+
		"\u03ad\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2\2\2\u03b1\u03b2\3\2"+
		"\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4\u03b6\7v\2\2\u03b5"+
		"\u03b4\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6a\3\2\2\2\u03b7\u03b9\5\u00d6"+
		"l\2\u03b8\u03b7\3\2\2\2\u03b9\u03bc\3\2\2\2\u03ba\u03b8\3\2\2\2\u03ba"+
		"\u03bb\3\2\2\2\u03bb\u03bd\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bd\u03be\5\u013a"+
		"\u009e\2\u03be\u03bf\7x\2\2\u03bf\u03c0\5\u0168\u00b5\2\u03c0c\3\2\2\2"+
		"\u03c1\u03c2\7z\2\2\u03c2\u03c3\5\u0168\u00b5\2\u03c3e\3\2\2\2\u03c4\u03c5"+
		"\7!\2\2\u03c5\u03c7\5\u019a\u00ce\2\u03c6\u03c8\5\u00b4[\2\u03c7\u03c6"+
		"\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03ca\3\2\2\2\u03c9\u03cb\5\u00c0a"+
		"\2\u03ca\u03c9\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03cd"+
		"\7i\2\2\u03cd\u03ce\5\u0168\u00b5\2\u03ce\u03cf\7w\2\2\u03cfg\3\2\2\2"+
		"\u03d0\u03d3\5j\66\2\u03d1\u03d3\5l\67\2\u03d2\u03d0\3\2\2\2\u03d2\u03d1"+
		"\3\2\2\2\u03d3i\3\2\2\2\u03d4\u03d5\7\35\2\2\u03d5\u03d7\5\u019a\u00ce"+
		"\2\u03d6\u03d8\5\u00b4[\2\u03d7\u03d6\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8"+
		"\u03da\3\2\2\2\u03d9\u03db\5\u00c0a\2\u03da\u03d9\3\2\2\2\u03da\u03db"+
		"\3\2\2\2\u03db\u03e2\3\2\2\2\u03dc\u03de\7\177\2\2\u03dd\u03df\5n8\2\u03de"+
		"\u03dd\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e3\7\u0080"+
		"\2\2\u03e1\u03e3\7w\2\2\u03e2\u03dc\3\2\2\2\u03e2\u03e1\3\2\2\2\u03e3"+
		"k\3\2\2\2\u03e4\u03e5\7\35\2\2\u03e5\u03e7\5\u019a\u00ce\2\u03e6\u03e8"+
		"\5\u00b4[\2\u03e7\u03e6\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9\3\2\2"+
		"\2\u03e9\u03eb\7\u0083\2\2\u03ea\u03ec\5r:\2\u03eb\u03ea\3\2\2\2\u03eb"+
		"\u03ec\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ef\7\u0084\2\2\u03ee\u03f0"+
		"\5\u00c0a\2\u03ef\u03ee\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f1\3\2\2"+
		"\2\u03f1\u03f2\7w\2\2\u03f2m\3\2\2\2\u03f3\u03f8\5p9\2\u03f4\u03f5\7v"+
		"\2\2\u03f5\u03f7\5p9\2\u03f6\u03f4\3\2\2\2\u03f7\u03fa\3\2\2\2\u03f8\u03f6"+
		"\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fc\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fb"+
		"\u03fd\7v\2\2\u03fc\u03fb\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fdo\3\2\2\2\u03fe"+
		"\u0400\5\u00d6l\2\u03ff\u03fe\3\2\2\2\u0400\u0403\3\2\2\2\u0401\u03ff"+
		"\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0405\3\2\2\2\u0403\u0401\3\2\2\2\u0404"+
		"\u0406\5\u00d2j\2\u0405\u0404\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0407"+
		"\3\2\2\2\u0407\u0408\5\u019a\u00ce\2\u0408\u0409\7x\2\2\u0409\u040a\5"+
		"\u0168\u00b5\2\u040aq\3\2\2\2\u040b\u0410\5t;\2\u040c\u040d\7v\2\2\u040d"+
		"\u040f\5t;\2\u040e\u040c\3\2\2\2\u040f\u0412\3\2\2\2\u0410\u040e\3\2\2"+
		"\2\u0410\u0411\3\2\2\2\u0411\u0414\3\2\2\2\u0412\u0410\3\2\2\2\u0413\u0415"+
		"\7v\2\2\u0414\u0413\3\2\2\2\u0414\u0415\3\2\2\2\u0415s\3\2\2\2\u0416\u0418"+
		"\5\u00d6l\2\u0417\u0416\3\2\2\2\u0418\u041b\3\2\2\2\u0419\u0417\3\2\2"+
		"\2\u0419\u041a\3\2\2\2\u041a\u041d\3\2\2\2\u041b\u0419\3\2\2\2\u041c\u041e"+
		"\5\u00d2j\2\u041d\u041c\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u041f\3\2\2"+
		"\2\u041f\u0420\5\u0168\u00b5\2\u0420u\3\2\2\2\u0421\u0422\7\t\2\2\u0422"+
		"\u0424\5\u019a\u00ce\2\u0423\u0425\5\u00b4[\2\u0424\u0423\3\2\2\2\u0424"+
		"\u0425\3\2\2\2\u0425\u0427\3\2\2\2\u0426\u0428\5\u00c0a\2\u0427\u0426"+
		"\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042b\7\177\2\2"+
		"\u042a\u042c\5x=\2\u042b\u042a\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042d"+
		"\3\2\2\2\u042d\u042e\7\u0080\2\2\u042ew\3\2\2\2\u042f\u0434\5z>\2\u0430"+
		"\u0431\7v\2\2\u0431\u0433\5z>\2\u0432\u0430\3\2\2\2\u0433\u0436\3\2\2"+
		"\2\u0434\u0432\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0438\3\2\2\2\u0436\u0434"+
		"\3\2\2\2\u0437\u0439\7v\2\2\u0438\u0437\3\2\2\2\u0438\u0439\3\2\2\2\u0439"+
		"y\3\2\2\2\u043a\u043c\5\u00d6l\2\u043b\u043a\3\2\2\2\u043c\u043f\3\2\2"+
		"\2\u043d\u043b\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u0441\3\2\2\2\u043f\u043d"+
		"\3\2\2\2\u0440\u0442\5\u00d2j\2\u0441\u0440\3\2\2\2\u0441\u0442\3\2\2"+
		"\2\u0442\u0443\3\2\2\2\u0443\u0447\5\u019a\u00ce\2\u0444\u0448\5|?\2\u0445"+
		"\u0448\5~@\2\u0446\u0448\5\u0080A\2\u0447\u0444\3\2\2\2\u0447\u0445\3"+
		"\2\2\2\u0447\u0446\3\2\2\2\u0447\u0448\3\2\2\2\u0448{\3\2\2\2\u0449\u044b"+
		"\7\u0083\2\2\u044a\u044c\5r:\2\u044b\u044a\3\2\2\2\u044b\u044c\3\2\2\2"+
		"\u044c\u044d\3\2\2\2\u044d\u044e\7\u0084\2\2\u044e}\3\2\2\2\u044f\u0451"+
		"\7\177\2\2\u0450\u0452\5n8\2\u0451\u0450\3\2\2\2\u0451\u0452\3\2\2\2\u0452"+
		"\u0453\3\2\2\2\u0453\u0454\7\u0080\2\2\u0454\177\3\2\2\2\u0455\u0456\7"+
		"i\2\2\u0456\u0457\5\u00e2r\2\u0457\u0081\3\2\2\2\u0458\u0459\7\66\2\2"+
		"\u0459\u045b\5\u019a\u00ce\2\u045a\u045c\5\u00b4[\2\u045b\u045a\3\2\2"+
		"\2\u045b\u045c\3\2\2\2\u045c\u045e\3\2\2\2\u045d\u045f\5\u00c0a\2\u045e"+
		"\u045d\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0461\7\177"+
		"\2\2\u0461\u0462\5n8\2\u0462\u0463\7\u0080\2\2\u0463\u0083\3\2\2\2\u0464"+
		"\u0467\7\5\2\2\u0465\u0468\5\u019a\u00ce\2\u0466\u0468\7q\2\2\u0467\u0465"+
		"\3\2\2\2\u0467\u0466\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046a\7x\2\2\u046a"+
		"\u046b\5\u0168\u00b5\2\u046b\u046c\7i\2\2\u046c\u046d\5\u00e2r\2\u046d"+
		"\u046e\7w\2\2\u046e\u0085\3\2\2\2\u046f\u0471\7\34\2\2\u0470\u0472\7\26"+
		"\2\2\u0471\u0470\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473\3\2\2\2\u0473"+
		"\u0474\5\u019a\u00ce\2\u0474\u0475\7x\2\2\u0475\u0476\5\u0168\u00b5\2"+
		"\u0476\u0477\7i\2\2\u0477\u0478\5\u00e2r\2\u0478\u0479\7w\2\2\u0479\u0087"+
		"\3\2\2\2\u047a\u047c\7\"\2\2\u047b\u047a\3\2\2\2\u047b\u047c\3\2\2\2\u047c"+
		"\u047d\3\2\2\2\u047d\u047e\7\37\2\2\u047e\u0480\5\u019a\u00ce\2\u047f"+
		"\u0481\5\u00b4[\2\u0480\u047f\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0486"+
		"\3\2\2\2\u0482\u0484\7x\2\2\u0483\u0485\5\u0190\u00c9\2\u0484\u0483\3"+
		"\2\2\2\u0484\u0485\3\2\2\2\u0485\u0487\3\2\2\2\u0486\u0482\3\2\2\2\u0486"+
		"\u0487\3\2\2\2\u0487\u0489\3\2\2\2\u0488\u048a\5\u00c0a\2\u0489\u0488"+
		"\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048f\7\177\2\2"+
		"\u048c\u048e\5\u00d4k\2\u048d\u048c\3\2\2\2\u048e\u0491\3\2\2\2\u048f"+
		"\u048d\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0495\3\2\2\2\u0491\u048f\3\2"+
		"\2\2\u0492\u0494\5\u008aF\2\u0493\u0492\3\2\2\2\u0494\u0497\3\2\2\2\u0495"+
		"\u0493\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0498\3\2\2\2\u0497\u0495\3\2"+
		"\2\2\u0498\u0499\7\u0080\2\2\u0499\u0089\3\2\2\2\u049a\u049c\5\u00d6l"+
		"\2\u049b\u049a\3\2\2\2\u049c\u049f\3\2\2\2\u049d\u049b\3\2\2\2\u049d\u049e"+
		"\3\2\2\2\u049e\u04a1\3\2\2\2\u049f\u049d\3\2\2\2\u04a0\u04a2\5\u00d2j"+
		"\2\u04a1\u04a0\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a8\3\2\2\2\u04a3\u04a9"+
		"\5\u008cG\2\u04a4\u04a9\5\u008eH\2\u04a5\u04a9\5\u0098M\2\u04a6\u04a9"+
		"\5\u009aN\2\u04a7\u04a9\5.\30\2\u04a8\u04a3\3\2\2\2\u04a8\u04a4\3\2\2"+
		"\2\u04a8\u04a5\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a8\u04a7\3\2\2\2\u04a9\u008b"+
		"\3\2\2\2\u04aa\u04ad\5\u0090I\2\u04ab\u04ae\7w\2\2\u04ac\u04ae\5\u00ee"+
		"x\2\u04ad\u04ab\3\2\2\2\u04ad\u04ac\3\2\2\2\u04ae\u008d\3\2\2\2\u04af"+
		"\u04b2\5\u0092J\2\u04b0\u04b3\7w\2\2\u04b1\u04b3\5\u00eex\2\u04b2\u04b0"+
		"\3\2\2\2\u04b2\u04b1\3\2\2\2\u04b3\u008f\3\2\2\2\u04b4\u04b5\5Z.\2\u04b5"+
		"\u04b6\7\f\2\2\u04b6\u04b8\5\u019a\u00ce\2\u04b7\u04b9\5\u00b4[\2\u04b8"+
		"\u04b7\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bc\7\u0083"+
		"\2\2\u04bb\u04bd\5\u0094K\2\u04bc\u04bb\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd"+
		"\u04be\3\2\2\2\u04be\u04c0\7\u0084\2\2\u04bf\u04c1\5d\63\2\u04c0\u04bf"+
		"\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c3\3\2\2\2\u04c2\u04c4\5\u00c0a"+
		"\2\u04c3\u04c2\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u0091\3\2\2\2\u04c5\u04c6"+
		"\5Z.\2\u04c6\u04c7\7\f\2\2\u04c7\u04c9\5\u019a\u00ce\2\u04c8\u04ca\5\u00b4"+
		"[\2\u04c9\u04c8\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb"+
		"\u04cc\7\u0083\2\2\u04cc\u04d1\5\u00ccg\2\u04cd\u04ce\7v\2\2\u04ce\u04d0"+
		"\5\u0096L\2\u04cf\u04cd\3\2\2\2\u04d0\u04d3\3\2\2\2\u04d1\u04cf\3\2\2"+
		"\2\u04d1\u04d2\3\2\2\2\u04d2\u04d4\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d4\u04d5"+
		"\7v\2\2\u04d5\u04d7\7\u0084\2\2\u04d6\u04d8\5d\63\2\u04d7\u04d6\3\2\2"+
		"\2\u04d7\u04d8\3\2\2\2\u04d8\u04da\3\2\2\2\u04d9\u04db\5\u00c0a\2\u04da"+
		"\u04d9\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u0093\3\2\2\2\u04dc\u04e1\5\u0096"+
		"L\2\u04dd\u04de\7v\2\2\u04de\u04e0\5\u0096L\2\u04df\u04dd\3\2\2\2\u04e0"+
		"\u04e3\3\2\2\2\u04e1\u04df\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e5\3\2"+
		"\2\2\u04e3\u04e1\3\2\2\2\u04e4\u04e6\7v\2\2\u04e5\u04e4\3\2\2\2\u04e5"+
		"\u04e6\3\2\2\2\u04e6\u0095\3\2\2\2\u04e7\u04e9\5\u00d6l\2\u04e8\u04e7"+
		"\3\2\2\2\u04e9\u04ec\3\2\2\2\u04ea\u04e8\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb"+
		"\u04f0\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ed\u04ee\5\u013a\u009e\2\u04ee\u04ef"+
		"\7x\2\2\u04ef\u04f1\3\2\2\2\u04f0\u04ed\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1"+
		"\u04f2\3\2\2\2\u04f2\u04f3\5\u0168\u00b5\2\u04f3\u0097\3\2\2\2\u04f4\u04f5"+
		"\7\5\2\2\u04f5\u04f6\5\u019a\u00ce\2\u04f6\u04f7\7x\2\2\u04f7\u04fa\5"+
		"\u0168\u00b5\2\u04f8\u04f9\7i\2\2\u04f9\u04fb\5\u00e2r\2\u04fa\u04f8\3"+
		"\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fd\7w\2\2\u04fd"+
		"\u0099\3\2\2\2\u04fe\u04ff\7!\2\2\u04ff\u0504\5\u019a\u00ce\2\u0500\u0502"+
		"\7x\2\2\u0501\u0503\5\u0190\u00c9\2\u0502\u0501\3\2\2\2\u0502\u0503\3"+
		"\2\2\2\u0503\u0505\3\2\2\2\u0504\u0500\3\2\2\2\u0504\u0505\3\2\2\2\u0505"+
		"\u0506\3\2\2\2\u0506\u0507\7w\2\2\u0507\u009b\3\2\2\2\u0508\u050b\5\u009e"+
		"P\2\u0509\u050b\5\u00a2R\2\u050a\u0508\3\2\2\2\u050a\u0509\3\2\2\2\u050b"+
		"\u009d\3\2\2\2\u050c\u050e\7\17\2\2\u050d\u050f\5\u00b4[\2\u050e\u050d"+
		"\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0512\5\u0168\u00b5"+
		"\2\u0511\u0513\5\u00c0a\2\u0512\u0511\3\2\2\2\u0512\u0513\3\2\2\2\u0513"+
		"\u0514\3\2\2\2\u0514\u0518\7\177\2\2\u0515\u0517\5\u00d4k\2\u0516\u0515"+
		"\3\2\2\2\u0517\u051a\3\2\2\2\u0518\u0516\3\2\2\2\u0518\u0519\3\2\2\2\u0519"+
		"\u051e\3\2\2\2\u051a\u0518\3\2\2\2\u051b\u051d\5\u00a0Q\2\u051c\u051b"+
		"\3\2\2\2\u051d\u0520\3\2\2\2\u051e\u051c\3\2\2\2\u051e\u051f\3\2\2\2\u051f"+
		"\u0521\3\2\2\2\u0520\u051e\3\2\2\2\u0521\u0522\7\u0080\2\2\u0522\u009f"+
		"\3\2\2\2\u0523\u0525\5\u00d6l\2\u0524\u0523\3\2\2\2\u0525\u0528\3\2\2"+
		"\2\u0526\u0524\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0532\3\2\2\2\u0528\u0526"+
		"\3\2\2\2\u0529\u0533\5.\30\2\u052a\u052c\5\u00d2j\2\u052b\u052a\3\2\2"+
		"\2\u052b\u052c\3\2\2\2\u052c\u0530\3\2\2\2\u052d\u0531\5\u0084C\2\u052e"+
		"\u0531\5X-\2\u052f\u0531\5\u00caf\2\u0530\u052d\3\2\2\2\u0530\u052e\3"+
		"\2\2\2\u0530\u052f\3\2\2\2\u0531\u0533\3\2\2\2\u0532\u0529\3\2\2\2\u0532"+
		"\u052b\3\2\2\2\u0533\u00a1\3\2\2\2\u0534\u0536\7\"\2\2\u0535\u0534\3\2"+
		"\2\2\u0535\u0536\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u0539\7\17\2\2\u0538"+
		"\u053a\5\u00b4[\2\u0539\u0538\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053c"+
		"\3\2\2\2\u053b\u053d\7Z\2\2\u053c\u053b\3\2\2\2\u053c\u053d\3\2\2\2\u053d"+
		"\u053e\3\2\2\2\u053e\u053f\5\36\20\2\u053f\u0540\7\r\2\2\u0540\u0542\5"+
		"\u0168\u00b5\2\u0541\u0543\5\u00c0a\2\u0542\u0541\3\2\2\2\u0542\u0543"+
		"\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0548\7\177\2\2\u0545\u0547\5\u00d4"+
		"k\2\u0546\u0545\3\2\2\2\u0547\u054a\3\2\2\2\u0548\u0546\3\2\2\2\u0548"+
		"\u0549\3\2\2\2\u0549\u054e\3\2\2\2\u054a\u0548\3\2\2\2\u054b\u054d\5\u00a4"+
		"S\2\u054c\u054b\3\2\2\2\u054d\u0550\3\2\2\2\u054e\u054c\3\2\2\2\u054e"+
		"\u054f\3\2\2\2\u054f\u0551\3\2\2\2\u0550\u054e\3\2\2\2\u0551\u0552\7\u0080"+
		"\2\2\u0552\u00a3\3\2\2\2\u0553\u0555\5\u00d6l\2\u0554\u0553\3\2\2\2\u0555"+
		"\u0558\3\2\2\2\u0556\u0554\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0563\3\2"+
		"\2\2\u0558\u0556\3\2\2\2\u0559\u0564\5.\30\2\u055a\u055c\5\u00d2j\2\u055b"+
		"\u055a\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u0561\3\2\2\2\u055d\u0562\5f"+
		"\64\2\u055e\u0562\5\u0084C\2\u055f\u0562\5\u00caf\2\u0560\u0562\5X-\2"+
		"\u0561\u055d\3\2\2\2\u0561\u055e\3\2\2\2\u0561\u055f\3\2\2\2\u0561\u0560"+
		"\3\2\2\2\u0562\u0564\3\2\2\2\u0563\u0559\3\2\2\2\u0563\u055b\3\2\2\2\u0564"+
		"\u00a5\3\2\2\2\u0565\u0567\7\n\2\2\u0566\u0568\5^\60\2\u0567\u0566\3\2"+
		"\2\2\u0567\u0568\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056d\7\177\2\2\u056a"+
		"\u056c\5\u00d4k\2\u056b\u056a\3\2\2\2\u056c\u056f\3\2\2\2\u056d\u056b"+
		"\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u0573\3\2\2\2\u056f\u056d\3\2\2\2\u0570"+
		"\u0572\5\u00a8U\2\u0571\u0570\3\2\2\2\u0572\u0575\3\2\2\2\u0573\u0571"+
		"\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0576\3\2\2\2\u0575\u0573\3\2\2\2\u0576"+
		"\u0577\7\u0080\2\2\u0577\u00a7\3\2\2\2\u0578\u057a\5\u00d6l\2\u0579\u0578"+
		"\3\2\2\2\u057a\u057d\3\2\2\2\u057b\u0579\3\2\2\2\u057b\u057c\3\2\2\2\u057c"+
		"\u0586\3\2\2\2\u057d\u057b\3\2\2\2\u057e\u0587\5.\30\2\u057f\u0581\5\u00d2"+
		"j\2\u0580\u057f\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0584\3\2\2\2\u0582"+
		"\u0585\5\u00aaV\2\u0583\u0585\5\u00acW\2\u0584\u0582\3\2\2\2\u0584\u0583"+
		"\3\2\2\2\u0585\u0587\3\2\2\2\u0586\u057e\3\2\2\2\u0586\u0580\3\2\2\2\u0587"+
		"\u00a9\3\2\2\2\u0588\u058a\7\34\2\2\u0589\u058b\7\26\2\2\u058a\u0589\3"+
		"\2\2\2\u058a\u058b\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058d\5\u019a\u00ce"+
		"\2\u058d\u058e\7x\2\2\u058e\u058f\5\u0168\u00b5\2\u058f\u0590\7w\2\2\u0590"+
		"\u00ab\3\2\2\2\u0591\u0592\7\f\2\2\u0592\u0594\5\u019a\u00ce\2\u0593\u0595"+
		"\5\u00b4[\2\u0594\u0593\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0596\3\2\2"+
		"\2\u0596\u0599\7\u0083\2\2\u0597\u059a\5\u00aeX\2\u0598\u059a\5\u00b2"+
		"Z\2\u0599\u0597\3\2\2\2\u0599\u0598\3\2\2\2\u0599\u059a\3\2\2\2\u059a"+
		"\u059b\3\2\2\2\u059b\u059d\7\u0084\2\2\u059c\u059e\5d\63\2\u059d\u059c"+
		"\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u05a0\3\2\2\2\u059f\u05a1\5\u00c0a"+
		"\2\u05a0\u059f\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a3"+
		"\7w\2\2\u05a3\u00ad\3\2\2\2\u05a4\u05a9\5\u00b0Y\2\u05a5\u05a6\7v\2\2"+
		"\u05a6\u05a8\5\u00b0Y\2\u05a7\u05a5\3\2\2\2\u05a8\u05ab\3\2\2\2\u05a9"+
		"\u05a7\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ad\3\2\2\2\u05ab\u05a9\3\2"+
		"\2\2\u05ac\u05ae\7v\2\2\u05ad\u05ac\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae"+
		"\u00af\3\2\2\2\u05af\u05b1\5\u00d6l\2\u05b0\u05af\3\2\2\2\u05b1\u05b4"+
		"\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b7\3\2\2\2\u05b4"+
		"\u05b2\3\2\2\2\u05b5\u05b8\5\u019a\u00ce\2\u05b6\u05b8\7q\2\2\u05b7\u05b5"+
		"\3\2\2\2\u05b7\u05b6\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05ba\7x\2\2\u05ba"+
		"\u05bb\5\u0168\u00b5\2\u05bb\u00b1\3\2\2\2\u05bc\u05bd\5\u00b0Y\2\u05bd"+
		"\u05be\7v\2\2\u05be\u05c0\3\2\2\2\u05bf\u05bc\3\2\2\2\u05c0\u05c3\3\2"+
		"\2\2\u05c1\u05bf\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c4\3\2\2\2\u05c3"+
		"\u05c1\3\2\2\2\u05c4\u05c5\5\u00b0Y\2\u05c5\u05c9\7v\2\2\u05c6\u05c8\5"+
		"\u00d6l\2\u05c7\u05c6\3\2\2\2\u05c8\u05cb\3\2\2\2\u05c9\u05c7\3\2\2\2"+
		"\u05c9\u05ca\3\2\2\2\u05ca\u05cc\3\2\2\2\u05cb\u05c9\3\2\2\2\u05cc\u05cd"+
		"\7t\2\2\u05cd\u00b3\3\2\2\2\u05ce\u05cf\7m\2\2\u05cf\u05d0\5\u00b6\\\2"+
		"\u05d0\u05d1\7l\2\2\u05d1\u00b5\3\2\2\2\u05d2\u05dd\5\u00b8]\2\u05d3\u05d4"+
		"\5\u00ba^\2\u05d4\u05d5\7v\2\2\u05d5\u05d7\3\2\2\2\u05d6\u05d3\3\2\2\2"+
		"\u05d7\u05da\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05db"+
		"\3\2\2\2\u05da\u05d8\3\2\2\2\u05db\u05dd\5\u00bc_\2\u05dc\u05d2\3\2\2"+
		"\2\u05dc\u05d8\3\2\2\2\u05dd\u00b7\3\2\2\2\u05de\u05df\5\u00ba^\2\u05df"+
		"\u05e0\7v\2\2\u05e0\u05e2\3\2\2\2\u05e1\u05de\3\2\2\2\u05e2\u05e5\3\2"+
		"\2\2\u05e3\u05e1\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e7\3\2\2\2\u05e5"+
		"\u05e3\3\2\2\2\u05e6\u05e8\5\u00ba^\2\u05e7\u05e6\3\2\2\2\u05e7\u05e8"+
		"\3\2\2\2\u05e8\u00b9\3\2\2\2\u05e9\u05eb\5\u00d6l\2\u05ea\u05e9\3\2\2"+
		"\2\u05ea\u05eb\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ef\7S\2\2\u05ed\u05ee"+
		"\7x\2\2\u05ee\u05f0\5\u0196\u00cc\2\u05ef\u05ed\3\2\2\2\u05ef\u05f0\3"+
		"\2\2\2\u05f0\u00bb\3\2\2\2\u05f1\u05f2\5\u00be`\2\u05f2\u05f3\7v\2\2\u05f3"+
		"\u05f5\3\2\2\2\u05f4\u05f1\3\2\2\2\u05f5\u05f8\3\2\2\2\u05f6\u05f4\3\2"+
		"\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05fa\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f9"+
		"\u05fb\5\u00be`\2\u05fa\u05f9\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u00bd"+
		"\3\2\2\2\u05fc\u05fe\5\u00d6l\2\u05fd\u05fc\3\2\2\2\u05fd\u05fe\3\2\2"+
		"\2\u05fe\u05ff\3\2\2\2\u05ff\u0604\5\u019a\u00ce\2\u0600\u0602\7x\2\2"+
		"\u0601\u0603\5\u0190\u00c9\2\u0602\u0601\3\2\2\2\u0602\u0603\3\2\2\2\u0603"+
		"\u0605\3\2\2\2\u0604\u0600\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0608\3\2"+
		"\2\2\u0606\u0607\7i\2\2\u0607\u0609\5\u0168\u00b5\2\u0608\u0606\3\2\2"+
		"\2\u0608\u0609\3\2\2\2\u0609\u00bf\3\2\2\2\u060a\u0610\7$\2\2\u060b\u060c"+
		"\5\u00c2b\2\u060c\u060d\7v\2\2\u060d\u060f\3\2\2\2\u060e\u060b\3\2\2\2"+
		"\u060f\u0612\3\2\2\2\u0610\u060e\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u0614"+
		"\3\2\2\2\u0612\u0610\3\2\2\2\u0613\u0615\5\u00c2b\2\u0614\u0613\3\2\2"+
		"\2\u0614\u0615\3\2\2\2\u0615\u00c1\3\2\2\2\u0616\u0619\5\u00c4c\2\u0617"+
		"\u0619\5\u00c6d\2\u0618\u0616\3\2\2\2\u0618\u0617\3\2\2\2\u0619\u00c3"+
		"\3\2\2\2\u061a\u061b\5\u0198\u00cd\2\u061b\u061c\7x\2\2\u061c\u061d\5"+
		"\u0196\u00cc\2\u061d\u00c5\3\2\2\2\u061e\u0620\5\u00c8e\2\u061f\u061e"+
		"\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0622\5\u0168\u00b5"+
		"\2\u0622\u0624\7x\2\2\u0623\u0625\5\u0190\u00c9\2\u0624\u0623\3\2\2\2"+
		"\u0624\u0625\3\2\2\2\u0625\u00c7\3\2\2\2\u0626\u0627\7\r\2\2\u0627\u0628"+
		"\7m\2\2\u0628\u0629\5\u00b8]\2\u0629\u062a\7l\2\2\u062a\u00c9\3\2\2\2"+
		"\u062b\u062c\5Z.\2\u062c\u062d\7\f\2\2\u062d\u062f\5\u019a\u00ce\2\u062e"+
		"\u0630\5\u00b4[\2\u062f\u062e\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0631"+
		"\3\2\2\2\u0631\u0632\7\u0083\2\2\u0632\u0637\5\u00ccg\2\u0633\u0634\7"+
		"v\2\2\u0634\u0636\5b\62\2\u0635\u0633\3\2\2\2\u0636\u0639\3\2\2\2\u0637"+
		"\u0635\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u063b\3\2\2\2\u0639\u0637\3\2"+
		"\2\2\u063a\u063c\7v\2\2\u063b\u063a\3\2\2\2\u063b\u063c\3\2\2\2\u063c"+
		"\u063d\3\2\2\2\u063d\u063f\7\u0084\2\2\u063e\u0640\5d\63\2\u063f\u063e"+
		"\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u0642\3\2\2\2\u0641\u0643\5\u00c0a"+
		"\2\u0642\u0641\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u0645"+
		"\5\u00eex\2\u0645\u00cb\3\2\2\2\u0646\u0648\5\u00d6l\2\u0647\u0646\3\2"+
		"\2\2\u0648\u064b\3\2\2\2\u0649\u0647\3\2\2\2\u0649\u064a\3\2\2\2\u064a"+
		"\u064e\3\2\2\2\u064b\u0649\3\2\2\2\u064c\u064f\5\u00ceh\2\u064d\u064f"+
		"\5\u00d0i\2\u064e\u064c\3\2\2\2\u064e\u064d\3\2\2\2\u064f\u00cd\3\2\2"+
		"\2\u0650\u0652\7[\2\2\u0651\u0653\5\u0198\u00cd\2\u0652\u0651\3\2\2\2"+
		"\u0652\u0653\3\2\2\2\u0653\u0655\3\2\2\2\u0654\u0650\3\2\2\2\u0654\u0655"+
		"\3\2\2\2\u0655\u0657\3\2\2\2\u0656\u0658\7\26\2\2\u0657\u0656\3\2\2\2"+
		"\u0657\u0658\3\2\2\2\u0658\u0659\3\2\2\2\u0659\u065a\7\32\2\2\u065a\u00cf"+
		"\3\2\2\2\u065b\u065d\7\26\2\2\u065c\u065b\3\2\2\2\u065c\u065d\3\2\2\2"+
		"\u065d\u065e\3\2\2\2\u065e\u065f\7\32\2\2\u065f\u0660\7x\2\2\u0660\u0661"+
		"\5\u0168\u00b5\2\u0661\u00d1\3\2\2\2\u0662\u066c\7\27\2\2\u0663\u0669"+
		"\7\u0083\2\2\u0664\u066a\7\7\2\2\u0665\u066a\7\32\2\2\u0666\u066a\7\36"+
		"\2\2\u0667\u0668\7\20\2\2\u0668\u066a\5\4\3\2\u0669\u0664\3\2\2\2\u0669"+
		"\u0665\3\2\2\2\u0669\u0666\3\2\2\2\u0669\u0667\3\2\2\2\u066a\u066b\3\2"+
		"\2\2\u066b\u066d\7\u0084\2\2\u066c\u0663\3\2\2\2\u066c\u066d\3\2\2\2\u066d"+
		"\u00d3\3\2\2\2\u066e\u066f\7|\2\2\u066f\u0670\7Z\2\2\u0670\u0671\7\u0081"+
		"\2\2\u0671\u0672\5\u00d8m\2\u0672\u0673\7\u0082\2\2\u0673\u00d5\3\2\2"+
		"\2\u0674\u0675\7|\2\2\u0675\u0676\7\u0081\2\2\u0676\u0677\5\u00d8m\2\u0677"+
		"\u0678\7\u0082\2\2\u0678\u00d7\3\2\2\2\u0679\u067b\5\4\3\2\u067a\u067c"+
		"\5\u00dan\2\u067b\u067a\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u00d9\3\2\2"+
		"\2\u067d\u0681\5(\25\2\u067e\u067f\7i\2\2\u067f\u0681\5\u00eav\2\u0680"+
		"\u067d\3\2\2\2\u0680\u067e\3\2\2\2\u0681\u00db\3\2\2\2\u0682\u0688\7w"+
		"\2\2\u0683\u0688\5F$\2\u0684\u0688\5\u00dep\2\u0685\u0688\5\u00e0q\2\u0686"+
		"\u0688\5.\30\2\u0687\u0682\3\2\2\2\u0687\u0683\3\2\2\2\u0687\u0684\3\2"+
		"\2\2\u0687\u0685\3\2\2\2\u0687\u0686\3\2\2\2\u0688\u00dd\3\2\2\2\u0689"+
		"\u068b\5\u00d6l\2\u068a\u0689\3\2\2\2\u068b\u068e\3\2\2\2\u068c\u068a"+
		"\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u068f\3\2\2\2\u068e\u068c\3\2\2\2\u068f"+
		"\u0690\7\21\2\2\u0690\u0693\5\u013a\u009e\2\u0691\u0692\7x\2\2\u0692\u0694"+
		"\5\u0168\u00b5\2\u0693\u0691\3\2\2\2\u0693\u0694\3\2\2\2\u0694\u0697\3"+
		"\2\2\2\u0695\u0696\7i\2\2\u0696\u0698\5\u00e2r\2\u0697\u0695\3\2\2\2\u0697"+
		"\u0698\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069a\7w\2\2\u069a\u00df\3\2"+
		"\2\2\u069b\u069c\5\u00e2r\2\u069c\u069d\7w\2\2\u069d\u06a3\3\2\2\2\u069e"+
		"\u06a0\5\u00e8u\2\u069f\u06a1\7w\2\2\u06a0\u069f\3\2\2\2\u06a0\u06a1\3"+
		"\2\2\2\u06a1\u06a3\3\2\2\2\u06a2\u069b\3\2\2\2\u06a2\u069e\3\2\2\2\u06a3"+
		"\u00e1\3\2\2\2\u06a4\u06a6\br\1\2\u06a5\u06a7\5\u00d6l\2\u06a6\u06a5\3"+
		"\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06a6\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9"+
		"\u06aa\3\2\2\2\u06aa\u06ab\5\u00e2r*\u06ab\u06f5\3\2\2\2\u06ac\u06f5\5"+
		"\u00eav\2\u06ad\u06f5\5\u00ecw\2\u06ae\u06b0\t\5\2\2\u06af\u06b1\7\26"+
		"\2\2\u06b0\u06af\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2"+
		"\u06f5\5\u00e2r \u06b3\u06b4\7V\2\2\u06b4\u06f5\5\u00e2r\37\u06b5\u06b6"+
		"\t\6\2\2\u06b6\u06f5\5\u00e2r\36\u06b7\u06b9\7s\2\2\u06b8\u06ba\5\u00e2"+
		"r\2\u06b9\u06b8\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06f5\3\2\2\2\u06bb"+
		"\u06bc\7u\2\2\u06bc\u06f5\5\u00e2r\21\u06bd\u06bf\7\6\2\2\u06be\u06c0"+
		"\7S\2\2\u06bf\u06be\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c2\3\2\2\2\u06c1"+
		"\u06c3\5\u00e2r\2\u06c2\u06c1\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06f5"+
		"\3\2\2\2\u06c4\u06c6\7\4\2\2\u06c5\u06c7\7S\2\2\u06c6\u06c5\3\2\2\2\u06c6"+
		"\u06c7\3\2\2\2\u06c7\u06c9\3\2\2\2\u06c8\u06ca\5\u00e2r\2\u06c9\u06c8"+
		"\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06f5\3\2\2\2\u06cb\u06cd\7\31\2\2"+
		"\u06cc\u06ce\5\u00e2r\2\u06cd\u06cc\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce"+
		"\u06f5\3\2\2\2\u06cf\u06d3\7\u0083\2\2\u06d0\u06d2\5\u00d4k\2\u06d1\u06d0"+
		"\3\2\2\2\u06d2\u06d5\3\2\2\2\u06d3\u06d1\3\2\2\2\u06d3\u06d4\3\2\2\2\u06d4"+
		"\u06d6\3\2\2\2\u06d5\u06d3\3\2\2\2\u06d6\u06d7\5\u00e2r\2\u06d7\u06d8"+
		"\7\u0084\2\2\u06d8\u06f5\3\2\2\2\u06d9\u06dd\7\u0081\2\2\u06da\u06dc\5"+
		"\u00d4k\2\u06db\u06da\3\2\2\2\u06dc\u06df\3\2\2\2\u06dd\u06db\3\2\2\2"+
		"\u06dd\u06de\3\2\2\2\u06de\u06e1\3\2\2\2\u06df\u06dd\3\2\2\2\u06e0\u06e2"+
		"\5\u00f6|\2\u06e1\u06e0\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2\u06e3\3\2\2"+
		"\2\u06e3\u06f5\7\u0082\2\2\u06e4\u06e8\7\u0083\2\2\u06e5\u06e7\5\u00d4"+
		"k\2\u06e6\u06e5\3\2\2\2\u06e7\u06ea\3\2\2\2\u06e8\u06e6\3\2\2\2\u06e8"+
		"\u06e9\3\2\2\2\u06e9\u06ec\3\2\2\2\u06ea\u06e8\3\2\2\2\u06eb\u06ed\5\u00f8"+
		"}\2\u06ec\u06eb\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee"+
		"\u06f5\7\u0084\2\2\u06ef\u06f5\5\u00fc\177\2\u06f0\u06f5\5\u010a\u0086"+
		"\2\u06f1\u06f5\5\u0118\u008d\2\u06f2\u06f5\5\u00e8u\2\u06f3\u06f5\5&\24"+
		"\2\u06f4\u06a4\3\2\2\2\u06f4\u06ac\3\2\2\2\u06f4\u06ad\3\2\2\2\u06f4\u06ae"+
		"\3\2\2\2\u06f4\u06b3\3\2\2\2\u06f4\u06b5\3\2\2\2\u06f4\u06b7\3\2\2\2\u06f4"+
		"\u06bb\3\2\2\2\u06f4\u06bd\3\2\2\2\u06f4\u06c4\3\2\2\2\u06f4\u06cb\3\2"+
		"\2\2\u06f4\u06cf\3\2\2\2\u06f4\u06d9\3\2\2\2\u06f4\u06e4\3\2\2\2\u06f4"+
		"\u06ef\3\2\2\2\u06f4\u06f0\3\2\2\2\u06f4\u06f1\3\2\2\2\u06f4\u06f2\3\2"+
		"\2\2\u06f4\u06f3\3\2\2\2\u06f5\u0749\3\2\2\2\u06f6\u06f7\f\34\2\2\u06f7"+
		"\u06f8\t\7\2\2\u06f8\u0748\5\u00e2r\35\u06f9\u06fa\f\33\2\2\u06fa\u06fb"+
		"\t\b\2\2\u06fb\u0748\5\u00e2r\34\u06fc\u06ff\f\32\2\2\u06fd\u0700\5\u01a4"+
		"\u00d3\2\u06fe\u0700\5\u01a6\u00d4\2\u06ff\u06fd\3\2\2\2\u06ff\u06fe\3"+
		"\2\2\2\u0700\u0701\3\2\2\2\u0701\u0702\5\u00e2r\33\u0702\u0748\3\2\2\2"+
		"\u0703\u0704\f\31\2\2\u0704\u0705\7[\2\2\u0705\u0748\5\u00e2r\32\u0706"+
		"\u0707\f\30\2\2\u0707\u0708\7Y\2\2\u0708\u0748\5\u00e2r\31\u0709\u070a"+
		"\f\27\2\2\u070a\u070b\7\\\2\2\u070b\u0748\5\u00e2r\30\u070c\u070d\f\26"+
		"\2\2\u070d\u070e\5\u00e4s\2\u070e\u070f\5\u00e2r\27\u070f\u0748\3\2\2"+
		"\2\u0710\u0711\f\25\2\2\u0711\u0712\7]\2\2\u0712\u0748\5\u00e2r\26\u0713"+
		"\u0714\f\24\2\2\u0714\u0715\7^\2\2\u0715\u0748\5\u00e2r\25\u0716\u0717"+
		"\f\20\2\2\u0717\u0718\7u\2\2\u0718\u0748\5\u00e2r\21\u0719\u071a\f\17"+
		"\2\2\u071a\u071b\7i\2\2\u071b\u0748\5\u00e2r\20\u071c\u071d\f\16\2\2\u071d"+
		"\u071e\5\u00e6t\2\u071e\u071f\5\u00e2r\17\u071f\u0748\3\2\2\2\u0720\u0721"+
		"\f\'\2\2\u0721\u0722\7r\2\2\u0722\u0723\5\n\6\2\u0723\u0725\7\u0083\2"+
		"\2\u0724\u0726\5\u0116\u008c\2\u0725\u0724\3\2\2\2\u0725\u0726\3\2\2\2"+
		"\u0726\u0727\3\2\2\2\u0727\u0728\7\u0084\2\2\u0728\u0748\3\2\2\2\u0729"+
		"\u072a\f&\2\2\u072a\u072b\7r\2\2\u072b\u0748\5\u019a\u00ce\2\u072c\u072d"+
		"\f%\2\2\u072d\u072e\7r\2\2\u072e\u0748\5\u00fa~\2\u072f\u0730\f$\2\2\u0730"+
		"\u0731\7r\2\2\u0731\u0748\7\'\2\2\u0732\u0733\f#\2\2\u0733\u0735\7\u0083"+
		"\2\2\u0734\u0736\5\u0116\u008c\2\u0735\u0734\3\2\2\2\u0735\u0736\3\2\2"+
		"\2\u0736\u0737\3\2\2\2\u0737\u0748\7\u0084\2\2\u0738\u0739\f\"\2\2\u0739"+
		"\u073a\7\u0081\2\2\u073a\u073b\5\u00e2r\2\u073b\u073c\7\u0082\2\2\u073c"+
		"\u0748\3\2\2\2\u073d\u073e\f!\2\2\u073e\u0748\7~\2\2\u073f\u0740\f\35"+
		"\2\2\u0740\u0741\7\3\2\2\u0741\u0748\5\u016a\u00b6\2\u0742\u0743\f\23"+
		"\2\2\u0743\u0745\7s\2\2\u0744\u0746\5\u00e2r\2\u0745\u0744\3\2\2\2\u0745"+
		"\u0746\3\2\2\2\u0746\u0748\3\2\2\2\u0747\u06f6\3\2\2\2\u0747\u06f9\3\2"+
		"\2\2\u0747\u06fc\3\2\2\2\u0747\u0703\3\2\2\2\u0747\u0706\3\2\2\2\u0747"+
		"\u0709\3\2\2\2\u0747\u070c\3\2\2\2\u0747\u0710\3\2\2\2\u0747\u0713\3\2"+
		"\2\2\u0747\u0716\3\2\2\2\u0747\u0719\3\2\2\2\u0747\u071c\3\2\2\2\u0747"+
		"\u0720\3\2\2\2\u0747\u0729\3\2\2\2\u0747\u072c\3\2\2\2\u0747\u072f\3\2"+
		"\2\2\u0747\u0732\3\2\2\2\u0747\u0738\3\2\2\2\u0747\u073d\3\2\2\2\u0747"+
		"\u073f\3\2\2\2\u0747\u0742\3\2\2\2\u0748\u074b\3\2\2\2\u0749\u0747\3\2"+
		"\2\2\u0749\u074a\3\2\2\2\u074a\u00e3\3\2\2\2\u074b\u0749\3\2\2\2\u074c"+
		"\u074d\t\t\2\2\u074d\u00e5\3\2\2\2\u074e\u074f\t\n\2\2\u074f\u00e7\3\2"+
		"\2\2\u0750\u0752\5\u00d6l\2\u0751\u0750\3\2\2\2\u0752\u0753\3\2\2\2\u0753"+
		"\u0751\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0755\3\2\2\2\u0755\u0756\5\u00e8"+
		"u\2\u0756\u075f\3\2\2\2\u0757\u075f\5\u00eex\2\u0758\u075f\5\u00f2z\2"+
		"\u0759\u075f\5\u00f4{\2\u075a\u075f\5\u011e\u0090\2\u075b\u075f\5\u012a"+
		"\u0096\2\u075c\u075f\5\u012c\u0097\2\u075d\u075f\5\u012e\u0098\2\u075e"+
		"\u0751\3\2\2\2\u075e\u0757\3\2\2\2\u075e\u0758\3\2\2\2\u075e\u0759\3\2"+
		"\2\2\u075e\u075a\3\2\2\2\u075e\u075b\3\2\2\2\u075e\u075c\3\2\2\2\u075e"+
		"\u075d\3\2\2\2\u075f\u00e9\3\2\2\2\u0760\u0761\t\13\2\2\u0761\u00eb\3"+
		"\2\2\2\u0762\u0765\5\b\5\2\u0763\u0765\5\30\r\2\u0764\u0762\3\2\2\2\u0764"+
		"\u0763\3\2\2\2\u0765\u00ed\3\2\2\2\u0766\u076a\7\177\2\2\u0767\u0769\5"+
		"\u00d4k\2\u0768\u0767\3\2\2\2\u0769\u076c\3\2\2\2\u076a\u0768\3\2\2\2"+
		"\u076a\u076b\3\2\2\2\u076b\u076e\3\2\2\2\u076c\u076a\3\2\2\2\u076d\u076f"+
		"\5\u00f0y\2\u076e\u076d\3\2\2\2\u076e\u076f\3\2\2\2\u076f\u0770\3\2\2"+
		"\2\u0770\u0771\7\u0080\2\2\u0771\u00ef\3\2\2\2\u0772\u0774\5\u00dco\2"+
		"\u0773\u0772\3\2\2\2\u0774\u0775\3\2\2\2\u0775\u0773\3\2\2\2\u0775\u0776"+
		"\3\2\2\2\u0776\u0778\3\2\2\2\u0777\u0779\5\u00e2r\2\u0778\u0777\3\2\2"+
		"\2\u0778\u0779\3\2\2\2\u0779\u077c\3\2\2\2\u077a\u077c\5\u00e2r\2\u077b"+
		"\u0773\3\2\2\2\u077b\u077a\3\2\2\2\u077c\u00f1\3\2\2\2\u077d\u077f\7&"+
		"\2\2\u077e\u0780\7\25\2\2\u077f\u077e\3\2\2\2\u077f\u0780\3\2\2\2\u0780"+
		"\u0781\3\2\2\2\u0781\u0782\5\u00eex\2\u0782\u00f3\3\2\2\2\u0783\u0784"+
		"\7\"\2\2\u0784\u0785\5\u00eex\2\u0785\u00f5\3\2\2\2\u0786\u078b\5\u00e2"+
		"r\2\u0787\u0788\7v\2\2\u0788\u078a\5\u00e2r\2\u0789\u0787\3\2\2\2\u078a"+
		"\u078d\3\2\2\2\u078b\u0789\3\2\2\2\u078b\u078c\3\2\2\2\u078c\u078f\3\2"+
		"\2\2\u078d\u078b\3\2\2\2\u078e\u0790\7v\2\2\u078f\u078e\3\2\2\2\u078f"+
		"\u0790\3\2\2\2\u0790\u0796\3\2\2\2\u0791\u0792\5\u00e2r\2\u0792\u0793"+
		"\7w\2\2\u0793\u0794\5\u00e2r\2\u0794\u0796\3\2\2\2\u0795\u0786\3\2\2\2"+
		"\u0795\u0791\3\2\2\2\u0796\u00f7\3\2\2\2\u0797\u0798\5\u00e2r\2\u0798"+
		"\u0799\7v\2\2\u0799\u079b\3\2\2\2\u079a\u0797\3\2\2\2\u079b\u079c\3\2"+
		"\2\2\u079c\u079a\3\2\2\2\u079c\u079d\3\2\2\2\u079d\u079f\3\2\2\2\u079e"+
		"\u07a0\5\u00e2r\2\u079f\u079e\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0\u00f9"+
		"\3\2\2\2\u07a1\u07a2\7M\2\2\u07a2\u00fb\3\2\2\2\u07a3\u07a7\5\u00fe\u0080"+
		"\2\u07a4\u07a7\5\u0106\u0084\2\u07a5\u07a7\5\u0108\u0085\2\u07a6\u07a3"+
		"\3\2\2\2\u07a6\u07a4\3\2\2\2\u07a6\u07a5\3\2\2\2\u07a7\u00fd\3\2\2\2\u07a8"+
		"\u07a9\5\b\5\2\u07a9\u07ad\7\177\2\2\u07aa\u07ac\5\u00d4k\2\u07ab\u07aa"+
		"\3\2\2\2\u07ac\u07af\3\2\2\2\u07ad\u07ab\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae"+
		"\u07b2\3\2\2\2\u07af\u07ad\3\2\2\2\u07b0\u07b3\5\u0100\u0081\2\u07b1\u07b3"+
		"\5\u0104\u0083\2\u07b2\u07b0\3\2\2\2\u07b2\u07b1\3\2\2\2\u07b2\u07b3\3"+
		"\2\2\2\u07b3\u07b4\3\2\2\2\u07b4\u07b5\7\u0080\2\2\u07b5\u00ff\3\2\2\2"+
		"\u07b6\u07bb\5\u0102\u0082\2\u07b7\u07b8\7v\2\2\u07b8\u07ba\5\u0102\u0082"+
		"\2\u07b9\u07b7\3\2\2\2\u07ba\u07bd\3\2\2\2\u07bb\u07b9\3\2\2\2\u07bb\u07bc"+
		"\3\2\2\2\u07bc\u07c3\3\2\2\2\u07bd\u07bb\3\2\2\2\u07be\u07bf\7v\2\2\u07bf"+
		"\u07c4\5\u0104\u0083\2\u07c0\u07c2\7v\2\2\u07c1\u07c0\3\2\2\2\u07c1\u07c2"+
		"\3\2\2\2\u07c2\u07c4\3\2\2\2\u07c3\u07be\3\2\2\2\u07c3\u07c1\3\2\2\2\u07c4"+
		"\u0101\3\2\2\2\u07c5\u07c7\5\u00d6l\2\u07c6\u07c5\3\2\2\2\u07c7\u07ca"+
		"\3\2\2\2\u07c8\u07c6\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07d3\3\2\2\2\u07ca"+
		"\u07c8\3\2\2\2\u07cb\u07d4\5\u019a\u00ce\2\u07cc\u07cf\5\u019a\u00ce\2"+
		"\u07cd\u07cf\5\u00fa~\2\u07ce\u07cc\3\2\2\2\u07ce\u07cd\3\2\2\2\u07cf"+
		"\u07d0\3\2\2\2\u07d0\u07d1\7x\2\2\u07d1\u07d2\5\u00e2r\2\u07d2\u07d4\3"+
		"\2\2\2\u07d3\u07cb\3\2\2\2\u07d3\u07ce\3\2\2\2\u07d4\u0103\3\2\2\2\u07d5"+
		"\u07d6\7s\2\2\u07d6\u07d7\5\u00e2r\2\u07d7\u0105\3\2\2\2\u07d8\u07d9\5"+
		"\b\5\2\u07d9\u07dd\7\u0083\2\2\u07da\u07dc\5\u00d4k\2\u07db\u07da\3\2"+
		"\2\2\u07dc\u07df\3\2\2\2\u07dd\u07db\3\2\2\2\u07dd\u07de\3\2\2\2\u07de"+
		"\u07eb\3\2\2\2\u07df\u07dd\3\2\2\2\u07e0\u07e5\5\u00e2r\2\u07e1\u07e2"+
		"\7v\2\2\u07e2\u07e4\5\u00e2r\2\u07e3\u07e1\3\2\2\2\u07e4\u07e7\3\2\2\2"+
		"\u07e5\u07e3\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6\u07e9\3\2\2\2\u07e7\u07e5"+
		"\3\2\2\2\u07e8\u07ea\7v\2\2\u07e9\u07e8\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea"+
		"\u07ec\3\2\2\2\u07eb\u07e0\3\2\2\2\u07eb\u07ec\3\2\2\2\u07ec\u07ed\3\2"+
		"\2\2\u07ed\u07ee\7\u0084\2\2\u07ee\u0107\3\2\2\2\u07ef\u07f0\5\b\5\2\u07f0"+
		"\u0109\3\2\2\2\u07f1\u07f5\5\u010c\u0087\2\u07f2\u07f5\5\u0112\u008a\2"+
		"\u07f3\u07f5\5\u0114\u008b\2\u07f4\u07f1\3\2\2\2\u07f4\u07f2\3\2\2\2\u07f4"+
		"\u07f3\3\2\2\2\u07f5\u010b\3\2\2\2\u07f6\u07f7\5\b\5\2\u07f7\u07f9\7\177"+
		"\2\2\u07f8\u07fa\5\u010e\u0088\2\u07f9\u07f8\3\2\2\2\u07f9\u07fa\3\2\2"+
		"\2\u07fa\u07fb\3\2\2\2\u07fb\u07fc\7\u0080\2\2\u07fc\u010d\3\2\2\2\u07fd"+
		"\u0802\5\u0110\u0089\2\u07fe\u07ff\7v\2\2\u07ff\u0801\5\u0110\u0089\2"+
		"\u0800\u07fe\3\2\2\2\u0801\u0804\3\2\2\2\u0802\u0800\3\2\2\2\u0802\u0803"+
		"\3\2\2\2\u0803\u0806\3\2\2\2\u0804\u0802\3\2\2\2\u0805\u0807\7v\2\2\u0806"+
		"\u0805\3\2\2\2\u0806\u0807\3\2\2\2\u0807\u010f\3\2\2\2\u0808\u0811\5\u019a"+
		"\u00ce\2\u0809\u080c\5\u019a\u00ce\2\u080a\u080c\5\u00fa~\2\u080b\u0809"+
		"\3\2\2\2\u080b\u080a\3\2\2\2\u080c\u080d\3\2\2\2\u080d\u080e\7x\2\2\u080e"+
		"\u080f\5\u00e2r\2\u080f\u0811\3\2\2\2\u0810\u0808\3\2\2\2\u0810\u080b"+
		"\3\2\2\2\u0811\u0111\3\2\2\2\u0812\u0813\5\b\5\2\u0813\u081f\7\u0083\2"+
		"\2\u0814\u0819\5\u00e2r\2\u0815\u0816\7v\2\2\u0816\u0818\5\u00e2r\2\u0817"+
		"\u0815\3\2\2\2\u0818\u081b\3\2\2\2\u0819\u0817\3\2\2\2\u0819\u081a\3\2"+
		"\2\2\u081a\u081d\3\2\2\2\u081b\u0819\3\2\2\2\u081c\u081e\7v\2\2\u081d"+
		"\u081c\3\2\2\2\u081d\u081e\3\2\2\2\u081e\u0820\3\2\2\2\u081f\u0814\3\2"+
		"\2\2\u081f\u0820\3\2\2\2\u0820\u0821\3\2\2\2\u0821\u0822\7\u0084\2\2\u0822"+
		"\u0113\3\2\2\2\u0823\u0824\5\b\5\2\u0824\u0115\3\2\2\2\u0825\u082a\5\u00e2"+
		"r\2\u0826\u0827\7v\2\2\u0827\u0829\5\u00e2r\2\u0828\u0826\3\2\2\2\u0829"+
		"\u082c\3\2\2\2\u082a\u0828\3\2\2\2\u082a\u082b\3\2\2\2\u082b\u082e\3\2"+
		"\2\2\u082c\u082a\3\2\2\2\u082d\u082f\7v\2\2\u082e\u082d\3\2\2\2\u082e"+
		"\u082f\3\2\2\2\u082f\u0117\3\2\2\2\u0830\u0832\7\25\2\2\u0831\u0830\3"+
		"\2\2\2\u0831\u0832\3\2\2\2\u0832\u0839\3\2\2\2\u0833\u083a\7^\2\2\u0834"+
		"\u0836\7\\\2\2\u0835\u0837\5\u011a\u008e\2\u0836\u0835\3\2\2\2\u0836\u0837"+
		"\3\2\2\2\u0837\u0838\3\2\2\2\u0838\u083a\7\\\2\2\u0839\u0833\3\2\2\2\u0839"+
		"\u0834\3\2\2\2\u083a\u0840\3\2\2\2\u083b\u0841\5\u00e2r\2\u083c\u083d"+
		"\7z\2\2\u083d\u083e\5\u016a\u00b6\2\u083e\u083f\5\u00eex\2\u083f\u0841"+
		"\3\2\2\2\u0840\u083b\3\2\2\2\u0840\u083c\3\2\2\2\u0841\u0119\3\2\2\2\u0842"+
		"\u0847\5\u011c\u008f\2\u0843\u0844\7v\2\2\u0844\u0846\5\u011c\u008f\2"+
		"\u0845\u0843\3\2\2\2\u0846\u0849\3\2\2\2\u0847\u0845\3\2\2\2\u0847\u0848"+
		"\3\2\2\2\u0848\u084b\3\2\2\2\u0849\u0847\3\2\2\2\u084a\u084c\7v\2\2\u084b"+
		"\u084a\3\2\2\2\u084b\u084c\3\2\2\2\u084c\u011b\3\2\2\2\u084d\u084f\5\u00d6"+
		"l\2\u084e\u084d\3\2\2\2\u084f\u0852\3\2\2\2\u0850\u084e\3\2\2\2\u0850"+
		"\u0851\3\2\2\2\u0851\u0853\3\2\2\2\u0852\u0850\3\2\2\2\u0853\u0856\5\u013a"+
		"\u009e\2\u0854\u0855\7x\2\2\u0855\u0857\5\u0168\u00b5\2\u0856\u0854\3"+
		"\2\2\2\u0856\u0857\3\2\2\2\u0857\u011d\3\2\2\2\u0858\u085a\5\u0128\u0095"+
		"\2\u0859\u0858\3\2\2\2\u0859\u085a\3\2\2\2\u085a\u085f\3\2\2\2\u085b\u0860"+
		"\5\u0120\u0091\2\u085c\u0860\5\u0122\u0092\2\u085d\u0860\5\u0124\u0093"+
		"\2\u085e\u0860\5\u0126\u0094\2\u085f\u085b\3\2\2\2\u085f\u085c\3\2\2\2"+
		"\u085f\u085d\3\2\2\2\u085f\u085e\3\2\2\2\u0860\u011f\3\2\2\2\u0861\u0862"+
		"\7\22\2\2\u0862\u0863\5\u00eex\2\u0863\u0121\3\2\2\2\u0864\u0865\7%\2"+
		"\2\u0865\u0866\5\u00e2r\2\u0866\u0867\5\u00eex\2\u0867\u0123\3\2\2\2\u0868"+
		"\u0869\7%\2\2\u0869\u086a\7\21\2\2\u086a\u086b\5\u0136\u009c\2\u086b\u086c"+
		"\7i\2\2\u086c\u086d\5\u00e2r\2\u086d\u086e\5\u00eex\2\u086e\u0125\3\2"+
		"\2\2\u086f\u0870\7\r\2\2\u0870\u0871\5\u013a\u009e\2\u0871\u0872\7\20"+
		"\2\2\u0872\u0873\5\u00e2r\2\u0873\u0874\5\u00eex\2\u0874\u0127\3\2\2\2"+
		"\u0875\u0876\7S\2\2\u0876\u0877\7x\2\2\u0877\u0129\3\2\2\2\u0878\u0879"+
		"\7\16\2\2\u0879\u087a\5\u00e2r\2\u087a\u0881\5\u00eex\2\u087b\u087f\7"+
		"\b\2\2\u087c\u0880\5\u00eex\2\u087d\u0880\5\u012a\u0096\2\u087e\u0880"+
		"\5\u012c\u0097\2\u087f\u087c\3\2\2\2\u087f\u087d\3\2\2\2\u087f\u087e\3"+
		"\2\2\2\u0880\u0882\3\2\2\2\u0881\u087b\3\2\2\2\u0881\u0882\3\2\2\2\u0882"+
		"\u012b\3\2\2\2\u0883\u0884\7\16\2\2\u0884\u0885\7\21\2\2\u0885\u0886\5"+
		"\u0136\u009c\2\u0886\u0887\7i\2\2\u0887\u0888\5\u00e2r\2\u0888\u088f\5"+
		"\u00eex\2\u0889\u088d\7\b\2\2\u088a\u088e\5\u00eex\2\u088b\u088e\5\u012a"+
		"\u0096\2\u088c\u088e\5\u012c\u0097\2\u088d\u088a\3\2\2\2\u088d\u088b\3"+
		"\2\2\2\u088d\u088c\3\2\2\2\u088e\u0890\3\2\2\2\u088f\u0889\3\2\2\2\u088f"+
		"\u0890\3\2\2\2\u0890\u012d\3\2\2\2\u0891\u0892\7\23\2\2\u0892\u0893\5"+
		"\u00e2r\2\u0893\u0897\7\177\2\2\u0894\u0896\5\u00d4k\2\u0895\u0894\3\2"+
		"\2\2\u0896\u0899\3\2\2\2\u0897\u0895\3\2\2\2\u0897\u0898\3\2\2\2\u0898"+
		"\u089b\3\2\2\2\u0899\u0897\3\2\2\2\u089a\u089c\5\u0130\u0099\2\u089b\u089a"+
		"\3\2\2\2\u089b\u089c\3\2\2\2\u089c\u089d\3\2\2\2\u089d\u089e\7\u0080\2"+
		"\2\u089e\u012f\3\2\2\2\u089f\u08a0\5\u0134\u009b\2\u08a0\u08a1\7{\2\2"+
		"\u08a1\u08a2\5\u0132\u009a\2\u08a2\u08a4\3\2\2\2\u08a3\u089f\3\2\2\2\u08a4"+
		"\u08a7\3\2\2\2\u08a5\u08a3\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6\u08a8\3\2"+
		"\2\2\u08a7\u08a5\3\2\2\2\u08a8\u08a9\5\u0134\u009b\2\u08a9\u08aa\7{\2"+
		"\2\u08aa\u08ac\5\u00e2r\2\u08ab\u08ad\7v\2\2\u08ac\u08ab\3\2\2\2\u08ac"+
		"\u08ad\3\2\2\2\u08ad\u0131\3\2\2\2\u08ae\u08af\5\u00e2r\2\u08af\u08b0"+
		"\7v\2\2\u08b0\u08b6\3\2\2\2\u08b1\u08b3\5\u00e8u\2\u08b2\u08b4\7v\2\2"+
		"\u08b3\u08b2\3\2\2\2\u08b3\u08b4\3\2\2\2\u08b4\u08b6\3\2\2\2\u08b5\u08ae"+
		"\3\2\2\2\u08b5\u08b1\3\2\2\2\u08b6\u0133\3\2\2\2\u08b7\u08b9\5\u00d6l"+
		"\2\u08b8\u08b7\3\2\2\2\u08b9\u08bc\3\2\2\2\u08ba\u08b8\3\2\2\2\u08ba\u08bb"+
		"\3\2\2\2\u08bb\u08bd\3\2\2\2\u08bc\u08ba\3\2\2\2\u08bd\u08bf\5\u0136\u009c"+
		"\2\u08be\u08c0\5\u0138\u009d\2\u08bf\u08be\3\2\2\2\u08bf\u08c0\3\2\2\2"+
		"\u08c0\u0135\3\2\2\2\u08c1\u08c3\7\\\2\2\u08c2\u08c1\3\2\2\2\u08c2\u08c3"+
		"\3\2\2\2\u08c3\u08c4\3\2\2\2\u08c4\u08c9\5\u013a\u009e\2\u08c5\u08c6\7"+
		"\\\2\2\u08c6\u08c8\5\u013a\u009e\2\u08c7\u08c5\3\2\2\2\u08c8\u08cb\3\2"+
		"\2\2\u08c9\u08c7\3\2\2\2\u08c9\u08ca\3\2\2\2\u08ca\u0137\3\2\2\2\u08cb"+
		"\u08c9\3\2\2\2\u08cc\u08cd\7\16\2\2\u08cd\u08ce\5\u00e2r\2\u08ce\u0139"+
		"\3\2\2\2\u08cf\u08d2\5\u013c\u009f\2\u08d0\u08d2\5\u0146\u00a4\2\u08d1"+
		"\u08cf\3\2\2\2\u08d1\u08d0\3\2\2\2\u08d2\u013b\3\2\2\2\u08d3\u08e1\5\u013e"+
		"\u00a0\2\u08d4\u08e1\5\u0140\u00a1\2\u08d5\u08e1\5\u0142\u00a2\2\u08d6"+
		"\u08e1\5\u0144\u00a3\2\u08d7\u08e1\5\u0148\u00a5\2\u08d8\u08e1\5\u014c"+
		"\u00a7\2\u08d9\u08e1\5\u014e\u00a8\2\u08da\u08e1\5\u0158\u00ad\2\u08db"+
		"\u08e1\5\u015c\u00af\2\u08dc\u08e1\5\u0160\u00b1\2\u08dd\u08e1\5\u0162"+
		"\u00b2\2\u08de\u08e1\5\u0166\u00b4\2\u08df\u08e1\5&\24\2\u08e0\u08d3\3"+
		"\2\2\2\u08e0\u08d4\3\2\2\2\u08e0\u08d5\3\2\2\2\u08e0\u08d6\3\2\2\2\u08e0"+
		"\u08d7\3\2\2\2\u08e0\u08d8\3\2\2\2\u08e0\u08d9\3\2\2\2\u08e0\u08da\3\2"+
		"\2\2\u08e0\u08db\3\2\2\2\u08e0\u08dc\3\2\2\2\u08e0\u08dd\3\2\2\2\u08e0"+
		"\u08de\3\2\2\2\u08e0\u08df\3\2\2\2\u08e1\u013d\3\2\2\2\u08e2\u08f3\7 "+
		"\2\2\u08e3\u08f3\7\13\2\2\u08e4\u08f3\7G\2\2\u08e5\u08f3\7J\2\2\u08e6"+
		"\u08f3\7H\2\2\u08e7\u08f3\7I\2\2\u08e8\u08f3\7K\2\2\u08e9\u08f3\7L\2\2"+
		"\u08ea\u08ec\7U\2\2\u08eb\u08ea\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec\u08ed"+
		"\3\2\2\2\u08ed\u08f3\7M\2\2\u08ee\u08f0\7U\2\2\u08ef\u08ee\3\2\2\2\u08ef"+
		"\u08f0\3\2\2\2\u08f0\u08f1\3\2\2\2\u08f1\u08f3\7R\2\2\u08f2\u08e2\3\2"+
		"\2\2\u08f2\u08e3\3\2\2\2\u08f2\u08e4\3\2\2\2\u08f2\u08e5\3\2\2\2\u08f2"+
		"\u08e6\3\2\2\2\u08f2\u08e7\3\2\2\2\u08f2\u08e8\3\2\2\2\u08f2\u08e9\3\2"+
		"\2\2\u08f2\u08eb\3\2\2\2\u08f2\u08ef\3\2\2\2\u08f3\u013f\3\2\2\2\u08f4"+
		"\u08f6\7\30\2\2\u08f5\u08f4\3\2\2\2\u08f5\u08f6\3\2\2\2\u08f6\u08f8\3"+
		"\2\2\2\u08f7\u08f9\7\26\2\2\u08f8\u08f7\3\2\2\2\u08f8\u08f9\3\2\2\2\u08f9"+
		"\u08fa\3\2\2\2\u08fa\u08fd\5\u019a\u00ce\2\u08fb\u08fc\7p\2\2\u08fc\u08fe"+
		"\5\u013a\u009e\2\u08fd\u08fb\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u0141\3"+
		"\2\2\2\u08ff\u0900\7q\2\2\u0900\u0143\3\2\2\2\u0901\u0902\7s\2\2\u0902"+
		"\u0145\3\2\2\2\u0903\u0904\5\u014a\u00a6\2\u0904\u0905\7u\2\2\u0905\u0906"+
		"\5\u014a\u00a6\2\u0906\u0147\3\2\2\2\u0907\u0908\5\u014a\u00a6\2\u0908"+
		"\u0909\7t\2\2\u0909\u090a\5\u014a\u00a6\2\u090a\u0149\3\2\2\2\u090b\u0918"+
		"\7G\2\2\u090c\u0918\7J\2\2\u090d\u090f\7U\2\2\u090e\u090d\3\2\2\2\u090e"+
		"\u090f\3\2\2\2\u090f\u0910\3\2\2\2\u0910\u0918\7M\2\2\u0911\u0913\7U\2"+
		"\2\u0912\u0911\3\2\2\2\u0912\u0913\3\2\2\2\u0913\u0914\3\2\2\2\u0914\u0918"+
		"\7R\2\2\u0915\u0918\5\b\5\2\u0916\u0918\5\30\r\2\u0917\u090b\3\2\2\2\u0917"+
		"\u090c\3\2\2\2\u0917\u090e\3\2\2\2\u0917\u0912\3\2\2\2\u0917\u0915\3\2"+
		"\2\2\u0917\u0916\3\2\2\2\u0918\u014b\3\2\2\2\u0919\u091b\t\5\2\2\u091a"+
		"\u091c\7\26\2\2\u091b\u091a\3\2\2\2\u091b\u091c\3\2\2\2\u091c\u091d\3"+
		"\2\2\2\u091d\u091e\5\u013c\u009f\2\u091e\u014d\3\2\2\2\u091f\u0920\5\b"+
		"\5\2\u0920\u0922\7\177\2\2\u0921\u0923\5\u0150\u00a9\2\u0922\u0921\3\2"+
		"\2\2\u0922\u0923\3\2\2\2\u0923\u0924\3\2\2\2\u0924\u0925\7\u0080\2\2\u0925"+
		"\u014f\3\2\2\2\u0926\u092b\5\u0152\u00aa\2\u0927\u0929\7v\2\2\u0928\u092a"+
		"\5\u0156\u00ac\2\u0929\u0928\3\2\2\2\u0929\u092a\3\2\2\2\u092a\u092c\3"+
		"\2\2\2\u092b\u0927\3\2\2\2\u092b\u092c\3\2\2\2\u092c\u092f\3\2\2\2\u092d"+
		"\u092f\5\u0156\u00ac\2\u092e\u0926\3\2\2\2\u092e\u092d\3\2\2\2\u092f\u0151"+
		"\3\2\2\2\u0930\u0935\5\u0154\u00ab\2\u0931\u0932\7v\2\2\u0932\u0934\5"+
		"\u0154\u00ab\2\u0933\u0931\3\2\2\2\u0934\u0937\3\2\2\2\u0935\u0933\3\2"+
		"\2\2\u0935\u0936\3\2\2\2\u0936\u0153\3\2\2\2\u0937\u0935\3\2\2\2\u0938"+
		"\u093a\5\u00d6l\2\u0939\u0938\3\2\2\2\u093a\u093d\3\2\2\2\u093b\u0939"+
		"\3\2\2\2\u093b\u093c\3\2\2\2\u093c\u094d\3\2\2\2\u093d\u093b\3\2\2\2\u093e"+
		"\u093f\5\u00fa~\2\u093f\u0940\7x\2\2\u0940\u0941\5\u013a\u009e\2\u0941"+
		"\u094e\3\2\2\2\u0942\u0943\5\u019a\u00ce\2\u0943\u0944\7x\2\2\u0944\u0945"+
		"\5\u013a\u009e\2\u0945\u094e\3\2\2\2\u0946\u0948\7\30\2\2\u0947\u0946"+
		"\3\2\2\2\u0947\u0948\3\2\2\2\u0948\u094a\3\2\2\2\u0949\u094b\7\26\2\2"+
		"\u094a\u0949\3\2\2\2\u094a\u094b\3\2\2\2\u094b\u094c\3\2\2\2\u094c\u094e"+
		"\5\u019a\u00ce\2\u094d\u093e\3\2\2\2\u094d\u0942\3\2\2\2\u094d\u0947\3"+
		"\2\2\2\u094e\u0155\3\2\2\2\u094f\u0951\5\u00d6l\2\u0950\u094f\3\2\2\2"+
		"\u0951\u0954\3\2\2\2\u0952\u0950\3\2\2\2\u0952\u0953\3\2\2\2\u0953\u0955";
	private static final String _serializedATNSegment1 =
		"\3\2\2\2\u0954\u0952\3\2\2\2\u0955\u0956\7s\2\2\u0956\u0157\3\2\2\2\u0957"+
		"\u0958\5\b\5\2\u0958\u095a\7\u0083\2\2\u0959\u095b\5\u015a\u00ae\2\u095a"+
		"\u0959\3\2\2\2\u095a\u095b\3\2\2\2\u095b\u095c\3\2\2\2\u095c\u095d\7\u0084"+
		"\2\2\u095d\u0159\3\2\2\2\u095e\u0963\5\u013a\u009e\2\u095f\u0960\7v\2"+
		"\2\u0960\u0962\5\u013a\u009e\2\u0961\u095f\3\2\2\2\u0962\u0965\3\2\2\2"+
		"\u0963\u0961\3\2\2\2\u0963\u0964\3\2\2\2\u0964\u0967\3\2\2\2\u0965\u0963"+
		"\3\2\2\2\u0966\u0968\7v\2\2\u0967\u0966\3\2\2\2\u0967\u0968\3\2\2\2\u0968"+
		"\u015b\3\2\2\2\u0969\u096b\7\u0083\2\2\u096a\u096c\5\u015e\u00b0\2\u096b"+
		"\u096a\3\2\2\2\u096b\u096c\3\2\2\2\u096c\u096d\3\2\2\2\u096d\u096e\7\u0084"+
		"\2\2\u096e\u015d\3\2\2\2\u096f\u0970\5\u013a\u009e\2\u0970\u0971\7v\2"+
		"\2\u0971\u097e\3\2\2\2\u0972\u097e\5\u0144\u00a3\2\u0973\u0976\5\u013a"+
		"\u009e\2\u0974\u0975\7v\2\2\u0975\u0977\5\u013a\u009e\2\u0976\u0974\3"+
		"\2\2\2\u0977\u0978\3\2\2\2\u0978\u0976\3\2\2\2\u0978\u0979\3\2\2\2\u0979"+
		"\u097b\3\2\2\2\u097a\u097c\7v\2\2\u097b\u097a\3\2\2\2\u097b\u097c\3\2"+
		"\2\2\u097c\u097e\3\2\2\2\u097d\u096f\3\2\2\2\u097d\u0972\3\2\2\2\u097d"+
		"\u0973\3\2\2\2\u097e\u015f\3\2\2\2\u097f\u0980\7\u0083\2\2\u0980\u0981"+
		"\5\u013a\u009e\2\u0981\u0982\7\u0084\2\2\u0982\u0161\3\2\2\2\u0983\u0984"+
		"\7\u0081\2\2\u0984\u0985\5\u0164\u00b3\2\u0985\u0986\7\u0082\2\2\u0986"+
		"\u0163\3\2\2\2\u0987\u098c\5\u013a\u009e\2\u0988\u0989\7v\2\2\u0989\u098b"+
		"\5\u013a\u009e\2\u098a\u0988\3\2\2\2\u098b\u098e\3\2\2\2\u098c\u098a\3"+
		"\2\2\2\u098c\u098d\3\2\2\2\u098d\u0990\3\2\2\2\u098e\u098c\3\2\2\2\u098f"+
		"\u0991\7v\2\2\u0990\u098f\3\2\2\2\u0990\u0991\3\2\2\2\u0991\u0165\3\2"+
		"\2\2\u0992\u0995\5\b\5\2\u0993\u0995\5\30\r\2\u0994\u0992\3\2\2\2\u0994"+
		"\u0993\3\2\2\2\u0995\u0167\3\2\2\2\u0996\u099a\5\u016a\u00b6\2\u0997\u099a"+
		"\5\u018a\u00c6\2\u0998\u099a\5\u0186\u00c4\2\u0999\u0996\3\2\2\2\u0999"+
		"\u0997\3\2\2\2\u0999\u0998\3\2\2\2\u099a\u0169\3\2\2\2\u099b\u09aa\5\u016c"+
		"\u00b7\2\u099c\u09aa\5\u018c\u00c7\2\u099d\u09aa\5\u0188\u00c5\2\u099e"+
		"\u09aa\5\36\20\2\u099f\u09aa\5\u0170\u00b9\2\u09a0\u09aa\5\u016e\u00b8"+
		"\2\u09a1\u09aa\5\u0178\u00bd\2\u09a2\u09aa\5\u0176\u00bc\2\u09a3\u09aa"+
		"\5\u0172\u00ba\2\u09a4\u09aa\5\u0174\u00bb\2\u09a5\u09aa\5\u018e\u00c8"+
		"\2\u09a6\u09aa\5\34\17\2\u09a7\u09aa\5\u017a\u00be\2\u09a8\u09aa\5&\24"+
		"\2\u09a9\u099b\3\2\2\2\u09a9\u099c\3\2\2\2\u09a9\u099d\3\2\2\2\u09a9\u099e"+
		"\3\2\2\2\u09a9\u099f\3\2\2\2\u09a9\u09a0\3\2\2\2\u09a9\u09a1\3\2\2\2\u09a9"+
		"\u09a2\3\2\2\2\u09a9\u09a3\3\2\2\2\u09a9\u09a4\3\2\2\2\u09a9\u09a5\3\2"+
		"\2\2\u09a9\u09a6\3\2\2\2\u09a9\u09a7\3\2\2\2\u09a9\u09a8\3\2\2\2\u09aa"+
		"\u016b\3\2\2\2\u09ab\u09ac\7\u0083\2\2\u09ac\u09ad\5\u0168\u00b5\2\u09ad"+
		"\u09ae\7\u0084\2\2\u09ae\u016d\3\2\2\2\u09af\u09b0\7Z\2\2\u09b0\u016f"+
		"\3\2\2\2\u09b1\u09bc\7\u0083\2\2\u09b2\u09b3\5\u0168\u00b5\2\u09b3\u09b4"+
		"\7v\2\2\u09b4\u09b6\3\2\2\2\u09b5\u09b2\3\2\2\2\u09b6\u09b7\3\2\2\2\u09b7"+
		"\u09b5\3\2\2\2\u09b7\u09b8\3\2\2\2\u09b8\u09ba\3\2\2\2\u09b9\u09bb\5\u0168"+
		"\u00b5\2\u09ba\u09b9\3\2\2\2\u09ba\u09bb\3\2\2\2\u09bb\u09bd\3\2\2\2\u09bc"+
		"\u09b5\3\2\2\2\u09bc\u09bd\3\2\2\2\u09bd\u09be\3\2\2\2\u09be\u09bf\7\u0084"+
		"\2\2\u09bf\u0171\3\2\2\2\u09c0\u09c1\7\u0081\2\2\u09c1\u09c2\5\u0168\u00b5"+
		"\2\u09c2\u09c3\7w\2\2\u09c3\u09c4\5\u00e2r\2\u09c4\u09c5\7\u0082\2\2\u09c5"+
		"\u0173\3\2\2\2\u09c6\u09c7\7\u0081\2\2\u09c7\u09c8\5\u0168\u00b5\2\u09c8"+
		"\u09c9\7\u0082\2\2\u09c9\u0175\3\2\2\2\u09ca\u09cc\7[\2\2\u09cb\u09cd"+
		"\5\u0198\u00cd\2\u09cc\u09cb\3\2\2\2\u09cc\u09cd\3\2\2\2\u09cd\u09cf\3"+
		"\2\2\2\u09ce\u09d0\7\26\2\2\u09cf\u09ce\3\2\2\2\u09cf\u09d0\3\2\2\2\u09d0"+
		"\u09d1\3\2\2\2\u09d1\u09d2\5\u016a\u00b6\2\u09d2\u0177\3\2\2\2\u09d3\u09d4"+
		"\7V\2\2\u09d4\u09d5\t\f\2\2\u09d5\u09d6\5\u016a\u00b6\2\u09d6\u0179\3"+
		"\2\2\2\u09d7\u09d9\5\u00c8e\2\u09d8\u09d7\3\2\2\2\u09d8\u09d9\3\2\2\2"+
		"\u09d9\u09da\3\2\2\2\u09da\u09db\5Z.\2\u09db\u09dc\7\f\2\2\u09dc\u09de"+
		"\7\u0083\2\2\u09dd\u09df\5\u017e\u00c0\2\u09de\u09dd\3\2\2\2\u09de\u09df"+
		"\3\2\2\2\u09df\u09e0\3\2\2\2\u09e0\u09e2\7\u0084\2\2\u09e1\u09e3\5\u017c"+
		"\u00bf\2\u09e2\u09e1\3\2\2\2\u09e2\u09e3\3\2\2\2\u09e3\u017b\3\2\2\2\u09e4"+
		"\u09e5\7z\2\2\u09e5\u09e6\5\u016a\u00b6\2\u09e6\u017d\3\2\2\2\u09e7\u09ea"+
		"\5\u0180\u00c1\2\u09e8\u09ea\5\u0184\u00c3\2\u09e9\u09e7\3\2\2\2\u09e9"+
		"\u09e8\3\2\2\2\u09ea\u017f\3\2\2\2\u09eb\u09f0\5\u0182\u00c2\2\u09ec\u09ed"+
		"\7v\2\2\u09ed\u09ef\5\u0182\u00c2\2\u09ee\u09ec\3\2\2\2\u09ef\u09f2\3"+
		"\2\2\2\u09f0\u09ee\3\2\2\2\u09f0\u09f1\3\2\2\2\u09f1\u09f4\3\2\2\2\u09f2"+
		"\u09f0\3\2\2\2\u09f3\u09f5\7v\2\2\u09f4\u09f3\3\2\2\2\u09f4\u09f5\3\2"+
		"\2\2\u09f5\u0181\3\2\2\2\u09f6\u09f8\5\u00d6l\2\u09f7\u09f6\3\2\2\2\u09f8"+
		"\u09fb\3\2\2\2\u09f9\u09f7\3\2\2\2\u09f9\u09fa\3\2\2\2\u09fa\u0a01\3\2"+
		"\2\2\u09fb\u09f9\3\2\2\2\u09fc\u09ff\5\u019a\u00ce\2\u09fd\u09ff\7q\2"+
		"\2\u09fe\u09fc\3\2\2\2\u09fe\u09fd\3\2\2\2\u09ff\u0a00\3\2\2\2\u0a00\u0a02"+
		"\7x\2\2\u0a01\u09fe\3\2\2\2\u0a01\u0a02\3\2\2\2\u0a02\u0a03\3\2\2\2\u0a03"+
		"\u0a04\5\u0168\u00b5\2\u0a04\u0183\3\2\2\2\u0a05\u0a06\5\u0182\u00c2\2"+
		"\u0a06\u0a07\7v\2\2\u0a07\u0a09\3\2\2\2\u0a08\u0a05\3\2\2\2\u0a09\u0a0c"+
		"\3\2\2\2\u0a0a\u0a08\3\2\2\2\u0a0a\u0a0b\3\2\2\2\u0a0b\u0a0d\3\2\2\2\u0a0c"+
		"\u0a0a\3\2\2\2\u0a0d\u0a0e\5\u0182\u00c2\2\u0a0e\u0a12\7v\2\2\u0a0f\u0a11"+
		"\5\u00d6l\2\u0a10\u0a0f\3\2\2\2\u0a11\u0a14\3\2\2\2\u0a12\u0a10\3\2\2"+
		"\2\u0a12\u0a13\3\2\2\2\u0a13\u0a15\3\2\2\2\u0a14\u0a12\3\2\2\2\u0a15\u0a16"+
		"\7t\2\2\u0a16\u0185\3\2\2\2\u0a17\u0a19\7(\2\2\u0a18\u0a17\3\2\2\2\u0a18"+
		"\u0a19\3\2\2\2\u0a19\u0a1a\3\2\2\2\u0a1a\u0a1b\5\u0190\u00c9\2\u0a1b\u0187"+
		"\3\2\2\2\u0a1c\u0a1e\7(\2\2\u0a1d\u0a1c\3\2\2\2\u0a1d\u0a1e\3\2\2\2\u0a1e"+
		"\u0a1f\3\2\2\2\u0a1f\u0a20\5\u0194\u00cb\2\u0a20\u0189\3\2\2\2\u0a21\u0a22"+
		"\7\17\2\2\u0a22\u0a23\5\u0190\u00c9\2\u0a23\u018b\3\2\2\2\u0a24\u0a25"+
		"\7\17\2\2\u0a25\u0a26\5\u0194\u00cb\2\u0a26\u018d\3\2\2\2\u0a27\u0a28"+
		"\7q\2\2\u0a28\u018f\3\2\2\2\u0a29\u0a2e\5\u0192\u00ca\2\u0a2a\u0a2b\7"+
		"T\2\2\u0a2b\u0a2d\5\u0192\u00ca\2\u0a2c\u0a2a\3\2\2\2\u0a2d\u0a30\3\2"+
		"\2\2\u0a2e\u0a2c\3\2\2\2\u0a2e\u0a2f\3\2\2\2\u0a2f\u0a32\3\2\2\2\u0a30"+
		"\u0a2e\3\2\2\2\u0a31\u0a33\7T\2\2\u0a32\u0a31\3\2\2\2\u0a32\u0a33\3\2"+
		"\2\2\u0a33\u0191\3\2\2\2\u0a34\u0a37\5\u0198\u00cd\2\u0a35\u0a37\5\u0194"+
		"\u00cb\2\u0a36\u0a34\3\2\2\2\u0a36\u0a35\3\2\2\2\u0a37\u0193\3\2\2\2\u0a38"+
		"\u0a3a\7~\2\2\u0a39\u0a38\3\2\2\2\u0a39\u0a3a\3\2\2\2\u0a3a\u0a3c\3\2"+
		"\2\2\u0a3b\u0a3d\5\u00c8e\2\u0a3c\u0a3b\3\2\2\2\u0a3c\u0a3d\3\2\2\2\u0a3d"+
		"\u0a3e\3\2\2\2\u0a3e\u0a4a\5\36\20\2\u0a3f\u0a41\7\u0083\2\2\u0a40\u0a42"+
		"\7~\2\2\u0a41\u0a40\3\2\2\2\u0a41\u0a42\3\2\2\2\u0a42\u0a44\3\2\2\2\u0a43"+
		"\u0a45\5\u00c8e\2\u0a44\u0a43\3\2\2\2\u0a44\u0a45\3\2\2\2\u0a45\u0a46"+
		"\3\2\2\2\u0a46\u0a47\5\36\20\2\u0a47\u0a48\7\u0084\2\2\u0a48\u0a4a\3\2"+
		"\2\2\u0a49\u0a39\3\2\2\2\u0a49\u0a3f\3\2\2\2\u0a4a\u0195\3\2\2\2\u0a4b"+
		"\u0a4c\5\u0198\u00cd\2\u0a4c\u0a4d\7T\2\2\u0a4d\u0a4f\3\2\2\2\u0a4e\u0a4b"+
		"\3\2\2\2\u0a4f\u0a52\3\2\2\2\u0a50\u0a4e\3\2\2\2\u0a50\u0a51\3\2\2\2\u0a51"+
		"\u0a54\3\2\2\2\u0a52\u0a50\3\2\2\2\u0a53\u0a55\5\u0198\u00cd\2\u0a54\u0a53"+
		"\3\2\2\2\u0a54\u0a55\3\2\2\2\u0a55\u0197\3\2\2\2\u0a56\u0a57\t\r\2\2\u0a57"+
		"\u0199\3\2\2\2\u0a58\u0a59\t\16\2\2\u0a59\u019b\3\2\2\2\u0a5a\u0a5b\t"+
		"\17\2\2\u0a5b\u019d\3\2\2\2\u0a5c\u0a63\5\u019c\u00cf\2\u0a5d\u0a63\5"+
		"\u019a\u00ce\2\u0a5e\u0a63\78\2\2\u0a5f\u0a63\79\2\2\u0a60\u0a63\7:\2"+
		"\2\u0a61\u0a63\7S\2\2\u0a62\u0a5c\3\2\2\2\u0a62\u0a5d\3\2\2\2\u0a62\u0a5e"+
		"\3\2\2\2\u0a62\u0a5f\3\2\2\2\u0a62\u0a60\3\2\2\2\u0a62\u0a61\3\2\2\2\u0a63"+
		"\u019f\3\2\2\2\u0a64\u0a65\5\u00eav\2\u0a65\u01a1\3\2\2\2\u0a66\u0a67"+
		"\t\20\2\2\u0a67\u01a3\3\2\2\2\u0a68\u0a69\7m\2\2\u0a69\u0a6a\6\u00d3\27"+
		"\2\u0a6a\u0a6b\7m\2\2\u0a6b\u01a5\3\2\2\2\u0a6c\u0a6d\7l\2\2\u0a6d\u0a6e"+
		"\6\u00d4\30\2\u0a6e\u0a6f\7l\2\2\u0a6f\u01a7\3\2\2\2\u0170\u01ab\u01b1"+
		"\u01b7\u01be\u01c6\u01c9\u01d0\u01d6\u01de\u01e6\u01ea\u01ed\u01f5\u01f8"+
		"\u01ff\u0203\u020a\u0212\u021a\u0226\u022c\u0235\u0238\u023f\u0244\u0248"+
		"\u024c\u0251\u0258\u025c\u0266\u026e\u0276\u027a\u027f\u0282\u0289\u0291"+
		"\u029d\u02a9\u02ae\u02c3\u02ca\u02ce\u02d8\u02e0\u02e8\u02ec\u02f1\u02f7"+
		"\u0300\u0304\u0308\u030e\u0316\u031f\u0324\u0327\u0336\u033a\u033d\u0346"+
		"\u034c\u0350\u0356\u035c\u0361\u0368\u036b\u0374\u0378\u037a\u037d\u0383"+
		"\u0385\u0387\u038d\u0391\u0395\u0398\u039d\u03a0\u03a4\u03a6\u03b1\u03b5"+
		"\u03ba\u03c7\u03ca\u03d2\u03d7\u03da\u03de\u03e2\u03e7\u03eb\u03ef\u03f8"+
		"\u03fc\u0401\u0405\u0410\u0414\u0419\u041d\u0424\u0427\u042b\u0434\u0438"+
		"\u043d\u0441\u0447\u044b\u0451\u045b\u045e\u0467\u0471\u047b\u0480\u0484"+
		"\u0486\u0489\u048f\u0495\u049d\u04a1\u04a8\u04ad\u04b2\u04b8\u04bc\u04c0"+
		"\u04c3\u04c9\u04d1\u04d7\u04da\u04e1\u04e5\u04ea\u04f0\u04fa\u0502\u0504"+
		"\u050a\u050e\u0512\u0518\u051e\u0526\u052b\u0530\u0532\u0535\u0539\u053c"+
		"\u0542\u0548\u054e\u0556\u055b\u0561\u0563\u0567\u056d\u0573\u057b\u0580"+
		"\u0584\u0586\u058a\u0594\u0599\u059d\u05a0\u05a9\u05ad\u05b2\u05b7\u05c1"+
		"\u05c9\u05d8\u05dc\u05e3\u05e7\u05ea\u05ef\u05f6\u05fa\u05fd\u0602\u0604"+
		"\u0608\u0610\u0614\u0618\u061f\u0624\u062f\u0637\u063b\u063f\u0642\u0649"+
		"\u064e\u0652\u0654\u0657\u065c\u0669\u066c\u067b\u0680\u0687\u068c\u0693"+
		"\u0697\u06a0\u06a2\u06a8\u06b0\u06b9\u06bf\u06c2\u06c6\u06c9\u06cd\u06d3"+
		"\u06dd\u06e1\u06e8\u06ec\u06f4\u06ff\u0725\u0735\u0745\u0747\u0749\u0753"+
		"\u075e\u0764\u076a\u076e\u0775\u0778\u077b\u077f\u078b\u078f\u0795\u079c"+
		"\u079f\u07a6\u07ad\u07b2\u07bb\u07c1\u07c3\u07c8\u07ce\u07d3\u07dd\u07e5"+
		"\u07e9\u07eb\u07f4\u07f9\u0802\u0806\u080b\u0810\u0819\u081d\u081f\u082a"+
		"\u082e\u0831\u0836\u0839\u0840\u0847\u084b\u0850\u0856\u0859\u085f\u087f"+
		"\u0881\u088d\u088f\u0897\u089b\u08a5\u08ac\u08b3\u08b5\u08ba\u08bf\u08c2"+
		"\u08c9\u08d1\u08e0\u08eb\u08ef\u08f2\u08f5\u08f8\u08fd\u090e\u0912\u0917"+
		"\u091b\u0922\u0929\u092b\u092e\u0935\u093b\u0947\u094a\u094d\u0952\u095a"+
		"\u0963\u0967\u096b\u0978\u097b\u097d\u098c\u0990\u0994\u0999\u09a9\u09b7"+
		"\u09ba\u09bc\u09cc\u09cf\u09d8\u09de\u09e2\u09e9\u09f0\u09f4\u09f9\u09fe"+
		"\u0a01\u0a0a\u0a12\u0a18\u0a1d\u0a2e\u0a32\u0a36\u0a39\u0a3c\u0a41\u0a44"+
		"\u0a49\u0a50\u0a54\u0a62";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}