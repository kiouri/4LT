package com.fourlt.subject;

import com.fourlt.reference.Country;
import com.fourlt.party.Party;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("\u0413\u0435\u043E\u0431\u044A\u0435\u043A\u0442\u0421\u0443\u0431\u044A\u0435\u043A\u0442\u0430")
@org.kie.api.definition.type.Description("\u0433\u0435\u043E\u0433\u0440\u0430\u0444\u0438\u0447\u0435\u0441\u043A\u0430\u044F \u043B\u043E\u043A\u0430\u0446\u0438\u044F \u0441\u0443\u0431\u044A\u0435\u043A\u0442\u0430")
public class GeoObject extends Party implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label("\u043A\u043E\u0434 \u0430\u0432\u0442\u043E\u043D\u043E\u043C\u0438\u0438")
	@org.kie.api.definition.type.Position(3)
	private java.lang.Integer autonomyCode;

    @org.kie.api.definition.type.Label("\u041D\u043E\u043C\u0435\u0440 \u0441\u0442\u0440\u043E\u0435\u043D\u0438\u044F")
	@org.kie.api.definition.type.Position(7)
	private java.lang.Integer buildingNumber;

    @org.kie.api.definition.type.Label("\u041A\u043E\u0434 \u0433\u043E\u0440\u043E\u0434\u0430")
	@org.kie.api.definition.type.Position(1)
	private java.lang.Integer cityCode;

    @org.kie.api.definition.type.Label("\u043A\u043E\u0434 \u0441\u0442\u0440\u0430\u043D\u044B ISO3")
	@org.kie.api.definition.type.Position(5)
	private Country countryCodeISO3;

    @org.kie.api.definition.type.Label("\u041A\u043E\u0434 \u0440\u0430\u0439\u043E\u043D\u0430")
	@org.kie.api.definition.type.Position(2)
	private java.lang.Integer districtCode;

    @org.kie.api.definition.type.Label("\u041A\u043E\u0434 \u0433\u0435\u043E\u0431\u043E\u0431\u044A\u0435\u043A\u0442\u0430")
	@org.kie.api.definition.type.Position(0)
	private java.lang.Integer geoObjectCode;

    @org.kie.api.definition.type.Label("\u043D\u043E\u043C\u0435\u0440 \u0434\u043E\u043C\u0430")
	@org.kie.api.definition.type.Position(6)
	private java.lang.Integer houseNumber;

    @org.kie.api.definition.type.Label("\u043A\u043E\u0434 \u0440\u0435\u0433\u0438\u043E\u043D\u0430")
	@org.kie.api.definition.type.Position(4)
	private java.lang.Integer regionCode;

    @org.kie.api.definition.type.Label("\u043D\u043E\u043C\u0435\u0440 \u043A\u043E\u0440\u043F\u0443\u0441\u0430")
	@org.kie.api.definition.type.Position(8)
	private java.lang.Integer blockNumber;

	@org.kie.api.definition.type.Label("\u043D\u043E\u043C\u0435\u0440 \u043A\u0432\u0430\u0440\u0442\u0438\u0440\u044B")
	@org.kie.api.definition.type.Position(9)
	private java.lang.Integer apartmentNumber;

	@org.kie.api.definition.type.Label("\u043D\u043E\u043C\u0435\u0440 \u0438\u043D\u0434\u0435\u043A\u0441\u0430")
	@org.kie.api.definition.type.Position(10)
	private java.lang.Integer postIndex;

	@org.kie.api.definition.type.Label("\u043A\u043E\u0434 \u043D\u0430\u0441\u0435\u043B\u0435\u043D\u043D\u043E\u0433\u043E \u043F\u0443\u043D\u043A\u0442\u0430")
	@org.kie.api.definition.type.Position(11)
	private java.lang.Integer residentialAreaNumber;

	@org.kie.api.definition.type.Label("\u043A\u043E\u0434 \u0443\u043B\u0438\u0446\u044B")
	@org.kie.api.definition.type.Position(12)
	private java.lang.Integer streetCode;

	public java.lang.Integer getAutonomyCode() {
        return this.autonomyCode;
    }
    
    public void setAutonomyCode(java.lang.Integer autonomyCode) {
        this.autonomyCode = autonomyCode;
    }

    public java.lang.Integer getBuildingNumber() {
        return this.buildingNumber;
    }
    
    public void setBuildingNumber(java.lang.Integer buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public java.lang.Integer getCityCode() {
        return this.cityCode;
    }
    
    public void setCityCode(java.lang.Integer cityCode) {
        this.cityCode = cityCode;
    }

    public java.lang.Integer getDistrictCode() {
        return this.districtCode;
    }
    
    public void setDistrictCode(java.lang.Integer districtCode) {
        this.districtCode = districtCode;
    }

    public java.lang.Integer getGeoObjectCode() {
        return this.geoObjectCode;
    }
    
    public void setGeoObjectCode(java.lang.Integer geoObjectCode) {
        this.geoObjectCode = geoObjectCode;
    }

    public java.lang.Integer getHouseNumber() {
        return this.houseNumber;
    }
    
    public void setHouseNumber(java.lang.Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public java.lang.Integer getRegionCode() {
        return this.regionCode;
    }
    
    public void setRegionCode(java.lang.Integer regionCode) {
        this.regionCode = regionCode;
    }

	public java.lang.Integer getBlockNumber() {
		return this.blockNumber;
	}

	public void setBlockNumber(java.lang.Integer blockNumber) {
		this.blockNumber = blockNumber;
	}

	public java.lang.Integer getApartmentNumber() {
		return this.apartmentNumber;
	}

	public void setApartmentNumber(java.lang.Integer apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

	public java.lang.Integer getPostIndex() {
		return this.postIndex;
	}

	public void setPostIndex(java.lang.Integer postIndex) {
		this.postIndex = postIndex;
	}

	public java.lang.Integer getResidentialAreaNumber() {
		return this.residentialAreaNumber;
	}

	public void setResidentialAreaNumber(java.lang.Integer residentialAreaNumber) {
		this.residentialAreaNumber = residentialAreaNumber;
	}

	public java.lang.Integer getStreetCode() {
		return this.streetCode;
	}

	public void setStreetCode(java.lang.Integer streetCode) {
		this.streetCode = streetCode;
	}

	public com.fourlt.reference.Country getCountryCodeISO3() {
		return this.countryCodeISO3;
	}

	public void setCountryCodeISO3(com.fourlt.reference.Country countryCodeISO3) {
		this.countryCodeISO3 = countryCodeISO3;
	}

	public GeoObject() {
	}

	public GeoObject(java.lang.Integer geoObjectCode,
			java.lang.Integer cityCode, java.lang.Integer districtCode,
			java.lang.Integer autonomyCode, java.lang.Integer regionCode,
			com.fourlt.reference.Country countryCodeISO3,
			java.lang.Integer houseNumber, java.lang.Integer buildingNumber,
			java.lang.Integer blockNumber, java.lang.Integer apartmentNumber,
			java.lang.Integer postIndex,
			java.lang.Integer residentialAreaNumber,
			java.lang.Integer streetCode) {
		this.geoObjectCode = geoObjectCode;
		this.cityCode = cityCode;
		this.districtCode = districtCode;
		this.autonomyCode = autonomyCode;
		this.regionCode = regionCode;
		this.countryCodeISO3 = countryCodeISO3;
		this.houseNumber = houseNumber;
		this.buildingNumber = buildingNumber;
		this.blockNumber = blockNumber;
		this.apartmentNumber = apartmentNumber;
		this.postIndex = postIndex;
		this.residentialAreaNumber = residentialAreaNumber;
		this.streetCode = streetCode;
	}

}