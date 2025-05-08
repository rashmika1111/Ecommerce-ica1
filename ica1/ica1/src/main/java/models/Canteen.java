package models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Canteen {
	
	
	
	    @Id
	    private Integer id;  // Manually assigned ID
	    private String name;
	    private String location;

	    @OneToMany(mappedBy = "canteen")
	    private List<DailyMenu> dailyMenus;

	    // Getters and Setters
	

}
