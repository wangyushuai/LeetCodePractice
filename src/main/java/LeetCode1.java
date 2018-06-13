import java.util.HashMap;

/**
 * Created by wangyushuai@fang.com on 2018/4/17.
 */
public class LeetCode1 {
    //private static List<String> allStr = new ArrayList<>();
    /**
     * 计算几率
     * 6位数密码，3个字母组成，6位密码中，3个字母都有出现；
     * 求一次尝试，解锁的几率
     * @param args
     */
    public static void main(String[] args) {
        HashMap<String,String> all = GetAllList();
        int count = 0;
        for (String str : all.keySet()) {
            if (str.indexOf('a') >=0 && str.indexOf('b')>=0 && str.indexOf('c')>=0) {
                count ++;
            }
        }
        System.out.println("all:" + all.size());
        System.out.println("avillable:" + count);
    }

    public final static char[] psw = {'a','b','c'};

    private static HashMap<String,String> GetAllList() {
        HashMap<String,String> hashMap = new HashMap<>();

        for (int i = 0;i< psw.length; i ++) {
            for (int j = 0; j < psw.length; j++) {
                for (int k = 0; k < psw.length; k++) {
                    for (int l = 0; l < psw.length; l++) {
                        for (int m = 0; m < psw.length; m++) {
                            for (int n = 0; n < psw.length; n++) {
                                String tempStr = "" + psw[i] + psw[j] + psw[k] + psw[l] + psw[m] + psw[n];
                                if (!hashMap.containsKey(tempStr)) {
                                    hashMap.put(tempStr, "");
                                   // allStr.add(tempStr);
                                }

                            }
                        }
                    }
                }
            }
        }
        return  hashMap;
    }
}
