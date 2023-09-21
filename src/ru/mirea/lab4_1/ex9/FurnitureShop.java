package ru.mirea.lab4_1.ex9;
public class FurnitureShop {
    private Furniture[] thing;
    public FurnitureShop(int count) {
        thing = new Furniture[count];
        for (int i = 0; i < count; ) {
            thing[i++] = new Wardrobe("Стандартная модель", 1.8, 1.2, 0.8, 15759, "Дерево", 4, 15);
            if(i >= count) break;
            thing[i++] = new Table("Стандартная модель", 1.3, 1.1, 1.5, 7800, "Дерево", 1);
        }
    }
    public Furniture[] getThing() {
        return thing;
    }
    public void add(Furniture f){
        Furniture[] tmp = new Furniture[thing.length+1];
        System.arraycopy(thing, 0, tmp, 0, thing.length);
        tmp[thing.length] = f;
        thing = tmp;
    }
    public Furniture buy(int number){
        Furniture f = thing[number];
        Furniture[] tmp = new Furniture[thing.length-1];
        for (int i = 0; i < thing.length; i++){
            if(i < number) tmp[i] = thing[i];
            if (i > number) tmp[i-1] = thing[i];
        }
        thing = tmp;
        return f;
    }
    public String getPrices(){
        String price = "Прайслист:\n";
        for (Furniture f : thing) {
            price += f.toString() + "\n";
        }
        return price;
    }
}
