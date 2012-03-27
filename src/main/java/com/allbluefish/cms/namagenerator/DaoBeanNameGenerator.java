package com.allbluefish.cms.namagenerator;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;

public class DaoBeanNameGenerator extends AnnotationBeanNameGenerator {

	private static final String DAO_IMPL = "DaoImpl";

	public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
		String beanName = super.generateBeanName(definition, registry);
		if (beanName != null && beanName.endsWith(DAO_IMPL))
			beanName = beanName.substring(0, beanName.length() - 4);
		return beanName;
	}
}
