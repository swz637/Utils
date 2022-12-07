package utils;

/**
 * @author: lsq637
 * @since: 2022-12-07 11:04:17
 * @describe: 自建字符串工具类
 */
public class LsqStringUtils {

    /**
     * 改进String 类型自带的 subString()，防止越界问题，借鉴JavaScript该方法的思路，改变原有逻辑
     *
     * @param str   要操作的字符串
     * @param start 开始索引
     * @param subLength   要截取的字符的个数，当要截取的字符数不足的时候，返回截取到的，不报错
     *                    如“0123456789”，要从索引为 9 的位置截取 3 位时，只返回一位 9
     * @return 截取后的字符串
     */
    public static String substring(String str, int start, int subLength) {
        int end = start + subLength;
        int len = str.length();
        return end > len ? str.substring(start) : str.substring(start, end);
    }



    public static void main(String[] args) {
        String str  = "0123456789";
        System.out.println(substring(str, 9, 3));
    }

}
