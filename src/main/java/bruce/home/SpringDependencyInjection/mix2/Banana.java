package bruce.home.SpringDependencyInjection.mix2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("m2Banana")
public class Banana {
//    @Autowired
//    @Qualifier("m2Apple")

//    @Resource(name = "m2Apple")
    private Apple apple;

    @Autowired
    public void setApple(@Qualifier("m2Apple") Apple apple) {
        this.apple = apple;
    }
}
