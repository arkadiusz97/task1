package org.example;

import java.util.ArrayList;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ArrayList<WallBlock>blocks = new ArrayList<>();
        blocks.add(new WallBlock("blue", "sand"));
        blocks.add(new WallBlock("red", "cement"));
        Wall myWall = new Wall(blocks);
        System.out.println("Number of elements: " + String.valueOf(myWall.count()));
        System.out.println("Color of the first cement element: " +
            myWall.findBlocksByMaterial("cement").get(0).getColor());
        WallBlock oneBlock = (WallBlock)myWall.findBlockByColor("blue").get();
        System.out.println("Material of blue element: " + oneBlock.getMaterial());
    }
}