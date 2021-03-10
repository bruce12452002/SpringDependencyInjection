package bruce.home.SpringDependencyInjection.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("sApple")
public class Apple {
    private Banana banana;

//    @Autowired
    @Resource(name = "sBanana")
    public void setBanana(/*@Qualifier("sBanana")*/ Banana banana) {
        this.banana = banana;
    }
}
