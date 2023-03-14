package koschei;

import koschei.models.Ocean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KoscheiTheDeathless {
    private Ocean1 ocean;

    public String getRulesByDeth() {
        return "There is an ocean in the world , " + ocean.toString();//На свете есть океан
    }

    @Autowired
    public void setOcean(Ocean1 ocean) {
        this.ocean = ocean;
    }
}
