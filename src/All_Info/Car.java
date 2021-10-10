/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package All_Info;

import java.util.Date;

/**
 *
 * @author Kunjir
 */
public class Car {
    
    private String city;
    private int seats;
    private String company;
    private String model;
    private int serial;
    private int mfg;
    private String availability;
    private Date expdate;

    Car(String city, int seats, String company, String model, int serial, int mfg, String availability, Date expdate) {
        this.city = city;
        this.seats = seats;
        this.company = company;
        this.model = model;
        this.serial = serial;
        this.mfg = mfg;
        this.availability = availability;
        this.expdate = expdate;
        
    }

    Car() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getMfg() {
        return mfg;
    }

    public void setMfg(int mfg) {
        this.mfg = mfg;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public Date getExpdate() {
        return expdate;
    }

    public void setExpdate(Date expdate) {
        this.expdate = expdate;
    }

  
    @Override
    public String toString(){
        return city;
    }
  
}
