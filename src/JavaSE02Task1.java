public class JavaSE02Task1 {
}

class Pen {
    private int price;

    Pen(int price) {
        this.price = price;
    }

    int getPrice() {
        return price;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Pen pen = (Pen) obj;
        return price == pen.price;
    }

    public int hashCode() {
        return 666 * price;
    }

    public String toString() {
        return getClass() + " " + getClass().getName() + "@" + "price: " + price;
    }
}
