public class Employee {
    private String organization;
    private String designation;
    private int salary;

    public void setSleepingHours(int hours) {
        System.out.println("Setting sleeping hours to " + hours);
    }

    public void setAlarmTime(int time) {
        System.out.println("Setting alarm time to " + time);
    }
}

public class PartTime extends Employee {
    private String partTimeResponsibilities;

    public void setPartTimeResponsibilities(String responsibilities) {
        this.partTimeResponsibilities = responsibilities;
    }
}

public class FullTime extends Employee {
    private int bonus;

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}

public class HR {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setSleepingHours(8);
        employee.setAlarmTime(6);

        PartTime partTime = new PartTime();
        partTime.setPartTimeResponsibilities("Data entry");

        FullTime fullTime = new FullTime();
        fullTime.setBonus(5000);
    }
}
