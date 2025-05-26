package challenges.javacore.useCases;

import challenges.javacore.domain.entity.Employee;

public class PrintEmployeeData {
  public void printEmployeeData(Employee employee) {
    System.out.println(employee.name);
    System.out.println(employee.age);
    if (employee.salarys != null) {
      for (double salary : employee.salarys) {
        System.out.print(salary + ", ");
      }
    }
  }
}
