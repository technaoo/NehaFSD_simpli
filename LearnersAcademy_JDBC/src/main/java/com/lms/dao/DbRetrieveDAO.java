package com.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.lms.structure.Student;
import com.lms.structure.Subject;
import com.lms.structure.Teachers;
import com.lms.structure.Classes;
import com.lms.dbUtil.DbUtil;

public class DbRetrieveDAO {
		
		public List<Student> display() throws ClassNotFoundException, SQLException
		{
			
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("connection with dB is established ");
		}
		else {
			System.out.println("connection failed ");
		}
		
				List<Student> list = new ArrayList<>();
				String sql="select * from Student";
				PreparedStatement st=con.prepareStatement(sql);
				
				//address of the table if it exists
				ResultSet rs=st.executeQuery();
				
				while(rs.next()) {
					Student s = new Student();
					s.setid(rs.getInt(1));
					s.setSname(rs.getString(2));
					
					s.setSage(rs.getInt(3));
					s.setSclass(rs.getInt(4));
					list.add(s);
				}
				return list;
				
		}	
		
	public List<Subject> displaysub() throws ClassNotFoundException, SQLException
		{
			
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("connection with dB is established ");
		}
		else {
			System.out.println("connection failed ");
		}	
				List<Subject> listSub= new ArrayList<>();
				String sqls="select * from Subjects";
				PreparedStatement sts=con.prepareStatement(sqls);
				
				//address of the table if it exists
				ResultSet rss=sts.executeQuery();
				
				while(rss.next()) {
					Subject sub = new Subject();
					sub.setId(rss.getInt(1));
					sub.setName(rss.getString(2));
					
					listSub.add(sub);
				}
				return listSub;
			
				
		}
		
		
	public List<Teachers> displayTeachers() throws ClassNotFoundException, SQLException
	{
		
	Connection con=DbUtil.dbConn();
	if(con!=null) {
		System.out.println("connection with dB is established ");
	}
	else {
		System.out.println("connection failed ");
	}
	
			List<Teachers> listT = new ArrayList<>();
			String sqlt="select * from Teachers";
			PreparedStatement stt=con.prepareStatement(sqlt);
			
			//address of the table if it exists
			ResultSet rst=stt.executeQuery();
			
			while(rst.next()) {
				Teachers t = new Teachers();
				t.setId(rst.getInt(1));
				t.setName(rst.getString(2));
				
				t.setAge(rst.getInt(3));
				
				listT.add(t);
			}
			return listT;
			
	}			

	public List<Classes> displayClass(int query) throws ClassNotFoundException, SQLException
	{
		
	Connection con=DbUtil.dbConn();
	if(con!=null) {
		System.out.println("connection with dB is established ");
	}
	else {
		System.out.println("connection failed ");
	}
	
			List<Classes> listC = new ArrayList<>();
			if(query == 1) {
			String sqlc="select * from Classes";
			PreparedStatement stc=con.prepareStatement(sqlc);
			ResultSet rsc=stc.executeQuery();
			while(rsc.next()) {
				Classes c = new Classes();
				c.setId(rsc.getInt(1));
				c.setSection(rsc.getInt(2));
				c.setTeacher(rsc.getString(3));
				c.setSubject(rsc.getString(4));
				c.setTime(rsc.getString(5));
				
				listC.add(c);
			}
			}
			else if (query == 2){
				String sqlc="select * from Classes where subject='HINDI'";
				PreparedStatement stc=con.prepareStatement(sqlc);
				ResultSet rsc=stc.executeQuery();
				while(rsc.next()) {
					Classes c = new Classes();
					c.setId(rsc.getInt(1));
					c.setSection(rsc.getInt(2));
					c.setTeacher(rsc.getString(3));
					c.setSubject(rsc.getString(2));
					c.setTime(rsc.getString(5));
					
					listC.add(c);
				}
				}
			else {
				String sqlc="select * from Classes";
				PreparedStatement stc=con.prepareStatement(sqlc);
				ResultSet rsc=stc.executeQuery();
				while(rsc.next()) {
					Classes c = new Classes();
					c.setId(rsc.getInt(1));
					c.setSection(rsc.getInt(2));
					c.setTeacher(rsc.getString(3));
					c.setSubject(rsc.getString(4));
					c.setTime(rsc.getString(5));
					
					listC.add(c);
				}
			}
			
			//address of the table if it exists
			
			
			
			return listC;
			
	}			
	
	

}
