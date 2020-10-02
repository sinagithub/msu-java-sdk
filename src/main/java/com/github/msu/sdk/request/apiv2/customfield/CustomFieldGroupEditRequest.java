package com.github.msu.sdk.request.apiv2.customfield;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.CustomFieldGroupBehaviour;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.BaseCustomFieldGroupResponse.class
)
public class CustomFieldGroupEditRequest extends ApiRequest {
    private String code;

    private String name;

    private CustomFieldGroupBehaviour behaviour;

    private CustomFieldGroupEditRequest() {
    }

    public static CustomFieldGroupEditRequestBuilder builder() {
        return new CustomFieldGroupEditRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CODE, this.code);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.NAME, this.name);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.BEHAVIOUR, this.behaviour);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.CUSTOMFIELDGROUPEDIT;
    }

    public static final class CustomFieldGroupEditRequestBuilder {
        private String code;

        private String name;

        private CustomFieldGroupBehaviour behaviour;

        private Authentication authentication;

        public CustomFieldGroupEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public CustomFieldGroupEditRequestBuilder withCode(String code) {
            this.code = code;
            return this;
        }

        public CustomFieldGroupEditRequestBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public CustomFieldGroupEditRequestBuilder withBehaviour(CustomFieldGroupBehaviour behaviour) {
            this.behaviour = behaviour;
            return this;
        }

        public CustomFieldGroupEditRequest build() {
            CustomFieldGroupEditRequest request = new CustomFieldGroupEditRequest();
            request.authentication = this.authentication;
            request.code = this.code;
            request.name = this.name;
            request.behaviour = this.behaviour;
            return request;
        }
    }
}
