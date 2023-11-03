package practice.pet_hotel.model;

public class Dogs extends Pet implements Comparable<Dogs> {
    public Dogs(int id, String name, int age, String breed, int days, double pricePerDay) {
        super(id, name, age, breed, days, pricePerDay);
    }

    @Override
    public int compareTo(Dogs o) {
        return this.getId()-o.getId();
    }
}
