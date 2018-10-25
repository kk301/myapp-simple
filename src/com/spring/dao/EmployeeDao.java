package com.spring.dao;
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;

import com.spring.bean.Employee; 
public class EmployeeDao {
	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	} 
	public int save(Employee p){  
		System.out.println("Data Save------"+p.getDesignation()+" "+p.getId()+" "+p.getId()+" "+p.getSalary());
	    String sql="insert into emp3(name,salary,designation)  values('"+p.getName()+"',"+p.getSalary()+",'"+p.getDesignation()+"')";  
	    return template.update(sql);  
	}  
	public int update(Employee p){  
	    String sql="update Emp3 set name='"+p.getName()+"', salary="+p.getSalary()+", designation='"+p.getDesignation()+"' where id="+p.getId()+"";  
	    return template.update(sql);  
	}  
	public int delete(int id){  
	    String sql="delete from Emp3 where id="+id+"";  
	    return template.update(sql);  
	}  
	}  