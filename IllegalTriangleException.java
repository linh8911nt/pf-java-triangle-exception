public class IllegalTriangleException extends IllegalArgumentException {
    private double edgeAB;
    private double edgeAC;
    private double edgeBC;

    public IllegalTriangleException() {
    }

    public IllegalTriangleException(double edgeAB, double edgeAC, double edgeBC) {
        this.edgeAB = edgeAB;
        this.edgeBC = edgeBC;
        this.edgeAC = edgeAC;
    }

    public double getEdgeAB() {
        return edgeAB;
    }

    public double getEdgeBC() {
        return edgeBC;
    }

    public double getEdgeAC() {
        return edgeAC;
    }
}
