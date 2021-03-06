package com.fulln.entity.Mongo;

import com.fulln.entity.BaseModel;

import java.io.Serializable;

public class UserEntity extends BaseModel implements Serializable {
        private static final long serialVersionUID = -3258839839160856613L;
        private int id;
        private String userName;
        private String passWord;

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getUserName() {
                return userName;
        }

        public void setUserName(String userName) {
                this.userName = userName;
        }

        public String getPassWord() {
                return passWord;
        }

        public void setPassWord(String passWord) {
                this.passWord = passWord;
        }

}