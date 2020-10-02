package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.YesNo;
import com.github.msu.sdk.util.ResponseInfo;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryMerchantPaymentSystemsResponse.class
)
public class QueryMerchantPaymentSystemsRequest extends ApiRequest {
    private String dealerCode;

    private BigDecimal amount;

    private YesNo reflectCommission;

    private YesNo ignorerates;

    private YesNo defaultOnLy;

    private QueryMerchantPaymentSystemsRequest() {
    }

    public static QueryMerchantPaymentSystemsRequestBuilder builder() {
        return new QueryMerchantPaymentSystemsRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.AMOUNT, this.amount);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.REFLECTCOMMISSION, this.reflectCommission);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.IGNORERATES, this.ignorerates);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEFAULTONLY, this.defaultOnLy);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYMERCHANTPAYMENTSYSTEMS;
    }

    public static final class QueryMerchantPaymentSystemsRequestBuilder {
        private String dealerCode;

        private BigDecimal amount;

        private YesNo reflectCommission;

        private YesNo ignorerates;

        private YesNo defaultOnLy;

        private Authentication authentication;

        public QueryMerchantPaymentSystemsRequestBuilder withAuthentication(
                Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryMerchantPaymentSystemsRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public QueryMerchantPaymentSystemsRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public QueryMerchantPaymentSystemsRequestBuilder withReflectCommission(
                YesNo reflectCommission) {
            this.reflectCommission = reflectCommission;
            return this;
        }

        public QueryMerchantPaymentSystemsRequestBuilder withIgnorerates(YesNo ignorerates) {
            this.ignorerates = ignorerates;
            return this;
        }

        public QueryMerchantPaymentSystemsRequestBuilder withDefaultOnLy(YesNo defaultOnLy) {
            this.defaultOnLy = defaultOnLy;
            return this;
        }

        public QueryMerchantPaymentSystemsRequest build() {
            QueryMerchantPaymentSystemsRequest request = new QueryMerchantPaymentSystemsRequest();
            request.authentication = this.authentication;
            request.dealerCode = this.dealerCode;
            request.amount = this.amount;
            request.reflectCommission = this.reflectCommission;
            request.ignorerates = this.ignorerates;
            request.defaultOnLy = this.defaultOnLy;
            return request;
        }
    }
}
