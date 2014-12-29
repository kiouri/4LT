package com.fourlt.reference;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("\u0441\u043F\u0440\u0430\u0432\u043E\u0447\u043D\u0438\u043A \u0432\u0430\u043B\u044E\u0442")
public class currencyCode implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label(value = "\u043A\u043E\u0434 \u0432\u0430\u043B\u044E\u0442\u044B \u041E\u041A\u0412 \u0446\u0438\u0444\u0440\u043E\u0432\u043E\u0439")
	@org.kie.api.definition.type.Position(value = 0)
	private java.lang.Integer currencyIDdigit;
	@org.kie.api.definition.type.Label(value = "\u043A\u043E\u0434 \u0432\u0430\u043B\u044E\u0442\u044B \u041E\u041A\u0412 \u0431\u0443\u043A\u0432")
	@org.kie.api.definition.type.Position(value = 1)
	private char currencyIdChar;
	@org.kie.api.definition.type.Label(value = "\u0443\u043D\u0438\u0432\u0435\u0440\u0441\u0430\u043B\u044C\u043D\u044B\u0439 \u043A\u043E\u0434 \u0432\u0430\u043B\u044E\u0442\u044B")
	@org.kie.api.definition.type.Position(value = 2)
	private java.lang.Integer currencyID;
	@org.kie.api.definition.type.Label(value = "\u0434\u0440\u043E\u0431\u043D\u0430\u044F \u0435\u0434\u0438\u043D\u0438\u0446\u0430 \u0440\u0430\u0437\u0440\u044F\u0434\u0430")
	@org.kie.api.definition.type.Position(value = 3)
	private java.lang.Integer fractionalUnitDigit;
	@org.kie.api.definition.type.Label(value = "\u041D\u0430\u0438\u043C\u0435\u043D\u043E\u0432\u0430\u043D\u0438\u0435 \u0432\u0430\u043B\u044E\u0442\u044B \u041E\u041A\u0412")
	@org.kie.api.definition.type.Position(value = 4)
	private char currencyDefinition;
	@org.kie.api.definition.type.Label(value = "\u041D\u0430\u0438\u043C\u0435\u043D\u043E\u0432\u0430\u043D\u0438\u0435 \u0432\u0430\u043B\u044E\u0442\u044B \u043F\u043E ISO 4217")
	@org.kie.api.definition.type.Position(value = 5)
	private char currencyDefinitionISO;
	@org.kie.api.definition.type.Label(value = "\u041D\u0430\u0438\u043C\u0435\u043D\u043E\u0432\u0430\u043D\u0438\u0435 \u0441\u0442\u0440\u0430\u043D\u044B")
	@org.kie.api.definition.type.Position(value = 6)
	private com.fourlt.reference.Country currencyCountry;
	@org.kie.api.definition.type.Label(value = "\u0414\u0430\u0442\u0430 \u0432\u043A\u043B\u044E\u0447\u0435\u043D\u0438\u044F \u0432 \u0441\u043F\u0440\u0430\u0432\u043E\u0447\u043D\u0438\u043A \u0432\u0430\u043B\u044E\u0442")
	@org.kie.api.definition.type.Position(value = 7)
	private java.util.Date currencyStartdate;

	public java.lang.Integer getCurrencyIDdigit() {
		return this.currencyIDdigit;
	}

	public void setCurrencyIDdigit(java.lang.Integer currencyIDdigit) {
		this.currencyIDdigit = currencyIDdigit;
	}

	public char getCurrencyIdChar() {
		return this.currencyIdChar;
	}

	public void setCurrencyIdChar(char currencyIdChar) {
		this.currencyIdChar = currencyIdChar;
	}

	public java.lang.Integer getCurrencyID() {
		return this.currencyID;
	}

	public void setCurrencyID(java.lang.Integer currencyID) {
		this.currencyID = currencyID;
	}

	public java.lang.Integer getFractionalUnitDigit() {
		return this.fractionalUnitDigit;
	}

	public void setFractionalUnitDigit(java.lang.Integer fractionalUnitDigit) {
		this.fractionalUnitDigit = fractionalUnitDigit;
	}

	public char getCurrencyDefinition() {
		return this.currencyDefinition;
	}

	public void setCurrencyDefinition(char currencyDefinition) {
		this.currencyDefinition = currencyDefinition;
	}

	public char getCurrencyDefinitionISO() {
		return this.currencyDefinitionISO;
	}

	public void setCurrencyDefinitionISO(char currencyDefinitionISO) {
		this.currencyDefinitionISO = currencyDefinitionISO;
	}

	public com.fourlt.reference.Country getCurrencyCountry() {
		return this.currencyCountry;
	}

	public void setCurrencyCountry(com.fourlt.reference.Country currencyCountry) {
		this.currencyCountry = currencyCountry;
	}

	public java.util.Date getCurrencyStartdate() {
		return this.currencyStartdate;
	}

	public void setCurrencyStartdate(java.util.Date currencyStartdate) {
		this.currencyStartdate = currencyStartdate;
	}

	public currencyCode() {
	}

	public currencyCode(java.lang.Integer currencyIDdigit, char currencyIdChar,
			java.lang.Integer currencyID,
			java.lang.Integer fractionalUnitDigit, char currencyDefinition,
			char currencyDefinitionISO,
			com.fourlt.reference.Country currencyCountry,
			java.util.Date currencyStartdate) {
		this.currencyIDdigit = currencyIDdigit;
		this.currencyIdChar = currencyIdChar;
		this.currencyID = currencyID;
		this.fractionalUnitDigit = fractionalUnitDigit;
		this.currencyDefinition = currencyDefinition;
		this.currencyDefinitionISO = currencyDefinitionISO;
		this.currencyCountry = currencyCountry;
		this.currencyStartdate = currencyStartdate;
	}

}