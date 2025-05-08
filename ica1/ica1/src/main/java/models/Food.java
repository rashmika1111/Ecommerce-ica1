package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Food {
	
	@Id
    private Integer id; 
    private String name;
    private Double price;
    private Double weight;

}
