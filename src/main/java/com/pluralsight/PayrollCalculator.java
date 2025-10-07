package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.*;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the name of the employee file to process: ");
        String inputFileName = scan.nextLine();

        System.out.print("Enter the name of the payroll file to create: ");
        String outputFileName = scan.nextLine();

        try {
            FileReader fileReader = new FileReader(inputFileName);
            BufferedReader bufReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(outputFileName);
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);

            bufWriter.write("employeeid |  employeeName | gross pay");
            bufWriter.newLine();

//            bufReader.readLine(); //Alternative method to skip first line of csv file

            String input;

            Employee[] employeeList = new Employee[10];

            int count = 0;


            while((input = bufReader.readLine()) != null) {
                String[] tokens = input.split("\\|");
                if (!tokens[0].equals("id")) { //Skipping the header row

                    int id = Integer.parseInt(tokens[0]); //id
                    String name = tokens[1];
                    double hoursWorked = Double.parseDouble(tokens[2]);
                    double payRate = Double.parseDouble(tokens[3]);

                    employeeList[count] = new Employee(id, name, hoursWorked, payRate);

                    bufWriter.write(employeeList[count].getEmployeeId()+"|"+employeeList[count].getEmployeeName()+"|"+String.format("%.2f",employeeList[count].getGrossPay()));
                    bufWriter.newLine();

                    bufWriter.close();
                    System.out.println("Payroll file created:"+outputFileName);

                    count++;
                }

            }

            System.out.println(employeeList[0].getEmployeeName());

            bufReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}