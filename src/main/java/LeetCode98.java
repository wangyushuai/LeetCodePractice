
/**
 * 校验二叉树是搜索二叉树
 * @author wangyushuai2@jd.com
 * @date 2020/10/27
 */
public class LeetCode98 {

    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);

    }

    public boolean helper(TreeNode root,Integer lower,Integer upper) {
        if (root == null) {
            return true;
        }
        if (lower != null && root.val <= lower) {
            return false;
        }
        if (upper != null && root.val >= upper) {
            return false;
        }
        return helper(root.left,lower,root.val) && helper(root.right,root.val,upper);
    }

}
