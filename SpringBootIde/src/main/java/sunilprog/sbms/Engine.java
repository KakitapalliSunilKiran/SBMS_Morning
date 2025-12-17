package sunilprog.sbms;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Engine {
	
	public void startEngine() {
		System.out.println("Start the Engine");
	}

}
