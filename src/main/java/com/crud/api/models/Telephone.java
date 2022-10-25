package models;


import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TELEPHONE")

/*Lombok annotation*/
@Getter
@Setter
@NoArgsConstructor
public class Telephone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(length = 50)
	private String nom;
	@Column(length = 150)
	private String description;
	private Integer prix;
	

}
