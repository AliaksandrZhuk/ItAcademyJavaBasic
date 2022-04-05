public abstract class Employee { //работник
    private int ID;
    public String name;
    public String role;
    public int FixedSalary;//фиксированная зп
    public int workedHours;//отработанные часы
    public Employee() {
        ID++;
    }

    public final int getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setFixedSalary(int FixedSalary) {
        this.FixedSalary= FixedSalary;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public int getFixedSalary() {
        return this.FixedSalary;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
    public abstract int getPercent();
    public abstract int getFullSalary();

}
/*
Создать цепочку наследования (минимум 3 звена) классов, описывающих должностную структуру на заводе.
Реализовать методы по начислению зарплаты в зависимости от должности (почасовая, процентная, смешанная).
Иерархия должна иметь хотя бы три уровня.
 */