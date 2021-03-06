package com.mfi;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label(value = "Application")
public class app implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label(value = "Employment period")
    @org.kie.api.definition.type.Position(value = 2)
    private java.util.List<java.lang.Integer> epd;

    @org.kie.api.definition.type.Label(value = "Party")
    @org.kie.api.definition.type.Position(value = 4)
    private com.mfi.prt prt;

    @org.kie.api.definition.type.Label(value = "Position")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String pst;

    @org.kie.api.definition.type.Label(value = "Required Amount")
    @org.kie.api.definition.type.Position(value = 3)
    private java.util.List<java.lang.Long> rat;

    @org.kie.api.definition.type.Label(value = "Required Product")
    @org.kie.api.definition.type.Position(value = 5)
    private java.lang.String rpd;

    @org.kie.api.definition.type.Label(value = "Salary")
    @org.kie.api.definition.type.Position(value = 0)
    private java.util.List<java.lang.Long> slr;

    public app() {
    }
    
    public app(java.util.List<java.lang.Long> slr, java.lang.String pst, java.util.List<java.lang.Integer> epd, java.util.List<java.lang.Long> rat, com.mfi.prt prt, java.lang.String rpd) {
        this.slr = slr;
        this.pst = pst;
        this.epd = epd;
        this.rat = rat;
        this.prt = prt;
        this.rpd = rpd;
    }

    public java.util.List<java.lang.Integer> getEpd() {
        return this.epd;
    }
    
    public void setEpd(java.util.List<java.lang.Integer> epd) {
        this.epd = epd;
    }

    public com.mfi.prt getPrt() {
        return this.prt;
    }
    
    public void setPrt(com.mfi.prt prt) {
        this.prt = prt;
    }

    public java.lang.String getPst() {
        return this.pst;
    }
    
    public void setPst(java.lang.String pst) {
        this.pst = pst;
    }

    public java.util.List<java.lang.Long> getRat() {
        return this.rat;
    }
    
    public void setRat(java.util.List<java.lang.Long> rat) {
        this.rat = rat;
    }

    public java.lang.String getRpd() {
        return this.rpd;
    }
    
    public void setRpd(java.lang.String rpd) {
        this.rpd = rpd;
    }

    public java.util.List<java.lang.Long> getSlr() {
        return this.slr;
    }
    
    public void setSlr(java.util.List<java.lang.Long> slr) {
        this.slr = slr;
    }

}