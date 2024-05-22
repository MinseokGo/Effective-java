# public 클래스에서는 public 필드가 아닌 접근자 메서드를 사용하라

```java
class Point {
    public double x;
    public double y;
}
```

* 위 클래스는 데이터 필드에 직접 접근할 수 있으니 캡슐화의 이점을 제공하지 못한다.
* 또한 API 를 바꾸지 않고는 내부 표현을 바꿀 수 없다.
* 불변식 보장이 안된다.
* 외부 필드에 접근할 때 부수 작접을 수행할 수도 없다. (예를들면 접근자 메서드에서는 내부 구현을 통해 특정 로직을 구현할 수 있지만
  public 필드를 직접 접근하는 순간 부수 작업을 수행할 수 없다.)

```java
class Point {
    public final double x;
    public final double y;
}
```
* 불변식은 보장되지만 여전히 다른 문제들이 해결되지 않는다.

## 접근자 메서드 사용
```java
class Point {
    private double x;
    private double y;
    
    // getter, setter 생략
}
```
* setter 로 인해 불변식이 보장되지는 않지만 다른 문제들은 해결된다.
* 접근자 메서드 내부 구현에 부수 작업을 추가할 수 있다.
* 캡슐화되었다.