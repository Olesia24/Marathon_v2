package practice.supermarket.model;

public class MilkFood extends Food implements Comparable<MilkFood>{
    public MilkFood(int barCode, String name, double price, long expDate) {
        super(barCode, name, price, expDate);
    }

    @Override
    public int compareTo(MilkFood o) {
        return this.barCode - o.barCode;
    }
}
