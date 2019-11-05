public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public void print(int numberOfPages, int numberOfCopies) {
        if((numberOfPages * numberOfCopies) <= this.paper){
            this.paper -= (numberOfPages * numberOfCopies);
            this.toner -= (numberOfPages * numberOfCopies);
        }
    }

    public int getSheetsLeft() {
        return this.paper;
    }

    public int getTonerVolume() {
        return this.toner;
    }
}
