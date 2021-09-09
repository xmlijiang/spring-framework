import com.jali.User;
import com.jali.UserFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) context.getBean("user222");
		System.out.println(user.getApplicationContext());
		String[] activeProfiles = user.getEnvironment().getActiveProfiles();
		System.out.println("--------------Environment------------------");
		for (String activeProfile : activeProfiles) {
			System.out.println(activeProfile);
		}
		System.out.println("-------------------------------------------");
		System.out.println(user);
		user.show();

		/*获取的是普通对象*/
		User userFactoryBean = (User) context.getBean("userFactoryBean");
		System.out.println(userFactoryBean);

		/*获取的FactoryBean对象*/
		UserFactoryBean userFactoryBean2 = (UserFactoryBean) context.getBean("&userFactoryBean");
		System.out.println(userFactoryBean2);

//		User bean = context.getBean(User.class);
//		System.out.println(bean);
	}
}