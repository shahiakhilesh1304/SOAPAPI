package com.mphrx.soapapitut.config;


import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
public class SoapConfigWSDL extends WsConfigurerAdapter {
	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext context)
	{
		MessageDispatcherServlet mds = new MessageDispatcherServlet();
		mds.setApplicationContext(context);
		mds.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<MessageDispatcherServlet>(mds,"/ws/*");
	}
	
	@Bean("patientDetailWSDL")
	public DefaultWsdl11Definition defaultWSDL(XsdSchema scheme)
	{
		DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
		wsdl.setPortTypeName("PatientEndPoint");
		wsdl.setLocationUri("/ws/");
		wsdl.setTargetNamespace("http://www.mphrx.com/soapapitut/PatientXSDPojo");
		wsdl.setSchema(scheme);
		return wsdl;
	}
	
	@Bean
	public XsdSchema schema()
	{
		return new SimpleXsdSchema(new ClassPathResource("Patient.xsd"));
	}
}
