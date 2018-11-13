public class KitchenUtencils {
    private String material;
    private Integer amount;
    private Boolean usesPower;
    private String color;
    private Integer price;


    public KitchenUtencils(String material, Integer amount, Boolean usesPower, String color, Integer price) {
        this.material = material;
        this.amount = amount;
        this.usesPower = usesPower;
        this.color = color;
        this.price = price;
    }

    public KitchenUtencils(String material, Integer amount, Integer price) {

    }

    public KitchenUtencils(String material, Boolean usesPower, String color, Integer price) {

    }

    public void cooking() {
        
    }

    public void cleaning() {

    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Boolean getUsesPower() {
        return usesPower;
    }

    public void setUsesPower(Boolean usesPower) {
        this.usesPower = usesPower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
