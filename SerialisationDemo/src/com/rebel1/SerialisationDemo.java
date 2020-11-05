package com.rebel1;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerialisationDemo {

	public static void main(String[] args) 
	{
		Student st1 = new Student();
		st1.setId(1245);
		st1.setName("Ruhi");
		
		Student st2 = new Student();
		st2.setId(46706);
		st2.setName("Hiren Devmurari");
		
		List<Student> c = new ArrayList<>();
		c.add(st1);
		c.add(st2);
		
		University u = new University();
		u.setStudent(c);
		
		try {
			XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("data.xml")));
			x.writeObject(u);
			x.close();
			System.out.println("done !!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
