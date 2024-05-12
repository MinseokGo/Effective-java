# 변경 가능성을 최소화하라

불변 클래스는 가변 클래스보다 설계하고 구현하고 사용하기 쉬우며, 오류가 생길 여지도 적고 훨씬 안전하다.

## 클래스를 불변으로 만드는 다섯 가지 규칙
* 객체의 상태를 변경하는 메서드(변경자)를 제공하지 않는다.
* 클래스를 확장할 수 없도록 한다.
* 모든 필드를 final 로 선언한다.
* 모든 필드를 private 으로 선언한다.
* 자신 외에는 내부의 가변 컴포넌트에 접근할 수 없도록 한다.

## 불변 객체의 장점
### 불변 객체는 근본적으로 스레드 안전(Thread-safe)하여 따로 동기화할 필요 없다.
여러 스레드가 동시에 사용해도 절대 훼손되지 않는다. 불변 객체에 대해서는 그 어떤 스레드도 다른 스레드에 영향을 줄 수 없다.

### 불변 객체는 안심하고 공유할 수 있다.
따라서 불변 클래스라면 한번 만든 인스턴스를 최대한 재활용하기를 권한다.
가장 쉬운 재활용 방법은 자주 쓰이는 값들을 상수(public static final)로 제공하는 것이다.

```java
import com.example.effectivejava.ch4.item17.Complex;

// 자주 쓰이는 값들을 캐싱
public static final Complex ZERO = new Complex(0, 0);
public static final Complex ONE  = new Complex(1, 0);
public static final Complex I    = new Complex(0, 1);
```