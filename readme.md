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