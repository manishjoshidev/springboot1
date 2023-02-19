package org.btm.spring.SpringAnnota;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration //will work as configuration file
@ComponentScan(basePackages="org.btm.spring.SpringAnnota") //it will scan all the componnents 
public class AppConfig 
{
//	@Bean
//	public Samsung getPhone()
//	{
//		return new Samsung();
//	}
//@Bean
//public Processor getProcessor()
//{
//	return new Snapdragon();
//}
}
