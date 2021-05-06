/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.golang.provider;

import com.ducesoft.babel.emperor.spi.MtQueue;
import com.ducesoft.babel.emperor.spi.Transformer;
import com.ducesoft.babel.emperor.tool.SourceTree;
import com.ducesoft.babel.golang.grammar.GoParser.*;
import com.ducesoft.babel.golang.grammar.GoParserBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * @author coyzeng@gmail.com
 */
public class GolangTransformer extends GoParserBaseListener implements Transformer {

    private final SourceTree queue = new SourceTree();

    @Override
    public void enterPackageClause(PackageClauseContext ctx) {
        queue.confinePackage(ctx.getChild(1).getText());
    }

    @Override
    public void exitPackageClause(PackageClauseContext ctx) {
        queue.definePackage(ctx.getText());
    }

    @Override
    public void enterImportDecl(ImportDeclContext ctx) {

    }

    @Override
    public void exitImportDecl(ImportDeclContext ctx) {

    }

    @Override
    public void enterImportSpec(ImportSpecContext ctx) {

    }

    @Override
    public void exitImportSpec(ImportSpecContext ctx) {

    }

    @Override
    public void enterImportPath(ImportPathContext ctx) {

    }

    @Override
    public void exitImportPath(ImportPathContext ctx) {

    }

    @Override
    public void enterDeclaration(DeclarationContext ctx) {

    }

    @Override
    public void exitDeclaration(DeclarationContext ctx) {

    }

    @Override
    public void enterConstDecl(ConstDeclContext ctx) {

    }

    @Override
    public void exitConstDecl(ConstDeclContext ctx) {

    }

    @Override
    public void enterConstSpec(ConstSpecContext ctx) {

    }

    @Override
    public void exitConstSpec(ConstSpecContext ctx) {

    }

    @Override
    public void enterIdentifierList(IdentifierListContext ctx) {

    }

    @Override
    public void exitIdentifierList(IdentifierListContext ctx) {

    }

    @Override
    public void enterExpressionList(ExpressionListContext ctx) {

    }

    @Override
    public void exitExpressionList(ExpressionListContext ctx) {

    }

    @Override
    public void enterTypeDecl(TypeDeclContext ctx) {

    }

    @Override
    public void exitTypeDecl(TypeDeclContext ctx) {

    }

    @Override
    public void enterTypeSpec(TypeSpecContext ctx) {

    }

    @Override
    public void exitTypeSpec(TypeSpecContext ctx) {

    }

    @Override
    public void enterFunctionDecl(FunctionDeclContext ctx) {

    }

    @Override
    public void exitFunctionDecl(FunctionDeclContext ctx) {

    }

    @Override
    public void enterMethodDecl(MethodDeclContext ctx) {

    }

    @Override
    public void exitMethodDecl(MethodDeclContext ctx) {

    }

    @Override
    public void enterReceiver(ReceiverContext ctx) {

    }

    @Override
    public void exitReceiver(ReceiverContext ctx) {

    }

    @Override
    public void enterVarDecl(VarDeclContext ctx) {

    }

    @Override
    public void exitVarDecl(VarDeclContext ctx) {

    }

    @Override
    public void enterVarSpec(VarSpecContext ctx) {

    }

    @Override
    public void exitVarSpec(VarSpecContext ctx) {

    }

    @Override
    public void enterBlock(BlockContext ctx) {

    }

    @Override
    public void exitBlock(BlockContext ctx) {

    }

    @Override
    public void enterStatementList(StatementListContext ctx) {

    }

    @Override
    public void exitStatementList(StatementListContext ctx) {

    }

    @Override
    public void enterStatement(StatementContext ctx) {

    }

    @Override
    public void exitStatement(StatementContext ctx) {

    }

    @Override
    public void enterSimpleStmt(SimpleStmtContext ctx) {

    }

    @Override
    public void exitSimpleStmt(SimpleStmtContext ctx) {

    }

    @Override
    public void enterExpressionStmt(ExpressionStmtContext ctx) {

    }

    @Override
    public void exitExpressionStmt(ExpressionStmtContext ctx) {

    }

    @Override
    public void enterSendStmt(SendStmtContext ctx) {

    }

    @Override
    public void exitSendStmt(SendStmtContext ctx) {

    }

