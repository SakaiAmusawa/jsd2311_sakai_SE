package io;

import io.InputUtil.InputField;

import java.io.Serializable;

public class UserInfo implements Serializable {
    @InputField
    private String userName;
    @InputField
    private String passwd;
    @InputField
    private String nickName;
    @InputField
    private String sex;
    @InputField(title = "年龄", notNull = true, regex = "[0-9]{1,2}", regexNotMathTitle = "输入错误！请输入1或2位的整数")
    private int age;

    public UserInfo() {
    }

    public UserInfo(String userName, String passwd, String nickName, String sex, int age) {
        this.userName = userName;
        this.passwd = passwd;
        this.nickName = nickName;
        this.sex = sex;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userName='" + userName + '\'' +
                ", passwd='" + passwd + '\'' +
                ", nickName='" + nickName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
