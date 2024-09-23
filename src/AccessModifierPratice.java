class Cylinder{
    private int radius;
    private int height;

    public int getRadius(){
    return radius;
    }

     public void setRadius(int radius){
        this.radius = radius;
     }

     public int getHeight(){
        return height;
     }

     public void setHeight(int height){
        this.height = height;
     }

     public double surfaceArea(){
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
     }

     public double volume(){
        return Math.PI * radius * radius * height;
     }
}

class AccessModifier {
    public static void main(String[] args) {

        // **** Access Modifier ****
    Cylinder myCylinder = new Cylinder();
    myCylinder.setHeight(12);
    System.out.println("The height of the cylinder is: "+myCylinder.getHeight());

    myCylinder.setRadius(9);
    System.out.println("The radius of the cylinder is: "+myCylinder.getRadius());
    // Surface area of cylinder
    System.out.println("Surface area of cylinder is: "+myCylinder.surfaceArea());
    // Volume of cylinder
    System.out.println("Volume of the cylinder is: "+myCylinder.volume());
    }
}
