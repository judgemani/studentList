/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author manki
 */
class Student {
    private String sname;
    private String sID;
//mani123 //12345667123
    public Student(String sname, String sID) {
        this.sname = sname;
        this.sID = sID;
    }
    //view comment 
    public String getSname() {
        return sname;
    }
//comment ar 9;40
    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }
}
