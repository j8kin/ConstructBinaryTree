import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    private val rLR = intArrayOf(0,0,0,0,0)
    private var rLRI = 0

    private fun rootLeftRight(root: TreeNode?) {
        if (root != null) {
            rLR[rLRI] = root.`val`
            rLRI++
            rootLeftRight(root.left)
            rootLeftRight(root.right)
        }
    }

    @Test
    fun buildTreeTest1() {
        val rootLeftRight = intArrayOf(3,9,20,15,7)
        val leftRootRight = intArrayOf(9,3,15,20,7)
        val result = solution.buildTree(rootLeftRight,leftRootRight)
        rLRI = 0
        rootLeftRight(result)
        assertArrayEquals(rootLeftRight, rLR)
    }
}