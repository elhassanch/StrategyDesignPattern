package strategy;

public class Produit implements Comparable {

    String name;
    int price;
    int value;

    public Produit(String name, int price, int value) {
        this.name = name;
        this.price = price;
        this.value = value;
    }

    public int compareToBy(Produit prod, String sortBy) {
        if (sortBy.equalsIgnoreCase("name")) {
            return this.name.compareTo(prod.name);
        }

        else if (sortBy.equalsIgnoreCase("price")) {
            if (this.price>prod.price) 
                return 1;
            else if (this.price<p.price) 
                return -1;
            else 
                return 0;
        }

        else if (sortBy.equalsIgnoreCase("value")) {
            if (this.value>prod.value) 
                return 1;
            else if (this.value<p.value) 
                return -1;
            else 
                return 0;
        }
    }

}