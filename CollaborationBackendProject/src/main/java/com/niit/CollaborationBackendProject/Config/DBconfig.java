package com.niit.CollaborationBackendProject.Config;



import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.CollaborationBackendProject.Dao.BlogDao;
import com.niit.CollaborationBackendProject.Dao.BlogDaoImpl;
import com.niit.CollaborationBackendProject.model.Blog;
import com.niit.CollaborationBackendProject.model.User;



@Configuration
@ComponentScan("com.niit.*")
@EnableTransactionManagement
public class DBconfig 
{
	@Bean
public DataSource getOracleDataSource()
{
	DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
	driverManagerDataSource.setDriverClassName("oracle.jdbc.driver.oracleDriver");
	driverManagerDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
	driverManagerDataSource.setUsername("hr");
	driverManagerDataSource.setPassword("hr");
	return driverManagerDataSource;
	
}
 public Properties getHibernateProperties()
 {
	 Properties properties = new Properties();
	 properties.setProperty("hibernate.hbm2ddl.auto","create");
	 properties.put("hibernate.dialect","org.hibernate.dialect.OracleDialect");
	 return properties;
 }

 @Bean
 public SessionFactory getSessionFactory()
 {
	 LocalSessionFactoryBuilder localSessionFactoryBuilder = new LocalSessionFactoryBuilder(getOracleDataSource());
	 localSessionFactoryBuilder.addProperties(getHibernateProperties());
	 localSessionFactoryBuilder.addAnnotatedClass(User.class);
	 localSessionFactoryBuilder.addAnnotatedClass(Blog.class);
	 System.out.println("SessionFactory beans created");
	 return localSessionFactoryBuilder.buildSessionFactory();
 }
 
 @Bean
 public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory)
 {
	 return new HibernateTransactionManager(sessionFactory);
 }
  
// @Bean
// public BlogDao getBlogDao(SessionFactory sessionFactory)
// {
//	 return new BlogDaoImpl(sessionFactory);
// }
}
