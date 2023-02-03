package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Shoes {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int shoeid;
	private String shoename;
	private float price;
	//private String filepath;
}