    @Override
    public void enterIncDecStmt(IncDecStmtContext ctx) {

    }

    @Override
    public void exitIncDecStmt(IncDecStmtContext ctx) {

    }

    @Override
    public void enterAssignment(AssignmentContext ctx) {

    }

    @Override
    public void exitAssignment(AssignmentContext ctx) {

    }

    @Override
    public void enterAssign_op(Assign_opContext ctx) {

    }

    @Override
    public void exitAssign_op(Assign_opContext ctx) {

    }

    @Override
    public void enterShortVarDecl(ShortVarDeclContext ctx) {

    }

    @Override
    public void exitShortVarDecl(ShortVarDeclContext ctx) {

    }

    @Override
    public void enterEmptyStmt(EmptyStmtContext ctx) {

    }

    @Override
    public void exitEmptyStmt(EmptyStmtContext ctx) {

    }

    @Override
    public void enterLabeledStmt(LabeledStmtContext ctx) {

    }

    @Override
    public void exitLabeledStmt(LabeledStmtContext ctx) {

    }

    @Override
    public void enterReturnStmt(ReturnStmtContext ctx) {

    }

    @Override
    public void exitReturnStmt(ReturnStmtContext ctx) {

    }

    @Override
    public void enterBreakStmt(BreakStmtContext ctx) {

    }

    @Override
    public void exitBreakStmt(BreakStmtContext ctx) {

    }

    @Override
    public void enterContinueStmt(ContinueStmtContext ctx) {

    }

    @Override
    public void exitContinueStmt(ContinueStmtContext ctx) {

    }

    @Override
    public void enterGotoStmt(GotoStmtContext ctx) {

    }

    @Override
    public void exitGotoStmt(GotoStmtContext ctx) {

    }

    @Override
    public void enterFallthroughStmt(FallthroughStmtContext ctx) {

    }

    @Override
    public void exitFallthroughStmt(FallthroughStmtContext ctx) {

    }

    @Override
    public void enterDeferStmt(DeferStmtContext ctx) {

    }

    @Override
    public void exitDeferStmt(DeferStmtContext ctx) {

    }

    @Override
    public void enterIfStmt(IfStmtContext ctx) {

    }

    @Override
    public void exitIfStmt(IfStmtContext ctx) {

    }

    @Override
    public void enterSwitchStmt(SwitchStmtContext ctx) {

    }

    @Override
    public void exitSwitchStmt(SwitchStmtContext ctx) {

    }

    @Override
    public void enterExprSwitchStmt(ExprSwitchStmtContext ctx) {

    }

    @Override
    public void exitExprSwitchStmt(ExprSwitchStmtContext ctx) {

    }

    @Override
    public void enterExprCaseClause(ExprCaseClauseContext ctx) {

    }

    @Override
    public void exitExprCaseClause(ExprCaseClauseContext ctx) {

    }

    @Override
    public void enterExprSwitchCase(ExprSwitchCaseContext ctx) {

    }

    @Override
    public void exitExprSwitchCase(ExprSwitchCaseContext ctx) {

    }

    @Override
    public void enterTypeSwitchStmt(TypeSwitchStmtContext ctx) {

    }

    @Override
    public void exitTypeSwitchStmt(TypeSwitchStmtContext ctx) {

    }

    @Override
    public void enterTypeSwitchGuard(TypeSwitchGuardContext ctx) {

    }

    @Override
    public void exitTypeSwitchGuard(TypeSwitchGuardContext ctx) {

    }

    @Override
    public void enterTypeCaseClause(TypeCaseClauseContext ctx) {

    }

    @Override
    public void exitTypeCaseClause(TypeCaseClauseContext ctx) {

    }

    @Override
    public void enterTypeSwitchCase(TypeSwitchCaseContext ctx) {

    }

    @Override
    public void exitTypeSwitchCase(TypeSwitchCaseContext ctx) {

    }

    @Override
    public void enterTypeList(TypeListContext ctx) {

    }

    @Override
    public void exitTypeList(TypeListContext ctx) {

    }

    @Override
    public void enterSelectStmt(SelectStmtContext ctx) {

    }

    @Override
    public void exitSelectStmt(SelectStmtContext ctx) {

    }

    @Override
    public void enterCommClause(CommClauseContext ctx) {

    }

