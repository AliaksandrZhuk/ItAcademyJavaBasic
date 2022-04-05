class Rab1 extends Employee { //смешанная форма: 90% деньгами и 10 % продукцией
    static private  final  int HOURS_FOR_MONTH = 160;
    static private  final  int MAX_SALARY=1100;

    @Override
    public int getPercent() {
        if (getWorkedHours() > HOURS_FOR_MONTH){
            return 90;
        }
        return getWorkedHours() * 90 / HOURS_FOR_MONTH;
    }


    @Override
    public int getFullSalary() {
        return getFixedSalary() * 90/ MAX_SALARY;
    }
}
/*
не реализовано до конца
 */