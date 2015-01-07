package com.mfi;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label(value = "Party")
public class prt implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label(value = "Age")
    @org.kie.api.definition.type.Position(value = 3)
    private java.util.List<java.lang.Short> age;

    @org.kie.api.definition.type.Label(value = "Fist Name")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String fst;

    @org.kie.api.definition.type.Label(value = "Home Address")
    @org.kie.api.definition.type.Position(value = 4)
    private java.lang.String hdr;

    @org.kie.api.definition.type.Label(value = "Last Name")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String lst;

    @org.kie.api.definition.type.Label(value = "Middle Name")
    @org.kie.api.definition.type.Position(value = 2)
    private java.util.List<java.lang.String> mdl;

    @org.kie.api.definition.type.Label(value = "Partner")
    @org.kie.api.definition.type.Position(value = 6)
    private com.mfi.prt prt;

    @org.kie.api.definition.type.Label(value = "Work Address")
    @org.kie.api.definition.type.Position(value = 5)
    private java.lang.String wdr;

    public prt() {
    }
    
    public prt(java.lang.String fst, java.lang.String lst, java.util.List<java.lang.String> mdl, java.util.List<java.lang.Short> age, java.lang.String hdr, java.lang.String wdr, com.mfi.prt prt) {
        this.fst = fst;
        this.lst = lst;
        this.mdl = mdl;
        this.age = age;
        this.hdr = hdr;
        this.wdr = wdr;
        this.prt = prt;
    }

    public java.util.List<java.lang.Short> getAge() {
        return this.age;
    }
    
    public void setAge(java.util.List<java.lang.Short> age) {
        this.age = age;
    }

    public java.lang.String getFst() {
        return this.fst;
    }
    
    public void setFst(java.lang.String fst) {
        this.fst = fst;
    }

    public java.lang.String getHdr() {
        return this.hdr;
    }
    
    public void setHdr(java.lang.String hdr) {
        this.hdr = hdr;
    }

    public java.lang.String getLst() {
        return this.lst;
    }
    
    public void setLst(java.lang.String lst) {
        this.lst = lst;
    }

    public java.util.List<java.lang.String> getMdl() {
        return this.mdl;
    }
    
    public void setMdl(java.util.List<java.lang.String> mdl) {
        this.mdl = mdl;
    }

    public com.mfi.prt getPrt() {
        return this.prt;
    }
    
    public void setPrt(com.mfi.prt prt) {
        this.prt = prt;
    }

    public java.lang.String getWdr() {
        return this.wdr;
    }
    
    public void setWdr(java.lang.String wdr) {
        this.wdr = wdr;
    }

}