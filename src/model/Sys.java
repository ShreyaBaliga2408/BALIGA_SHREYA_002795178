/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import utility.UtilityFunctions;

/**
 *
 * @author Shreya Baliga
 */
public class Sys {
    
    private String name;
    private PatientDirectory patDir;
    private PersonDirectory perDir;
    private UserDirectory userDir;
    private ArrayList<City> cityList;
    
    public Sys(){
    
        patDir = new PatientDirectory(this);
        perDir = new PersonDirectory(this);
        userDir = new UserDirectory();
        cityList = new ArrayList<City>();
        
        createData(this);
        
    }

    public City addCity(String cityName) {
        
        City newCity = new City(this,cityName);
        this.cityList.add(newCity);
        return newCity;
    }
    
    public UserDirectory getUserDir() {
        return userDir;
    }

    public PatientDirectory getPatDir() {
        return patDir;
    }

    public PersonDirectory getPerDir() {
        return perDir;
    }
    
   
    
    public boolean checkIfCityExists(String cityName){
        
        for(City city:this.getCityList()){
            
            if(city.getCitName().equals(cityName)){
                return true; // City exists
            }
            
        }
        
        return false;
    }
    
    public House findHouseInCity(Person person){
    
        for(City city:this.getCityList()){
            
            if(!city.findHouseInCommunity(person).equals(null)){
                return city.findHouseInCommunity(person);
            }
        
        }
        
        return null;
    }
            
    public void createData(Sys sys){
        
        UtilityFunctions util = new UtilityFunctions();
        
        //Add city
        sys.addCity("Boston");
        sys.getCity("Boston").newCommunity("Jamaica Plain");
        
        sys.addCity("Waltham");
        sys.getCity("Waltham").newCommunity("Brandies");
        
        PatientDirectory pD = sys.getPatDir();
        PersonDirectory perD = sys.getPerDir();
        
        //Create person
        Person per1 = perD.createPerson(1234, "Shreya Baliga", util.convertToDate("31-Oct-1996"));
        Person per2 = perD.createPerson(5678, "Neha Baliga", util.convertToDate("20-Dec-1996"));
        
        //Add to house
        Community comm = sys.getCity("Boston").getCommunityByName("Jamaica Plain");
        House house = comm.createHouse(146, "Boylston St.", "Jamaica Plain", "Boston");
        house.addPersonToHouse(per1);
        house.addPersonToHouse(per2);
        
        //Create patient
        Patient pat1 = pD.createPatient(per1);
        Patient pat2 = pD.createPatient(per2);
        
        // Step 1. Get patient
        Patient selectedPatient = pD.searchPatientByName("Shreya Baliga");
        
        // Step 2. Create vital signs
        VitalSigns vs = new VitalSigns(90.0,120.0,72.0);
        
        // Step 3. Map vital signs, patient & encounter
        selectedPatient.getEncounterHistory().addEncounter(vs);
                
    }

    public City getCity(String cityName) {
        for(City city:this.cityList){
            
            if(city.getCitName().equals(cityName))
                    return city;
        }
        
        return null;
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }
    
    
    
}
