package com.myblog.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class TestClass1 {
    public static void main(String[] args) {
//        List<Employee> employee =Arrays.asList(
//                new Employee("mike",23,"chennail"),
//                new Employee("stline",25,"new delhi"),
//                new Employee("adam",35 ,"barari")
//        );
//      employee.stream().filter(emp->emp.getAge()>21).collect(Collectors.toList());
//      for (Employee e: employee){
//          System.out.println(e.getName());
//          System.out.println(e.getAge());
//          System.out.println(e.getCity());

 //     }
  // }
  List<Integer>val=Arrays.asList(12,23,34,44,445,332);
List<Integer>data=val.stream().filter(n->n%2==0).map(n1->n1*n1).collect(Collectors.toList());
        System.out.println(data);


}
}