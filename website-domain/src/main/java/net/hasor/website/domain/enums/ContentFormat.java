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
package net.hasor.website.domain.enums;
import net.hasor.website.domain.GeneralEnumParsing;
/**
 * 文章格式类型
 * @version : 2016年08月11日
 * @author 赵永春(zyc@hasor.net)
 */
public enum ContentFormat implements GeneralEnumParsing<ContentFormat> {
    Text(0, "文本"),//
    MD(1, "MD"), //
    Rich(2, "富文本"), //
    PrivateJson(3, "结构化"),//
    ;
    //
    private int    type;
    private String desc;
    ContentFormat(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }
    public int getType() {
        return type;
    }
    public String getDesc() {
        return desc;
    }
    //
    public ContentFormat formType(int type) {
        for (ContentFormat item : ContentFormat.values()) {
            if (item.getType() == type) {
                return item;
            }
        }
        return null;
    }
    public ContentFormat formName(String name) {
        for (ContentFormat item : ContentFormat.values()) {
            if (item.name().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }
}