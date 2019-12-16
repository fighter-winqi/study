package com.concurrency.designpattern.creational.simplefactory;

        import lombok.extern.slf4j.Slf4j;

/**
 * <p>Title: AliPayQRCode</p>
 * <p>Description: 生成WeChat支付二维码实现类</p>
 * <p>Company: http://www.yinjiedu.com</p>
 * <p>Project: annotation</p>
 *
 * @author: WEIQI
 * @Date: 2019-11-24 22:37
 * @Version: 1.0
 */
@Slf4j
public class WechatQRCode extends QrCode {
    /**
     * @description: 生成支付二维码
     * @auther: WEIQI
     * @date: 2019-11-24 22:36
     * @return:
     */
    @Override
    public void produceQRCode() {
        log.info("generate wechat QRCode...");
    }
}
