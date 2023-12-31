package ru.mirea.lab4_1.ex9;
public class Table extends Furniture {
    private String material;
    private int deskDrawer;

    public Table(String modelName, double height, double width, double depth, int price, String material, int deskDrawer) {
        super(modelName, height, width, depth, price);
        this.material = material;
        this.deskDrawer = deskDrawer;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getDeskDrawer() {
        return deskDrawer;
    }

    public void setDeskDrawer(int deskDrawer) {
        this.deskDrawer = deskDrawer;
    }

    @Override
    public String toString() {
        return "Table{" +
                "material='" + material + '\'' +
                ", deskDrawer=" + deskDrawer + ", " + super.toString() +
                '}';
    }
}
