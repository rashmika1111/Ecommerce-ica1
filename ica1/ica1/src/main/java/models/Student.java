package models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity

public class Student {
	
	 @Id
	    private Integer id;  // Manually assigned ID
	    private String name;
	    private String academicDegree;

	    @OneToMany(mappedBy = "student")
	    private List<Order> orders;


}
