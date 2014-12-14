package com.fourlt.subject;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("\u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u0421\u0443\u0431\u044A\u0435\u043A\u0442\u0430")
public class documentSubject extends com.fourlt.subject.Subject implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label("\u043A\u043E\u0434 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u0430")
	@org.kie.api.definition.type.Position(0)
	private java.lang.Integer documentId;

    @org.kie.api.definition.type.Label("\u0433\u043E\u0440\u043E\u0434 \u0432\u044B\u0434\u0430\u0447\u0438 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442")
	@org.kie.api.definition.type.Position(7)
	private char documentIssueCityId;

    @org.kie.api.definition.type.Label("\u0414\u0430\u0442\u0430 \u0432\u044B\u0434\u0430\u0447\u0438 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u0430")
	@org.kie.api.definition.type.Position(4)
	private java.util.Date documentIssueDate;

    @org.kie.api.definition.type.Label("\u043F\u043E\u0434\u0440\u0430\u0437\u0434\u0435\u043B\u0435\u043D\u0438\u0435 \u0432\u044B\u0434\u0430\u0432\u0448\u0435\u0435 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442")
	@org.kie.api.definition.type.Position(5)
	private java.lang.Integer documentIssueDepartment;

    @org.kie.api.definition.type.Label("\u041A\u043E\u0434 \u043F\u043E\u0434\u0440\u0430\u0437\u0434\u0435\u043B\u0435\u043D\u0438\u044F \u0432\u044B\u0434\u0430\u0432\u0448\u0435\u0433\u043E \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442")
	@org.kie.api.definition.type.Position(6)
	private java.lang.Integer documentIssueDepartmentCode;

    @org.kie.api.definition.type.Label("\u043D\u043E\u043C\u0435\u0440 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u0430")
	@org.kie.api.definition.type.Position(3)
	private java.lang.Integer documentNumber;

    @org.kie.api.definition.type.Label("\u0441\u0435\u0440\u0438\u044F \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u0430")
	@org.kie.api.definition.type.Position(2)
	private java.lang.Integer documentSeria;

    @org.kie.api.definition.type.Label("\u0442\u0438\u043F \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u0430")
	@org.kie.api.definition.type.Position(1)
	private java.lang.Integer documentType;

    public java.lang.Integer getDocumentId() {
        return this.documentId;
    }
    
    public void setDocumentId(java.lang.Integer documentId) {
        this.documentId = documentId;
    }

    public char getDocumentIssueCityId() {
        return this.documentIssueCityId;
    }
    
    public void setDocumentIssueCityId(char documentIssueCityId) {
        this.documentIssueCityId = documentIssueCityId;
    }

    public java.util.Date getDocumentIssueDate() {
        return this.documentIssueDate;
    }
    
    public void setDocumentIssueDate(java.util.Date documentIssueDate) {
        this.documentIssueDate = documentIssueDate;
    }

    public java.lang.Integer getDocumentIssueDepartment() {
        return this.documentIssueDepartment;
    }
    
    public void setDocumentIssueDepartment(java.lang.Integer documentIssueDepartment) {
        this.documentIssueDepartment = documentIssueDepartment;
    }

    public java.lang.Integer getDocumentIssueDepartmentCode() {
        return this.documentIssueDepartmentCode;
    }
    
    public void setDocumentIssueDepartmentCode(java.lang.Integer documentIssueDepartmentCode) {
        this.documentIssueDepartmentCode = documentIssueDepartmentCode;
    }

    public java.lang.Integer getDocumentNumber() {
        return this.documentNumber;
    }
    
    public void setDocumentNumber(java.lang.Integer documentNumber) {
        this.documentNumber = documentNumber;
    }

    public java.lang.Integer getDocumentSeria() {
        return this.documentSeria;
    }
    
    public void setDocumentSeria(java.lang.Integer documentSeria) {
        this.documentSeria = documentSeria;
    }

    public java.lang.Integer getDocumentType() {
        return this.documentType;
    }
    
    public void setDocumentType(java.lang.Integer documentType) {
        this.documentType = documentType;
    }

	public documentSubject() {
	}

	public documentSubject(java.lang.Integer documentId,
			java.lang.Integer documentType, java.lang.Integer documentSeria,
			java.lang.Integer documentNumber, java.util.Date documentIssueDate,
			java.lang.Integer documentIssueDepartment,
			java.lang.Integer documentIssueDepartmentCode,
			char documentIssueCityId) {
		this.documentId = documentId;
		this.documentType = documentType;
		this.documentSeria = documentSeria;
		this.documentNumber = documentNumber;
		this.documentIssueDate = documentIssueDate;
		this.documentIssueDepartment = documentIssueDepartment;
		this.documentIssueDepartmentCode = documentIssueDepartmentCode;
		this.documentIssueCityId = documentIssueCityId;
	}

}