package bruce.home.SpringDependencyInjection.mix1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("m1Apple")
public class Apple {
    private Banana banana;

    @Autowired
    public void setBanana(@Qualifier("m1Banana") Banana banana) {
        this.banana = banana;
    }
}
