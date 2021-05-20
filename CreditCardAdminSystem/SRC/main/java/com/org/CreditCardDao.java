package com.org;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CreditCardDao {
	private static Connection con=null;
	public Boolean addCreditCardDetails(List<CreditCard>cards) throws 
	Exception{
		con=DBConnectionManager.getInstance().getConnection();
		String query="insert into creditcard values(?,?,?,?,?,?,?);";
		PreparedStatement ps=null;
		boolean b=false;
		int index=0;
		int size=cards.size();
		try
		{
			for(CreditCard c:cards) {
				ps=con.prepareStatement(query);
				ps.setLong(1, c.creditCardNum);
				ps.setString(2,c.customerName);
				ps.setString(3,c.customerEmail);
				ps.setLong(4,c.customerPhone);
				ps.setDouble(5,c.billAmount);
				ps.setDate(6,ApplicationUtil.convertUtilToSqlDate(c.dueDate));
				if(c.paymentDate==null) {
					ps.setDate(7, null);
				}
				else {
					ps.setDate(7, ApplicationUtil.convertUtilToSqlDate(c.paymentDate));
				}
				int row=ps.executeUpdate();
				if(row>0) {
					index+=1;
				
				if(index==size) {
					b=true;
					
				}
			}
			
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
	
}
