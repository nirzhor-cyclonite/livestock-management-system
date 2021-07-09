/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livestock2;

/**
 *
 * @author Sujoy
 */
public class Animal {
    int animalId;
    int farmId;
    String animalType;
    int age;
    String requiredMedicine;
    double foodAmount;
    String gender;
    int weight;

    public Animal() {
    }

    public Animal(int animalId, int farmId, String animalType, int age, String requiredMedicine, double foodAmount, String gender, int weight) {
        this.animalId = animalId;
        this.farmId = farmId;
        this.animalType = animalType;
        this.age = age;
        this.requiredMedicine = requiredMedicine;
        this.foodAmount = foodAmount;
        this.gender = gender;
        this.weight = weight;
    }
    
    
    
}
