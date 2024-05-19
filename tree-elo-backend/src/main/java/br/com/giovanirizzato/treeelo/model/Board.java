package br.com.giovanirizzato.treeelo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Board{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)     
	private Integer id;

	private String name;
}