package com.fourlt.subject;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("\u0441\u0443\u0431\u044A\u0435\u043A\u0442")
@org.kie.api.definition.type.PropertyReactive
public class subject implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Description("\u043D\u043E\u043C\u0435\u0440 \u0418\u041D\u041D \u0441\u0443\u0431\u044A\u0435\u043A\u0442\u0430")
	@org.kie.api.definition.type.Label("\u0438\u043D\u043D")
	@org.kie.api.definition.type.Position(1)
	private subject_type inn;

    @org.kie.api.definition.type.Description("\u043A\u043E\u0434 \u043F\u0440\u0435\u0434\u043F\u043E\u0447\u0438\u0442\u0430\u0435\u043C\u043E\u0433\u043E \u044F\u0437\u044B\u043A\u0430")
	@org.kie.api.definition.type.Label("\u044F\u0437\u044B\u043A")
	@org.kie.api.definition.type.Position(2)
	private java.lang.Integer language;

    @org.kie.api.definition.type.Description("\u0441\u0441\u044B\u043B\u043A\u0430 \u043D\u0430 \u0440\u043E\u0434\u0438\u0442\u0435\u043B\u044C\u0441\u043A\u0438\u0439 \u0438\u0434 \u0441\u0443\u0431\u044A\u0435\u043A\u0442\u0430")
	@org.kie.api.definition.type.Label("\u0420\u043E\u0434\u0438\u0442\u0435\u043B\u044C\u0441\u043A\u0438\u0439 \u0438\u0434 \u0441\u0443\u0431\u044A\u0435\u043A\u0442\u0430")
	@org.kie.api.definition.type.Position(4)
	private java.lang.Integer parentId;

    @org.kie.api.definition.type.Description("\u0438\u0434 \u0441\u0443\u0431\u044A\u0435\u043A\u0442\u0430")
	@org.kie.api.definition.type.Label("\u043A\u043E\u0434 \u0441\u0443\u0431\u044A\u0435\u043A\u0442\u0430")
	@org.kie.api.definition.type.Position(0)
	private java.lang.Integer subjectId;

    @org.kie.api.definition.type.Description("\u0422\u0438\u043F \u0441\u0443\u0431\u044A\u0435\u043A\u0442\u0430: \u0444\u0438\u0437\u0438\u0447\u0435\u0441\u043A\u043E\u0435 \u043B\u0438\u0446\u043E, \u0438\u043D\u0434\u0438\u0432\u0438\u0434\u0443\u0430\u043B\u044C\u043D\u044B\u0439 \u043F\u0440\u0435\u0434\u043F\u0440\u0438\u043D\u0438\u043C\u0430\u0442\u0435\u043B\u044C, \u043E\u043E\u043E \u0438 \u0442\u0434")
	@org.kie.api.definition.type.Label("\u0442\u0438\u043F \u0441\u0443\u0431\u044A\u0435\u043A\u0442\u0430")
	@org.kie.api.definition.type.Position(3)
	private char subjectType;

    public java.lang.Integer getLanguage() {
        return this.language;
    }
    
    public void setLanguage(java.lang.Integer language) {
        this.language = language;
    }

    public java.lang.Integer getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(java.lang.Integer subjectId) {
		this.subjectId = subjectId;
	}

	public char getSubjectType() {
		return this.subjectType;
	}

	public void setSubjectType(char subjectType) {
		this.subjectType = subjectType;
	}

	public java.lang.Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(java.lang.Integer parentId) {
		this.parentId = parentId;
	}

	public com.fourlt.subject.subject_type getInn() {
		return this.inn;
	}

	public void setInn(com.fourlt.subject.subject_type inn) {
		this.inn = inn;
	}

	public subject() {
	}

	public subject(java.lang.Integer subjectId,
			com.fourlt.subject.subject_type inn, java.lang.Integer language,
			char subjectType, java.lang.Integer parentId) {
		this.subjectId = subjectId;
		this.inn = inn;
		this.language = language;
		this.subjectType = subjectType;
		this.parentId = parentId;
	}

}