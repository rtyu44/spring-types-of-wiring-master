package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Needle7 {

    private Deth8 deth;

    @Autowired
    public Needle7(Deth8 deth) {
        this.deth = deth;
    }

//    @Autowired
//    public void setDeth(Deth8 deth) {
//        this.deth = deth;
//    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле " + deth.toString();
    }//смерть Кощея на игле...Koshchei's death on the needle :(
}
