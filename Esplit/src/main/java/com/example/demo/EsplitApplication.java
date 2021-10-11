package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@SpringBootApplication
public class EsplitApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsplitApplication.class, args);
	}

	
	@Bean
	public TilesConfigurer tilesconfig()
	{ 
		TilesConfigurer tilesconfig=new TilesConfigurer();
		String[] defs= {"/WEB-INF/tiles.xml"};
		tilesconfig.setDefinitions(defs);
		return tilesconfig;
	}
	
	@Bean
	public UrlBasedViewResolver tilesViewResolver()
	{
		UrlBasedViewResolver tilesviewResolver=new UrlBasedViewResolver();
		tilesviewResolver.setViewClass(TilesView.class );
		return tilesviewResolver;
	}
}
