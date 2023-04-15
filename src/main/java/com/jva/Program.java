package com.jva;

import com.jva.foreignNames.DepartmentProvider;
import com.jva.foreignNames.Person;
import com.jva.foreignNames.PersonParser;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        String csvFilePath = "foreign_names.csv";
        DepartmentProvider departmentProvider = new DepartmentProvider();
        //получаем список людей изи файла
        List<Person> people = PersonParser.parseFromStream(Program.class.getClassLoader().getResourceAsStream(csvFilePath), departmentProvider);

        for (Person human:
                people) {
            System.out.println(human);
        }
    }
}
