package com.allbluefish.cms.namagenerator;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;

public class ServiceBeanNameGenerator extends AnnotationBeanNameGenerator {

	private static final String SERVICE_IMPL = "ServiceImpl";

	public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
		String beanName = super.generateBeanName(definition, registry);
		if (beanName != null && beanName.endsWith(SERVICE_IMPL))
			beanName = beanName.substring(0, beanName.length() - 4);
		return beanName;
	}
}
