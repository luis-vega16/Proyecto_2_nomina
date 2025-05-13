package com.example.financialapi;
// Generated from FinancialModel.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FinancialModelParser}.
 */
public interface FinancialModelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FinancialModelParser#calculation}.
	 * @param ctx the parse tree
	 */
	void enterCalculation(FinancialModelParser.CalculationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinancialModelParser#calculation}.
	 * @param ctx the parse tree
	 */
	void exitCalculation(FinancialModelParser.CalculationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinancialModelParser#baseSalary}.
	 * @param ctx the parse tree
	 */
	void enterBaseSalary(FinancialModelParser.BaseSalaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinancialModelParser#baseSalary}.
	 * @param ctx the parse tree
	 */
	void exitBaseSalary(FinancialModelParser.BaseSalaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinancialModelParser#extraHours}.
	 * @param ctx the parse tree
	 */
	void enterExtraHours(FinancialModelParser.ExtraHoursContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinancialModelParser#extraHours}.
	 * @param ctx the parse tree
	 */
	void exitExtraHours(FinancialModelParser.ExtraHoursContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinancialModelParser#bonus}.
	 * @param ctx the parse tree
	 */
	void enterBonus(FinancialModelParser.BonusContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinancialModelParser#bonus}.
	 * @param ctx the parse tree
	 */
	void exitBonus(FinancialModelParser.BonusContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinancialModelParser#tax}.
	 * @param ctx the parse tree
	 */
	void enterTax(FinancialModelParser.TaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinancialModelParser#tax}.
	 * @param ctx the parse tree
	 */
	void exitTax(FinancialModelParser.TaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinancialModelParser#insurance}.
	 * @param ctx the parse tree
	 */
	void enterInsurance(FinancialModelParser.InsuranceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinancialModelParser#insurance}.
	 * @param ctx the parse tree
	 */
	void exitInsurance(FinancialModelParser.InsuranceContext ctx);
}