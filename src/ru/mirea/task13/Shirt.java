package ru.mirea.task13;

public class Shirt {
        private String id;
        private String type;
        private String color;
        private String size;

    public String getColor() {
        return color;
    }

    public String getId() {
        return id;
    }

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }
    public Shirt(String id,String type, String color, String size){
        this.id=id;
        this.size = size;
        this.type=type;
        this.color=color;
    }
    public String toString() {
        return "Shirt{ ID = "+this.id+", type = "+this.type+", color = "+this.color+", size = "+this.size+" }";
    }

    public static void main(String [] args){
        String [] shirts = new String[11];
        Shirt[] Shirts = new Shirt[11];
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
        for(int i = 0;i<Shirts.length;i++){
           Shirts[i]= new Shirt(shirts[i].split(",")[0], shirts[i].split(",")[1],
                   shirts[i].split(",")[2], shirts[i].split(",")[3]);
        }
        for (Shirt shirt:Shirts ){
            System.out.println(shirt.toString());
        }
    }
}
