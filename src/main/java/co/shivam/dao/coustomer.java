package co.shivam.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import co.shivam.entity.Coustomer;

public interface coustomer {
	
	
 // maping with the data base 
	@Insert("INSERT INTO CUSTOMUR(names , city , email , phone)values(#{names} , #{city} , #{email} ,#{phone})")
	public void addCounstomer(Coustomer coustomer);
	
	@Select("select * from CUSTOMUR where id = #{id}")
	public Coustomer getCustomerById(Integer id);
	
	// creating the update maping 
	@Update("update CUSTOMUR set name =#{names} , city = #{city} , email =  #{email} , phone = #{phone} where id = #{id} ")
	public void updateCustomer(Coustomer coustomer);
	
}
