/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package All_Info;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Kunjir
 */
public class CarDummyData {
    
    
    
Car[] data;

public CarDummyData()
{
try {
SimpleDateFormat formatDate = new SimpleDateFormat("MM-dd-yyyy");
data = new Car[]{
new Car("Boston",2,"Honda Accord","abc",123,777,"Yes",formatDate.parse("11-09-2021")),
new Car("Chicago",5,"Chevrolet","abc",153,121,"Yes",formatDate.parse("11-09-2022")),
new Car("New York",4,"Honda Accord","xyz",546,1212,"no",formatDate.parse("10-09-2020")),
new Car("Boston",3,"Chevrolet","xyz",1223,1233,"Yes",formatDate.parse("10-09-2019")),
new Car("New York",2,"Chevrolet","xyz",1923,147,"no",formatDate.parse("10-09-2021")),
new Car("Chicago",3,"Jeep","abc",1263,852,"no",formatDate.parse("10-09-2021")),
new Car("New York",6,"Chevrolet","abc",1223,412,"Yes",formatDate.parse("10-09-2021")),
new Car("Boston",7,"Jeep","abc",1823,126,"Yes",formatDate.parse("10-09-2021")),
new Car("New York",4,"Honda Accord","abc",1823,258,"no",formatDate.parse("10-09-2021")),
new Car("Chicago",4,"Jeep","abc",1273,258,"Yes",formatDate.parse("10-09-2021")),
};
}
catch (Exception e)
{ }
}



public Car[] getData() {
return data;
}


    
    
}
