class Rab extends Employee { //процентная оплата
    static private  final  int HOURS_FOR_MONTH = 160;
    static private  final  int MAX_SALARY=1200;

    @Override
    public int getPercent() {
        if (getWorkedHours() > HOURS_FOR_MONTH){
            return 100;
        }
        return getWorkedHours() * 100 / HOURS_FOR_MONTH;
    }

    @Override
    public int getFullSalary() {
        return getFixedSalary() * 100 / MAX_SALARY;
    }
}
