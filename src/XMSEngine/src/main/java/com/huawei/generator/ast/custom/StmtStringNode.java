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

package com.huawei.generator.ast.custom;

import com.huawei.generator.ast.AstNode;
import com.huawei.generator.ast.AstVisitor;
import com.huawei.generator.ast.StatementNode;

/**
 * Represents another AstNode as a string.
 *
 * @since 2019-12-28
 */
public final class StmtStringNode extends StatementNode {
    private AstNode inner;

    private StmtStringNode() {
    }

    public AstNode astNode() {
        return inner;
    }

    @Override
    public void accept(AstVisitor visitor) {
        visitor.visit(this);
    }

    public static StmtStringNode create(AstNode inner) {
        StmtStringNode node = new StmtStringNode();
        node.inner = inner;
        return node;
    }
}
