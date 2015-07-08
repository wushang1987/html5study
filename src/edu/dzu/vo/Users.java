package edu.dzu.vo;

import java.io.Serializable;

public class Users implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private Integer age;
    private String tel;
    private String address;
    
    public Users(){
        
    }
    
    public Users(Integer id){
        this.id = id;
    }
    
    public Users(Integer id, String name, 
            Integer age, String tel, String address){
        this.id = id;
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.address = address;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
}