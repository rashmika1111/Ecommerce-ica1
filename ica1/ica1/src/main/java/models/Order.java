package models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
@Entity
public class Order {
	
	 @Id
	    private Integer id;  // Manually assigned ID
	    private LocalDate orderDate;

	    @ManyToOne
	    private Student student;

	    @OneToMany(mappedBy = "order")
	    private List<OrderLine> orderLines;

}
