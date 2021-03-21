package cn.krislin.product.domain;

import cn.krislin.mbg.model.SmsFlashPromotionSession;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 秒杀活动信息扩展
 **/
@Data
public class FlashPromotionSessionExt extends SmsFlashPromotionSession {
    @ApiModelProperty(value = "活动状态#根据时间进行判断",notes = "0->进行中,1->即将开始,2->已结束")
    private Integer sessionStatus;
    @ApiModelProperty(value = "当前秒杀活动ID")
    private Long flashPromotionId;
}
