# Algorithm Journey 练习项目

> 跟学 [algorithmzuo/algorithm-journey](https://github.com/algorithmzuo/algorithm-journey) 的 Java 练习仓库。

## 项目结构

```text
src/main/java/
├── dawn/algorithm/        ← 左程云算法课程代码
│   ├── class001/          ← 按课程编号组织
│   │   └── Code01_XXX.java
│   └── class004/
│       └── SelectBubbleInsert.java
└── leetcode/              ← LeetCode 刷题记录
    └── P0912.java         ← LeetCode 题号命名
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
| 课程包名 | `classXXX` | `class001`, `class023` |
| 课程类名 | `题目简称`或`CodeXX_题目简称` | `SelectBubbleInsert.java` |
| 刷题包名 | `leetcode` | `leetcode` |
| 刷题类名 | `P` + 4位数字题号 | `P0912.java`, `P0001.java` |

## 配套博客

学习笔记发布在博客 `posts/algorithm/` 目录下，按专题组织。

## 参考

- 源码仓库：[algorithm-journey](https://github.com/algorithmzuo/algorithm-journey)
- PPT 课件：[algorithm-journey/ppt](https://github.com/algorithmzuo/algorithm-journey/tree/main/ppt)

