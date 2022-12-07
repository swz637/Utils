package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author: lsq637
 * @since: 2022-12-07 11:21:57
 * @describe: 关于集合类的工具类
 */
public class LsqCollectionUtils {

    /**
     * 实现类似JavaScript中集合、数组的join方法
     *
     * @param collection 传入集合
     * @param separator  要join进来的字符串
     * @return 返回每两个元素间加入separator后的集合的字符串
     */
    public static String join(Collection<? extends Object> collection, String separator) {

        StringBuilder builder = new StringBuilder();
        for (Object o : collection) {
            String s = o.toString();
            builder.append(s).append(separator);
        }
        builder.delete(builder.length() - separator.length(), builder.length());
        return builder.toString();
    }

    public static <T> String join(T[] array, String separator) {

        StringBuilder builder = new StringBuilder();
        for (T o : array) {
            String s = o.toString();
            builder.append(s).append(separator);
        }
        builder.delete(builder.length() - separator.length(), builder.length());
        return builder.toString();
    }

    /**
     * 移除集合中最后一个元素
     *
     * @param collection 集合类
     * @return 返回是否成功
     */
    public static boolean removeLast(Collection<? extends Object> collection) {

        return collection.remove(collection.size() - 1);
    }

    public static void main(String[] args) {

        HashSet<Object> set = new HashSet<>();
        Integer[] ints = new Integer[10];
        for (int i = 0; i < 10; i++) {
            set.add(i);
            ints[i] = i;
        }
        //System.out.println(join(set, ":"));
        System.out.println(join(ints, "."));


    }
}
