/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hasor.website.login.oauth;
import net.hasor.web.annotation.ReqParam;
/**
 * 登录表单回调form。
 * @version : 2016年1月10日
 * @author 赵永春(zyc@hasor.net)
 */
public class OAuthForm {
    // - Hasor
    @ReqParam("type")
    private String type;
    @ReqParam("provider")
    private String provider;
    // - OAuth
    @ReqParam("state")
    private String state;
    @ReqParam("code")
    private String code;
    @ReqParam("redirectURI")
    private String redirectURI;
    //
    //
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getProvider() {
        return provider;
    }
    public void setProvider(String provider) {
        this.provider = provider;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getRedirectURI() {
        return redirectURI;
    }
    public void setRedirectURI(String redirectURI) {
        this.redirectURI = redirectURI;
    }
}