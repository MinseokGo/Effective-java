# item14: Comparable 을 구현할지 고려하라

## Comparable.compareTo()
compareTo 메서드는 해당 객체가 주어진 객체보다 작으면 음의 정수, 같으면 0을, 크면 양의 정수를 반환한다.

* x.compareTo(y) < 0 이면, 오름차순 기준으로 x 는 y 보다 앞순서에 위치한다.
* x.compareTo(y) == 0 이면, 오름차순 기준으로 x 는 y 보다 앞순서에 위치한다. (내림차순일 경우 반대이다.)
* x.compareTo(y) > 0 이면, 오름차순 기준으로 x 는 y 보다 뒷순서에 위치한다.

**x.compareTo(y) == 0 이면, x.equals(y) 는 true 이어야 한다.**

## compreTo()의 규약
* 일관성 : 동일한 두 객체는 항상 같아야 한다.
* 반사성 : 자기 자신과 비교하면 0을 반환한다.
* 대칭성 : x.compareTo(y) == 0 이라면, y.compareTo(x) 도 0 이어야 한다.
* 추이성 : x.compareTo(y) > 0 이고, y.compareTo(z) > 0 이면, x.compareTo(z) > 0 이어야 한다.

## 만약 하위 클래스에서 새로운 값 필드를 추가한다면?
```java
public class Parent implements Comparable<Parent> {
    private final int id;
    private final String name;
    
    ...

    @Override
    public int compareTo(Parent other) {
        return Integer.compare(id, other.id);
    }
}
```
와 같은 Parent 클래스가 있다고 가정하자. 만약 이 클래스를 확장한 클래스에 새로운 값 필드를 추가한다면?

```java
public class Child extends Parent {
    private final int order;
    
    ...

    @Override
    public int compareTo(Child other) {
        final int result = super.compareTo(other);
        if (result == 0) {
            return Integer.compare(order, other.order);
        }
        return result;
    }
}
```
이런 경우 Parent 클래스의 compareTo 메서드가 같다고 판명한 객체가 Child 클래스에서는 다를 수가 있다. 즉 일관성을 위반한다.

### Parent 클래스를 컴포지션하자..!

```java
public class Child implements Comparable<Child> {
    private final Parent parent;
    private final int order;
    
    ...
    
    public Parent asParent() {
        return parent;
    }
    
    @Override
    public int compareTo(Child other) {
        final int result = Integer.compare(parent.getId(), other.parent.getId());
        if (result != 0) {
            return result;
        }
        return Integer.compare(order, other.order);
    }
}
```
상속 관계를 컴포지션으로 풀어내면서 일관성도 지킬 수 있다.
(Parent 는 Parent 끼리만, Child 는 Child 끼리만 비교할 수 있다.)
