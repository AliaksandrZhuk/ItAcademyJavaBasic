public enum Season {
    WINTER("Cold season"),
    SPRING("Cool season"),
    SUMMER("Hot season"),
    AUTUMN("Cool season");

    private String description;
    private Integer countOfDays;

    private Season(String description) {
         this.description = description;
     }

    public String getDescription() {
    return description;
    }

    Season(Integer countOfDays) {
        this.countOfDays = countOfDays;
     }

    public Integer getCountOfDays() {
     return countOfDays;
     }

}