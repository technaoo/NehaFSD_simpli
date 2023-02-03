package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ShoesDAO {
	
	@Autowired
	ShoesRepo repo;

	public Shoes insert(Shoes s) {
		return repo.save(s);
	}
		
		public List<Shoes> getall(){	//Method for select * from Shoes
			return repo.findAll();
		}
	
	public void deletebyId(Integer id) {
		repo.deleteById(id);
	}
	
	@SuppressWarnings("deprecation")
	public Shoes getShoebyId(Integer id) {
		return repo.getReferenceById(id);
	}
	public List<Shoes> editbyId(String name, float price, Integer id)
	{
		//return repo.editbyId(name, price, id);
		return null;
	}
}
