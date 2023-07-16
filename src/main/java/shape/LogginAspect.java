package shape;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Around;

@Aspect
@Component
public class LogginAspect {

    @Around("execution(* shape.Square.calculateArea())")
    public Object logSquareArea(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Obliczanie pola figury...");

        // Wykonuje metodę, do której zostało zastosowane @Around
        Object result = joinPoint.proceed();

        System.out.println("Obliczenie pola figury zakończone.");

        return result;
    }
}