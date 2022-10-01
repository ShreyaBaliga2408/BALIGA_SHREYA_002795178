/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author shreya baliga
 */
public class EmployeeHistory {
    private ArrayList<Employee> history;
    
    public EmployeeHistory()
    {
        this.history= new ArrayList<Employee>();
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    public Employee addnewEmployee()
    {
        Employee empnew= new Employee();
        history.add(empnew);
        return empnew;
    }

    public void deleteEmployee(Employee selectedemployee) {
        history.remove(selectedemployee);
    }

   
    
}
