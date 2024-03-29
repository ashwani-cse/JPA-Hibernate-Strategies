package com.inheritence.type.demo.inheritance_strategies.joined_table;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

/**
 * @author Ashwani Kumar
 * Created on 13/01/24.
 */

@PrimaryKeyJoinColumn(name = "employee_id")
@Entity(name = "jt_employee")
public class Employee extends Person {

    private double salary;
}
