//package com.study.datastructure.linkedlist;
//
///**
// * 手写单链表（模仿 LinkedList 的核心机制）
// *
// * 【链表 vs 数组 回顾】
// * - 数组：连续内存，按下标随机访问 O(1)，但插入/删除要搬移元素 O(n)
// * - 链表：节点分散内存，靠指针串联，头部插入/删除 O(1)，但按下标找要一个个走 O(n)
// *
// * 【链表核心】
// * - 每个节点 = 一个值 + 指向下一个节点的指针
// * - 只需要记住 head（头节点），就能顺着指针走遍整个链表
// * - 尾部节点 next = null（链表终结）
// *
// * 【建议实现顺序】
// * Node 内部类 → 头插 addFirst → 尾插 addLast → 删除 remove(value)
// * → 按下标取 get(index) → 长度 size() → 反转 reverse() → toString
// *
// * 【易错点】
// * - 删除节点前要先把"前驱节点的 next"备份好，否则会断链
// * - 空链表（head == null）时操作要先判空
// * - reverse 时小心：不能先断开当前节点再找下一个（会丢链）
// */
//public class MyLinkedList {
//
//    // ========== 内部节点类 ==========
//    /**
//     * 链表节点：值 + 指向下一个节点的指针
//     */
//    private static class Node {
//        Object value;   // 节点存的值
//        Node next;      // 指向下一个节点的引用（尾部为 null）
//
//        Node(Object value) {
//            this.value = value;
//        }
//    }
//
//    // 【任务1】定义字段：一个 Node head（头节点）+ 一个 int size（节点个数）
//    // TODO 你的实现
//
//    // 【任务2】头部插入：新节点.next = 旧head，head = 新节点
//    // 提示：就两步，改两个引用，O(1)
//    public void addFirst(Object element) {
//        // TODO 你的实现
//    }
//
//    // 【任务3】尾部插入：先找到当前尾节点，再让它的 next 指向新节点
//    // 提示：用一个临时节点从头开始走，走到 next == null 时就是尾部
//    // 注意：空链表时 head == null，直接让 head = 新节点
//    public void addLast(Object element) {
//        // TODO 你的实现
//    }
//
//    // 【任务4】按值删除第一个匹配的节点，删除成功返回 true
//    // 提示：
//    //   - 如果删的是 head：head = head.next，size--
//    //   - 否则：找到"前驱节点"，让 prev.next = prev.next.next（跳过被删节点）
//    public boolean remove(Object value) {
//        // TODO 你的实现
//    }
//
//    // 【任务5】按下标取元素（从 0 开始），越界抛 IndexOutOfBoundsException
//    // 提示：从头走 index 步，就是目标节点
//    public Object get(int index) {
//        // TODO 你的实现
//    }
//
//    // 【任务6】返回节点个数
//    public int size() {
//        // TODO 你的实现
//    }
//
//    // 【任务7】反转链表：1->2->3 变成 3->2->1
//    // 提示（最经典的三指针法）：
//    //   prev = null, cur = head, next = null
//    //   循环：next = cur.next  （先保存下一个，防止断链）
//    //         cur.next = prev   （当前节点指向"前一个"）
//    //         prev = cur        （三个指针整体前移）
//    //         cur = next
//    //   循环结束后 prev 就是新的 head
//    public void reverse() {
//        // TODO 你的实现
//    }
//
//    // 【任务8】打印链表，形如：1 -> 2 -> 3 -> null
//    @Override
//    public String toString() {
//        // 提示：从头遍历，拼接字符串
//        // TODO 你的实现
//        return null;
//    }
//}
