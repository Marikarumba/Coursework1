import static java.lang.System.*;
public class Main {

    public static void printEmployerList (Employee [] eList) {

        for (int i = 0; i < eList.length; i++) {
            out.println(eList[i].toString());
        }
    }

    public static int getSumSalary (Employee [] eList) {

        int salarySum = 0;

        for (int i = 0; i < eList.length; i++) {
            salarySum = salarySum + eList[i].getSalary();
        }
        return salarySum;

    }

    public static Employee getMinSalary (Employee [] eList) {

        int min = Integer.MAX_VALUE;
        Employee minPerson=eList[0];

        for (int i = 0; i < eList.length; i++) {
            if (eList[i].getSalary() < min) {
                min = eList[i].getSalary();
                minPerson=eList[i];
            }
        }
        return minPerson;
    }

    public static Employee getMaxSalary (Employee [] eList) {

        int max = 0;
        Employee maxPerson=eList[0];
        for (int i = 0; i < eList.length; i++) {
            if (eList[i].getSalary() > max) {
                max = eList[i].getSalary();
                maxPerson=eList[i];
            }
        }
        return maxPerson;
    }

    public static int middleSalary (Employee [] eList) {
        return getSumSalary(eList)/eList.length;
    }

    public static void printFullName (Employee [] eList) {

        for (int i = 0; i < eList.length; i++) {
            out.println(eList[i].getFullName());
        }
    }

    public static void main(String[] args) {

        Employee[] employerList = new Employee[10] ;
        employerList [0] = new Employee( "Иванов0 И.И.", 1, 10_000);
        employerList [1] = new Employee( "Иванов1 И.И.", 1, 20_000);
        employerList [2] = new Employee( "Иванов2 И.И.", 2, 30_000);
        employerList [3] = new Employee( "Иванов3 И.И.", 2, 40_000);
        employerList [4] = new Employee( "Иванов4 И.И.", 3, 50_000);
        employerList [5] = new Employee( "Иванов5 И.И.", 3, 60_000);
        employerList [6] = new Employee( "Иванов6 И.И.", 4, 70_000);
        employerList [7] = new Employee( "Иванов7 И.И.", 4, 80_000);
        employerList [8] = new Employee( "Иванов8 И.И.", 5, 90_000);
        employerList [9] = new Employee( "Иванов9 И.И.", 5, 100_000);

        printEmployerList(employerList);
        out.println("Сумма зарплат: " + getSumSalary(employerList));
        out.println("Минимальный оклад у сотрудника: " + getMinSalary(employerList).toString() );
        out.println("Максимальный оклад у сотрудника: " + getMaxSalary(employerList).toString());
        out.println("Средний оклад: "+middleSalary(employerList));
        printFullName(employerList);

    }

}