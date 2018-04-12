import java.util.Scanner;

public class TriangleExample {
    private double edgeAB;
    private double edgeAC;
    private double edgeBC;

    public TriangleExample() {
    }

    public TriangleExample(double edgeAB, double edgeAC, double edgeBC) throws IllegalTriangleException{
        this.edgeAB = edgeAB;
        this.edgeAC = edgeAC;
        this.edgeBC = edgeBC;
        edgeTriangleNagative();
        compareEdgeTriangle();
    }

    @Override
    public String toString() {
        return "TriangleExample{" +
                "edgeAB = " + edgeAB +
                ", edgeAC = " + edgeAC +
                ", edgeBC = " + edgeBC +
                '}';
    }

    public boolean isEdgeNagative(double edgeAB, double edgeAC, double edgeBC){
        return  (edgeAB > 0 && edgeAC > 0 && edgeBC > 0);
    }

    public boolean compareSumTwoEdgeWithOther(double edgeAB, double edgeAC, double edgeBC){
        return ((edgeAB + edgeAC > edgeBC) && (edgeAB + edgeBC > edgeAC) && (edgeAC + edgeBC > edgeAB));
    }

    public void edgeTriangleNagative() throws IllegalTriangleException{
        if (!isEdgeNagative(edgeAB, edgeAC, edgeBC)){
            throw new IllegalTriangleException(edgeAB, edgeAC, edgeBC);
        }
    }
    public void compareEdgeTriangle() throws IllegalTriangleException{
        if (!compareSumTwoEdgeWithOther(edgeAB, edgeAC, edgeBC))
            throw new IllegalTriangleException(edgeAB, edgeAC, edgeBC);
    }

    public double getEdgeAB() {
        return edgeAB;
    }

    public void setEdgeAB(double edgeAB) throws IllegalTriangleException{
        this.edgeAB = edgeAB;
    }

    public double getEdgeAC() {
        return edgeAC;
    }

    public void setEdgeAC(double edgeAC) throws IllegalTriangleException{
        this.edgeAC = edgeAC;
    }

    public double getEdgeBC() {
        return edgeBC;
    }

    public void setEdgeBC(double edgeBC) throws IllegalTriangleException{
        this.edgeBC = edgeBC;
    }

    public static void main(String[] args) {
        TriangleExample triangleExample;
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter edge AB: ");
            double edgeAB = input.nextDouble();
            System.out.println("Enter edge AC: ");
            double edgeAC = input.nextDouble();
            System.out.println("Enter edge BC: ");
            double edgeBC = input.nextDouble();

            triangleExample = new TriangleExample(edgeAB, edgeAC, edgeBC);

            System.out.println("Triangle ABC have edge AB = " + edgeAB +
                    ", edge AC = " + edgeAC + ", edge BC = " + edgeBC);

        }catch (IllegalTriangleException e){
            e.printStackTrace();
        }
    }
}
