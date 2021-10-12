package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBConnection {
	
	  private Connection con; 
	  private Statement st; 
	  private ResultSet rs; 
	  PreparedStatement pstmt;
	  
	  //DB 연결
	  private void connDB() { 
		  try { 
			  Class.forName("com.mysql.cj.jdbc.Driver"); 
			  con = DriverManager.getConnection("jdbc:mysql://localhost:3307/tutorial", "root", "1234"); 
			  st = con.createStatement();
		  } catch (Exception e) { 
			  System.out.println("데이터베이스 연결 오류 : "+e.getMessage());
		  } 
	  }
	  
	  //DB 연결 종료
	  private void disConnction() {
		  if(rs != null) {
			  try {
				rs.close();
				System.out.println("rs 연결종료");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		  }
		  if(pstmt != null) {
			  try {
				  pstmt.close();
				  System.out.println("pstmt 연결종료");
			  } catch (Exception e) {
				  System.out.println(e.getMessage());
			  }
		  }
		  if(con != null) {
			  try {
				  con.close();
				  System.out.println("con 연결종료");
			  } catch (Exception e) {
				  System.out.println(e.getMessage());
			  }
		  }
	  }
	  
	  //check admin
	  public boolean isAdmin(String adminID, String adminPassword) {
		  connDB();
		  try {
			  String SQL = "SELECT * FROM admin WHERE adminID = '" + adminID + "' and adminPassword = '" + adminPassword + "'"; 
			  rs = st.executeQuery(SQL);
			  if(rs.next()) {
				  return true; 
			  }
			  
		  } catch (Exception e) {
			  System.out.println("데이터베이스 검색 오류 : "+e.getMessage()); 
		  } finally {
			  disConnction();
		  }
		  return false;
		  
	  }
	  
	  //admin List
	  public ArrayList<String> showAdmin() {
		  ArrayList<String> adminList = new ArrayList<>();
		  connDB();
		  try {
			  String SQL = "SELECT * FROM admin";
			  rs = st.executeQuery(SQL);
			  if(rs.next()) {
				  String ID = rs.getString("adminID");
				  String PW = rs.getString("adminPassword");
				  adminList.add("ID = " + ID + "/ PW = " + PW);
				  return adminList;
			  }
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				disConnction();
			}
		return adminList;
	  }
	  
	  
	 
}
