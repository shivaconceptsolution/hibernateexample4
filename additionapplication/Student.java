package com.example.additionapplication;

public class Student {
    private int rno;
    private  String sname;
    public  Student(int rno, String sname)
    {
             this.rno=rno;
             this.sname=sname;
    }
    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
