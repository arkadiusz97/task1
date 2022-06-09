package org.example;

import java.util.ArrayList;
import java.util.List;

public class WallBlock implements CompositeBlock{
    String color;
    String material;
    //List<CompositeBlock>compositeBlocks;
    //It's impossible to create interface instance.
    public WallBlock(String nColor, String nMaterial) {
        color = nColor;
        material = nMaterial;
    }
    /*public List getBlocks() {
        return compositeBlocks;
    }*/
    public String getColor() {
        return color;
    }
    public String getMaterial(){
        return material;
    }
}
