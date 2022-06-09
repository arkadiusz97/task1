package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure{
    private List<WallBlock>blocks;

    public Wall(List<WallBlock>newBlocks) {
        blocks = newBlocks;
    }
    // zwraca dowolny element o podanym kolorze
    public Optional findBlockByColor(String color) {
        Optional<WallBlock> anyElement = Optional.empty();
        for(WallBlock i : blocks)
            if(i.getColor() == color) {
                anyElement = Optional.of(i);
                break;
            }
        return anyElement;
    }

    // zwraca wszystkie elementy z danego materiału
    public List<WallBlock>findBlocksByMaterial(String material) {
        List<WallBlock> blocksToReturn = new ArrayList<>();
        for(WallBlock i : blocks)
            if(i.getMaterial() == material)
                blocksToReturn.add(i);
        return blocksToReturn;
    }

    //zwraca liczbę wszystkich elementów tworzących strukturę
    public int count(){
        return blocks.size();
    }
}
