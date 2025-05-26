package challenges.javacore.test;

import challenges.javacore.domain.entity.Employee;
import challenges.javacore.useCases.ArithmeticMean;
import challenges.javacore.useCases.PrintEmployeeData;

public class EmployeeTest {
  public static void main(String[] args) {
    Employee employee = new Employee();
    PrintEmployeeData printEmployeeData = new PrintEmployeeData();
    ArithmeticMean arithmeticMean = new ArithmeticMean();

    employee.name = "Brenno";
    employee.age = 23;
    employee.salarys = null;

    printEmployeeData.printEmployeeData(employee);
    arithmeticMean.salaryArithmeticMean(employee);
  }
}
