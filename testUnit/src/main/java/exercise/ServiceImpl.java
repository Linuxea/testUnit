package exercise;


/**
 * Created by linuxea.lin on 2017/7/7.
 */
public class ServiceImpl implements BaseService {
    @Override
    public void add() {
        System.out.println("add成功");
    }

    @Override
    public void delete() {
        System.out.println("delete成功");
    }

    @Override
    public void update() {
        System.out.println("update成功");
    }

    @Override
    public void find() {
        System.out.println("find成功");
    }
}
