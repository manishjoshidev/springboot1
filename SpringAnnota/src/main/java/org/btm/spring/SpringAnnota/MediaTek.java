package org.btm.spring.SpringAnnota;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MediaTek implements Processor
{
	public void Process() {
		System.out.println("Good Cpu for normal use");
	}

}
