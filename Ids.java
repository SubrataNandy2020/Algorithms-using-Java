import java.util.*;
class Checking{
    public Vertex go(Vertex start, Vertex target) {
        for (int depth = 0; true; depth++) {
            Vertex found = check(start, depth, target);
            System.out.println();
            if (found != null) {
                return found;
            }
        }
    }
    private Vertex check(Vertex vertex, int depth, Vertex target) {
        System.out.print(vertex + " ");
        if(depth==0 && vertex.getData().equals(target.getData())) {
            return vertex;
        }
        if (depth > 0) {
            for (Vertex v: vertex.getAdjacencies()) {
                    Vertex found = check(v, depth-1, target);
                    if (found != null) {
                        return found;
                    }
                }
            }
        return null;
    }
}


class Ids {
    public static void main(String[] args) {
		//defined
        Vertex vertex0 = new Vertex("0");
        Vertex vertex1 = new Vertex("1");
        Vertex vertex2 = new Vertex("2");
        Vertex vertex3 = new Vertex("3");
        Vertex vertex4 = new Vertex("4");
		Vertex vertex5 = new Vertex("5");
		Vertex vertex6 = new Vertex("6");
        vertex0.addAdjacency(vertex1);
        vertex0.addAdjacency(vertex2);
        vertex1.addAdjacency(vertex3);
		vertex1.addAdjacency(vertex4);
        vertex2.addAdjacency(vertex5);
		vertex2.addAdjacency(vertex6);
        Checking checking= new Checking();
		System.out.println("Searching from 0 to 6");
		System.out.print("Path is:");
        System.out.println(checking.go(vertex0,vertex6).getData() + "found");
    }
}

class Vertex {
    public String data;
    private int depthLevel = 0;
    private List<Vertex> adjacencies;
    public Vertex(String data) {
        this.data = data;
        adjacencies = new ArrayList<>();
    }
    public void addAdjacency(Vertex vertex) {
        adjacencies.add(vertex);
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public int getDepthLevel() {
        return depthLevel;
    }
    public void setDepthLevel(int depthLevel) {
        this.depthLevel = depthLevel;
    }
    public List<Vertex> getAdjacencies() {
        return adjacencies;
    }
    public void setAdjacencies(List<Vertex> adjacencies) {
        this.adjacencies = adjacencies;
    }
    @Override
    public String toString() {
        return data;
    }
}