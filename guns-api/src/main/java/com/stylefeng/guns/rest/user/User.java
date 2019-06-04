package com.stylefeng.guns.rest.user;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    int uuid;
    Integer sex;
    Integer lifeState;
    String email;
    String phone;
    String address;
    String username;
    String password;
    String nickname;
    String birthday;
    String biography;
    String headAddress;
    Date createTime;
    Date updateTime;


    public int getUuid() {
        return uuid;
    }

    public Integer getSex() {
        return sex;
    }

    public Integer getLifeState() {
        return lifeState;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getBiography() {
        return biography;
    }

    public String getHeadAddress() {
        return headAddress;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public void setLifeState(Integer lifeState) {
        this.lifeState = lifeState;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public void setHeadAddress(String headAddress) {
        this.headAddress = headAddress;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "uuid=" + uuid +
                ", sex=" + sex +
                ", lifeState=" + lifeState +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", biography='" + biography + '\'' +
                ", headAddress='" + headAddress + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}