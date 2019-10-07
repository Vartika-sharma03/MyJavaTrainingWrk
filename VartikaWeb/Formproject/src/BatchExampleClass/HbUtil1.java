package BatchExampleClass;
import java.util.HashMap;
import java.util.Map;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class HbUtil1 {
	private static StandardServiceRegistry registry;
	   private static SessionFactory sessionFactory;

	   public static SessionFactory getSessionFactory() {
	      if (sessionFactory == null) {
	         try {
	            StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();

	            //Configuration properties
	            Map<String, Object> settings = new HashMap<>();
	        	settings.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
				settings.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/maven");
	            settings.put(Environment.USER, "root");
	            settings.put(Environment.PASS, "root");
	           
	            settings.put(Environment.HBM2DDL_AUTO, "update");
	            //Set JDBC batch size
	            settings.put(Environment.STATEMENT_BATCH_SIZE, 50);

	            registryBuilder.applySettings(settings);
	            registry = registryBuilder.build();
	            
	            MetadataSources sources = new MetadataSources(registry);
	            sources.addAnnotatedClass(Employee.class);
	            Metadata metadata = sources.getMetadataBuilder().build();
	            
	            sessionFactory = metadata.getSessionFactoryBuilder().build();
	         } catch (Exception e) {
	            if (registry != null) {
	               StandardServiceRegistryBuilder.destroy(registry);
	            }
	            e.printStackTrace();
	         }
	      }
	      return sessionFactory;
	   }

	   public static void shutdown() {
	      if (registry != null) {
	         StandardServiceRegistryBuilder.destroy(registry);
	      }
	   }
}
