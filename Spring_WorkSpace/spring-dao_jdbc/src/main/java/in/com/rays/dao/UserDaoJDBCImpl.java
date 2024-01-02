package in.com.rays.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.com.rays.dto.UserDTO;

@Repository
public class UserDaoJDBCImpl  implements UserDAOInt{

	private JdbcTemplate jdbcTamplate;
	
	@Autowired
	public void setdataSource (DataSource datasource) {
		
		this.jdbcTamplate = new JdbcTemplate(datasource);
		
	}
	
	public long add(UserDTO dto) {
		String sql = "INSERT INTO USER VALUED(?, ?, ?,?,?)";
		int pk = jdbcTamplate.update(sql , dto.getId(),dto);
		
		
		return 0;
	}

	public void update(UserDTO dto) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	public UserDTO findByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDTO authenticate(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDTO findByPK(long pk) {
		// TODO Auto-generated method stub
		return null;
	}

	public List search(UserDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	public List search(UserDTO dto, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
