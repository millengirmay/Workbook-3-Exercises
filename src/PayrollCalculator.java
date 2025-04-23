import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Employee{
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee(int employeeId, String name, double hoursWorked, double payRate){
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeId(){
        return employeeId;
    }
    public String getName(){
        return name;
    }
    public double getHoursWorked(){
        return hoursWorked;
    }
    public double getPayRate(){
        return payRate;
    }
    double getGrossPay(){
        return this.payRate * this.hoursWorked;
    }
}

public class PayrollCalculator {
    public static void main(String[] args) {
        String fileName = "employees.csv";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(fileName));
            String line;
            int lineNumber = 0;
            bf.readLine();
            System.out.printf("%-10s %-20s %-10s%n", "ID", "Name", "Gross pay");
            System.out.println("----------------------------------------------");

            while ((line = bf.readLine()) != null) {
                String[] parts = line.split("\\|");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double hoursWorked = Double.parseDouble(parts[2]);
                double payRate = Double.parseDouble(parts[3]);

                Employee emp = new Employee(id, name, hoursWorked, payRate);

                System.out.printf("%-10d %-20s $%.2f%n", emp.getEmployeeId(),
                        emp.getName(), emp.getGrossPay());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
