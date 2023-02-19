package org.btm.spring.SpringAnnota;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component   // used for class object
public class Samsung {
	@Autowired  //it will search for object itself
	Processor cpu;
	
	public Processor getCpu() {
		return cpu;
	}

	public void setCpu(Processor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("bad phone with bad camera hang too much");
		cpu.Process();
	}

}
