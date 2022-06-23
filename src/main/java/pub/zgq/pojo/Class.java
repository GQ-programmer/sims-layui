package pub.zgq.pojo;

public class Class {
    private Integer c_id;
    private String c_classId;
    private String c_className;
    private String c_counsellor;

    public Class() {
    }

    public Class(Integer c_id, String c_classId, String c_classsName, String c_counsellor) {
        this.c_id = c_id;
        this.c_classId = c_classId;
        this.c_className = c_classsName;
        this.c_counsellor = c_counsellor;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getC_classId() {
        return c_classId;
    }

    public void setC_classId(String c_classId) {
        this.c_classId = c_classId;
    }

    public String getC_className() {
        return c_className;
    }

    public void setC_className(String c_className) {
        this.c_className = c_className;
    }

    public String getC_counsellor() {
        return c_counsellor;
    }

    public void setC_counsellor(String c_counsellor) {
        this.c_counsellor = c_counsellor;
    }
}
