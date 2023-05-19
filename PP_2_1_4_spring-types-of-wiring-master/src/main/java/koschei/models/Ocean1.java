package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {
//--
    private final Island2 island;

    @Autowired
    public Ocean1(@Qualifier("island2") Island2 island){
        this.island = island;
    } //--

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}
//@Component
//public class Duck5 {
//    //--
//    private final Egg6 egg;
//
//    @Autowired
//    public Duck5(Egg6 egg){
//        this.egg = egg;
//    }
//    //--
//    @Override
//    public String toString() {
//        return ", в утке яйцо " + egg.toString();
//    }
//}
