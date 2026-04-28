# Algorithm Journey 练习项目

> 跟学 [algorithmzuo/algorithm-journey](https://github.com/algorithmzuo/algorithm-journey) 的 Java 练习仓库。

## 项目结构

```
src/main/java/dawn/algorithm/
├── classXXX/          ← 按课程编号组织，每节课一个包
│   └── Code01_XXX.java
└── template/          ← 可复用的算法模板
    ├── Sort.java
    ├── BinarySearch.java
    └── ...
```

## LeetCode 练习

本项目同时用于使用 Java 练习 LeetCode 算法题目，内容在 `src/leetcode` 下。

- `src/leetcode`: 包含 LeetCode 题目的解决方案。
- `src/leetcode/common`: LeetCode 中使用的通用数据结构（例如：ListNode, TreeNode）。

建议按照格式命名解决方案文件：`P<题目ID>_<题目名称>.java`。
示例：`P0001_TwoSum.java`

## 命名规范 (Algorithm Journey)

| 类型 | 格式 | 示例 |
|------|------|------|
| 包名 | `classXXX` | `class001`, `class023` |
| 类名 | `Code01_题目简称` | `Code01_SelectionSort.java` |
| 模板 | 直接放 `template` 包 | `template/UnionFind.java` |

## 快速开始

```bash
# 创建新课程目录（以 class001 为例）
mkdir -p src/main/java/dawn/algorithm/class001

# 在对应目录下新建练习文件
# 文件名: Code01_SelectionSort.java
# 包声明: package dawn.algorithm.class001;
```

## 进度追踪

| 阶段 | 课程范围 | 主题 | 状态 |
|------|----------|------|------|
| 入门 | class001-008 | 语言基础、二进制、排序、对数器、复杂度 | ⬜ |
| 入门 | class009-018 | 链表、栈、队列、二叉树 | ⬜ |
| 必备 | class019-029 | IO、递归、归并、快排、堆、基数排序 | ⬜ |
| 必备 | class030-033 | 位运算 | ⬜ |
| 必备 | class034-037 | 链表进阶、设计题、二叉树高频 | ⬜ |
| 必备 | class038-043 | 递归、回溯、数学基础 | ⬜ |
| 必备 | class044-048 | 前缀树、前缀和、差分 | ⬜ |
| 必备 | class049-055 | 滑窗、双指针、二分答案、单调栈/队列 | ⬜ |
| 必备 | class056-065 | 并查集、图论 | ⬜ |
| 必备 | class066-088 | 动态规划 | ⬜ |
| 必备 | class089-098 | 贪心、博弈、数论 | ⬜ |
| 扩展 | class099-103 | KMP、容斥原理等 | ⬜ |

## 配套博客

学习笔记发布在博客 `posts/algorithm/` 目录下，按专题组织。

## 参考

- 源码仓库：[algorithm-journey](https://github.com/algorithmzuo/algorithm-journey)
- PPT 课件：[algorithm-journey/ppt](https://github.com/algorithmzuo/algorithm-journey/tree/main/ppt)

