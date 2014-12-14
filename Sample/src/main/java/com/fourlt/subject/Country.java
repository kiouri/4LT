package com.fourlt.subject;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label(value = "c\u0442\u0440\u0430\u043D\u0430")
public class Country implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label(value = "\u0426\u0438\u0444\u0440\u043E\u0432\u043E\u0439 \u043A\u043E\u0434 \u0441\u0442\u0440\u0430\u043D\u044B")
    @org.kie.api.definition.type.Position(value = 3)
    private java.lang.Integer countryDigit;

    @org.kie.api.definition.type.Label(value = "\u041A\u043E\u0434 \u0441\u0442\u0440\u0430\u043D\u044B ISO2")
    @org.kie.api.definition.type.Position(value = 1)
    private char countryISO2;

    @org.kie.api.definition.type.Label(value = "\u041A\u043E\u0434 \u0441\u0442\u0440\u0430\u043D\u044B ISO3")
    @org.kie.api.definition.type.Position(value = 2)
    private char countryISO3;

    @org.kie.api.definition.type.Label(value = "\u041D\u0430\u0437\u0432\u0430\u043D\u0438\u0435 \u0441\u0442\u0440\u0430\u043D\u044B")
    @org.kie.api.definition.type.Position(value = 0)
    private char countryName;

    public Country() {
    }
    
    public Country(char countryName, char countryISO2, char countryISO3, java.lang.Integer countryDigit) {
        this.countryName = countryName;
        this.countryISO2 = countryISO2;
        this.countryISO3 = countryISO3;
        this.countryDigit = countryDigit;
    }

    public java.lang.Integer getCountryDigit() {
        return this.countryDigit;
    }
    
    public void setCountryDigit(java.lang.Integer countryDigit) {
        this.countryDigit = countryDigit;
    }

    public char getCountryISO2() {
        return this.countryISO2;
    }
    
    public void setCountryISO2(char countryISO2) {
        this.countryISO2 = countryISO2;
    }

    public char getCountryISO3() {
        return this.countryISO3;
    }
    
    public void setCountryISO3(char countryISO3) {
        this.countryISO3 = countryISO3;
    }

    public char getCountryName() {
        return this.countryName;
    }
    
    public void setCountryName(char countryName) {
        this.countryName = countryName;
    }

}