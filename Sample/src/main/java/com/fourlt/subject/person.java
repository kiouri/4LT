package com.fourlt.subject;

import com.fourlt.subject.Subject;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("\u0444\u0438\u0437\u0438\u0447\u0435\u0441\u043A\u043E\u0435 \u043B\u0438\u0446\u043E")
public class person extends Subject implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label("\u043A\u043E\u0434 \u0430\u0432\u0442\u043E\u043D\u043E\u043C\u0438\u0438")
	@org.kie.api.definition.type.Position(5)
	private java.lang.Integer autonomyCode;

    @org.kie.api.definition.type.Label("\u0434\u0430\u0442\u0430 \u0440\u043E\u0436\u0434\u0435\u043D\u0438\u044F")
	@org.kie.api.definition.type.Position(1)
	private java.util.Date birthDate;

    @org.kie.api.definition.type.Label("\u041A\u043E\u0434 \u0433\u043E\u0440\u043E\u0434\u0430 \u0440\u043E\u0436\u0434\u0435\u043D\u0438\u044F")
	@org.kie.api.definition.type.Position(3)
	private java.lang.Integer cityBirthCode;

    @org.kie.api.definition.type.Label("\u043A\u043E\u0434 \u0441\u0442\u0440\u0430\u043D\u044B")
	@org.kie.api.definition.type.Position(7)
	private java.lang.Integer countryCode;

    @org.kie.api.definition.type.Label("\u0434\u0430\u0442\u0430 \u0441\u043C\u0435\u0440\u0442\u0438")
	@org.kie.api.definition.type.Position(2)
	private java.util.Date deathDate;

    @org.kie.api.definition.type.Label("\u043A\u043E\u0434 \u0440\u0430\u0439\u043E\u043D\u0430")
	@org.kie.api.definition.type.Position(4)
	private java.lang.Integer districtCode;

    @org.kie.api.definition.type.Label("\u043A\u043E\u0434 \u0440\u043E\u0434\u043D\u043E\u0433\u043E \u044F\u0437\u044B\u043A\u0430")
	@org.kie.api.definition.type.Position(0)
	private java.lang.Integer motherLanguageCode;

    @org.kie.api.definition.type.Label("\u043A\u043E\u0434 \u0440\u0435\u0433\u0438\u043E\u043D\u0430")
	@org.kie.api.definition.type.Position(6)
	private java.lang.Integer regionCode;

    @org.kie.api.definition.type.Label("\u043A\u043E\u0434 \u0441\u0443\u0431\u044A\u0435\u043A\u0442\u0430")
	@org.kie.api.definition.type.Position(8)
	private java.lang.Integer subjectID;

    public java.lang.Integer getAutonomyCode() {
        return this.autonomyCode;
    }
    
    public void setAutonomyCode(java.lang.Integer autonomyCode) {
        this.autonomyCode = autonomyCode;
    }

    public java.util.Date getBirthDate() {
        return this.birthDate;
    }
    
    public void setBirthDate(java.util.Date birthDate) {
        this.birthDate = birthDate;
    }

    public java.lang.Integer getCityBirthCode() {
        return this.cityBirthCode;
    }
    
    public void setCityBirthCode(java.lang.Integer cityBirthCode) {
        this.cityBirthCode = cityBirthCode;
    }

    public java.lang.Integer getCountryCode() {
        return this.countryCode;
    }
    
    public void setCountryCode(java.lang.Integer countryCode) {
        this.countryCode = countryCode;
    }

    public java.util.Date getDeathDate() {
        return this.deathDate;
    }
    
    public void setDeathDate(java.util.Date deathDate) {
        this.deathDate = deathDate;
    }

    public java.lang.Integer getDistrictCode() {
        return this.districtCode;
    }
    
    public void setDistrictCode(java.lang.Integer districtCode) {
        this.districtCode = districtCode;
    }

    public java.lang.Integer getMotherLanguageCode() {
        return this.motherLanguageCode;
    }
    
    public void setMotherLanguageCode(java.lang.Integer motherLanguageCode) {
        this.motherLanguageCode = motherLanguageCode;
    }

    public java.lang.Integer getRegionCode() {
        return this.regionCode;
    }
    
    public void setRegionCode(java.lang.Integer regionCode) {
        this.regionCode = regionCode;
    }

    public java.lang.Integer getSubjectID() {
        return this.subjectID;
    }
    
    public void setSubjectID(java.lang.Integer subjectID) {
        this.subjectID = subjectID;
    }

	public person() {
	}

	public person(java.lang.Integer motherLanguageCode,
			java.util.Date birthDate, java.util.Date deathDate,
			java.lang.Integer cityBirthCode, java.lang.Integer districtCode,
			java.lang.Integer autonomyCode, java.lang.Integer regionCode,
			java.lang.Integer countryCode, java.lang.Integer subjectID) {
		this.motherLanguageCode = motherLanguageCode;
		this.birthDate = birthDate;
		this.deathDate = deathDate;
		this.cityBirthCode = cityBirthCode;
		this.districtCode = districtCode;
		this.autonomyCode = autonomyCode;
		this.regionCode = regionCode;
		this.countryCode = countryCode;
		this.subjectID = subjectID;
	}

}