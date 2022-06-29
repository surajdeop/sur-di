package sur.springframework.surdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sur.springframework.surdi.controllers.*;

@SpringBootApplication
public class SurDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SurDiApplication.class, args);

		System.out.println("------------- I18N Bean");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("------------- Primary Bean");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.getGreeting());

		System.out.println("------------- Property Based");
		PropertiesInjectedController propertiesInjectedController = (PropertiesInjectedController) ctx.getBean("propertiesInjectedController");
		System.out.println(propertiesInjectedController.getGreeting());


		System.out.println("------------- Setter Based");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());



		System.out.println("------------- Property Based");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());


	}

}
