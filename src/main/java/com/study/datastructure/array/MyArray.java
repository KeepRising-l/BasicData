package com.study.datastructure.array;

/**
 * @author Ray
 */
/**
 * 手写一个动态数组（模仿 ArrayList 的核心机制）
 *
 * 关键点：
 * 1. 内部用一个 Object[] 数组存数据，容量不够就扩容
 * 2. 扩容时新数组 = 原数组 * 1.5（ArrayList 也是这么做的）
 * 3. add(index, element) 插入时，index 及后面的元素要【从后往前】搬移
 * 4. remove(index) 删除时，index 后面的元素要【从前往后】搬移
 *
 * 建议实现顺序：size 字段 → 构造器 → add/addFirst/addLast → get → remove → 扩容 → toString
 */
public class MyArray {
    // 【任务1】定义字段：一个 Object[] data，一个 int size（当前元素个数）
    private Object[] data;
    private int size;

    // 【任务2】构造器：默认容量 10
    public MyArray() {
        data = new Object[10];
        size = 0;
    }

    //【任务3】返回当前元素个数
    public int size() {
        return size;
    }

    // 【任务4】尾部追加元素
    public void addLast(Object element) {
        // 第一步：判断容量是否已满。满了就先扩容，否则第 11 个元素塞不进去
        if (size == data.length) {
            grow();
        }
        // 第二步：新元素放到 size 位置（注意是 size，不是 size+1）
        data[size] = element;
        // 第三步：元素个数 +1
        size++;
    }

    // 【任务5】按下标取元素（先做越界检查，下标越界抛异常）
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return data[index];
    }
    // 【任务6】按下标删除元素，返回被删的值
    // 提示：删除后 size 减小，且被删位置之后所有元素【前移一格】
    public Object remove(int index) {
        if (index <0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Object removeElement = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        return removeElement;
    }

    // 【任务7】扩容：容量不够时，新建一个 1.5 倍大小的数组，拷贝旧数据
    // 提示：用 System.arraycopy，或者 for 循环都行
    private void grow() {
        Object[] newData = new Object[data.length * 15 / 10];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    // 【任务8】打印内容，方便调试
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }


}