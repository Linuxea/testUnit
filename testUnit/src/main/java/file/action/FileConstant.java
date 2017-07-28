package file.action;

/**
 * Created by Linuxea on 2017/7/28.
 */
public class FileConstant {

    /**
     * 文件切分大小必须为2的N次方
     * 单个文件大小最好不要小于1kb否则系统文件管理会自却填充至1kb
     */
    protected static final int size = 2^5000;

}
