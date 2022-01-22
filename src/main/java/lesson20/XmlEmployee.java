package lesson20;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import lombok.SneakyThrows;

import java.io.*;
import java.util.Arrays;


public class XmlEmployee {

    public static void main(String[] args) throws Exception {
        Employee employeeOne = new Employee();
        employeeOne.setFio("Иванов Иван Иванович");
        employeeOne.setLogin("ИИИ");
        employeeOne.setPersonnelNumber(1);
        employeeOne.setDepartment(new Department("Первый отдел", "Москва"));
        employeeOne.setPosition(new Position("Специалист", 60000));

        Employee employeeTwo = new Employee();
        employeeTwo.setFio("Петров Пётр Петрович");
        employeeTwo.setLogin("ППП");
        employeeTwo.setPersonnelNumber(2);
        employeeTwo.setDepartment(new Department("Второй отдел", "Пермь"));
        employeeTwo.setPosition(new Position("Ведущий специалист", 80000));

        Employee employeeThree = new Employee();
        employeeThree.setFio("Сидоров Сергей Сергеевич");
        employeeThree.setLogin("ССС");
        employeeThree.setPersonnelNumber(3);
        employeeThree.setDepartment(new Department("Третий отдел", "Екатеринбург"));
        employeeThree.setPosition(new Position("Главный специалист", 100000));

        Employee employeeFour = new Employee();
        employeeFour.setFio("Михайлов Михаил Михайлович");
        employeeFour.setLogin("МММ");
        employeeFour.setPersonnelNumber(4);
        employeeFour.setDepartment(new Department("Третий отдел", "Екатеринбург"));
        employeeFour.setPosition(new Position("Главный специалист", 110000));

        ListEmployee listEmployee = new ListEmployee();
        listEmployee.setEmployees(Arrays.asList(employeeOne, employeeTwo, employeeThree, employeeFour));

        writeToXML(listEmployee);

    }


    @SneakyThrows
    //процедуру маршалинга
    private static void writeToXML(ListEmployee listEmployee) {
        JAXBContext context = JAXBContext.newInstance(ListEmployee.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        StringWriter stringWriter = new StringWriter();
        marshaller.marshal(listEmployee, stringWriter);

        //Запись в файлы
        String line;
        line = stringWriter.toString();
        try (FileWriter fileWriter = new FileWriter("C:\\1\\Employee.xml")) {
            fileWriter.write(line);
        }
        System.out.println("XML: " + stringWriter);
    }

}