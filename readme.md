# Spring framework

### Primitive type injection

### Collection injection

### Reference type injection

    Reference type

    A is dependent on B
    <bean>
         <property name="">
            <ref bean="b">
        </property>
    </bean>

### Constructor injection

     <bean class="com.spring.ci.Person" name="personA">
        <constructor-arg>
            
        </constructor-arg>
    </bean>

## Bean lifecycle

Spring provide two methods to every bean

    public void init()
    public void destroy()

There are 3 ways to configure bean lifecylce

1. XML
2. Spring Interface (InitializingBean, DisposableBean)
3. Annotations

1.XML:

    public void init(){
        System.out.println("Inside init method");
    }

    public void destroy(){
        System.out.println("Inside destroy method");
    }

    <bean class="com.spring.lifecycle.xml.Employee" name="employee" init-method="init" destroy-method="destroy">
    <property name="name" value="Pratik"></property>
    </bean>

2.Spring Interface:

    implements InitializingBean, DisposableBean these two interfaces in Pojo(Student)
    
    @Override
    public void afterPropertiesSet() throws Exception {
        //init (this method implemented from InitializingBean interface)
        System.out.println("Init method called");

    }

    @Override
    public void destroy() throws Exception {
        //destroy(this method implemented from DisposableBean interface)
        System.out.println("Destroy method called");
    }

3.Annotations:

    Implement Bean lifecycle using @PostConstruct and @PreDestroy and add  <context:annotation-config/> in beans.xml
    ----------------------------------------------------------------
    @PostConstruct
    public void start(){
    System.out.println("starting method of Product");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy method of Product");
    }
    ----------------------------------------------------------------
    note:: if java 8+ add below dependency in pom.xml to get these two interfaces
    <dependency>
            <groupId>javax.annotation</groupId>
            <artifactId>javax.annotation-api</artifactId>
            <version>1.3.2</version>
        </dependency>



## Autowiring
Feature of Spring container in which spring container inject the dependencies automatically
Autowiring can't be used with primitive data types. It only works with reference types

Types of Autowiring

1.XML (No, byName, byType, constructor, autodetect)

2.Annotation (@Autowired)

    @Autowired identity beans by class Type
    @Qualifier(String beanName) is used with @Autowired annotation to identify the bean by Name