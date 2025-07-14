package Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentdetails1")
public class StudentEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int student_id;

@Column(name ="first_name")
private String firstName;

@Column(name ="last_name")
private String lastName;

@Column(name="age")
private int student_age;

public StudentEntity() {}

public int getstudent_id() {
	return student_id;
}

public void setStudent_id(int student_id) {
	this.student_id = student_id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getstudent_age() {
	return student_age;
}
public void setstudent_age(int student_age) {
	this.student_age=student_age;
}



}
