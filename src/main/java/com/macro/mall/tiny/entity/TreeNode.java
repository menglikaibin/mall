package com.macro.mall.tiny.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TreeNode {
    protected Long id;

    protected String name;

    protected Long pid;

    protected List<TreeNode> children = new ArrayList<>();

    public List<TreeNode> getChildren() {
        if (children.size() <= 0) {
            return null;
        }
        return children;
    }

    public void addChildren(TreeNode treeNode) {
        children.add(treeNode);
    }
}
