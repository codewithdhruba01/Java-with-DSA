class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing something");
    }
    public void printColor() {  // new mathod this ya batayaga ki color konsa hai
        System.out.println(this.color);
    }
}

    public class intro {
        public static void main(String args[]) {
            Pen pen1 = new Pen();
            pen1.color = "Blue";
            pen1.type = "Gel";

            Pen pen2 = new Pen();
            pen2.color = "Black";
            pen2.type = "Ballpoint";

            pen1.printColor();
            pen2.printColor();
        }
    }
