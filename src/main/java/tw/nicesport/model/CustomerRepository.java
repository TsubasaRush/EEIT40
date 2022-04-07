package tw.nicesport.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	@Query("from Customer where name = :name")
	public List<Customer> findCustomerByName(@Param("name") String name);
	//nativeQuery = true 表示使用原生SQL
	@Query(value="select * from Customer where name = :name", nativeQuery = true)
	public List<Customer> findCustomerByName2(@Param("name") String name);
	
	
	@Transactional   //  因要做刪改  且因目前直接呼叫dao 故需開交易
	@Modifying		//表示要做刪改
	@Query(value="delete from Customer where id = ?1", nativeQuery = true)
	public boolean deleteCustomerById(Integer id); 
	
	//jpaRepository用法
	//只需寫這樣findByLevelOrderByName  剩下去看P101方法或看文件
	public List<Customer> findByLevelOrderByName(Integer level);
}
