package com;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import com.configuration.application.ApplicationConfig;
import com.configuration.application.ApplicationDatabaseConfig;
import com.configuration.application.ApplicationFormatterConfig;
import com.configuration.application.ApplicationUploadConfig;

import javax.servlet.Filter;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {
                ApplicationConfig.class,
                ApplicationDatabaseConfig.class,
                ApplicationUploadConfig.class,
                ApplicationFormatterConfig.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        filter.setForceEncoding(true);
        return new Filter[]{filter};
    }

}