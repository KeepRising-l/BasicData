# BasicData 学习项目

数据结构与设计模式学习仓库（Java 17 + Maven）。

## 教材
- 《图解数据结构》小傅哥 — `docs/`（不入库）
- 《重学Java设计模式》小傅哥 — `docs/`（不入库）

## 目录结构
```
src/main/java/com/study/
  datastructure/    ← 数据结构（每章一个子包）
    array/  linkedlist/  queue/  stack/  hashmap/  bst/  avl/  redblacktree/  bloomfilter/
  designpattern/    ← 设计模式（每章一个子包）
    singleton/  factorymethod/  abstractfactory/  builder/  ...
```

## 协作约定
- 关键代码由用户亲手写，Claude 提供带注释骨架、讲评、参考答案
- 学习进度记录在 `.claude/skills/learning-tracker/LEARNING_PLAN.md`
- 每次学习完成后提交代码到 git 仓库

## 构建
```bash
mvn test    # 跑所有单元测试
```
