package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;


public class TestUtil {
	static Xls_Reader reader;
	
	
	
	public static ArrayList<Object[]> getDatafromexcel() {
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		try {
			
			reader = new Xls_Reader("C:\\Users\\dkart\\OneDrive\\Desktop\\Test data.xlsx");
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		
		for(int rowNum= 2; rowNum <= reader.getRowCount("Regdata"); rowNum++) {
			
			String FirstName = reader.getCellData("Regdata","FirstName", rowNum);
			String LastName = reader.getCellData("Regdata","LastName", rowNum);
			String Address1 = reader.getCellData("Regdata","Address1", rowNum);
			String Address2 = reader.getCellData("Regdata","Address2", rowNum);
			String City = reader.getCellData("Regdata","City", rowNum);
			String State = reader.getCellData("Regdata","State", rowNum);
			String Zipcode = reader.getCellData("Regdata","Zipcode", rowNum);
			String EmailAddress = reader.getCellData("Regdata","EmailAddress", rowNum);
			
			Object ob[]= {FirstName, LastName, Address1, Address2, City, State, Zipcode, EmailAddress};
			myData.add(ob);
		}	
			
	
		return myData;
	}

}
