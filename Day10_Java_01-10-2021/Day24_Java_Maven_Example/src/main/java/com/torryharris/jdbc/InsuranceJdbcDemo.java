package com.torryharris.jdbc;

import com.torryharris.model.Insurance;

import java.sql.*;
import java.util.ArrayList;

public class InsuranceJdbcDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/company";
            String userName = "root";
            String password = "Nigilmysql@123";
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected to DB Successfully");
            System.out.println();
            Statement statement = connection.createStatement();
            ArrayList<Insurance> insuranceArrayList = getInsurance();

            //Updating the MySQL DB Increasing Sum by 20%
            String updateQuery= "update Insurance set sum=sum+(sum*(20/100))";
            System.out.println(updateQuery);
            int rowsAffected= statement.executeUpdate(updateQuery);
            System.out.println("Table Updated Successfully");
            System.out.println("No of Rows Affected: "+rowsAffected);


            //Getting Info from MySQL DB to JAVA where Sum > 300000
            /*String query="select * from Insurance where sum>300000";
            ResultSet resultSet=statement.executeQuery(query);
            System.out.println("Insurance Details where Sum > 300000");
            System.out.println("--------------------");
            while(resultSet.next())
            {
                String insName=resultSet.getString("ins_name");
                int insId=resultSet.getInt("ins_id");
                int sum=resultSet.getInt("sum");
                String insType=resultSet.getString("ins_type");
                Insurance insurance=new Insurance(insName,insId,sum,insType);
                System.out.println(insurance);
            }*/

            //Getting Info from MySQL DB to JAVA Order by Sum
            /*String query="select * from Insurance order by sum";
            ResultSet resultSet=statement.executeQuery(query);
            System.out.println("Insurance Details Order By Sum");
            System.out.println("--------------------");
            while(resultSet.next())
            {
                String insName=resultSet.getString("ins_name");
                int insId=resultSet.getInt("ins_id");
                int sum=resultSet.getInt("sum");
                String insType=resultSet.getString("ins_type");
                Insurance insurance=new Insurance(insName,insId,sum,insType);
                System.out.println(insurance);
            }*/

            //Getting Info from MySQL DB to JAVA where Insurence Type is Term
            /*String query="select * from Insurance where ins_type='Term'";
            ResultSet resultSet=statement.executeQuery(query);
            System.out.println("Insurance Details with Insurance Type is Term");
            System.out.println("--------------------");
            while(resultSet.next())
            {
                String insName=resultSet.getString("ins_name");
                int insId=resultSet.getInt("ins_id");
                int sum=resultSet.getInt("sum");
                String insType=resultSet.getString("ins_type");
                Insurance insurance=new Insurance(insName,insId,sum,insType);
                System.out.println(insurance);
            }*/

            //Getting Info from MySQL DB to JAVA
            /*String query="select * from Insurance";
            ResultSet resultSet=statement.executeQuery(query);
            System.out.println("Insurance Details");
            System.out.println("--------------------");
            while(resultSet.next())
            {
                String insName=resultSet.getString("ins_name");
                int insId=resultSet.getInt("ins_id");
                int sum=resultSet.getInt("sum");
                String insType=resultSet.getString("ins_type");
                Insurance insurance=new Insurance(insName,insId,sum,insType);
                System.out.println(insurance);
            }*/

            //Inserting to Employee Table in MySQL DB
            /*for (Insurance i : insuranceArrayList) {
                String insertQuery = "insert into Insurance values('" + i.getInsuranceName() + "'," + i.getInsuranceId()
                        + "," + i.getSum()+ ",'" + i.getInsuranceType() + "')";

                System.out.println(insertQuery);
                statement.execute(insertQuery);
            }
            System.out.println("Inserted the values successfully");*/
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }

    }
    public static ArrayList<Insurance> getInsurance()
    {
        Insurance i1=new Insurance("LIC",1001,500000,"Life");
        Insurance i2=new Insurance("Star",1002,400000,"Health");
        Insurance i3=new Insurance("HDFC",1003,450000,"Term");
        Insurance i4=new Insurance("Axis",1004,300000,"Life");
        Insurance i5=new Insurance("ICICI",1005,350000,"Health");
        Insurance i6=new Insurance("SBI",1006,430000,"Term");
        ArrayList<Insurance> insuranceArrayList=new ArrayList<>();
        insuranceArrayList.add(i1);
        insuranceArrayList.add(i2);
        insuranceArrayList.add(i3);
        insuranceArrayList.add(i4);
        insuranceArrayList.add(i5);
        insuranceArrayList.add(i6);
        return insuranceArrayList;

    }

}


