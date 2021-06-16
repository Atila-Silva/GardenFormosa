package br.com.garden.garden.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "PEOPLE")
public class PeopleModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_PEOPLE")
	private Long idPeople;
	
	@Column(name = "NAME_PEOPLE")
	@NotNull(message = "Nome obrigatório")
	private String namePeople;
	
	@Column(name = "PHONE_PEOPLE")

	@NotNull(message = "Telefone obrigatório")
	private int phonePeople;
	
	@Column(name = "DATA_PEOPLE")
	private LocalDateTime createDatePeople;
	
	public PeopleModel() {	}

	

	public PeopleModel(@NotNull(message = "Nome obrigatório") String namePeople,
			@NotNull(message = "Telefone obrigatório") int phonePeople, LocalDateTime createDatePeople) {
		super();
		this.namePeople = namePeople;
		this.phonePeople = phonePeople;
		this.createDatePeople = createDatePeople;
	}

	
	
	public String getNamePeople() {
		return namePeople;
	}
		
	
	
	public void setNamePeople(String namePeople) {
		this.namePeople = namePeople;
	}



	public int getPhonePeople() {
		return phonePeople;
	}



	public void setPhonePeople(int phonePeople) {
		this.phonePeople = phonePeople;
	}



	public LocalDateTime getCreateDatePeople() {
		return createDatePeople;
	}



	public void setCreateDatePeople(LocalDateTime createDatePeople) {
		this.createDatePeople = createDatePeople;
	}



	public Long getIdPeople() {
		return idPeople;
	}

	public void setIdPeople(Long idPeople) {
		this.idPeople = idPeople;
	}

	

	
	
	


}
