package sv.com.ciber.main;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringApplicationContext implements ApplicationContextAware {

	private static ApplicationContext CONTEXT;

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		CONTEXT = context;
	}
	
	public static Object getBean(String BeanName) {
		return CONTEXT.getBean(BeanName);
	}
}
