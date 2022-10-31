/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Shreya Baliga*/
public class Community{
      
    
    EnumMap<City, String[]> LstCommunity = new EnumMap<>(City.class);
    Map<String, String> Community = new HashMap<>();
    
    public EnumMap<City, String[]> getLstCommunity() {
        return LstCommunity;
    }

    public void setLstCommunity() {
        LstCommunity.put(City.California, new String[]{"San Francisco", "Los Angeles", "Santa Barbara", "San Diego", });
        LstCommunity.put(City.Boston, new String[]{"Northeastern University", "Prudential", "Arlington", "Cambridge"});
        LstCommunity.put(City.Seattle, new String[]{"Fremont", "Beacon Hill", "Belltown"});
        LstCommunity.put(City.NorthCarolina, new String[]{"Raleigh", "Winston-Salem", "Asheville"});
    }

    public Map<String, String> getCommunity() {
        return Community;
    }

    public void setCommunity(Map<String, String> Community) {
        this.Community = Community;
    }
}
