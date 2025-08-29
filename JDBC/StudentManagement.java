package com.jdbc1.example;

import java.io.*;
import java.sql.*;

public class StudentManagement {
   BufferedReader br;

   public StudentManagement() {
      this.br = new BufferedReader(new InputStreamReader(System.in));
   }

   public void insertStudent() throws IOException {
      System.out.println("Enter Student Name: ");
      String sname = this.br.readLine();
      System.out.println("Enter Student RollNo: ");
      int sroll = Integer.parseInt(this.br.readLine());
      System.out.println("Enter Student Age: ");
      int sage = Integer.parseInt(this.br.readLine());
      System.out.println("Enter Student Gender: ");
      String sgender = this.br.readLine();
      System.out.println("Enter Student Address: ");
      String saddress = this.br.readLine();
      Connection con = JDBCConnection.getConn();

      try {
         PreparedStatement pst = con.prepareStatement("insert into student1(sname,sroll,sage,saddress,sgender) values(?,?,?,?,?)");
         pst.setString(1, sname);
         pst.setInt(2, sroll);
         pst.setInt(3, sage);
         pst.setString(4, saddress);
         pst.setString(5, sgender);
         int rs = pst.executeUpdate();
         if (rs == 1) {
            System.out.println("Inserted Successfully...");
         } else {
            System.out.println("Failed");
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }

   }

   public void deleteStudent() throws NumberFormatException, IOException {
      System.out.println("Enter Student Roll number : ");
      int sroll = Integer.parseInt(this.br.readLine());
      Connection con = JDBCConnection.getConn();

      try {
         PreparedStatement pst = con.prepareStatement("delete from student where sroll=?");
         pst.setInt(1, sroll);
         int result = pst.executeUpdate();
         if (result == 1) {
            System.out.println("Student Deleted successfully");
         } else {
            System.out.println("Failed");
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public void updateStudent() throws NumberFormatException, IOException {
      System.out.println("Enter Student Roll Number :");
      int sroll = Integer.parseInt(this.br.readLine());
      System.out.println("Enter Student Name: ");
      String sname = this.br.readLine();
      System.out.println("Enter Student Age: ");
      int sage = Integer.parseInt(this.br.readLine());
      System.out.println("Enter Student Gender: ");
      String sgender = this.br.readLine();
      System.out.println("Enter Student Address: ");
      String saddress = this.br.readLine();
      Connection con = JDBCConnection.getConn();

      try {
         PreparedStatement pst = con.prepareStatement("update student set sname=?,sage=?,saddress=?,sgender=? where sroll=?");
         pst.setString(1, sname);
         pst.setInt(2, sage);
         pst.setString(3, saddress);
         pst.setString(4, sgender);
         pst.setInt(5, sroll);
         int result = pst.executeUpdate();
         if (result == 1) {
            System.out.println("Student Updated successfully");
         } else {
            System.out.println("Failed");
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }

   }

   public void displayStudents() {
      Connection con = JDBCConnection.getConn();

      try {
         Statement st = con.createStatement();
         String sql = "select * from student";
         ResultSet rs = st.executeQuery(sql);

         for(int i = 1; rs.next(); ++i) {
            System.out.println("Student: " + i);
            System.out.println("Student Name: " + rs.getString(1));
            System.out.println("Student Roll: " + rs.getInt(2));
            System.out.println("Student Age: " + rs.getInt(3));
            System.out.println("Student Address: " + rs.getString(4));
            System.out.println("Student Gender: " + rs.getString(5));
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }

   public void displayStudentbyRoll() throws NumberFormatException, IOException {
      System.out.println("Enter Student Roll Number :");
      int sroll = Integer.parseInt(this.br.readLine());
      Connection con = JDBCConnection.getConn();

      try {
         Statement st = con.createStatement();
         String sql = "select * from student";
         ResultSet rs = st.executeQuery(sql);
         boolean temp = false;

         while(rs.next()) {
            if (sroll == rs.getInt(2)) {
               temp = true;
               System.out.println("Student Name: " + rs.getString(1));
               System.out.println("Student Roll: " + rs.getInt(2));
               System.out.println("Student Age: " + rs.getInt(3));
               System.out.println("Student Address: " + rs.getString(4));
               System.out.println("Student Gender: " + rs.getString(5));
            }
         }

         if (!temp) {
            System.out.println("Student not found");
         }
      } catch (Exception var7) {
         var7.printStackTrace();
      }

   }

   public static void main(String[] args) throws NumberFormatException, IOException {
      StudentManagement obj = new StudentManagement();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int choice;
      do {
         System.out.println("Welcome to Student management System");
         System.out.println("1.Insert");
         System.out.println("2.delete");
         System.out.println("3.update");
         System.out.println("4.retrive");
         System.out.println("5.retrivebyRoll");
         System.out.println("0.Exit");
         System.out.println("Enter Choice : ");
         choice = Integer.parseInt(br.readLine());
         switch (choice) {
            case 1:
               obj.insertStudent();
               break;
            case 2:
               obj.deleteStudent();
               break;
            case 3:
               obj.updateStudent();
               break;
            case 4:
               obj.displayStudents();
               break;
            case 5:
               obj.displayStudentbyRoll();
               break;
            default:
               System.out.println("Enter Correct Choice....");
         }
      } while(choice != 0);

   }
}
