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
package net.hasor.website.web.core;
import net.hasor.core.convert.ConverterUtils;
import net.hasor.core.convert.convert.DateConverter;
import net.hasor.web.WebApiBinder;
import net.hasor.web.WebModule;
import net.hasor.website.core.RootModule;
import net.hasor.website.domain.beans.AppConstant;
import net.hasor.website.login.oauth.OAuthModule;

import java.util.Date;
/**
 *
 * @version : 2015年12月25日
 * @author 赵永春(zyc@hasor.net)
 */
public class StartModule extends WebModule {
    @Override
    public void loadModule(WebApiBinder apiBinder) throws Throwable {
        //
        apiBinder.installModule(new OAuthModule());
        apiBinder.installModule(new RootModule(true));
        //
        apiBinder.setEncodingCharacter("utf-8", "utf-8");
        String contextPath = apiBinder.getServletContext().getContextPath();
        apiBinder.bindType(String.class).nameWith(AppConstant.VAR_CONTEXT_PATH).toInstance(contextPath);
        //
        apiBinder.scanAnnoRender();
        apiBinder.scanMappingTo();
        //
        // .Webs
        apiBinder.jeeFilter("/*").through(0, new JumpFilter());
        //
        DateConverter converter = new DateConverter();
        converter.setPatterns(new String[] { "yyyy-MM-dd", "hh:mm:ss", "yyyy-MM-dd hh:mm:ss" });
        ConverterUtils.register(converter, Date.class);
    }
}
