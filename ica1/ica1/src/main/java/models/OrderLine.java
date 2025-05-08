package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderLine {
	
	  @Id
	    private Integer id;  // Manually assigned ID
	    private Integer quantity;

	    @ManyToOne
	    private Order order;

	    @ManyToOne
	    private Food food;

}
