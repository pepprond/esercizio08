import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class SmartPhonePrice implements Cloneable{
    //TODO implement this class
    @Getter
    @Setter
    private String priceType;
    @Getter
    @Setter
    private double priceInEuros;

    public SmartPhonePrice(String priceType, double priceInEuros){
        this.priceInEuros=priceInEuros;
        this.priceType=priceType;

    }

    @Override
    public String toString() {
        return "SmartPhonePrice{" +
                "priceType='" + priceType + '\'' +
                ", priceInEuros=" + priceInEuros +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhonePrice that = (SmartPhonePrice) o;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 && priceType.equals(that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
