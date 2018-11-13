
public class SilverWare extends KitchenUtencils {

    public SilverWare(String material, Integer amount, Boolean usesPower, String color, Integer price) {
        super(material, amount, usesPower, color, price);
        this.setUsesPower(false);
        this.setColor("silver");
    }

}
