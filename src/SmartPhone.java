import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class SmartPhone implements Cloneable {


    @Getter
    @Setter
    private String brandName;
    @Getter
    @Setter
    private String modelName;
    @Getter
    @Setter
    private int batteryMah;
    @Getter
    @Setter
    private SmartPhonePrice producerPrice;
    @Getter
    @Setter
    private SmartPhonePrice retailPrice;

    public SmartPhone(String modelName, String brandName, int batteryMah,SmartPhonePrice producerPrice, SmartPhonePrice retailPrice){
        this.modelName= modelName;
        this.brandName=brandName;
        this.batteryMah=batteryMah;
        this.producerPrice=producerPrice;
        this.retailPrice=retailPrice;

    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", batteryMah=" + batteryMah +
                ", producerPrice=" + producerPrice +
                ", retailPrice=" + retailPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhone that = (SmartPhone) o;
        return batteryMah == that.batteryMah && brandName.equals(that.brandName) && modelName.equals(that.modelName) && producerPrice.equals(that.producerPrice) && retailPrice.equals(that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batteryMah, producerPrice, retailPrice);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
