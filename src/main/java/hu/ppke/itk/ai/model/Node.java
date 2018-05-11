package hu.ppke.itk.ai.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static hu.ppke.itk.ai.model.Category.LAND;

public class Node {

    private int xPos;
    private int yPos;
    private Category category;
    private Node northNeighb;
    private Node eastNeighb;
    private Node southNeighb;
    private Node westNeighb;
    private boolean isVisited;

    // This is used during search. The ancestorNode is
    // the node which added this node to the container.
    private Node ancestorNode;

    public Node(int xPos, int yPos, Category category) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.category = category;
        isVisited = false;
    }

    public List<Node> getAllNeighbors() {

        return Arrays.asList(northNeighb, eastNeighb, southNeighb, westNeighb);
    }

    public boolean isWaterNeighbor(Node currentNode) {
        List<Node> waterNeighbors = this.getAllNeighbors().stream()
                .filter(p -> p != null && !p.getCategory().equals(LAND)).collect(Collectors.toList());

        return waterNeighbors.contains(currentNode);
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public Category getCategory() {
        return category;
    }

    public Node setCategory(Category category) {
        this.category = category;
        return this;
    }

    public Node getNorthNeighb() {
        return northNeighb;
    }

    public Node setNorthNeighb(Node northNeighb) {
        this.northNeighb = northNeighb;
        return this;
    }

    public Node getEastNeighb() {
        return eastNeighb;
    }

    public Node setEastNeighb(Node eastNeighb) {
        this.eastNeighb = eastNeighb;
        return this;
    }

    public Node getSouthNeighb() {
        return southNeighb;
    }

    public Node setSouthNeighb(Node southNeighb) {
        this.southNeighb = southNeighb;
        return this;
    }

    public Node getWestNeighb() {
        return westNeighb;
    }

    public Node setWestNeighb(Node westNeighb) {
        this.westNeighb = westNeighb;
        return this;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public Node setVisited(boolean visited) {
        isVisited = visited;
        return this;
    }

    public Node getAncestorNode() {
        return ancestorNode;
    }

    public Node setAncestorNode(Node ancestorNode) {
        this.ancestorNode = ancestorNode;
        return this;
    }
}
