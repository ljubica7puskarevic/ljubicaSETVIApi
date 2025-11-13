package DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UploadFreeTextApiRequestDto {
    private String statusId;
    private String text;
    private int topK;
    private double threshold;
    private boolean enablePrivateLabelRanking;
    private boolean enableStockProductRanking;
    private boolean enableVendorRanking;
    private boolean enableProductRanking;
    private boolean useOldReranking;
}
