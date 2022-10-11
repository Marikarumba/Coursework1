import static java.lang.System.*;
public class Main {

    public static void printEmployerList (Employee [] eList) {

        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                out.println(eList[i].toString());
            }
        }
    }

    public static void printEmployerList (Employee [] eList, int dep) {

        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                if ( eList[i].getDepartment() == dep)
                out.println(eList[i].toStringDep());
            }
        }
    }

    public static int getSumSalary (Employee [] eList) {

        int salarySum = 0;

        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                salarySum += eList[i].getSalary();
            }
        }
        return salarySum;

    }
    public static int getSumSalary (Employee [] eList, int dep) {

        int salarySum = 0;

        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                if (eList[i].getDepartment() == dep) {
                    salarySum += eList[i].getSalary();
                }
            }
        }
        return salarySum;

    }

    public static Employee getMinSalary (Employee [] eList) {

        int min = Integer.MAX_VALUE;
        Employee minPerson=eList[0];

        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                if (eList[i].getSalary() < min) {
                    min = eList[i].getSalary();
                    minPerson = eList[i];
                }
            }
        }
        return minPerson;
    }

    public static Employee getMinSalary (Employee [] eList, int dep) {

        int min = Integer.MAX_VALUE;
        Employee minPerson=eList[0];

        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                if (eList[i].getDepartment() == dep) {
                    if (eList[i].getSalary() < min) {
                        min = eList[i].getSalary();
                        minPerson = eList[i];
                    }
                }
            }
        }
        return minPerson;
    }

    public static Employee getMaxSalary (Employee [] eList) {

        int max = 0;
        Employee maxPerson=eList[0];
        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                if (eList[i].getSalary() > max) {
                    max = eList[i].getSalary();
                    maxPerson = eList[i];
                }
            }
        }
        return maxPerson;
    }

    public static Employee getMaxSalary (Employee [] eList, int dep) {

        int max = 0;
        Employee maxPerson=eList[0];
        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                if (eList[i].getDepartment() == dep) {
                    if (eList[i].getSalary() > max) {
                        max = eList[i].getSalary();
                        maxPerson = eList[i];
                    }
                }
            }
        }
        return maxPerson;
    }

    public static int middleSalary (Employee [] eList) {
        int numberOfEmployers = 0;
        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                numberOfEmployers++;
            }
        }
        if (numberOfEmployers == 0)
            return 0;
        return getSumSalary(eList)/numberOfEmployers;
    }

    public static int middleSalary (Employee [] eList, int dep) {
        int numberOfEmployers = 0;
        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                if (eList[i].getDepartment() == dep) {
                    numberOfEmployers++;
                }
            }
        }
        if (numberOfEmployers == 0)
            return 0;
        return getSumSalary(eList, dep)/numberOfEmployers;
    }

    public static void printFullName (Employee [] eList) {

        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                out.println(eList[i].getFullName());
            }
        }
    }

    public static void indexSalaryList (Employee [] eList, int percent) {
        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                eList[i].indexSalary(percent);
            }
        }
    }

    public static void indexSalaryList (Employee [] eList, int percent, int dep) {
        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                if (eList[i].getDepartment() == dep) {
                    eList[i].indexSalary(percent);
                }
            }
        }
    }

    public static void findLessSalary (Employee [] eList, int salaryRate) {
        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                if ( eList[i].getSalary() < salaryRate)
                    out.println(eList[i].toStringDep());
            }
        }
    }
    public static void findMoreSalary (Employee [] eList, int salaryRate) {
        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                if ( eList[i].getSalary() >= salaryRate)
                    out.println(eList[i].toStringDep());
            }
        }
    }


    public static void main(String[] args) {

        Employee[] employerList = new Employee[10] ;
        employerList [0] = new Employee( "Иванов0 И.И.", 1, 10_000);
        employerList [1] = new Employee( "Иванов1 И.И.", 1, 20_000);
        employerList [2] = new Employee( "Иванов2 И.И.", 2, 30_000);
        employerList [3] = null;
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
        out.println("Средняя сложность");
        indexSalaryList(employerList, 50);
        printEmployerList(employerList);
        printEmployerList(employerList, 4);
        out.println("Минимальный оклад у сотрудника отдела № 4: " + getMinSalary(employerList, 4).toString());
        out.println("Максимальный оклад у сотрудника отдела № 4: " + getMaxSalary(employerList, 4).toString());
        out.println("Сумма зарплат отдела 3: " + getSumSalary(employerList, 3));
        out.println("Средний оклад по отделу 4: "+middleSalary(employerList,4));
        indexSalaryList(employerList,100, 1);
        printEmployerList(employerList, 1);
        findLessSalary(employerList,100_000);
        out.println( );
        findMoreSalary(employerList, 100_000);
    }

}