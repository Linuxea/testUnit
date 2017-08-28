package file.action;

/**
 * Created by Linuxea on 2017/7/28.
 */
public class FileConstant {

    /**
     * 文件切分大小为2的N次方
     * 单个文件大小最好不要小于1kb否则系统文件管理会自却填充至1kb
     * 分割与合并的数组要一致
     * 以上结论完全有错误的可能
     */
    protected static final int size = 2 ^ 5000 * 10000;

}
