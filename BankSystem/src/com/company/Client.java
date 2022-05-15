package com.company;
import java.util.ArrayList;

public class Client {

    public Integer id;
    public String name;
    public String surname;
    public String address;
    public Integer passportNumber;
    public Boolean verified;
    public ArrayList accountList;

    public static class Builder {
        public Client newClient;

        public Builder() {
            newClient = new Client();
        }

        public Builder withName(String name){
            newClient.name = name;
            return this;
        }

        public Builder withSurname(String surname){
            newClient.surname = surname;
            return this;
        }

        public Builder withAddress(String address){
            newClient.address = address;
            return this;
        }

        public Builder withPassportNumber(Integer passportNumber){
            newClient.passportNumber = passportNumber;
            return this;
        }

        public Client build(){
            if ( (newClient.name == null) || (newClient.surname == null) ) {
                System.out.println("required fields are not filled");
            } else {
                if ( (newClient.address != null) && (newClient.passportNumber != null) ) {
                    newClient.verified = true;
                }
                return newClient;
            }
            return null;
        }

    }
}
