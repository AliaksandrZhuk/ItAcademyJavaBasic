public @interface AcademyInfo {
    int year();
}
class MyClass {
    int year;
    @AcademyInfo(year = 2022)
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
/*
Создать собственную аннотацию @AcademyInfo c полем year. Создать метод, помеченный этой аннотацией с заданным year,
и метод без нее. С помощью рефлексии проверить наличие данной аннотации у этих методов из основной программы.
 */