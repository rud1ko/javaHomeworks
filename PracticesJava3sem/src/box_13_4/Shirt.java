package box_13_4;

public class Shirt {
    private String code;
    private String description;
    private String color;
    private String size;

    public Shirt(String code, String description, String color, String size) {
        this.code = code;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Code: " + code + "\n" +
                "Description: " + description + "\n" +
                "Color: " + color + "\n" +
                "Size: " + size + "\n";
    }

    public static void main(String[] args) {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt[] shirtArray = new Shirt[shirts.length];

        for (int i = 0; i < shirts.length; i++) {
            String[] shirtData = shirts[i].split(",");
            Shirt shirt = new Shirt(shirtData[0], shirtData[1], shirtData[2], shirtData[3]);
            shirtArray[i] = shirt;
        }

        for (Shirt shirt : shirtArray) {
            System.out.println(shirt);
        }
    }
}