    @Override
    public void exitCommClause(CommClauseContext ctx) {

    }

    @Override
    public void enterCommCase(CommCaseContext ctx) {

    }

    @Override
    public void exitCommCase(CommCaseContext ctx) {

    }

    @Override
    public void enterRecvStmt(RecvStmtContext ctx) {

    }

    @Override
    public void exitRecvStmt(RecvStmtContext ctx) {

    }

    @Override
    public void enterForStmt(ForStmtContext ctx) {

    }

    @Override
    public void exitForStmt(ForStmtContext ctx) {

    }

    @Override
    public void enterForClause(ForClauseContext ctx) {

    }

    @Override
    public void exitForClause(ForClauseContext ctx) {

    }

    @Override
    public void enterRangeClause(RangeClauseContext ctx) {

    }

    @Override
    public void exitRangeClause(RangeClauseContext ctx) {

    }

    @Override
    public void enterGoStmt(GoStmtContext ctx) {

    }

    @Override
    public void exitGoStmt(GoStmtContext ctx) {

    }

    @Override
    public void enterType_(Type_Context ctx) {

    }

    @Override
    public void exitType_(Type_Context ctx) {

    }

    @Override
    public void enterTypeName(TypeNameContext ctx) {

    }

    @Override
    public void exitTypeName(TypeNameContext ctx) {

    }

    @Override
    public void enterTypeLit(TypeLitContext ctx) {

    }

    @Override
    public void exitTypeLit(TypeLitContext ctx) {

    }

    @Override
    public void enterArrayType(ArrayTypeContext ctx) {

    }

    @Override
    public void exitArrayType(ArrayTypeContext ctx) {

    }

    @Override
    public void enterArrayLength(ArrayLengthContext ctx) {

    }

    @Override
    public void exitArrayLength(ArrayLengthContext ctx) {

    }

    @Override
    public void enterElementType(ElementTypeContext ctx) {

    }

    @Override
    public void exitElementType(ElementTypeContext ctx) {

    }

    @Override
    public void enterPointerType(PointerTypeContext ctx) {

    }

    @Override
    public void exitPointerType(PointerTypeContext ctx) {

    }

    @Override
    public void enterInterfaceType(InterfaceTypeContext ctx) {

    }

    @Override
    public void exitInterfaceType(InterfaceTypeContext ctx) {

    }

    @Override
    public void enterSliceType(SliceTypeContext ctx) {

    }

    @Override
    public void exitSliceType(SliceTypeContext ctx) {

    }

    @Override
    public void enterMapType(MapTypeContext ctx) {

    }

    @Override
    public void exitMapType(MapTypeContext ctx) {

    }

    @Override
    public void enterChannelType(ChannelTypeContext ctx) {

    }

    @Override
    public void exitChannelType(ChannelTypeContext ctx) {

    }

    @Override
    public void enterMethodSpec(MethodSpecContext ctx) {

    }

    @Override
    public void exitMethodSpec(MethodSpecContext ctx) {

    }

    @Override
    public void enterFunctionType(FunctionTypeContext ctx) {

    }

    @Override
    public void exitFunctionType(FunctionTypeContext ctx) {

    }

    @Override
    public void enterSignature(SignatureContext ctx) {

    }

    @Override
    public void exitSignature(SignatureContext ctx) {

    }

    @Override
    public void enterResult(ResultContext ctx) {

    }

    @Override
    public void exitResult(ResultContext ctx) {

    }

    @Override
    public void enterParameters(ParametersContext ctx) {

    }

    @Override
    public void exitParameters(ParametersContext ctx) {

    }

    @Override
    public void enterParameterDecl(ParameterDeclContext ctx) {

    }

    @Override
    public void exitParameterDecl(ParameterDeclContext ctx) {

    }

    @Override
    public void enterExpression(ExpressionContext ctx) {

    }

    @Override
    public void exitExpression(ExpressionContext ctx) {

    }

    @Override
    public void enterPrimaryExpr(PrimaryExprContext ctx) {

    }

    @Override
    public void exitPrimaryExpr(PrimaryExprContext ctx) {

    }

    @Override
    public void enterUnaryExpr(UnaryExprContext ctx) {

    }

    @Override
    public void exitUnaryExpr(UnaryExprContext ctx) {

    }

