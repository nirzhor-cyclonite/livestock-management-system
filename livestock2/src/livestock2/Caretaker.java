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
public class Caretaker {
    int caretakerId;
    String name;
    String contactNo;
    String email;
    String address;
    int farmId;
    int token;

    public Caretaker() {
    }

    public Caretaker(int caretakerId, String name, String contactNo, String email, String address, int farmId, int token) {
        this.caretakerId = caretakerId;
        this.name = name;
        this.contactNo = contactNo;
        this.email = email;
        this.address = address;
        this.farmId = farmId;
        this.token = token;
    }
    
    
}
