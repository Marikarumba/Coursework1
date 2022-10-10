import java.security.PublicKey;

import static java.lang.System.out;

public class Employee {

   public String fullName;
   public int department;
   public int salary;
   public int id;
   public static int employeeCounter = 1;

   public Employee(String fullName, int department, int salary) {

      this.fullName = fullName;
      this.department = department;
      this.salary = salary;
      this.id = employeeCounter++;
   }

   public String getFullName() {
      return fullName;
   }

   public int getDepartment() {
      return department;
   }

   public int getSalary() {
      return salary;
   }

   public int getId() {
      return id;
   }

   public static int getEmployeeCounter() {
      return employeeCounter;
   }

   public void setDepartment(int department) {
      this.department = department;
   }

   public void setSalary(int salary) {
      this.salary = salary;
   }

   public String toString() {
      return "# " + id +" "+ fullName + " Отдел #" + department + " Оклад: " + salary;
   }
}
