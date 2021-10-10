/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package All_Info;
import java.util.ArrayList;

/**
 *
 * @author Kunjir
 */
public class CarInventory {
    
    private ArrayList<Car> storage;
    
    public CarInventory() {
    
        storage = new ArrayList<Car>();
        
    
    }

    
    
    public ArrayList<Car> getStorage() {
        return storage;
    }

    public void setStorage(ArrayList<Car> storage) {
        this.storage = storage;
    }
    
    public Car addData(){
        
        Car car = new Car();
        storage.add(car);
        return car;
    }
    
     public Car addCarDetails(Car car){

        storage.add(car);
        return car;
        }
    
    
    public void deleteData(Car car){
        
       storage.remove(car);
    }
    
    public int getCount(){

        return storage.size();
        }
    
}
