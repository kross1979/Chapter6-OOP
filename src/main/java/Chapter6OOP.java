/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0273898
 */
public class Chapter6OOP {
    public static void main(String[] args) {
        
        Employee myEmployee = new Employee("John", "Smith", 4000, 0.20F, 500);
        
        float netPayForMonth = myEmployee.calculateMonthlyPay(0, 0);
        
        System.out.println(netPayForMonth);
    }
}
