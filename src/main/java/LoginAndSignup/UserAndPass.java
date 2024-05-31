/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginAndSignup;

import java.util.HashMap;

/**
 *
 * @author admin
 */
public class UserAndPass {

    HashMap<String, String> portal = new HashMap<>();

    public UserAndPass() {
    
        portal.put("05-00-2839", "kurt");
    }
    
    protected HashMap GetLoginInfo(){
        return portal;
    }

    
}
