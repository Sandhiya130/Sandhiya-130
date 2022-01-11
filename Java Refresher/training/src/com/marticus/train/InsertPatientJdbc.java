package com.marticus.train;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
    import java.util.Scanner;
					/**
					 * A sample program that demonstrates how to execute SQL INSERT statement
					 * using JDBC. 
					 * @author www.codejava.net
					 *
					 */
					
	public class InsertPatientJdbc {
		
						public static void main(String[] args) {
							String dbURL = "jdbc:mysql://localhost:3306/hospital";
							String username = "root";
							String password = "Diksheek@26";
							
							try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
								
								String sql = "INSERT INTO patient (patient_id, patient_name, patient_age, patient_disease,patient_gender,allocating_bed,bed_number) VALUES (?, ?, ?,,?,? ?)";
								
								PreparedStatement statement = conn.prepareStatement(sql);
								statement.setString(1, "1041");
								statement.setString(2, "hema");
								statement.setString(3, "24");
								statement.setString(4, "eyecheckup");
								statement.setString(5, "no");
								statement.setString(4, "null");
								
								
								
								int rowsInserted = statement.executeUpdate();
								if (rowsInserted > 0) {
									System.out.println("A new user was inserted successfully!");
								}

								
							} catch (SQLException ex) {
								ex.printStackTrace();
							}		
						}
					

				

			


		

	}


}
