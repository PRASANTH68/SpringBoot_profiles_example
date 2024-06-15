# SpringBoot_profiles_example
What are profiles?
Spring Boot profiles are a way to segregate parts of your application configuration and make it only available in certain environments. This is particularly useful when you have different configurations for different environments like development, testing, and production.

Activating Profiles
1. Setting in application.properties:
	spring.profiles.active=dev

2. Using Command Line Arguments:
	java -jar myapp.jar --spring.profiles.active=dev

3. Environment Variable:
	export SPRING_PROFILES_ACTIVE=dev

4. Programmatically:
	@SpringBootApplication
	public class MyApp {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MyApp.class);
        app.setAdditionalProfiles("dev");
        app.run(args);
    }
	}
