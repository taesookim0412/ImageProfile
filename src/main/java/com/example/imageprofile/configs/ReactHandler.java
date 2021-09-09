package com.example.imageprofile.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@EnableWebMvc
public class ReactHandler implements WebMvcConfigurer {
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/index.html").addResourceLocations("/WEB-INF/imageprofile-react/build/index.html");
//        registry.addResourceHandler("/static/**").addResourceLocations("/WEB-INF/imageprofile-react/build/static/");
//        registry.addResourceHandler("/*.js").addResourceLocations("/WEB-INF/imageprofile-react/build/");
//        registry.addResourceHandler("/*.json").addResourceLocations("/WEB-INF/imageprofile-react/build/");
//        registry.addResourceHandler("/*.ico").addResourceLocations("/WEB-INF/imageprofile-react/build/");
//
//        WebMvcConfigurer.super.addResourceHandlers(registry);
//    }
//    @Bean
//    public ViewResolver viewResolver() {
//        UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
//        viewResolver.setViewClass(InternalResourceView.class);
//        return viewResolver;
//    }
}
