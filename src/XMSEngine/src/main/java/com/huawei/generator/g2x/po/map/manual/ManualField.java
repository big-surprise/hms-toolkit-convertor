/*
 * Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.huawei.generator.g2x.po.map.manual;

import com.huawei.generator.g2x.po.map.Desc;

import com.google.gson.annotations.Expose;

/**
 * ManualField: description of manual-fields, indicating wishhub plugins can not modify them directly.
 * Therefore app client developers should change them manually.
 * <p>
 * including:
 * 1. fieldName means field name
 * 2. desc means details of this field, see {@link Desc}
 * </p>
 * <p>
 * Note: for manual field, desc is very important, because it contains the user manual and url to guide
 * developers.
 * </p>
 *
 * @since 2019-11-27
 */
public class ManualField {
    @Expose
    private String fieldName;

    @Expose
    private Desc desc;

    public ManualField(String fieldName, Desc desc) {
        this.fieldName = fieldName;
        this.desc = desc;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Desc getDesc() {
        return desc;
    }
}
