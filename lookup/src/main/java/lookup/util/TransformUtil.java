package lookup.util;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import lookup.domain.Category;
import lookup.domain.User;

public class TransformUtil {
	private static Logger log = Logger.getLogger("TransformUtil");

	/*
	 * Result Set to List of User
	 * */
	public static List<User> convertToListUser(ResultSet rs){
		List<User> list = null;
		try{
			rs.beforeFirst();
			list = new ArrayList<User>();
			while(rs.next()){
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getString("phone"));
				user.setLoginID(rs.getString("loginID"));
				
				list.add(user);
			}
		}catch(Exception e){
				log.info("Exception Occured");
	            log.info("Class Name: TransformUtil");
	            log.info("Method: convertToListUser()");
	            log.info("Message: ");
	            log.info(e.getMessage());
		}
		
		return list;
	}

	/*
	 * Result Set to User
	 * */
	public static User convertToUser(ResultSet rs){
		User user = null;
		try{
				rs.beforeFirst(); rs.next();
				user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getString("phone"));
				user.setLoginID(rs.getString("loginID"));
								
		}catch(Exception e){
				log.info("Exception Occured");
	            log.info("Class Name: TransformUtil");
	            log.info("Method: convertToUser()");
	            log.info(e.getMessage());
		}
		
		return user;
	}
	
	/*
	 * Result Set to List of Category
	 * */
	public static List<Category> convertToListCategory(ResultSet rs){
		List<Category> list = null;
		try{
			rs.beforeFirst();
			list = new ArrayList<Category>();
			while(rs.next()){
				Category category = new Category();
				category.setId(rs.getInt("id"));
				category.setName(rs.getString("name"));
				category.setUserID(rs.getInt("userid"));
				
				list.add(category);
			}
		}catch(Exception e){
				log.info("Exception Occured");
	            log.info("Class Name: TransformUtil");
	            log.info("Method: convertToListUser()");
	            log.info("Message: ");
	            log.info(e.getMessage());
		}
		
		return list;
	}

	/*
	 * Result Set to Category
	 * */
	public static Category convertToCategory(ResultSet rs){
		Category category = null;
		try{
				rs.beforeFirst(); rs.next();
				category = new Category();
				category.setId(rs.getInt("id"));
				category.setName(rs.getString("name"));
				category.setUserID(rs.getInt("userid"));
								
		}catch(Exception e){
				log.info("Exception Occured");
	            log.info("Class Name: TransformUtil");
	            log.info("Method: convertToUser()");
	            log.info(e.getMessage());
		}
		
		return category;
	}
	
	
}
