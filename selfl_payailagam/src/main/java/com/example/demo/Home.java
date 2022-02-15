package com.example.demo;


import org.springframework.stereotype.Component;

@Component()
public class Home {
    //POJO class
    private String owner;
    private String doorNo;
    public Home(String owner, String doorNo) {
        this.owner = owner;
        this.doorNo = doorNo;
    }
public void connect()
{
    System.out.println("this is netconnection method");
}


}
