package com.wisely.highlight.spring4.ch2.el;


import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.wisely.highlight.spring4.ch2.el")
@PropertySource("classpath:com/wisely/highlight/spring4/ch2/el/test.properties")
public class ELConfig {

	@Value("Nomal value string")
	private String normal;
	
	@Value("#{systemProperties['os.name']}")
	private String osName;
	
	@Value("#{T(java.lang.Math).random()*100.0}")
	private double randomNumber;
	
	@Value("#{demoService.another}")
	private String fromAnother;
	
//	@Value("{classpath:C:/Git/GitWorkspaces/GitHub/test/StudySpring4WithGradle}")
//	private Resource testFile;
	
	@Value("http://www.baidu.com")
	private Resource testUrl;
	
	@Value("${book.name}")
	private String bookName;
	
	@Autowired
	private Environment environment;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	public void outputResource() {
		try {
			System.out.println("normal property:"+normal);
			System.out.println("osName:"+osName);
			System.out.println("randomNumber:"+randomNumber);
			System.out.println("fromAnother:"+fromAnother);
			//System.out.println(IOUtils.toString(testFile.getInputStream()));
			System.out.println("testURL: "+IOUtils.toString(testUrl.getInputStream()));
			System.out.println("bookName :"+bookName);
			System.out.println("book.author :"+environment.getProperty("book.author"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
