package tw.niq.app.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleBean
		implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	public LifeCycleBean() {
		System.out.println("## LifeCycleBean - LifeCycleBean()");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("## LifeCycleBean - setApplicationContext(ApplicationContext applicationContext): " + applicationContext);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("## LifeCycleBean - setBeanFactory(BeanFactory beanFactory): " + beanFactory);
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("## LifeCycleBean - setBeanName(String name): " + name);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("## LifeCycleBean - destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("## LifeCycleBean - afterPropertiesSet()");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("## LifeCycleBean - postConstruct()");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("## LifeCycleBean - preDestroy()");
	}
	
	public void beforeInit() {
		System.out.println("## LifeCycleBean - beforeInit()");
	}
	
	public void afterInit() {
		System.out.println("## LifeCycleBean - afterInit()");
	}
	
}
