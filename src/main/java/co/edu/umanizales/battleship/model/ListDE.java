package co.edu.umanizales.battleship.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class ListDE {
    private NodeDE head;
    private int size;

    public void add(ShipDistribution shipDistribution) {

    }

    public void addToStart(ShipDistribution shipDistribution) {

    }

    public List<ShipDistribution> list(){
        List<ShipDistribution> list= new ArrayList<>();
        //Recorre la listade y llenar la List
        return list;
    }


}
