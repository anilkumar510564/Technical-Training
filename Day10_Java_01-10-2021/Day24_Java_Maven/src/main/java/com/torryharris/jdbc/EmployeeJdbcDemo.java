package com.torryharris.jdbc;

import com.torryharris.model.Employee;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeJdbcDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/company";
            String userName="root";
            String password="Nigilmysql@123";
            Connection connection= DriverManager.getConnection(url,userName,password);
            System.out.println("Connected to DB Successfully");
            System.out.println();
            Statement statement=connection.createStatement();

            //Getting Info from MySQL DB to JAVA
            String query="select * from Employee";
            ResultSet resultSet=statement.executeQuery(query);
            System.out.println("Employee Details");
            System.out.println("--------------------");
            while(resultSet.next())
            {
                int empId=resultSet.getInt("employee_id");
                String name=resultSet.getString("emp_name");
                String designation=resultSet.getString("designation");
                float salary=resultSet.getFloat("salary");
                int yearOfJoining=resultSet.getInt("year_of_joining");
                Employee employee=new Employee(empId,name,designation,salary,yearOfJoining);
                System.out.println(employee);
            }

            //Updating the MySQL DB
            /*String updateQuery= "update Employee "+"set designation='Architect' "+"where year_of_joining=2021";
            System.out.println(updateQuery);
            int rowsAffected= statement.executeUpdate(updateQuery);
            System.out.println("Table Updated Successfully");
            System.out.println("No of Rows Affected: "+rowsAffected);*/

            ArrayList<Employee> employeeArrayList=getEmployee();

            //Inserting to Employee Table in MySQL DB
            /*for(Employee e:employeeArrayList) {
                String insertQuery1 = "insert into Employee values(" + e.getEmployeeId() + ",'" + e.getName() + "'," +
                        "'" + e.getDesignation() + "'," + e.getSalary() + "," + e.getYearOfJoining() + ")";

                System.out.println(insertQuery1);
                statement.execute(insertQuery1);
            }
            System.out.println("Inserted the values successfully");*/
            statement.close();
            connection.close();
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            ex.printStackTrace();
        }

    }
    public static ArrayList<Employee> getEmployee()
    {
        Employee e1=new Employee(101,"Ram","Manager",60000.0f,2017);
        Employee e2=new Employee(102,"Sita","Business Analyst",55000.0f,2018);
        Employee e3=new Employee(103,"Akash","Quality Analyst",35000.0f,2019);
        Employee e4=new Employee(104,"Shiva","Software Developer",40000.0f,2021);
        Employee e5=new Employee(105,"Sakthi","HR",50000.0f,2021);
        ArrayList<Employee> employeeArrayList=new ArrayList<>();
        employeeArrayList.add(e1);
        employeeArrayList.add(e2);
        employeeArrayList.add(e3);
        employeeArrayList.add(e4);
        employeeArrayList.add(e5);
        return employeeArrayList;

    }
}
