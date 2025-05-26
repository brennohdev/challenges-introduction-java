package challenges.javacore.useCases;

import challenges.javacore.domain.entity.Employee;

public class ArithmeticMean {
  public void salaryArithmeticMean(Employee employee) {
    double arithmeticMean = 0;
    if (employee.salarys != null) {
      for (double salary : employee.salarys) {
        arithmeticMean += salary;
      }
      arithmeticMean /= employee.salarys.length;
    }
    System.out.println("\n Arithmetic Mean: " + arithmeticMean);
  }
}
