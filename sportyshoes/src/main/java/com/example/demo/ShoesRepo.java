package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ShoesRepo extends JpaRepository<Shoes, Integer> {
//	@Query("Update Shoes shoes set shoes.shoename =?1 and shoes.price=2? where shoes.shoeid=?3")
//	public List<Shoes> editbyId(String shoename, Float price, Integer shoeid);
//}
}