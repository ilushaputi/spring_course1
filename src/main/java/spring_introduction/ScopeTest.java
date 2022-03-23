package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

       Dog myDog = context.getBean("dog", Dog.class);
       myDog.say();
      // Dog myDog2 = context.getBean("dog", Dog.class);
      // System.out.println("Переменные ссылаются на один и тот же объект? " + (myDog==myDog2));
        context.close();
    }
}
