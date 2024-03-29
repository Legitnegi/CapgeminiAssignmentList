package com.telusko;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@ComponentScan({"com.telusko"})
public class TeluskoConfig
{
	//it basically returning view resolver object
	@Bean
	public InternalResourceViewResolver viewresolver() {
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		return vr;
	}


}
