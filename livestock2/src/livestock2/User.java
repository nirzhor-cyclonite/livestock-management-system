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
public class User {
    String username;
    String password;
    String userType;
    int tokken;

    public User() {
    }

    public User(String username, String password, String userType, int tokken) {
        this.username = username;
        this.password = password;
        this.userType = userType;
        this.tokken = tokken;
    }
    
}
