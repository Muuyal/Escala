public class Travels{
    private String name;
    private String destination;
    private char leftDate;
    private char deadlinePay;
    private int price;
    private int seasonPay;
    private int numPay;

    Travels (String name, String destination, char leftDate, int price){
        this.name = name;
        this.destination = destination;
        this.leftDate = leftDate;
        this.price = price;
    }

    //Metodos

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public char getLeftDate() {
        return leftDate;
    }

    public void setLeftDate(char leftDate) {
        this.leftDate = leftDate;
    }

    public char getDeadlinePay() {
        return deadlinePay;
    }

    public void setDeadlinePay(char deadlinePay) {
        this.deadlinePay = deadlinePay;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSeasonPay() {
        return seasonPay;
    }

    public void setSeasonPay(int seasonPay) {
        this.seasonPay = seasonPay;
    }

    public int getNumPay() {
        return numPay;
    }

    public void setNumPay(int numPay) {
        this.numPay = numPay;
    }
}