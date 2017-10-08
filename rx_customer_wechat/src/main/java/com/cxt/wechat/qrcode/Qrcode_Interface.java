package com.cxt.wechat.qrcode;

import com.cxt.wechat.entity.qrcode.Qrcode;

import java.io.OutputStream;

/**
 *
 * Created by cccxt on 2016/9/10.
 */
public interface Qrcode_Interface {
    /**
     * 创建二维码的URL
     */
    String CREATE = "https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token=ACCESS_TOKEN";

    /**
     * 获取二维码图片的URL
     */
    String SHOWQRCPDE = "https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket=TICKET";

    /**
     * 创建二维码的接口
     * @param qrcode 二维码实体
     * @return 创建二维码后的结果字符串
     */
    String create(Qrcode qrcode, String ACCESS_TOKEN);

    /**
     *
     * @param TICKET 获取的二维码ticket，凭借此ticket可以在有效时间内换取二维码。
     * @return 二维码图片字节
     */
    byte[] showqrcode(String TICKET);
}
