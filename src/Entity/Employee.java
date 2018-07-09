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
    Person person;

    public Employee() {
    }

    public Employee(Long id, Person person) {
        this.id = id;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", person=" + person + '}';
    }
    
}