    @Override
    public void enterConversion(ConversionContext ctx) {

    }

    @Override
    public void exitConversion(ConversionContext ctx) {

    }

    @Override
    public void enterOperand(OperandContext ctx) {

    }

    @Override
    public void exitOperand(OperandContext ctx) {

    }

    @Override
    public void enterLiteral(LiteralContext ctx) {

    }

    @Override
    public void exitLiteral(LiteralContext ctx) {

    }

    @Override
    public void enterBasicLit(BasicLitContext ctx) {

    }

    @Override
    public void exitBasicLit(BasicLitContext ctx) {

    }

    @Override
    public void enterInteger(IntegerContext ctx) {

    }

    @Override
    public void exitInteger(IntegerContext ctx) {

    }

    @Override
    public void enterOperandName(OperandNameContext ctx) {

    }

    @Override
    public void exitOperandName(OperandNameContext ctx) {

    }

    @Override
    public void enterQualifiedIdent(QualifiedIdentContext ctx) {

    }

    @Override
    public void exitQualifiedIdent(QualifiedIdentContext ctx) {

    }

    @Override
    public void enterCompositeLit(CompositeLitContext ctx) {

    }

    @Override
    public void exitCompositeLit(CompositeLitContext ctx) {

    }

    @Override
    public void enterLiteralType(LiteralTypeContext ctx) {

    }

    @Override
    public void exitLiteralType(LiteralTypeContext ctx) {

    }

    @Override
    public void enterLiteralValue(LiteralValueContext ctx) {

    }

    @Override
    public void exitLiteralValue(LiteralValueContext ctx) {

    }

    @Override
    public void enterElementList(ElementListContext ctx) {

    }

    @Override
    public void exitElementList(ElementListContext ctx) {

    }

    @Override
    public void enterKeyedElement(KeyedElementContext ctx) {

    }

    @Override
    public void exitKeyedElement(KeyedElementContext ctx) {

    }

    @Override
    public void enterKey(KeyContext ctx) {

    }

    @Override
    public void exitKey(KeyContext ctx) {

    }

    @Override
    public void enterElement(ElementContext ctx) {

    }

    @Override
    public void exitElement(ElementContext ctx) {

    }

    @Override
    public void enterStructType(StructTypeContext ctx) {

    }

    @Override
    public void exitStructType(StructTypeContext ctx) {

    }

    @Override
    public void enterFieldDecl(FieldDeclContext ctx) {

    }

    @Override
    public void exitFieldDecl(FieldDeclContext ctx) {

    }

    @Override
    public void enterString_(String_Context ctx) {

    }

    @Override
    public void exitString_(String_Context ctx) {

    }

    @Override
    public void enterEmbeddedField(EmbeddedFieldContext ctx) {

    }

    @Override
    public void exitEmbeddedField(EmbeddedFieldContext ctx) {

    }

    @Override
    public void enterFunctionLit(FunctionLitContext ctx) {

    }

    @Override
    public void exitFunctionLit(FunctionLitContext ctx) {

    }

    @Override
    public void enterIndex(IndexContext ctx) {

    }

    @Override
    public void exitIndex(IndexContext ctx) {

    }

    @Override
    public void enterSlice(SliceContext ctx) {

    }

    @Override
    public void exitSlice(SliceContext ctx) {

    }

    @Override
    public void enterTypeAssertion(TypeAssertionContext ctx) {

    }

    @Override
    public void exitTypeAssertion(TypeAssertionContext ctx) {

    }

    @Override
    public void enterArguments(ArgumentsContext ctx) {

    }

    @Override
    public void exitArguments(ArgumentsContext ctx) {

    }

    @Override
    public void enterMethodExpr(MethodExprContext ctx) {

    }

    @Override
    public void exitMethodExpr(MethodExprContext ctx) {

    }

    @Override
    public void enterReceiverType(ReceiverTypeContext ctx) {

    }

    @Override
    public void exitReceiverType(ReceiverTypeContext ctx) {

    }

    @Override
    public void enterEos(EosContext ctx) {

    }

    @Override
    public void exitEos(EosContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode node) {

    }

    @Override
    public void visitErrorNode(ErrorNode node) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }

    @Override
    public MtQueue transform() {
        return this.queue;
    }
}
