package com.study.datastructure.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * MyArray 单元测试
 * 跑法：在项目根目录执行 mvn test
 */
class MyArrayTest {

    @Test
    void addLastAndGet() {
        // 尾部追加 3 个元素，再验证个数和取值
        MyArray arr = new MyArray();
        arr.addLast("a");
        arr.addLast("b");
        arr.addLast("c");

        assertEquals(3, arr.size());
        assertEquals("a", arr.get(0));
        assertEquals("c", arr.get(2));
    }

    @Test
    void growWhenExceedsInitialCapacity() {
        // 插入 15 个元素（超过初始容量 10），验证扩容后数据不丢
        MyArray arr = new MyArray();
        for (int i = 0; i < 15; i++) {
            arr.addLast(i);
        }
        assertEquals(15, arr.size());
        assertEquals(14, arr.get(14));
    }

    @Test
    void removeShiftsLeft() {
        // 删除中间元素后，后续元素应前移一格
        MyArray arr = new MyArray();
        arr.addLast("a");
        arr.addLast("b");
        arr.addLast("c");

        Object removed = arr.remove(1);

        assertEquals("b", removed);
        assertEquals(2, arr.size());
        assertEquals("c", arr.get(1)); // b 被删后 c 前移到下标 1
    }

    @Test
    void outOfBoundsThrows() {
        // 越界访问应抛异常
        MyArray arr = new MyArray();
        arr.addLast("a");
        assertThrows(IndexOutOfBoundsException.class, () -> arr.get(1));
        assertThrows(IndexOutOfBoundsException.class, () -> arr.remove(-1));
    }

    @Test
    void toStringFormat() {
        // toString 只显示已占用元素，形如 [10, 20, 30]
        MyArray arr = new MyArray();
        arr.addLast(10);
        arr.addLast(20);
        arr.addLast(30);
        assertEquals("[10, 20, 30]", arr.toString());
    }
}
