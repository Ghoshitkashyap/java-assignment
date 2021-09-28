
enum flat {
    bhk1(10),bhk2(20),bhk3(50),bhk4(90);
    private int price;
    flat(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}
public class java9{
    public static void main(String args[]){
        System.out.println("All flat prices:");
        for (flat c : flat.values()) System.out.println(
                c + " costs " + c.getPrice() + " thousand rupees.");
    }
}