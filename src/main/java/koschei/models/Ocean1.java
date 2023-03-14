package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {

    private Island2 island;
    @Autowired
    public Ocean1(Island2 island){
        this.island = island;
    }

    @Override
    public String toString() {
        return "on the ocean island " + island.toString();//на океане остров
    }
}
