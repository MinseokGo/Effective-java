package com.example.effectivejava.ch2.Item1;

import java.util.Arrays;
import java.util.List;

public class StaticFactoryMethodConvention {
    private final List<Character> alphabets;

    private StaticFactoryMethodConvention(final Character... alphabets) {
        this.alphabets = Arrays.asList(alphabets);
        System.out.println("Create static factory method convention!!");
    }

    // 매개변수가 하나일 때
    public static StaticFactoryMethodConvention from(final Character alphabet) {
        return new StaticFactoryMethodConvention(alphabet);
    }

    // 매개변수가 여러개일 때
    public static StaticFactoryMethodConvention of(final Character... alphabets) {
        return new StaticFactoryMethodConvention(alphabets);
    }

    // from과 of의 더 자세한 버전
    public static StaticFactoryMethodConvention valueOf(final Character... alphabets) {
        return new StaticFactoryMethodConvention(alphabets);
    }

    // 매개변수를 받는다면 매개변수로 명시한 인스턴스 반환(getInstance() or instance())
    // 같은 인스턴스임은 보장하지 않음
    // 즉, 같을 수도 있고 다를 수도 있음
    public static StaticFactoryMethodConvention getInstance(final Character... alphabets) {
        return new StaticFactoryMethodConvention(alphabets);
    }

    // 매번 새로운 인스턴스를 생성해 반환함을 보장함(create() or newInstance())
    public static StaticFactoryMethodConvention create(final Character... alphabets) {
        return new StaticFactoryMethodConvention(alphabets);
    }

    // getType() getInstance() 와 같음. 인스턴스가 같을 수도 있고 다를 수도 있음
    // 생성할 클래스가 아닌 다른 클래스에 팩터리 메서드를 정의할 때 사용
    // 즉 StaticFactoryMethod 의 팩터리 메서드를 StaticFactoryMethodConvention 에 작성한다는 말
    public static StaticFactoryMethod getStaticFactoryMethod() {
        return new StaticFactoryMethod();
    }

    // newType() newInstance() 와 같음. 매번 새로운 인스턴스 반환
    // 생성할 클래스가 아닌 다른 클래스에 팩터리 메서드를 정의할 때 사용
    // 즉 StaticFactoryMethod 의 팩터리 메서드를 StaticFactoryMethodConvention 에 작성한다는 말
    public static StaticFactoryMethod newStaticFactoryMethod() {
        return new StaticFactoryMethod();
    }

    // getType()과 newType()의 간결한 버전
    // 스프링 빈 팩터리에서 빈을 생성하는 것과 비슷한 맥락
    public static StaticFactoryMethod staticFactoryMethod() {
        return new StaticFactoryMethod();
    }
}
