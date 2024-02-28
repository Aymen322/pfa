package com.pfa.model;


import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Formation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String description;

    private double price;

    
    private LocalDate startDate;

    
    private LocalDate endDate;
    

    @ManyToMany(mappedBy = "formations")
    private List<Beneficiaire> beneficiaires;
    
    @ManyToOne
    @JoinColumn(name = "formateur_id")
    private Formateur formateur;

	public Formation(Long id, @NotBlank String description, double price, LocalDate startDate, LocalDate endDate,
			List<Beneficiaire> beneficiaires, Formateur formateur) {
		super();
		this.id = id;
		this.description = description;
		this.price = price;
		this.startDate = startDate;
		this.endDate = endDate;
		this.beneficiaires = beneficiaires;
		this.formateur = formateur;
	}
	

	public Formation() {
		super();
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public List<Beneficiaire> getBeneficiaires() {
		return beneficiaires;
	}

	public void setBeneficiaires(List<Beneficiaire> beneficiaires) {
		this.beneficiaires = beneficiaires;
	}

	public Formateur getFormateur() {
		return formateur;
	}

	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}
	
	
    
    
}