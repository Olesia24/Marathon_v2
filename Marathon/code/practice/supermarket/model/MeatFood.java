package practice.supermarket.model;

public class MeatFood extends Food implements Comparable<MeatFood>{
    public MeatFood(int barCode, String name, double price, long expDate) {
        super(barCode, name, price, expDate);
    }

    @Override
    public int compareTo(MeatFood o) {
        return this.barCode - o.barCode;
    }
}
