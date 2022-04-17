public class PerimetrSquare {
    public void getPerimetr(){

        Square square = new Square();

        try {
            square.setSide(0);
        } catch (PerimetrExeption e) {
            System.out.println(e.getMessage());
        }
    }
}
