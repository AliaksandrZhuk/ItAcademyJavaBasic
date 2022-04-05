abstract public class Card {
    protected int material;
    protected String number;
    protected String size;
    protected String name;
    }
    class DebitCard extends Card {
           public DebitCard(){
               name = "Visa";
       }
    class CreditCard extends Card {
           public CreditCard(){

               name = "MasterCard";
           }

    }
}
/*
Создать цепочку наследования (минимум 3 звена) классов, описывающих банковские карточки.
Иерархия должна иметь хотя бы три уровня.
 */