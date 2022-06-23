package pub.zgq.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Student implements Serializable {

    private String sid;//学号
    private String sname;//姓名
    private String sex;//性别
    private String birthday;//出生日期
    private String address;//家庭住址
    private String tel;//电话
    private String cname;//班级名称
    private String dname;//宿舍名称

    public Student() {
    }

    public Student(String sid, String sname, String sex, String birthday, String address, String tel, String cname, String dname) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
        this.tel = tel;
        this.cname = cname;
        this.dname = dname;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", tel='" + tel + '\'' +
                ", cname='" + cname + '\'' +
                ", dname='" + dname + '\'' +
                '}';
    }
}
