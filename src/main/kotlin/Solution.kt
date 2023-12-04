class Solution {
    private var idx = 0

    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        if (inorder.isEmpty()) return null

        val newNode = TreeNode(preorder[idx])
        val inx = inorder.indexOf(preorder[idx])
        idx++

        val left = inorder.sliceArray(IntRange(0,inx-1))
        val right = inorder.sliceArray(IntRange(inx + 1,inorder.size-1))

        newNode.left = buildTree(preorder, left)
        newNode.right = buildTree(preorder, right)
        return newNode
    }
}