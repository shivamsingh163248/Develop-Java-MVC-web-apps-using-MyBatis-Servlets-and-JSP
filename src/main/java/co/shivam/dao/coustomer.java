package co.shivam.dao;

import org.apache.ibatis.annotations.Insert;

import co.shivam.entity.Coustomer;

public interface coustomer {
	
	
 // maping with the data base 
	@Insert("INSERT INTO CUSTOMUR(names , city , email , phone)values(#{names} , #{city} , #{email} #{phone})")
	public void addCounstomer(Coustomer coustomer);
	
	
	
	
}
