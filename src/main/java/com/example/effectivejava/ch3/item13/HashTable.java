package com.example.effectivejava.ch3.item13;

public class HashTable implements Cloneable {
    private Entry[] buckets;

    private static class Entry {
        final Object key;
        Object value;
        Entry next;

        Entry(Object key, Object value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        // 스택 오버플로우를 고려하여 재귀 대신 반복문을 통해 깊은 복사
        Entry deepCopy() {
            Entry result = new Entry(key, value, next);
            for (Entry entry = result; entry.next != null; entry = entry.next) {
                entry.next = new Entry(entry.next.key, entry.next.value, entry.next.next);
            }
            return result;
        }
    }

    @Override
    public HashTable clone() {
        try {
            HashTable result = (HashTable) super.clone();
            result.buckets = new Entry[buckets.length];
            for (int i = 0; i < buckets.length; i++) {
                if (buckets[i] != null) {
                    result.buckets[i] = buckets[i];
                }
            }
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
