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
public class Owner {
    int ownerId;
    int token;
    String name;
    String address;
    String contactNo;
    String email;

    public Owner() {
    }

    public Owner(int ownerId, int token, String name, String address, String contactNo, String email) {
        this.ownerId = ownerId;
        this.token = token;
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
        this.email = email;
    }

    
    
    
}
