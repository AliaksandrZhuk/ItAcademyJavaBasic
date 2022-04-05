class Master extends Employee { //почасовая зп
    static private final int HOURS_FOR_MONTH = 160;
    static private final int MAX_SALARY = 1000;


    @Override
    public int getPercent() {
        return getWorkedHours() * 100 / HOURS_FOR_MONTH;
    }

    @Override
    public int getFullSalary() {
        return getFixedSalary() * 100 / MAX_SALARY;
    }
}
