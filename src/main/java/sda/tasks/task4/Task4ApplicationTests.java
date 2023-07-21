//package sda.tasks.task4;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.junit.Test;
//
//import java.util.List;
//
//@SpringBootTest
//public class Task4ApplicationTests {
//    @Autowired
//    @Qualifier
//    private DummyLogger dummyLogger;
////    @Autowired
////    private ListUtil listUtil;
////    @Autowired
////    private StringUtil stringUtil;
//    @Test
//    public void testBeans(){
//        DummyLogger dummyLogger = new DummyLogger();
//        ListUtil listUtil = new ListUtil();
//        StringUtil stringUtil = new StringUtil();
//        dummyLogger.sayHello();
//        System.out.println("Suma wszystkich elementów, to " + listUtil.sumElements(List.of(1,2,3)));
//        System.out.println(stringUtil.formSentence(List.of("Goodbye","cruel", "world")));
//    }
//}
