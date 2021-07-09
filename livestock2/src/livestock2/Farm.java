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
public class Farm {
    int farmId;
    int ownerId;
    int cows;
    int goats;
    int sheep;
    int groupNo;
    int rating;
    String location;

    public Farm() {
    }

    public Farm(int farmId, int ownerId, int cows, int goats, int sheep, int groupNo, int rating, String location) {
        this.farmId = farmId;
        this.ownerId = ownerId;
        this.cows = cows;
        this.goats = goats;
        this.sheep = sheep;
        this.groupNo = groupNo;
        this.rating = rating;
        this.location = location;
    }
    
    public Farm(int farmId, int ownerId, int cows, int goats, int sheep, String location) {
        this.farmId = farmId;
        this.ownerId = ownerId;
        this.cows = cows;
        this.goats = goats;
        this.sheep = sheep;
        this.location = location;
    }
    
    
    public void setGroupNo(int groupNo){
        this.groupNo = groupNo;
    }
    
    public void setRating(int rating){
        this.rating = rating;
    }
    
}
