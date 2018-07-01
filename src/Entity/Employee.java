/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author ABRAHAM
 */
public class Employee {
    Long id;
    Person peron;

    public Employee() {
    }

    public Employee(Long id, Person peron) {
        this.id = id;
        this.peron = peron;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPeron() {
        return peron;
    }

    public void setPeron(Person peron) {
        this.peron = peron;
    } 
    
}
