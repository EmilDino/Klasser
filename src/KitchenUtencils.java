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
        System.out.println("constructor 1");
    }

    public KitchenUtencils() {
        System.out.println("constructor 2");
    }

    public KitchenUtencils(String material, Boolean usesPower, String color, Integer price) {
        System.out.println("constructor 3");
    }

    public void cooking() {
        System.out.println("get cooked mate");
    }

    public void cleaning() {
        System.out.println("clean AF");
    }

    public int addUtencil() {
        amount++;
        System.out.println("added a untencil");
        return amount;
    }

    public boolean turnOffPower() {
        usesPower = false;
        System.out.println("power turned off");
        return usesPower;
    }

    public boolean turnOnPower() {
        usesPower = true;
        System.out.println("power turned on");
        return usesPower;
    }

    public int increasePrice() {
        price++;
        System.out.println("price just increased");
        return price;
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
