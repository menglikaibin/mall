package com.macro.mall.tiny.common.utils;

import com.macro.mall.tiny.entity.TreeNode;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class TreeUtil {
    /**
     * 双重循环建树
     */
    public <T extends TreeNode> List<T> build(List<T> treeNodes, Object root) {
        List<T> trees = new ArrayList<>();

        for (T treeNode : treeNodes) {
            if (root.equals(treeNode.getPid())) {
                trees.add(treeNode);
            }
            for (T it : treeNodes) {
                if (it.getPid().equals(treeNode.getId())) {
                    treeNode.addChildren(it);
                }
            }
        }

        return trees;
    }

    /**
     * 递归方法建树
     */
    public <T extends TreeNode> List<T> buildByRecursive(List<T> treeNodes, Object root) {
        List<T> trees = new ArrayList<T>();
        for (T treeNode : treeNodes) {
            if (root.equals(treeNode.getPid())) {
                trees.add(findChildren(treeNode, treeNodes));
            }
        }

        return trees;
    }

    /**
     * 查找子节点
     */
    public <T extends TreeNode> T findChildren(T treeNode, List<T> treeNodes) {
        for (T it : treeNodes) {
            if (treeNode.getId() == it.getPid()) {
                if (treeNode.getChildren() == null) {
                    treeNode.setChildren(new ArrayList<>());
                }
                treeNode.addChildren(findChildren(it, treeNodes));
            }
        }
        return treeNode;
    }
}
