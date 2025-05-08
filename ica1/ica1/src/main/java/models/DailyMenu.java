package models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class DailyMenu {
	
	 @Id
	    private Integer id;  // Manually assigned ID
	    private LocalDate date;

	    @ManyToOne
	    private Canteen canteen;

	    @ManyToMany
	    private List<Food> foods;

}
