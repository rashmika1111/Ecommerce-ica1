package models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {
	
	@Id
    private Integer id;  // Manually assigned ID
    private String name;
    private String jobPosition;

    @ManyToMany
    private List<Canteen> canteens;

}
