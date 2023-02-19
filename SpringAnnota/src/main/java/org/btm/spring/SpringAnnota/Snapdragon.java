package org.btm.spring.SpringAnnota;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements Processor 
{
  public void Process() {
	 System.out.println("Best Cpu...");
}


}
