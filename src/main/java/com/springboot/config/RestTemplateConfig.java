package com.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class RestTemplateConfig {

    @Bean
    public Jaxb2Marshaller jaxb2Marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

        marshaller.setPackagesToScan("com.springboot.dto");

        return marshaller;
    }

    @Bean
    public RestTemplate restTemplate(Jaxb2Marshaller marshaller) {
        RestTemplate restTemplate = new RestTemplate();

        MarshallingHttpMessageConverter xmlConverter = new MarshallingHttpMessageConverter();
        xmlConverter.setMarshaller(marshaller);
        xmlConverter.setUnmarshaller(marshaller);

        List<HttpMessageConverter<?>> converters = new ArrayList<>();
        converters.add(xmlConverter); // for XML
        converters.addAll(restTemplate.getMessageConverters()); // default JSON and others

        restTemplate.setMessageConverters(converters);

        return restTemplate;
    }
}
