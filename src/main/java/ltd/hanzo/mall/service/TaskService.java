package ltd.hanzo.mall.service;

/**
 * @Author 皓宇QAQ
 * @email 2469653218@qq.com
 * @Date 2020/5/19 23:41
 * @link https://github.com/Tianhaoy/hanzomall
 * @Description: 一些小任务接口
 */
public interface TaskService {
    /*
    扫描订单 未支付状态的单子发送邮件提醒支付
    */
    void callPayOrders();

    /**
     *  超时自动取消订单发送邮件提醒
     */
    void cancelOrderSendSimpleMail(String orderNo);
}
