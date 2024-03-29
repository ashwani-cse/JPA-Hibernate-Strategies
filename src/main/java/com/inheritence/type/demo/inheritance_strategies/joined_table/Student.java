package com.inheritence.type.demo.inheritance_strategies.joined_table;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

/**
 * @author Ashwani Kumar
 * Created on 13/01/24.
 */

@PrimaryKeyJoinColumn(name = "student_id")
@Entity(name = "jt_student")
public class Student extends Person {

    private String course;
}
