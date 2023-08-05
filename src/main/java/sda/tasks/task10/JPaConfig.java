package sda.tasks.task10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class JPaConfig {
    // Ziarno @Bean(name="entityManagerFactory")
    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        // Utworzenie obiektu LocalContainerEntityManagerFactoryBean
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        // Ustawienie źródła danych
        em.setDataSource(dataSource());
        // Ustawienie pakietów encji
        em.setPackagesToScan(new String[] { "com.example.model" });
        // Ustawienie dostawcy JPA
        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        // Zwrócenie obiektu LocalContainerEntityManagerFactoryBean
        return em;
    }

    // Ziarno źródła danych
    // W klasie konfiguracyjnej JPaConfig
    @Bean
    public DriverManagerDataSource dataSource() {
        // Utworzenie obiektu DriverManagerDataSource
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        // Ustawienie sterownika bazy danych
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); // zmieniono na nowy sterownik
        // Ustawienie adresu URL bazy danych
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        // Ustawienie nazwy użytkownika bazy danych
        dataSource.setUsername("root");
        // Ustawienie hasła bazy danych
        dataSource.setPassword("root");
        // Zwrócenie obiektu DriverManagerDataSource
        return dataSource;
    }

}
